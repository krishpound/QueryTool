package com.gf.ny.persist;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

public class JDBCManager{

	
	private static Logger log = Logger.getLogger("JDBCManager");
	
	
	private JDBCManager(){
		PropertyConfigurator.configure("cfg/mysql_config-JDBC.properties");
	}
	
	public static Connection getConnection(String url)
		throws SQLException
		{
			DriverManager.setLoginTimeout(10);
			return DriverManager.getConnection(url);
		
		}
	
	public static Connection getConnection(String url, String user, String password) 
	 	throws SQLException{
		
			return DriverManager.getConnection(url,user,password);
		
	}
	
	public static Connection getConnection(String url, Properties props)
		throws SQLException{
		
			return DriverManager.getConnection(url, props);
		
	}
		
	public static void closePreparedStatement(PreparedStatement ps){
		
		if (ps != null){
			
			try {
				ps.close();
//				log.debug("Prepared statement was closed");
			}
			catch (Exception e){
				log.error("prepared statement failed to close.");
				
			}		
		} 
	}	
		
	public static void closeStatement(Statement stmt){
		
		if (stmt != null){
			
			try {
				stmt.close();
//				log.debug("Statement was closed");
			}
			catch (Exception e){
				log.error("Statement failed to close");

			}
			
		} 
	}
	
	public static void closeResultSet(ResultSet result){
		
		if (result != null){
			
			try {
				result.close();
//				log.debug("Resultset was closed");
			}
			catch (Exception e){
				log.error("Resultset failed to close");
				
			}
			
		}
	}
	
	public static void closeConnection(Connection connection){
		
		if (connection != null){
			
			try {
				connection.close();
//				log.debug("Connection returned to pool");
			}
			catch (Exception e){
				log.error("Connection failed to close");
			}
			
		}
	}
	
}