package com.gf.ny.persist;

//Alegent Creighton

import java.sql.Connection;
import java.sql.SQLException;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

public class DataSource{ 
	
	private static Logger log = Logger.getLogger("DataSource");
	private static String sqlserver = "sqlserver";
	private static String mysql = "mysql";
	private static String cache = "cache";
	private static String postgre = "postgre";
	private static String url = null;
	private static String driverName;
	private static String test="TEST";
	private static String live="LIVE";
	private static String parms[],namespace;
	private static String user,pw,serverName,databaseName,protocol,portNo,connParm;
	
	/*
	 * SPRING PROPERTIES 
	 * 
	 */ 
//	private IDsManager dataManager;

//	@Autowired
//	public void setDataManager(IDsManager dataManager){
//		this.dataManager = dataManager;
//	}
	
	public static Connection GetEnsembleConnection(String instance){
		
		PropertyConfigurator.configure("c:/home/java/cfg/postgre_config-JDBC.properties");
		
		Connection c=null;
		String server=null;
		String port=null;
		String nameSpace=null;
		String user = "christools";
		String pw = "Chr1$T00l$!";
		
		try {
			
			if(instance.equalsIgnoreCase("PxI3_ENSEPIC1")){
				server = "172.20.24.37";
				port = "56773";
				nameSpace = "ENSEPIC1";
			}
			
			if(instance.equalsIgnoreCase("PxI1_SOARIAN")){
				server = "172.20.24.36";
				port = "1971";
				nameSpace = "SOARIAN";
			}
			
			if(instance.equalsIgnoreCase("PxI1_INTERBORORHIO")){
				server = "172.20.24.36";
				port = "1971";
				nameSpace = "INTERBORORHIO";
			}
			
			if(instance.equalsIgnoreCase("QxI3_ENSEPIC2017")){
				server = "172.20.24.33";
				port = "56774";
				nameSpace = "ENSEPIC2017";
			}
			
			if(instance.equalsIgnoreCase("QxI3_ENSEPIC1")){
				server = "172.20.24.33";
				port = "56774";
				nameSpace = "ENSEPIC1";
			}
			
			if(instance.equalsIgnoreCase("QxI3_ENSEPIC1V2")){
				server = "172.20.24.33";
				port = "56774";
				nameSpace = "ENSEPIC1V2";
			}
			
			if(instance.equalsIgnoreCase("QxI1_CLINICAL")){
				server = "eblsclqa.nychhc.org";
				port = "1972";
				nameSpace = "CLINICAL";
			}
			
			driverName = "com.intersys.jdbc.CacheDataSource";
    		Class.forName(driverName).newInstance();	//register the JDBC driver
    		log.info("Registered the cache driver");
    		protocol = "jdbc:Cache://";
    		url = protocol + server + ":" + port + "/" + nameSpace;
        	connParm = url;
        	log.info("The cache url: "+url);
			c = JDBCManager.getConnection(url,user,pw);
        	log.info("obtained a connection to: "+nameSpace);

		}
		catch(Exception e){
			log.error(server+":"+port+"/"+nameSpace+" : "+e.getMessage());
		}
		
		if(url.equalsIgnoreCase("jdbc:Cache://eblsclpd.nychhc.org:1972/ADT")){
			System.out.println("Break point");
		}
		
		return c;
	}
	
