package com.gf.ny.src;

import java.io.File;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import org.apache.log4j.PropertyConfigurator;
import com.gf.ny.persist.*;
import com.intersys.objects.Database;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

public class InterfaceProfilingDriver {

	private static Logger log = Logger.getLogger("InterfaceProfilingDriver");
	private static String batchSQL = "select r.route,r.environment,r.namespace,r.sourceconfig,r.targetconfig,q.frequency,q.cache_sql,q.last_refresh from query q join ensembleroute r on (q.route = r.route) where q.frequency = 'on demand' order by 1";
	private static String purgeHibernateLogging = "delete from logging where logger like 'org.hibernate%'";
	private static String jobEndSql = "update query set last_refresh = '#REFRESH#' where route = #ROUTE#";
	private static ArrayList<ProfileBean> batchList = new ArrayList<ProfileBean>();
	private static DataSource dataSource = new DataSource();
	private static Connection c;
	private static PreparedStatement ps;
	private static ResultSet rs;
	private static String sql;
	private static String refreshingFile = "c:/home/java/cfg/refresh.txt";
	
	public static void GrabInterfacesToProfile(Connection postgres){
		
		Connection ensembleConn=null;
		String lastEnvironment="",lastNamespace="";
		Statement stmt=null;
		String route;
		Map segmentMap = new HashMap();
		ArrayList<String> jobSegmentList = new ArrayList<String>();
		ArrayList<String> routeSegmentList = new ArrayList<String>();
		
		
		try{
			
			for(ProfileBean profile : batchList){
	            
				if(routeSegmentList.size()>0) routeSegmentList.clear();
				
				route = Integer.toString(profile.getRoute());
				
				if((profile.getEnvironment().equalsIgnoreCase(lastEnvironment)&&(profile.getNamespace().equalsIgnoreCase(lastNamespace)))){}
				else{
					ensembleConn = DataSource.GetEnsembleConnection(profile.getConnection());
					lastEnvironment = profile.getEnvironment();
					lastNamespace = profile.getNamespace();
				}
				
				if(ensembleConn != null){
					
					routeSegmentList = LoadQueryTool.go(ensembleConn,profile);
					
					for (String  segment : routeSegmentList) {
						if(!jobSegmentList.contains(segment)) jobSegmentList.add(segment);
					}
						
					SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
					String refreshDate = simpleDateFormat.format(new Date());
					sql = jobEndSql.replaceAll("#REFRESH#",refreshDate).replaceAll("#ROUTE#", route);
					System.out.println("jobEndSql = "+sql);
					stmt = postgres.createStatement();
					stmt.executeUpdate(purgeHibernateLogging);
					stmt.executeUpdate(sql);
					
				}
				
			}
			
			System.out.println("\n\n");
			for (String  segment : jobSegmentList) System.out.println("Distinct segment: "+segment);
			System.out.println("\n\n");
			
			JDBCManager.closeConnection(ensembleConn);
			JDBCManager.closeStatement(stmt);
			
		}
		catch(Exception e){
			log.error(e.getMessage());
			System.out.println(e.getCause());
			System.exit(-9);
		}
		
	}
	
	public static void main(String[] args) {
		
		PropertyConfigurator.configure("c:/home/java/cfg/postgre_config-JDBC.properties");
		log.info("Starting " + (new Date()).toString() + "\n");
		
		try{
		
			DataSource dataSource = new DataSource();
			c = dataSource.ConfigConn("postgre", null, null);
			log.info("grabbing interfaces to profile from batchCycle table");
			ps = c.prepareStatement(batchSQL);
			rs = ps.executeQuery();
			
			while(rs.next()){
				
				ProfileBean pb = new ProfileBean();
				pb.setRoute(rs.getInt(1));
				pb.setEnvironment(rs.getString(2));
				pb.setNamespace(rs.getString(3));
				pb.setSourceConfig(rs.getString(4));
				pb.setTargetConfig(rs.getString(5));
				pb.setFrequency(rs.getString(6));
				pb.setCacheSql(rs.getString(7));
				pb.setLastRefresh(rs.getString(8));
				batchList.add(pb);
			
			}
			
			for (ProfileBean chris : batchList) {
				System.out.println("Query: "+chris.getCacheSql());
				//System.out.println("sourceConfig: "+chris.getSourceConfig());
				//System.out.println("targetConfig: "+chris.getTargetConfig());
				//System.out.println("lastRefresh: "+chris.getLastRefresh());
			}
			
			GrabInterfacesToProfile(c);
			
			
			System.out.println("finishing up now");
			
			log.info("reindexing MessageWarehouse database");
			Statement statement = c.createStatement();
			statement.execute("reindex database \"MessageWarehouse\"");
			log.info("reindexing complete");
			
			JDBCManager.closeStatement(statement);
			JDBCManager.closeConnection(c);
			JDBCManager.closeResultSet(rs);
			JDBCManager.closePreparedStatement(ps);
			
		}
		catch(SQLException sqlE){
			log.error(sqlE.getMessage());
		}
		catch(Exception e){
			log.error(e.getMessage());
		}
		
		//File f = new File(refreshingFile);
		//boolean b = f.delete();
		
		log.info("Ending " + (new Date()).toString() + "\n");
		System.out.println("All done.");

	}

}
