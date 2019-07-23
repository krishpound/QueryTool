package com.gf.ny.persist;

import java.sql.Connection;
import java.sql.SQLException;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.sql.DataSource;
import com.intersys.objects.CacheDatabase;
import com.intersys.objects.CacheException;
import com.intersys.objects.Database;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;


public class DataAccess {
	
	private static Logger log = Logger.getLogger("DataAccess");
	private static String jbossDataSource;
	private static String jbossMessageWarehouse="java:/MessageWarehouse-DS";
	private static String jbossDxI3ENSEPIC1="java:/DxI3_ENSEPIC1-DS";
	private static Connection c=null;
	

public static Connection lookUp(String dataSource){
		
	//This method returns a java.sql.Connection from the JBoss managed pool
	
		try{
			
			if(dataSource.equalsIgnoreCase("DxI3/ENSEPIC1")){
				jbossDataSource = jbossDxI3ENSEPIC1;
			}
			else{
				jbossDataSource = jbossMessageWarehouse;
			}
			
			InitialContext cxt = new InitialContext();
			DataSource ds = (DataSource) cxt.lookup(jbossDataSource);
			c = ds.getConnection();
			
			log.info("acquired datasource "+jbossDataSource);
			//System.out.println("DataAccess: aquired datasource "+jbossDataSource);
		
		}
		catch(NamingException ne){
			log.error(ne.getMessage());
		}
		catch(SQLException sqlE){
			log.error(sqlE.getMessage());
		}
		catch(Exception e){
			log.error(e.getMessage());
		}
		
		return c;
		
	}
	