	public Connection ConfigConn(String database, String environment, String INTERFACE){
		
//		if(database.equalsIgnoreCase("cache")){
//			PropertyConfigurator.configure("cfg/cache_config-JDBC.properties");
//		}
//		else{
//			PropertyConfigurator.configure("cfg/mysql_config-JDBC.properties");
//		}
		
		//PropertyConfigurator.configure("cfg/postgre_config-JDBC.properties");
		PropertyConfigurator.configure("c:/home/java/cfg/postgre_config-JDBC.properties");
		
		Connection c=null;
		
		try {
			
            
            if(database.equalsIgnoreCase(cache)){
            	
            	driverName = "com.intersys.jdbc.CacheDataSource";
        		Class.forName(driverName).newInstance();	//register the JDBC driver
        		log.info("Registered the "+database+" driver");
        		protocol = "jdbc:Cache://";
        		user = "poundc";
        		pw = "J9h4c897!";
            	
            	if (environment.equalsIgnoreCase(test)){
            	
            		serverName = "localhost";
            		databaseName = "SAMPLES";
            		
            	}
            	
            	if (environment.equalsIgnoreCase(live)){
                	
            		if(INTERFACE.substring(0, 4).equalsIgnoreCase("D1I3")){
            			portNo = "56774"; 
            			serverName = "172.24.214.4";  
                		parms = INTERFACE.split(":");
            			namespace = parms[1].trim();
            			
            			if(namespace.equalsIgnoreCase("ENSEPIC1")){
            				databaseName = "ENSEPIC1";
            			}
            			if(namespace.equalsIgnoreCase("EPICADT1")){
            				databaseName = "EPICADT1";
            			}
            			if(namespace.equalsIgnoreCase("HSLIB")){
            				databaseName = "HSLIB";
            			}
            			if(namespace.equalsIgnoreCase("MIRRORVIP")){
            				databaseName = "MIRRORVIP";
            			}
            			if(namespace.equalsIgnoreCase("SOARIAN")){
            				databaseName = "SOARIAN";
            			}
            		}
            		else if(INTERFACE.substring(0, 4).equalsIgnoreCase("Q1I3")){
            			portNo = "56774";
            			serverName = "172.24.214.20";
            			parms = INTERFACE.split(":");
            			namespace = parms[1].trim();
            			
            			if(namespace.equalsIgnoreCase("ENSEPIC1")){
            				databaseName = "ENSEPIC1";
            			}
            			if(namespace.equalsIgnoreCase("ENSDEMO")){
            				databaseName = "ENSDEMO";
            			}
                		if(namespace.equalsIgnoreCase("ENSEMBLE")){
            				databaseName = "ENSEMBLE";
            			}
            			if(namespace.equalsIgnoreCase("HSLIB")){
            				databaseName = "HSLIB";
            			}
            			if(namespace.equalsIgnoreCase("MIRRORVIP")){
            				databaseName = "MIRRORVIP";
            			}
            			if(namespace.equalsIgnoreCase("VIEWERLIB")){
            				databaseName = "VIEWERLIB";
            			}
            		}
            		else if(INTERFACE.substring(0, 4).equalsIgnoreCase("P1I1")){
            			portNo = "1972";
            			serverName = "172.24.214.21";
            			parms = INTERFACE.split(":");
            			namespace = parms[1].trim();
            			
            			if(namespace.equalsIgnoreCase("ADT")){
            				databaseName = "ADT";
            			}
            			if(namespace.equalsIgnoreCase("ANCILLARY")){
            				databaseName = "ANCILLARY";
            			}
            			if(namespace.equalsIgnoreCase("BLOODBANK")){
            				databaseName = "BLOODBANK";
            			}
            			if(namespace.equalsIgnoreCase("CLINICAL")){
            				databaseName = "CLINICAL";
            			}
            			if(namespace.equalsIgnoreCase("DASHBOARDED")){
            				databaseName = "DASHBOARDED";
            			}
            			if(namespace.equalsIgnoreCase("ELMHURSTED")){
            				databaseName = "ELMHURSTED";
            			}
            			if(namespace.equalsIgnoreCase("IMMUNIZATIONDOH")){
            				databaseName = "IMMUNIZATIONDOH";
            			}
            			if(namespace.equalsIgnoreCase("INTERBORORHIO")){
            				databaseName = "INTERBORORHIO";
            			}
            			if(namespace.equalsIgnoreCase("ENSDEMO")){
            				databaseName = "ENSDEMO";
            			}
            			if(namespace.equalsIgnoreCase("ENSEMBLE")){
            				databaseName = "ENSEMBLE";
            			}
            			if(namespace.equalsIgnoreCase("HSLIB")){
            				databaseName = "HSLIB";
            			}
            			if(namespace.equalsIgnoreCase("MIRRORVIP")){
            				databaseName = "MIRRORVIP";
            			}
            			if(namespace.equalsIgnoreCase("VIEWERLIB")){
            				databaseName = "VIEWERLIB";
            			}
            		}
            		else if(INTERFACE.substring(0, 4).equalsIgnoreCase("P1I2")){
            			portNo = "1972";
            			serverName = "172.24.214.11";
            			parms = INTERFACE.split(":");
            			namespace = parms[1].trim();
            			
            			if(namespace.equalsIgnoreCase("AMALGA")){
            				databaseName = "AMALGA";
            			}
            			if(namespace.equalsIgnoreCase("ENSDEMO")){
            				databaseName = "ENSDEMO";
            			}
            			if(namespace.equalsIgnoreCase("ENSEMBLE")){
            				databaseName = "ENSEMBLE";
            			}
            			if(namespace.equalsIgnoreCase("HSLIB")){
            				databaseName = "HSLIB";
            			}
            			if(namespace.equalsIgnoreCase("MIRRORVIP")){
            				databaseName = "MIRRORVIP";
            			}
            			if(namespace.equalsIgnoreCase("HHCPATIENTVISITS")){
            				databaseName = "HHCPATIENTVISITS";
            			}
            			if(namespace.equalsIgnoreCase("PATIENTSUMMARYREPORTS")){
            				databaseName = "PATIENTSUMMARYREPORTS";
            			}
            			if(namespace.equalsIgnoreCase("PRESSGANEY")){
            				databaseName = "PRESSGANEY";
            			}
            		}
            		
            		else if(INTERFACE.substring(0,8).equalsIgnoreCase("ENS4DOH3")){  /* VMS PROD */
            			portNo = "1972";
            			serverName = "172.23.66.23";
            			parms = INTERFACE.split(":");
            			namespace = parms[1].trim();
            			
            			if(namespace.equalsIgnoreCase("EDSYNDROMIC")){
            				databaseName = "EDSYNDROMIC";
            			}
            			if(namespace.equalsIgnoreCase("EHCPSR")){
            				databaseName = "EHCPSR";
            			}
            			if(namespace.equalsIgnoreCase("NYCCSM")){
            				databaseName = "NYCCSM";
            			}
            			if(namespace.equalsIgnoreCase("NYCHHC")){
            				databaseName = "NYCHHC";
            			}
            			if(namespace.equalsIgnoreCase("TAPANDQUEUE")){
            				databaseName = "TAPANDQUEUE";
            			}
            			if(namespace.equalsIgnoreCase("ENSDEMO")){
            				databaseName = "ENSDEMO";
            			}
            			if(namespace.equalsIgnoreCase("ENSEMBLE")){
            				databaseName = "ENSEMBLE";
            			}
            			if(namespace.equalsIgnoreCase("NYCHHC_TEMP")){
            				databaseName = "NYCHHC_TEMP";
            			}
            		}
            		
            		else if(INTERFACE.substring(0,11).equalsIgnoreCase("ENSA4TEST2B")){  /* VMS DEV */
            			portNo = "1977";
            			serverName = "172.24.39.52";
            			parms = INTERFACE.split(":");
            			namespace = parms[1].trim();
            			
            			if(namespace.equalsIgnoreCase("CAREMGT")){
            				databaseName = "CAREMGT";
            			}
            			if(namespace.equalsIgnoreCase("COMET")){
            				databaseName = "COMET";
            			}
            			if(namespace.equalsIgnoreCase("EDDASHBOARD")){
            				databaseName = "EDDASHBOARD";
            			}
            			if(namespace.equalsIgnoreCase("EDSYNDROMIC")){
            				databaseName = "EDSYNDROMIC";
            			}
            			if(namespace.equalsIgnoreCase("EHCPSR")){
            				databaseName = "EHCPSR";
            			}
            			if(namespace.equalsIgnoreCase("HCLL_PROD")){
            				databaseName = "HCLL_PROD";
            			}
            			if(namespace.equalsIgnoreCase("IMMUNIZATION")){
            				databaseName = "IMMUNIZATION";
            			}
            			if(namespace.equalsIgnoreCase("NYCCSM")){
            				databaseName = "NYCCSM";
            			}
            			if(namespace.equalsIgnoreCase("NYCHHCEHC")){
            				databaseName = "NYCHHCEHC";
            			}
            			if(namespace.equalsIgnoreCase("POWERSCRIBE360")){
            				databaseName = "POWERSCRIBE360";
            			}
            			if(namespace.equalsIgnoreCase("PRESSGANEY")){
            				databaseName = "PRESSGANEY";
            			}
            			if(namespace.equalsIgnoreCase("QS1")){
            				databaseName = "QS1";
            			}
            			if(namespace.equalsIgnoreCase("RHIO")){
            				databaseName = "RHIO";
            			}
            			if(namespace.equalsIgnoreCase("ENSDEMO")){
            				databaseName = "ENSDEMO";
            			}
            			if(namespace.equalsIgnoreCase("ENSEMBLE")){
            				databaseName = "ENSEMBLE";
            			}
            			if(namespace.equalsIgnoreCase("TELETRACKING")){
            				databaseName = "TELETRACKING";
            			}
            		}
            		
            		
            		else if(INTERFACE.substring(0,12).equalsIgnoreCase("ENSEMBLEDEV2")){  /* VMS QA */
            			portNo = "1974";
            			serverName = "172.24.39.51";
            			parms = INTERFACE.split(":");
            			namespace = parms[1].trim();
            			
            			if(namespace.equalsIgnoreCase("AMALGA")){
            				databaseName = "AMALGA";
            			}
            			if(namespace.equalsIgnoreCase("DENTRIX")){
            				databaseName = "DENTRIX";
            			}
            			if(namespace.equalsIgnoreCase("EDSYNDROMIC")){
            				databaseName = "EDSYNDROMIC";
            			}
            			if(namespace.equalsIgnoreCase("EHCPSR")){
            				databaseName = "EHCPSR";
            			}
            			if(namespace.equalsIgnoreCase("HCLL")){
            				databaseName = "HCLL";
            			}
            			if(namespace.equalsIgnoreCase("NYCHHC")){
            				databaseName = "NYCHHC";
            			}
            			if(namespace.equalsIgnoreCase("POWERSCRIBE360")){
            				databaseName = "POWERSCRIBE360";
            			}
            			if(namespace.equalsIgnoreCase("PRESSGANEY")){
            				databaseName = "PRESSGANEY";
            			}
            			if(namespace.equalsIgnoreCase("TAPANDQUEUE")){
            				databaseName = "TAPANDQUEUE";
            			}
            			if(namespace.equalsIgnoreCase("ENSEMBLE")){
            				databaseName = "ENSEMBLE";
            			}
            			if(namespace.equalsIgnoreCase("ENSDEMO")){
            				databaseName = "ENSDEMO";
            			}
            		}
            		
            		else if(INTERFACE.substring(0,4).equalsIgnoreCase("Q1I1")){ 
            			portNo = "1972";
            			serverName = "ebljclqa.nychhc.org";
            			parms = INTERFACE.split(":");
            			namespace = parms[1].trim();
            			
            			
            			if(namespace.equalsIgnoreCase("ADT")){
            				databaseName = "ADT";
            			}
            			if(namespace.equalsIgnoreCase("ANCILLARY")){
            				databaseName = "ANCILLARY";
            			}
            			if(namespace.equalsIgnoreCase("BLOODBANK")){
            				databaseName = "BLOODBANK";
            			}
            			if(namespace.equalsIgnoreCase("CLINICAL")){
            				databaseName = "CLINICAL";
            			}
            			if(namespace.equalsIgnoreCase("DASHBOARDED")){
            				databaseName = "DASHBOARDED";
            			}
            			if(namespace.equalsIgnoreCase("ELMHURSTED")){
            				databaseName = "ELMHURSTED";
            			}
            			if(namespace.equalsIgnoreCase("HSLIB")){
            				databaseName = "HSLIB";
            			}
            			if(namespace.equalsIgnoreCase("IMMUNIZATIONDOH")){
            				databaseName = "IMMUNIZATIONDOH";
            			}
            			if(namespace.equalsIgnoreCase("INTERBORORHIO")){
            				databaseName = "INTERBORORHIO";
            			}
            			if(namespace.equalsIgnoreCase("ENSDEMO")){
            				databaseName = "ENSDEMO";
            			}
            			if(namespace.equalsIgnoreCase("ENSEMBLE")){
            				databaseName = "ENSEMBLE";
            			}
            			if(namespace.equalsIgnoreCase("MIRRORVIP")){
            				databaseName = "MIRRORVIP";
            			}
            			if(namespace.equalsIgnoreCase("VIEWERLIB")){
            				databaseName = "VIEWERLIB";
            			}
            			
            		}
            		
            		
            		else if(INTERFACE.substring(0,4).equalsIgnoreCase("Q1I2")){ 
            			portNo = "1972";
            			serverName = "ebljcoqa.nychhc.org";
            			parms = INTERFACE.split(":");
            			namespace = parms[1].trim();
            			
            			
            			if(namespace.equalsIgnoreCase("AMALGA")){
            				databaseName = "AMALGA";
            			}
            			if(namespace.equalsIgnoreCase("ENSDEMO")){
            				databaseName = "ENSDEMO";
            			}
            			if(namespace.equalsIgnoreCase("ENSEMBLE")){
            				databaseName = "ENSEMBLE";
            			}
            			if(namespace.equalsIgnoreCase("HHCPATIENTVISITS")){
            				databaseName = "HHCPATIENTVISITS";
            			}
            			if(namespace.equalsIgnoreCase("HSLIB")){
            				databaseName = "HSLIB";
            			}
            			if(namespace.equalsIgnoreCase("MIRRORVIP")){
            				databaseName = "MIRRORVIP";
            			}
            			if(namespace.equalsIgnoreCase("PATIENTSUMMARYREPORTS")){
            				databaseName = "PATIENTSUMMARYREPORTS";
            			}
            			if(namespace.equalsIgnoreCase("PG-BACKUP")){
            				databaseName = "PG-BACKUP";
            			}
            			if(namespace.equalsIgnoreCase("PRESSGANEY")){
            				databaseName = "PRESSGANEY";
            			}
            			if(namespace.equalsIgnoreCase("VIEWERLIB")){
            				databaseName = "VIEWERLIB";
            			}
            		}
            		
            		else if(INTERFACE.substring(0,4).equalsIgnoreCase("P2I2")){ 
            			portNo = "56774";
            			serverName = "172.23.214.11";
            			parms = INTERFACE.split(":");
            			namespace = parms[1].trim();
            			
            			
            			if(namespace.equalsIgnoreCase("AMALGA")){
            				databaseName = "AMALGA";
            			}
            			if(namespace.equalsIgnoreCase("ENSDEMO")){
            				databaseName = "ENSDEMO";
            			}
            			if(namespace.equalsIgnoreCase("ENSEMBLE")){
            				databaseName = "ENSEMBLE";
            			}
            			if(namespace.equalsIgnoreCase("HHCPATIENTVISITS")){
            				databaseName = "HHCPATIENTVISITS";
            			}
            			if(namespace.equalsIgnoreCase("HSLIB")){
            				databaseName = "HSLIB";
            			}
            			if(namespace.equalsIgnoreCase("MIRRORVIP")){
            				databaseName = "MIRRORVIP";
            			}
            			if(namespace.equalsIgnoreCase("PATIENTSUMMARYREPORTS")){
            				databaseName = "PATIENTSUMMARYREPORTS";
            			}
            			if(namespace.equalsIgnoreCase("PRESSGANEY")){
            				databaseName = "PRESSGANEY";
            			}
            		}
            		
            		else if(INTERFACE.substring(0,4).equalsIgnoreCase("Q2I2")){ 
            			portNo = "56773";
            			serverName = "eblscoqa.nychhc.org";
            			parms = INTERFACE.split(":");
            			namespace = parms[1].trim();
            			
            			
            			if(namespace.equalsIgnoreCase("AMALGA")){
            				databaseName = "AMALGA";
            			}
            			if(namespace.equalsIgnoreCase("ENSDEMO")){
            				databaseName = "ENSDEMO";
            			}
            			if(namespace.equalsIgnoreCase("ENSEMBLE")){
            				databaseName = "ENSEMBLE";
            			}
            			if(namespace.equalsIgnoreCase("HHCPATIENTVISITS")){
            				databaseName = "HHCPATIENTVISITS";
            			}
            			if(namespace.equalsIgnoreCase("HSLIB")){
            				databaseName = "HSLIB";
            			}
            			if(namespace.equalsIgnoreCase("MIRRORVIP")){
            				databaseName = "MIRRORVIP";
            			}
            			if(namespace.equalsIgnoreCase("PATIENTSUMMARYREPORTS")){
            				databaseName = "PATIENTSUMMARYREPORTS";
            			}
            			if(namespace.equalsIgnoreCase("PRESSGANEY")){
            				databaseName = "PRESSGANEY";
            			}
            		}
            		else if(INTERFACE.substring(0,4).equalsIgnoreCase("P1I3")){ 
            			portNo = "56773";
            			serverName = "ebljclpd.nychhc.org";
            			parms = INTERFACE.split(":");
            			namespace = parms[1].trim();
            			
            			if(namespace.equalsIgnoreCase("ENSDEMO")){
            				databaseName = "ENSDEMO";
            			}
            			if(namespace.equalsIgnoreCase("ENSEMBLE")){
            				databaseName = "ENSEMBLE";
            			}
            			if(namespace.equalsIgnoreCase("ENSEPIC1")){
            				databaseName = "ENSEPIC1";
            			}
            			if(namespace.equalsIgnoreCase("HSLIB")){
            				databaseName = "HSLIB";
            			}
            			if(namespace.equalsIgnoreCase("MIRRORVIP")){
            				databaseName = "MIRRORVIP";
            			}
            			if(namespace.equalsIgnoreCase("VIEWERLIB")){
            				databaseName = "VIEWERLIB";
            			}
            		}
            		
            		else if(INTERFACE.substring(0,4).equalsIgnoreCase("D1I1")){ 
            			portNo = "1972";
            			serverName = "ebljdev1.nychhc.org";
            			parms = INTERFACE.split(":");
            			namespace = parms[1].trim();
            			
            			if(namespace.equalsIgnoreCase("A4TELETRKNG")){
            				databaseName = "A4TELETRKNG";
            			}
            			if(namespace.equalsIgnoreCase("ADT")){
            				databaseName = "ADT";
            			}
            			if(namespace.equalsIgnoreCase("ANCILLARY")){
            				databaseName = "ANCILLARY";
            			}
            			if(namespace.equalsIgnoreCase("BLOODBANK")){
            				databaseName = "BLOODBANK";
            			}
            			if(namespace.equalsIgnoreCase("CAREMGT")){
            				databaseName = "CAREMGT";
            			}
            			if(namespace.equalsIgnoreCase("CLINICAL")){
            				databaseName = "CLINICAL";
            			}
            			if(namespace.equalsIgnoreCase("DASHBOARDED")){
            				databaseName = "DASHBOARDED";
            			}
            			if(namespace.equalsIgnoreCase("EDSYNDROMIC")){
            				databaseName = "EDSYNDROMIC";
            			}
            			if(namespace.equalsIgnoreCase("ELMHURSTED")){
            				databaseName = "ELMHURSTED";
            			}
            			if(namespace.equalsIgnoreCase("ENSDEMO")){
            				databaseName = "ENSDEMO";
            			}
            			if(namespace.equalsIgnoreCase("ENSEMBLE")){
            				databaseName = "ENSEMBLE";
            			}
            			if(namespace.equalsIgnoreCase("HSLIB")){
            				databaseName = "HSLIB";
            			}
            			if(namespace.equalsIgnoreCase("IMMUNIZATION")){
            				databaseName = "IMMUNIZATION";
            			}
            			if(namespace.equalsIgnoreCase("MIRRORVIP")){
            				databaseName = "MIRRORVIP";
            			}
            			if(namespace.equalsIgnoreCase("RHIO")){
            				databaseName = "RHIO";
            			}
            			if(namespace.equalsIgnoreCase("TEST")){
            				databaseName = "TEST";
            			}
            			if(namespace.equalsIgnoreCase("VIEWERLIB")){
            				databaseName = "VIEWERLIB";
            			}
            			
            		}
            		
            		else if(INTERFACE.substring(0,4).equalsIgnoreCase("D1I2")){ 
            			portNo = "56773";
            			serverName = "ebljdev1.nychhc.org";
            			parms = INTERFACE.split(":");
            			namespace = parms[1].trim();
            			
            			if(namespace.equalsIgnoreCase("AMALGA")){
            				databaseName = "AMALGA";
            			}
            			if(namespace.equalsIgnoreCase("DENTRIX")){
            				databaseName = "DENTRIX";
            			}
            			if(namespace.equalsIgnoreCase("ENSDEMO")){
            				databaseName = "ENSDEMO";
            			}
            			if(namespace.equalsIgnoreCase("ENSEMBLE")){
            				databaseName = "ENSEMBLE";
            			}
            			if(namespace.equalsIgnoreCase("HHCPATIENTVISITS")){
            				databaseName = "HHCPATIENTVISITS";
            			}
            			if(namespace.equalsIgnoreCase("HSLIB")){
            				databaseName = "HSLIB";
            			}
            			if(namespace.equalsIgnoreCase("MEASURE12")){
            				databaseName = "MEASURE12";
            			}
            			if(namespace.equalsIgnoreCase("MIRRORVIP")){
            				databaseName = "MIRRORVIP";
            			}
            			if(namespace.equalsIgnoreCase("PATIENTREPORTING")){
            				databaseName = "PATIENTREPORTING";
            			}
            			if(namespace.equalsIgnoreCase("PRESSGANEY")){
            				databaseName = "PRESSGANEY";
            			}
            			if(namespace.equalsIgnoreCase("QS1PHARMACY")){
            				databaseName = "QS1PHARMACY";
            			}
            			if(namespace.equalsIgnoreCase("TMPENSEPIC")){
            				databaseName = "TMPENSEPIC";
            			}
            			if(namespace.equalsIgnoreCase("VIEWERLIB")){
            				databaseName = "VIEWERLIB";
            			}
            			
            		}
            		
            		else if(INTERFACE.substring(0,4).equalsIgnoreCase("P2I1")){ 
            			portNo = "1972";
            			serverName = "eblsclpd.nychhc.org";
            			parms = INTERFACE.split(":");
            			namespace = parms[1].trim();
            			
            			if(namespace.equalsIgnoreCase("ADT")){
            				databaseName = "ADT";
            			}
            			if(namespace.equalsIgnoreCase("ANCILLARY")){
            				databaseName = "ANCILLARY";
            			}
            			if(namespace.equalsIgnoreCase("BLOODBANK")){
            				databaseName = "BLODDBANK";
            			}
            			if(namespace.equalsIgnoreCase("CLINICAL")){
            				databaseName = "CLINICAL";
            			}
            			if(namespace.equalsIgnoreCase("DASHBOARDED")){
            				databaseName = "DASHBOARDED";
            			}
            			if(namespace.equalsIgnoreCase("ELMHURSTED")){
            				databaseName = "ELMHURSTED";
            			}
            			if(namespace.equalsIgnoreCase("ENSDEMO")){
            				databaseName = "ENSDEMO";
            			}
            			if(namespace.equalsIgnoreCase("ENSEMBLE")){
            				databaseName = "ENSEMBLE";
            			}
            			if(namespace.equalsIgnoreCase("HSLIB")){
            				databaseName = "HSLIB";
            			}
            			if(namespace.equalsIgnoreCase("IMMUNIZATIONDOH")){
            				databaseName = "IMMUNIZATIONDOH";
            			}
            			if(namespace.equalsIgnoreCase("INTERBORORHIO")){
            				databaseName = "INTERBORORHIO";
            			}
            			if(namespace.equalsIgnoreCase("MIRRORVIP")){
            				databaseName = "MIRRORVIP";
            			}
            			if(namespace.equalsIgnoreCase("VIEWERLIB")){
            				databaseName = "VIEWERLIB";
            			}
            			
            		}
            		
            		else if(INTERFACE.substring(0,4).equalsIgnoreCase("P2I3")){ 
            			portNo = "56773";
            			serverName = "eblsclpd.nychhc.org";
            			parms = INTERFACE.split(":");
            			namespace = parms[1].trim();
            			
            			if(namespace.equalsIgnoreCase("ENSDEMO")){
            				databaseName = "ENSDEMO";
            			}
            			if(namespace.equalsIgnoreCase("ENSEMBLE")){
            				databaseName = "ENSEMBLE";
            			}
            			if(namespace.equalsIgnoreCase("ENSEPIC1")){
            				databaseName = "ENSEPIC1";
            			}
            			if(namespace.equalsIgnoreCase("HSLIB")){
            				databaseName = "HSLIB";
            			}
            			if(namespace.equalsIgnoreCase("MIRRORVIP")){
            				databaseName = "MIRRORVIP";
            			}
            			if(namespace.equalsIgnoreCase("VIEWERLIB")){
            				databaseName = "VIEWERLIB";
            			}
            		}
            		
            		else if(INTERFACE.substring(0,4).equalsIgnoreCase("Q2I3")){ 
            			portNo = "56774";
            			serverName = "eblsclqa.nychhc.org";
            			parms = INTERFACE.split(":");
            			namespace = parms[1].trim();
            			
            			if(namespace.equalsIgnoreCase("ENSDEMO")){
            				databaseName = "ENSDEMO";
            			}
            			if(namespace.equalsIgnoreCase("ENSEMBLE")){
            				databaseName = "ENSEMBLE";
            			}
            			if(namespace.equalsIgnoreCase("HSLIB")){
            				databaseName = "HSLIB";
            			}
            			if(namespace.equalsIgnoreCase("MIRRORVIP")){
            				databaseName = "MIRRORVIP";
            			}
            			if(namespace.equalsIgnoreCase("VIEWERLIB")){
            				databaseName = "VIEWERLIB";
            			}
            		}
            		
            		else if(INTERFACE.substring(0,4).equalsIgnoreCase("Q2I2")){ 
            			portNo = "56773";
            			serverName = "eblscoqa.nychhc.org";
            			parms = INTERFACE.split(":");
            			namespace = parms[1].trim();
            			
            			if(namespace.equalsIgnoreCase("AMALGA")){
            				databaseName = "AMALGA";
            			}
            			if(namespace.equalsIgnoreCase("ENSDEMO")){
            				databaseName = "ENSDEMO";
            			}
            			if(namespace.equalsIgnoreCase("ENSEMBLE")){
            				databaseName = "ENSEMBLE";
            			}
            			if(namespace.equalsIgnoreCase("HHCPATIENTVISITS")){
            				databaseName = "HHCPATIENTVISITS";
            			}
            			if(namespace.equalsIgnoreCase("HSLIB")){
            				databaseName = "HSLIB";
            			}
            			if(namespace.equalsIgnoreCase("MIRRORVIP")){
            				databaseName = "MIRRORVIP";
            			}
            			if(namespace.equalsIgnoreCase("PATIENTSUMMARYREPORTS")){
            				databaseName = "PATIENTSUMMARYREPORTS";
            			}
            			if(namespace.equalsIgnoreCase("PRESSGANEY")){
            				databaseName = "PRESSGANEY";
            			}
            		}
            		
            		else if(INTERFACE.substring(0,4).equalsIgnoreCase("D2I1")){ 
            			portNo = "1972";
            			serverName = "eblsdev1.nychhc.org";
            			parms = INTERFACE.split(":");
            			namespace = parms[1].trim();
            			
            			if(namespace.equalsIgnoreCase("A4TELETRKNG")){
            				databaseName = "A4TELETRKNG";
            			}
            			if(namespace.equalsIgnoreCase("ADT")){
            				databaseName = "ADT";
            			}
            			if(namespace.equalsIgnoreCase("ANCILLARY")){
            				databaseName = "ANCILLARY";
            			}
            			if(namespace.equalsIgnoreCase("BLOODBANK")){
            				databaseName = "BLOODBANK";
            			}
            			if(namespace.equalsIgnoreCase("CAREMGT")){
            				databaseName = "CAREMGT";
            			}
            			if(namespace.equalsIgnoreCase("CLINICAL")){
            				databaseName = "CLINICAL";
            			}
            			if(namespace.equalsIgnoreCase("DASHBOARDED")){
            				databaseName = "DASHBOARDED";
            			}
            			if(namespace.equalsIgnoreCase("EDSYNDROMIC")){
            				databaseName = "EDSYNDROMIC";
            			}
            			if(namespace.equalsIgnoreCase("ELMHURSTED")){
            				databaseName = "ELMHURSTED";
            			}
            			if(namespace.equalsIgnoreCase("ENSDEMO")){
            				databaseName = "ENSDEMO";
            			}
            			if(namespace.equalsIgnoreCase("ENSEMBLE")){
            				databaseName = "ENSEMBLE";
            			}
            			if(namespace.equalsIgnoreCase("HSLIB")){
            				databaseName = "HSLIB";
            			}
            			if(namespace.equalsIgnoreCase("IMMUNIZATION")){
            				databaseName = "IMMUNIZATION";
            			}
            			if(namespace.equalsIgnoreCase("MIRRORVIP")){
            				databaseName = "MIRRORVIP";
            			}
            			if(namespace.equalsIgnoreCase("RHIO")){
            				databaseName = "RHIO";
            			}
            			if(namespace.equalsIgnoreCase("VIEWERLIB")){
            				databaseName = "VIEWERLIB";
            			}
            			
            		}
            		
            		else if(INTERFACE.substring(0,4).equalsIgnoreCase("D2I3")){ 
            			portNo = "56774";
            			serverName = "eblsclqa.nychhc.org";
            			parms = INTERFACE.split(":");
            			namespace = parms[1].trim();
            			
            			if(namespace.equalsIgnoreCase("ENSDEMO")){
            				databaseName = "ENSDEMO";
            			}
            			if(namespace.equalsIgnoreCase("ENSEMBLE")){
            				databaseName = "ENSEMBLE";
            			}
            			if(namespace.equalsIgnoreCase("HSLIB")){
            				databaseName = "HSLIB";
            			}
            			if(namespace.equalsIgnoreCase("MIRRORVIP")){
            				databaseName = "MIRRORVIP";
            			}
            			if(namespace.equalsIgnoreCase("VIEWERLIB")){
            				databaseName = "VIEWERLIB";
            			}
            			if(namespace.equalsIgnoreCase("ENSEPIC1")){
            				databaseName = "ENSEPIC1";
            			}
            		}
            		
            		else if(INTERFACE.equalsIgnoreCase("PROD_PCIDH3_ENS4DOH3: SYNDROMIC SURVEILLANCE")){
            			portNo = "1972";
            			serverName = "172.23.66.23"; 
                		databaseName = "EDSYNDROMIC";
            		}
            		else if(INTERFACE.equalsIgnoreCase("TEST_SYBI64_ENSA4TEST2B: SYNDROMIC SURVEILLANCE")){
            			portNo = "1977";
            			serverName = "172.24.39.52"; 
                		databaseName = "EDSYNDROMIC";
            		}
            	}
            	
            	url = protocol + serverName + ":" + portNo + "/" + databaseName;
            	connParm = url;
            	log.info("The cache url: "+url);
            	
            	if(url.equalsIgnoreCase("jdbc:Cache://eblsclpd.nychhc.org:1972/ADT")){
            		System.out.println("watch what happens");
            	}
            	
            }
            else if(database.equalsIgnoreCase(mysql)){
            	
            	driverName = "com.mysql.jdbc.Driver";
            	Class.forName(driverName).newInstance();   //register the JDBC driver 
            	log.info("Resistered the "+database+" driver");
            	
            	protocol = "jdbc:mysql://";
            	serverName = "localhost";
            	portNo = "3306";
            	databaseName = "/discharge_date_fix";
            	user = "?user=root";
            	pw = "&password=J9h4c897!";
            	url = protocol + serverName + ":" + portNo + databaseName + user + pw;
            	
                //System.out.println("\nConnection string = "+url);
            	
            }
            
            else if(database.equalsIgnoreCase(postgre)){
            	
            	driverName = "org.postgresql.Driver";
            	Class.forName(driverName).newInstance();   //register the JDBC driver 
            	log.info("Resistered the "+database+" driver");
            	
            	//"jdbc:postgresql://hostname:port/dbname","username", "password");
            	
            	
            	protocol = "jdbc:postgresql://";
            	serverName = "172.24.74.144";
            	portNo = "5432";
            	databaseName = "/MessageWarehouse";
            	user = "postgres";
            	pw = "postgres";
            	url = protocol + serverName + ":" + portNo + databaseName;
            	
                log.info("Connection string = "+url);
            	
            }
     
            if(database.equalsIgnoreCase("cache")){
            	c = JDBCManager.getConnection(url,user,pw);
            }
            else if(database.equalsIgnoreCase("postgre")){
            	c = JDBCManager.getConnection(url,user,pw);
            }
            else{
            	c = JDBCManager.getConnection(url);
            }
            
            log.info("obtained a connection to "+database);
            
		} 
		catch (SQLException sqle){
			log.error(sqle.getMessage()+"  "+INTERFACE);
			System.out.println(sqle.getMessage());
        }
		catch (Exception e){
			log.error("\nUnspecified Error: "+e.getMessage()+"   "+INTERFACE);
		}
		
		return c;			
	}
}