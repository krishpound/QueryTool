package com.gf.ny.src;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Date;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.resource.transaction.spi.TransactionStatus;

public class LoadEnsembleConfiguration {
	
	private static Logger log = Logger.getLogger("LoadEnsembleConfiguration");
	private static String rxPortsPattern = "Port	Adapter|Port	Adapter|IPPort	Adapter|IPPort	Adapter";
	private static String rxPortsPatternData = "Port	Adapter\\d+|Port	Adapter\\d+|IPPort	Adapter\\d+|IPPort	Adapter\\d+";
	private static String rxIpPattern = "IPAddress	Adapter|IPAddress	Adapter|IPAddress	Adapter|IPAddress	Adapter|IPAddress	Adapter";
	private static String rxIpPatternData = "IPAddress	Adapter\\d{1,3}\\.\\d{1,3}\\.\\d{1,3}\\.\\d{1,3}|IPAddress	Adapter\\d{1,3}\\.\\d{1,3}\\.\\d{1,3}\\.\\d{1,3}|IPAddress	Adapter\\d{1,3}\\.\\d{1,3}\\.\\d{1,3}\\.\\d{1,3}|IPAddress	Adapter[\\pL\\pN]+\\.[\\pL\\pN]+\\.[\\pL\\pN]+|IPAddress	Adapter[\\pL\\pN]+\\.[\\pL\\pN]+\\.[\\pL\\pN]+|IPAddress	Adapter[\\pL\\pN]+\\.[\\pL\\pN]+\\.[\\pL\\pN]+|IPAddress	Adapter[\\pL\\pN]+\\.[\\pL\\pN]+\\.[\\pL\\pN]+|IPAddress	Adapter\\d{1,3}\\.\\d{1,3}\\.\\d{1,3}\\.\\d{1,3}+|IPAddress	Adapterlocalhost|IPAddress	Adapterlocalhost|IPAddress	Adapterlocalhost|IPAddress	Adapterlocalhost|IPAddress	Adapterlocalhost";
	
	private static void persist(Object object) {
	    
		  Transaction tx = null;
		  Session session = HibernateSessionFactory.getSession();
		  try {
	    
			  tx = session.beginTransaction();
			  
			  session.save(object);
			  
			  tx.commit();
			  session.evict(object);
		  
		  } 
		  catch (RuntimeException e) {
	    
			  e.printStackTrace();
			  
			  
			  
			  if (tx != null && session.getTransaction().getStatus()==TransactionStatus.ACTIVE) {
				  try {
					  tx.rollback();
				  } 
				  catch (HibernateException e1) {}
	      throw e;
	    }
	  }
	}	
	
	public static void go(ResultSet rs){
		
	PropertyConfigurator.configure("c:/home/java/cfg/postgre_config-JDBC.properties");
	
	boolean hasPortDefined=false,hasIpDefined=false;
	SimpleDateFormat sdf = new SimpleDateFormat("MM/dd/yyyy HH:mm:ss");
	String refreshed = sdf.format(new Date());
	String searchString,port,ip;
	EnsembleConfiguration e = new EnsembleConfiguration();
	String environment=null,production=null,namespace=null,category=null,intrface=null,classname=null;
		
	try{
		
		if (rs.getString(6) != null){
					
			searchString = rs.getString(6);
			hasPortDefined = RegexCheck.findPattern(rxPortsPattern,searchString) ? true:false;
			hasIpDefined = RegexCheck.findPattern(rxIpPattern,searchString) ? true:false;
				
			//if(rs.getString(5).equalsIgnoreCase("PACS1OPERATION")){
			//	System.out.println("has ip defined = "+hasIpDefined);
			//}
				
			if (hasPortDefined){
				port = RegexCheck.grabData(rxPortsPatternData,searchString).substring(16);
				if (port.length() > 5) {
					//log.error("bad regex match ...|"+port+"|");
					//System.out.println("bad regex match ...|"+port+"|");
				}
			}
			else{
				port="";
			}
				
			if (hasIpDefined){
					
				if(searchString.length()>21){
					try{
						ip = RegexCheck.grabData(rxIpPatternData,searchString).substring(21);
					}
					catch (Exception ex){
						log.error("Cannot parse IP in this configuration:  "+searchString);
						ip = "couldn't parse - see log";
						System.out.println("\nERROR: can't parse an IP out of this string: "+searchString+"\n");
					}
				}
				else{
					System.out.println("invalid IP string: "+searchString);
					ip="";
				}
			}
			else{
				ip="";
			}
			
		}
		else{
			port="";
			ip="";
		}
			
			if(rs.getString(1)!=null){
				if(rs.getString(1).length()>100){
					environment = rs.getString(1).substring(0, 99);
				}
				else{
					environment = rs.getString(1);
				}
			}
			
			if(rs.getString(2)!=null){
				if(rs.getString(2).length()>100){
					production = rs.getString(2).substring(0, 99);
				}
				else{
					production = rs.getString(2);
				}
			}
			
			if(rs.getString(3)!=null){
				if(rs.getString(3).length()>100){
					namespace = rs.getString(3).substring(0, 99);
				}
				else{
					namespace = rs.getString(3);
				}
			}
			
			if(rs.getString(4)!=null){
				if(rs.getString(4).length()>100){
					category = rs.getString(4).substring(0, 99);
				}
				else{
					category = rs.getString(4);
				}
			}
			
			if(rs.getString(5)!=null){
				if(rs.getString(5).length()>100){
					intrface = rs.getString(5).substring(0, 99);
				}
				else{
					intrface = rs.getString(5);
				}
			}
			
			if(rs.getString(8)!=null){
				if(rs.getString(8).length()>100){
					classname = rs.getString(8).substring(0, 99);
				}
				else{
					classname = rs.getString(8);
				}
			}
						
			e.setEnvironment(environment);
			e.setProduction(production);
			e.setNamespace(namespace);
			e.setCategory(category);
			e.setHl7Interface(intrface);
			e.setPort(port);
			e.setEnabled(rs.getString(7));
			e.setClassName(classname);
			e.setLastRefresh(refreshed);
			e.setRemoteIp(ip);
			
			persist(e);
			
		
	}
	catch(SQLException sqlE){log.error(sqlE.getMessage());}
}
	
}