	public static Database createFailoverConnection(String environment) throws CacheException{
		
		//Connect using the Cluster address.
		//We want to check both data centers but will not know which node is active at the data center
		
		Database db=null;
		String url=null;
		String username="christools";
		String pwd="Chr1$T00l$!";
		
		//ENSEMBLE QA SERVERS
		if(environment.equalsIgnoreCase("Q1I1")){
			url="jdbc:Cache://172.24.194.71:1972/ENSEMBLE";
		}
		if(environment.equalsIgnoreCase("Q2I1")){
			url="jdbc:Cache://172.23.194.71:1972/ENSEMBLE";
		}
		if(environment.equalsIgnoreCase("Q1I2")){
			url="jdbc:Cache://172.24.194.75:1972/ENSEMBLE";
		}
		if(environment.equalsIgnoreCase("Q2I2")){
			url="jdbc:Cache://172.23.194.75:1972/ENSEMBLE";
		}
		if(environment.equalsIgnoreCase("Q1I3")){
			url="jdbc:Cache://172.24.194.71:56774/ENSEMBLE";
		}
		if(environment.equalsIgnoreCase("Q2I3")){
			url="jdbc:Cache://172.23.194.71:56774/ENSEMBLE";
		}
		
		//ENSEMBLE PRODUCTION SERVERS
		if(environment.equalsIgnoreCase("P1I1")){
			url="jdbc:Cache://172.24.194.79:1971/ENSEMBLE";
		}
		if(environment.equalsIgnoreCase("P2I1")){
			url="jdbc:Cache://172.23.194.79:1971/ENSEMBLE";
		}
		if(environment.equalsIgnoreCase("P1I2")){
			url="jdbc:Cache://172.24.194.83:1972/ENSEMBLE";
		}
		if(environment.equalsIgnoreCase("P2I2")){
			url="jdbc:Cache://172.23.194.83:1972/ENSEMBLE";
		}
		if(environment.equalsIgnoreCase("P1I3")){
			url="jdbc:Cache://172.24.194.79:56773/ENSEMBLE";
		}
		if(environment.equalsIgnoreCase("P2I3")){
			url="jdbc:Cache://172.23.194.79:56773/ENSEMBLE";
		}
		
		//System.out.println("DataAccess: asking for a connection to "+url+" "+username+" "+pwd);
		
		try{
			db = CacheDatabase.getDatabase(url, username, pwd);
			//System.out.println("PortSearchHandler: Connection to "+environment+" obtained successfully");
		}
		catch(Exception e){
			System.out.println("DataAccess: Establish connection to "+environment+" failed -> "+e.getMessage());
			db=null;
		}
		
		return db;
		
	}


	
	public static Database createConnection(String environment) throws CacheException {
		
		//This method returns an com.intersys.objects.Database object
		
		
		Database db=null;
		String url=null;
		String username="poundc";
		String pwd="J9h4c897!";
	
		if(environment.equalsIgnoreCase("PxI1_QCPR_CARDIOLOGY")) environment = "PxI1_QCPRCARDIOLOGY";
		if(environment.equalsIgnoreCase("PxI2_QCPR_CARDIOLOGY")) environment = "PxI2_QCPRCARDIOLOGY";
		
		if(environment.equalsIgnoreCase("DxI1_ADT")){
			url="jdbc:Cache://172.23.194.87:1972/ADT";
		}
		if(environment.equalsIgnoreCase("DxI1_BLOODBANK")){
			url="jdbc:Cache://172.23.194.87:1972/BLOODBANK";
		}
		if(environment.equalsIgnoreCase("DxI1_CAREMGT")){
			url="jdbc:Cache://172.20.23.44:1972/CAREMGT";
		}
		if(environment.equalsIgnoreCase("DxI1_CLINICAL")){
			url="jdbc:Cache://172.20.23.44:1972/CLINICAL";
		}
		if(environment.equalsIgnoreCase("DxI1_DASHBOARDED")){
			url="jdbc:Cache://172.20.23.44:1972/DASHBOARDED";
		}
		if(environment.equalsIgnoreCase("DxI1_EDSYNDROMIC")){
			url="jdbc:Cache://172.20.23.44:1972/EDSYNDROMIC";
		}
		if(environment.equalsIgnoreCase("DxI1_ELMHURSTED")){
			url="jdbc:Cache://172.20.23.44:1972/ELMHURSTED";
		}
		if(environment.equalsIgnoreCase("DxI1_HSLIB")){
			url="jdbc:Cache://172.20.23.44:1972/HSLIB";
		}
		if(environment.equalsIgnoreCase("DxI1_IMMUNIZATION")){
			url="jdbc:Cache://172.20.23.44:1972/IMMUNIZATION";
		}
		if(environment.equalsIgnoreCase("DxI1_PASSAGEPOINT")){
			url="jdbc:Cache://172.20.23.44:1972/PASSAGEPOINT";
		}
		if(environment.equalsIgnoreCase("DxI1_PHARMACY")){
			url="jdbc:Cache://172.20.23.44:1972/PHARMACY";
		}
		if(environment.equalsIgnoreCase("DxI1_QCPRADT")){
			url="jdbc:Cache://172.20.23.44:1972/QCPRADT";
		}
		if(environment.equalsIgnoreCase("DxI1_RHIO")){
			url="jdbc:Cache://172.20.23.44:1972/RHIO";
		}
		if(environment.equalsIgnoreCase("QxI1_ADT")){
			url="jdbc:Cache://172.20.24.32:1972/ADT";
		}
		if(environment.equalsIgnoreCase("QxI1_ANCILLARY")){
			url="jdbc:Cache://172.20.24.32:1972/ANCILLARY";
		}
		if(environment.equalsIgnoreCase("QxI1_BLOODBANK")){
			url="jdbc:Cache://172.20.24.32:1972/BLOODBANK";
		}
		if(environment.equalsIgnoreCase("QxI1_CLINICAL")){
			url="jdbc:Cache://172.20.24.32:1972/CLINICAL";
		}
		if(environment.equalsIgnoreCase("QxI1_DASHBOARDED")){
			url="jdbc:Cache://172.20.24.32:1972/DASHBOARDED";
		}
		if(environment.equalsIgnoreCase("QxI1_ELMHURSTED")){
			url="jdbc:Cache://172.20.24.32:1972/ELMHURSTED";
		}
		if(environment.equalsIgnoreCase("QxI1_MIRRORVIP2")){
			url="jdbc:Cache://172.20.24.32:1972/MIRRORVIP2";
		}
		if(environment.equalsIgnoreCase("QxI1_HSLIB")){
			url="jdbc:Cache://172.20.24.32:1972/HSLIB";
		}
		if(environment.equalsIgnoreCase("QxI1_IMMUNIZATIONDOH")){
			url="jdbc:Cache://172.20.24.32:1972/IMMUNIZATIONDOH";
		}
		if(environment.equalsIgnoreCase("QxI1_INTERBORORHIO")){
			url="jdbc:Cache://172.20.24.32:1972/INTERBORORHIO";
		}
		if(environment.equalsIgnoreCase("QxI1_NICS")){
			url="jdbc:Cache://172.20.24.32:1972/NICS";
		}
		if(environment.equalsIgnoreCase("QxI1_NYCIG")){
			url="jdbc:Cache://172.20.24.32:1972/NYCIG";
		}
		if(environment.equalsIgnoreCase("QxI1_QCPR")){
			url="jdbc:Cache://172.20.24.32:1972/QCPR";
		}
		if(environment.equalsIgnoreCase("QxI1_QCPRCARDIOLOGY")){
			url="jdbc:Cache://172.20.24.32:1972/QCPR_CARDIOLOGY";
		}
		if(environment.equalsIgnoreCase("QxI1_SOARIAN")){
			url="jdbc:Cache://172.20.24.32:1972/SOARIAN";
		}
		if(environment.equalsIgnoreCase("PxI1_ADT")){
			url="jdbc:Cache://172.20.24.36:1971/ADT";
		}
		if(environment.equalsIgnoreCase("PxI1_ANCILLARY")){
			url="jdbc:Cache://172.20.24.36:1971/ANCILLARY";
		}
		if(environment.equalsIgnoreCase("PxI1_BLOODBANK")){
			url="jdbc:Cache://172.20.24.36:1971/BLOODBANK";
		}
		if(environment.equalsIgnoreCase("PxI1_CLINICAL")){
			url="jdbc:Cache://172.20.24.36:1971/CLINICAL";
		}
		if(environment.equalsIgnoreCase("PxI1_DASHBOARDED")){
			url="jdbc:Cache://172.20.24.36:1971/DASHBOARDED";
		}
		if(environment.equalsIgnoreCase("PxI1_ELMHURSTED")){
			url="jdbc:Cache://172.20.24.36:1971/ELMHURSTED";
		}
		if(environment.equalsIgnoreCase("PxI1_HSLIB")){
			url="jdbc:Cache://172.20.24.36:1971/HSLIB";
		}
		if(environment.equalsIgnoreCase("PxI1_IMMUNIZATIONDOH")){
			url="jdbc:Cache://172.20.24.36:1971/IMMUNIZATIONDOH";
		}
		if(environment.equalsIgnoreCase("PxI1_INTERBORORHIO")){
			url="jdbc:Cache://172.20.24.36:1971/INTERBORORHIO";
		}
		if(environment.equalsIgnoreCase("PxI1_MIRRORVIP2")){
			url="jdbc:Cache://172.20.24.36:1971/MIRRORVIP2";
		}
		if(environment.equalsIgnoreCase("PxI1_NICS")){
			url="jdbc:Cache://172.20.24.36:1971/NICS";
		}
		if(environment.equalsIgnoreCase("PxI1_NYCIG")){
			url="jdbc:Cache://172.20.24.36:1971/NYCIG";
		}
		if(environment.equalsIgnoreCase("PxI1_QCPR")){
			url="jdbc:Cache://172.20.24.36:1971/QCPR";
		}
		if(environment.equalsIgnoreCase("PxI1_QCPRCARDIOLOGY")){
			url="jdbc:Cache://172.20.24.36:1971/QCPR_CARDIOLOGY";
		}
		if(environment.equalsIgnoreCase("PxI1_SOARIAN")){
			url="jdbc:Cache://172.20.24.36:1971/SOARIAN";
		}
		if(environment.equalsIgnoreCase("DxI2_AMALGA")){
			url="jdbc:Cache://172.20.24.45:56773/AMALGA";
		}
		if(environment.equalsIgnoreCase("DxI2_DENTRIX")){
			url="jdbc:Cache://172.20.24.45:56773/DENTRIX";
		}
		if(environment.equalsIgnoreCase("DxI2_DEPTOFCORRECTIONS")){
			url="jdbc:Cache://172.20.24.45:56773/DEPTOFCORRECTIONS";
		}
		if(environment.equalsIgnoreCase("DxI2_HHCPATIENTVISITS")){
			url="jdbc:Cache://172.20.24.45:56773/HHCPATIENTVISITS";
		}
		if(environment.equalsIgnoreCase("DxI2_MEASURE12")){
			url="jdbc:Cache://172.20.24.45:56773/MEASURE12";
		}
		if(environment.equalsIgnoreCase("DxI2_NICS")){
			url="jdbc:Cache://172.20.24.45:56773/NICS";
		}
		if(environment.equalsIgnoreCase("DxI2_NYSQUITLINE2")){
			url="jdbc:Cache://172.20.24.45:56773/NYSQUITLINE2";
		}
		if(environment.equalsIgnoreCase("DxI2_PATIENTREPORTING")){
			url="jdbc:Cache://172.20.24.45:56773/PATIENTREPORTING";
		}
		if(environment.equalsIgnoreCase("DxI2_PRESSGANEY")){
			url="jdbc:Cache://172.20.24.45:56773/PRESSGANEY";
		}
		if(environment.equalsIgnoreCase("DxI2_QCPR_CARDIOLOGY")){
			url="jdbc:Cache://172.20.24.45:56773/QCPR_CARDIOLOGY";
		}
		if(environment.equalsIgnoreCase("DxI2_QS1PHARMACY")){
			url="jdbc:Cache://172.20.24.45:56773/QS1PHARMACY";
		}
		if(environment.equalsIgnoreCase("PxI2_AMALGA")){
			url="jdbc:Cache://ensspi2.nychhc.org:1972/AMALGA";
		}
		if(environment.equalsIgnoreCase("PxI2_BI")){
			url="jdbc:Cache://ensspi2.nychhc.org:1972/BI";
		}
		if(environment.equalsIgnoreCase("PxI2_EDSYNDROMIC")){
			url="jdbc:Cache://ensspi2.nychhc.org:1972/EDSYNDROMIC";
		}
		if(environment.equalsIgnoreCase("PxI2_HHCPATIENTVISITS")){
			url="jdbc:Cache://ensspi2.nychhc.org:1972/HHCPATIENTVISITS";
		}
		if(environment.equalsIgnoreCase("PxI2_MEASURE12")){
			url="jdbc:Cache://ensspi2.nychhc.org:1972/MEASURE12";
		}
		if(environment.equalsIgnoreCase("PxI2_MIRRORVIP2")){
			url="jdbc:Cache://ensspi2.nychhc.org:1972/MEASURE12";
		}
		if(environment.equalsIgnoreCase("PxI2_NYSQUITLINE")){
			url="jdbc:Cache://ensspi2.nychhc.org:1972/NYSQUITLINE";
		}
		if(environment.equalsIgnoreCase("PxI2_PATIENTSUMMARYREPORTS")){
			url="jdbc:Cache://ensspi2.nychhc.org:1972/PATIENTSUMMARYREPORTS";
		}
		if(environment.equalsIgnoreCase("PxI2_PRESSGANEY")){
			url="jdbc:Cache://ensspi2.nychhc.org:1972/PRESSGANEY";
		}
		if(environment.equalsIgnoreCase("PxI2_QCPRCARDIOLOGY")){
			url="jdbc:Cache://172.23.194.85:1972/QCPR_CARDIOLOGY";
		}
		if(environment.equalsIgnoreCase("QxI2_AMALGA")){
			url="jdbc:Cache://172.20.24.34:1972/AMALGA";
		}
		if(environment.equalsIgnoreCase("QxI2_DSRIP")){
			url="jdbc:Cache://172.20.24.34:1972/DSRIP";
		}
		if(environment.equalsIgnoreCase("QxI2_EDSYNDROMIC")){
			url="jdbc:Cache://172.20.24.34:1972/EDSYNDROMIC";
		}
		if(environment.equalsIgnoreCase("QxI2_HHCPATIENTVISITS")){
			url="jdbc:Cache://172.20.24.34:1972/HHCPATIENTVISITS";
		}
		if(environment.equalsIgnoreCase("QxI2_MEASURE12")){
			url="jdbc:Cache://172.20.24.34:1972/MEASURE12";
		}
		if(environment.equalsIgnoreCase("QxI2_NICS")){
			url="jdbc:Cache://172.20.24.34:1972/NICS";
		}
		if(environment.equalsIgnoreCase("QxI2_MIRRORVIP")){
			url="jdbc:Cache://172.20.24.34:1972/MIRRORVIP";
		}
		if(environment.equalsIgnoreCase("QxI2_MIRRORVIP2")){
			url="jdbc:Cache://172.20.24.34:1972/MIRRORVIP2";
		}
		if(environment.equalsIgnoreCase("QxI2_NYSQUITLINE")){
			url="jdbc:Cache://172.20.24.34:1972/NYSQUITLINE";
		}
		if(environment.equalsIgnoreCase("QxI2_PATIENTSUMMARYREPORTS")){
			url="jdbc:Cache://172.20.24.34:1972/PATIENTSUMMARYREPORTS";
		}
		if(environment.equalsIgnoreCase("QxI2_PRESSGANEY")){
			url="jdbc:Cache://172.20.24.34:1972/PRESSGANEY";
		}
		if(environment.equalsIgnoreCase("QxI2_TAPS")){
			url="jdbc:Cache://172.20.24.34:1972/TAPS";
		}
		if(environment.equalsIgnoreCase("DxI3_ENSEPIC1")){
			url="jdbc:Cache://172.20.24.46:56774/ENSEPIC1";
		}
		if(environment.equalsIgnoreCase("DxI3_BIOMED")){
			url="jdbc:Cache://172.20.24.46:56774/BIOMED";
		}
		if(environment.equalsIgnoreCase("QxI3_ENSEPIC1")){
			url="jdbc:Cache://172.23.194.71:56774/ENSEPIC1";
		}
		if(environment.equalsIgnoreCase("QxI3_MIRRORVIP2")){
			url="jdbc:Cache://172.23.194.71:56774/MIRRORVIP2";
		}
		if(environment.equalsIgnoreCase("QxI3_NANTHEALTHEPIC")){
			url="jdbc:Cache://172.20.24.33:56774/NANTHEALTHEPIC";
		}
		if(environment.equalsIgnoreCase("PxI3_ENSEPIC1")){
			url="jdbc:Cache://172.20.24.37:56773/ENSEPIC1";
		}
		if(environment.equalsIgnoreCase("PxI3_MIRRORVIP2")){
			url="jdbc:Cache://172.20.24.37:56773/ENSEPIC1";
		}
		if(environment.equalsIgnoreCase("PxI3_NANTHEALTHEPIC")){
			url="jdbc:Cache://172.20.24.37:56773/NANTHEALTHEPIC";
		}
		if(environment.equalsIgnoreCase("Q2I3eblsclqa1.nychhc.org")){
			url="jdbc:Cache://eblsclqa1.nychhc.org:56774/ENSEMBLE";
		}
		if(environment.equalsIgnoreCase("Q2I3eblsclqa2.nychhc.org")){
			url="jdbc:Cache://eblsclqa2.nychhc.org:56774/ENSEMBLE";
		}
		if(environment.equalsIgnoreCase("Q2I1eblsclqa1.nychhc.org")){
			url="jdbc:Cache://eblsclqa1.nychhc.org:56774/ENSEMBLE";
		}
		if(environment.equalsIgnoreCase("Q2I1eblsclqa2.nychhc.org")){
			url="jdbc:Cache://eblsclqa2.nychhc.org:56774/ENSEMBLE";
		}
		if(environment.equalsIgnoreCase("Q2I2eblscoqa1.nychhc.org")){
			url="jdbc:Cache://eblscoqa1.nychhc.org:1972/ENSEMBLE";
		}
		if(environment.equalsIgnoreCase("Q2I2eblscoqa2.nychhc.org")){
			url="jdbc:Cache://eblscoqa2.nychhc.org:1972/ENSEMBLE";
		}
		if(environment.equalsIgnoreCase("Q2I1eblsclqa1.nychhc.org")){
			url="jdbc:Cache://172.23.194.72:1972/ENSEMBLE";
		}
		if(environment.equalsIgnoreCase("Q1I3ebljclqa1.nychhc.org")){
			url="jdbc:Cache://ebljclqa1.nychhc.org:56774/ENSEMBLE";
		}
		if(environment.equalsIgnoreCase("Q1I3ebljclqa2.nychhc.org")){
			url="jdbc:Cache://ebljclqa2.nychhc.org:56774/ENSEMBLE";
		}
		if(environment.equalsIgnoreCase("Q1I1ebljclqa1.nychhc.org")){
			url="jdbc:Cache://ebljclqa1.nychhc.org:1972/ENSEMBLE";
		}
		if(environment.equalsIgnoreCase("Q1I1ebljclqa2.nychhc.org")){
			url="jdbc:Cache://ebljclqa2.nychhc.org:1972/ENSEMBLE";
		}
		if(environment.equalsIgnoreCase("Q1I2ebljcoqa1.nychhc.org")){
			url="jdbc:Cache://ebljcoqa1.nychhc.org:1972/ENSEMBLE";
		}
		if(environment.equalsIgnoreCase("Q1I2ebljcoqa2.nychhc.org")){
			url="jdbc:Cache://172.24.194.75:1972/ENSEMBLE";
		}
		if(environment.equalsIgnoreCase("D1I1ebljdev1.nychhc.org")){
			url="jdbc:Cache://ebljdev1.nychhc.org:1972/ENSEMBLE";
		}
		if(environment.equalsIgnoreCase("D1I2ebljdev1.nychhc.org")){
			url="jdbc:Cache://ebljdev1.nychhc.org:56773/ENSEMBLE";
		}
		if(environment.equalsIgnoreCase("D1I3ebljdev1.nychhc.org")){
			url="jdbc:Cache://ebljdev1.nychhc.org:56774/ENSEMBLE";
		}
		if(environment.equalsIgnoreCase("D2I1eblsdev1.nychhc.org")){
			url="jdbc:Cache://eblsdev1.nychhc.org:1972/ENSEMBLE";
		}
		if(environment.equalsIgnoreCase("D2I2eblsdev1.nychhc.org")){
			url="jdbc:Cache://eblsdev1.nychhc.org:56773/ENSEMBLE";
		}
		if(environment.equalsIgnoreCase("D2I3eblsdev1.nychhc.org")){
			url="jdbc:Cache://eblsdev1.nychhc.org:56774/ENSEMBLE";
		}
		
		if(environment.equalsIgnoreCase("P1I1ebljclpd1.nychhc.org")){
			url="jdbc:Cache://ebljclpd1.nychhc.org:1971/ENSEMBLE";
		}
		if(environment.equalsIgnoreCase("P1I1ebljclpd2.nychhc.org")){
			url="jdbc:Cache://ebljclpd2.nychhc.org:1971/ENSEMBLE";
		}
		if(environment.equalsIgnoreCase("P1I2ebljcopd1.nychhc.org")){
			url="jdbc:Cache://ebljcopd1.nychhc.org:1972/ENSEMBLE";
		}
		if(environment.equalsIgnoreCase("P1I2ebljcopd2.nychhc.org")){
			url="jdbc:Cache://ebljcopd2.nychhc.org:1972/ENSEMBLE";
		}
		if(environment.equalsIgnoreCase("P2I1eblsclpd1.nychhc.org")){
			url="jdbc:Cache://eblsclpd1.nychhc.org:1971/ENSEMBLE";
		}
		if(environment.equalsIgnoreCase("P2I1eblsclpd2.nychhc.org")){
			url="jdbc:Cache://eblsclpd2.nychhc.org:1971/ENSEMBLE";
		}
		if(environment.equalsIgnoreCase("P2I2eblscopd1.nychhc.org")){
			url="jdbc:Cache://eblscopd1.nychhc.org:1972/ENSEMBLE";
		}
		if(environment.equalsIgnoreCase("P2I2eblscopd2.nychhc.org")){
			url="jdbc:Cache://eblscopd2.nychhc.org:1972/ENSEMBLE";
		}
		if(environment.equalsIgnoreCase("P1I3ebljclpd1.nychhc.org")){
			url="jdbc:Cache://ebljclpd1.nychhc.org:56773/ENSEMBLE";
		}
		if(environment.equalsIgnoreCase("P1I3ebljclpd2.nychhc.org")){
			url="jdbc:Cache://ebljclpd2.nychhc.org:56773/ENSEMBLE";
		}
		if(environment.equalsIgnoreCase("P2I3eblsclpd1.nychhc.org")){
			url="jdbc:Cache://eblsclpd1.nychhc.org:56773/ENSEMBLE";
		}
		if(environment.equalsIgnoreCase("P2I3eblsclpd2.nychhc.org")){
			url="jdbc:Cache://eblsclpd2.nychhc.org:56773/ENSEMBLE";
		}
		
	
		//if (environment.equalsIgnoreCase("Q2I1eblsclqa1.nychhc.org")){
			username="christools";
			pwd="Chr1$T00l$!";
		//}
		
		//System.out.println("DataAccess: asking for a connection to "+url+" "+username+" "+pwd);
		
		try{
			db = CacheDatabase.getDatabase(url, username, pwd);
			//System.out.println("PortSearchHandler: Connection to "+environment+" obtained successfully");
		}
		catch(Exception e){
			System.out.println("DataAccess: Establish connection to "+environment+" failed -> "+e.getMessage());
			//errorMessage = "Information from "+environment+" is not shown. Unable to connect to namespace";
			db=null;
		}
		
		
		return db;
		
	}
	
	public static void CloseConn(Database db){
		
		try{
			db.close();
		}
		catch(CacheException ce){
			System.out.println(ce.getMessage());
		}
		
	}
}
