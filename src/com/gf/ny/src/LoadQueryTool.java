package com.gf.ny.src;

import org.apache.log4j.PropertyConfigurator;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.resource.transaction.spi.TransactionStatus;
import com.intersys.objects.Database;
import java.text.SimpleDateFormat;
import com.gf.ny.persist.*;
import com.gf.ny.src.HibernateSessionFactory;
import java.io.*;
import java.util.*;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import java.util.Random;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

public class LoadQueryTool {

	private static Logger log = Logger.getLogger("LoadQueryTool");
	private static String path = "c:\\home\\alegentcreighton\\profiling\\";
	private static String inputFile = "alegent_rl_ob_orders_20130719.txt";
	private static String outputFile = "chrisOutput.txt";
	private static PreparedStatement pstmt=null;
	private static ResultSet rs;
	private static LineNumberReader lnr;
	private static FileOutputStream fos;
	private static PrintStream ps;
	private static String readLine;
	private static String messageControlId;
	private static Random r = new Random();
	private static long generatedMsgCntrlId;
	private static boolean populated;
	private static int mshCount=0;
	private static String lastRefresh;
	private static String logSql;
	private static String[] ensembleConfigParms;
	private static String INTERFACE;
	private static String rxPortsPattern = "Port	Adapter|Port	Adapter|IPPort	Adapter|IPPort	Adapter";
	private static String rxPortsPatternData = "Port	Adapter\\d+|Port	Adapter\\d+|IPPort	Adapter\\d+|IPPort	Adapter\\d+";
	private static String rxIpPattern = "IPAddress	Adapter|IPAddress	Adapter|IPAddress	Adapter|IPAddress	Adapter|IPAddress	Adapter";
	//private static String rxIpPatternData = "IPAddress	Adapter\\d{1,3}\\.\\d{1,3}\\.\\d{1,3}\\.\\d{1,3}|IPAddress	Adapter\\d{1,3}\\.\\d{1,3}\\.\\d{1,3}\\.\\d{1,3}|IPAddress	Adapter\\d{1,3}\\.\\d{1,3}\\.\\d{1,3}\\.\\d{1,3}";
	private static String rxIpPatternData = "IPAddress	Adapter\\d{1,3}\\.\\d{1,3}\\.\\d{1,3}\\.\\d{1,3}|IPAddress	Adapter\\d{1,3}\\.\\d{1,3}\\.\\d{1,3}\\.\\d{1,3}|IPAddress	Adapter\\d{1,3}\\.\\d{1,3}\\.\\d{1,3}\\.\\d{1,3}|IPAddress	Adapter[\\pL\\pN]+\\.[\\pL\\pN]+\\.[\\pL\\pN]+|IPAddress	Adapter[\\pL\\pN]+\\.[\\pL\\pN]+\\.[\\pL\\pN]+|IPAddress	Adapter[\\pL\\pN]+\\.[\\pL\\pN]+\\.[\\pL\\pN]+|IPAddress	Adapter[\\pL\\pN]+\\.[\\pL\\pN]+\\.[\\pL\\pN]+|IPAddress	Adapter\\d{1,3}\\.\\d{1,3}\\.\\d{1,3}\\.\\d{1,3}+|IPAddress	Adapterlocalhost|IPAddress	Adapterlocalhost|IPAddress	Adapterlocalhost|IPAddress	Adapterlocalhost|IPAddress	Adapterlocalhost";
	private static String sql;
	private static String jobStartSql = "select last_refresh from batchCycle where interface = '#INTERFACE#'";
	private static String jobEndSql   = "update batchCycle set last_refresh = #REFRESH# where interface = '#INTERFACE#'";
	private static String jobRefreshSql = "delete from ensemble_configuration where environment = '#ENVIRONMENT#' and namespace = '#NAMESPACE#'";
	//private static Map segmentMap = new HashMap();
	private static ArrayList<String> segmentList = new ArrayList<String>();
	private static ArrayList<String> patternList = new ArrayList<String>();
	
	 
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
	
	private static String handleLongField(String s){
		
		if(s !=null){
			
			if (s.length() >= 100){
				
				s = s.substring(0, 95) + "...";
				
			}
			
		}
		
		
		return s;
	}
	
	
	
	private static void processMSH(int route, String messageBodyId, String hl7){
		
		msh m = new msh();
		m.init();
		String[] field = hl7.split("\\|");
		String facilityCode;
		
		try{
			m.setMessageBodyId(messageBodyId);
			m.setRoute(route);
			m.setSendingApp(field[2]);
			m.setSendingFacility(field[3]);
			m.setReceivingApp(field[4]);
			m.setReceivingFacility(field[5]);
			m.setDatetimeOfMessage(field[6]);
			m.setMessageType(field[8]);
			m.setMessageControlId(field[9]);
			m.setProcessingId(field[10]);
			m.setVersionId(field[11]);
			
			System.out.println("processing message: "+m.getMessageBodyId());
			
		}
		catch(ArrayIndexOutOfBoundsException ae){}
		persist(m);
				
	}
	
private static void processGT1(int route, String messageBodyId, String hl7){
		
		gt1 g = new gt1();
		g.init();
		String[] field = hl7.split("\\|");
		String facilityCode;
		
		for (int x=0;x<field.length;x++){
			if (field[x]!=null){
				if (field[x].length() >= 100){
					field[x] = field[x].substring(0, 95) + "...";
				}
			}
		}
		
		try{
			g.setMessagebodyid(messageBodyId);
			g.setRoute(route);
			g.setSetid(field[1]);
			g.setGuarantornumber(field[2]);
			g.setGuarantorname(field[3]);
			g.setGuarantorspouseName(field[4]);
			g.setGuarantoraddress(field[5]);
			g.setGuarantorphnumhome(field[6]);
			g.setGuarantorphnumbusiness(field[7]);
			g.setGuarantordatetimeofbirth(field[8]);
			g.setGuarantorsex(field[9]);
			g.setGuarantortype(field[10]);
			g.setGuarantorrelationship(field[11]);
			g.setGuarantorssn(field[12]);
			g.setGuarantordatebegin(field[13]);
			g.setGuarantordateend(field[14]);
			g.setGuarantorpriority(field[15]);
			g.setGuarantoremployername(field[16]);
			g.setGuarantoremployeraddress(field[17]);
			g.setGuarantoremployerphonenumber(field[18]);
			g.setGuarantoremployeeidnumber(field[19]);
			g.setGuarantoremploymentstatus(field[20]);
			g.setGuarantororganizationname(field[21]);
			g.setGuarantorbillingholdflag(field[22]);
			g.setGuarantorcreditratingcode(field[23]);
			g.setGuarantordeathdateandtime(field[24]);
			g.setGuarantordeathflag(field[25]);
			g.setGuarantorchargeadjustmentcode(field[26]);
			g.setGuarantorhouseholdannualincome(field[27]);
			g.setGuarantorhouseholdsize(field[28]);
			g.setGuarantoremployeridnumber(field[29]);
			g.setGuarantormaritalstatuscode(field[30]);
			g.setEmploymentstopdate(field[31]);
			g.setLivingdependency(field[32]);
			g.setAmbulatorystatus(field[33]);
			g.setCitizenship(field[34]);
			g.setPrimarylanguage(field[35]);
			g.setLivingarrangement(field[36]);
			g.setPublicitycode(field[37]);
			g.setProtectionindicator(field[38]);
			g.setStudentindicator(field[39]);
			g.setReligion(field[40]);
			g.setMothersmaidenname(field[41]);
			g.setNationality(field[42]);
			g.setEthnicgroup(field[43]);
			g.setContactpersonsname(field[44]);
			g.setContactpersonstelephonenumber(field[45]);
			g.setContactreason(field[46]);
			g.setContactrelationship(field[47]);
			g.setJobtitle(field[48]);
			g.setJobcodeclass(field[49]);
			g.setGuarantoremployersorganizationname(field[50]);
			g.setHandicap(field[51]);
			g.setJobstatus(field[52]);
			g.setGuarantorfinancialclass(field[53]);
			g.setGuarantorrace(field[54]);
			
		}
		catch(ArrayIndexOutOfBoundsException ae){}
		persist(g);
				
	}
	

private static void processMRG(int route, String messageBodyId, String hl7){
	
	mrg m = new mrg();
	m.init();
	String[] field = hl7.split("\\|");
	
	for (int x=0;x<field.length;x++){
		if (field[x]!=null){
			if (field[x].length() >= 100){
				field[x] = field[x].substring(0, 95) + "...";
			}
		}
	}
	
	try{
			m.setMessagebodyid(messageBodyId);
			m.setRoute(route);
			m.setPriorpatientidentifierlist(field[1]);
			m.setPrioralternatepatientid(field[2]);
			m.setPriorpatientaccountnumber(field[3]);
			m.setPriorpatientid(field[4]);
			m.setPriorvisitnumber(field[5]);
			m.setPrioralternatevisitid(field[6]);
			m.setPriorpatientname(field[7]);
	
		}
		catch(ArrayIndexOutOfBoundsException ae){}	
		
		persist(m);
	
	}

	private static void processORC(int route, String messageBodyId, String hl7){
	
		orc o = new orc();
		o.init();
		String[] field = hl7.split("\\|");
		
		for (int x=0;x<field.length;x++){
			if (field[x]!=null){
				if (field[x].length() >= 100){
					field[x] = field[x].substring(0, 95) + "...";
				}
			}
		}
		
		try{
		
			o.setMessageBodyId(messageBodyId);
			o.setRoute(route);
			o.setOrderControl(field[1]);
			o.setPlacerOrderNumber(field[2]);
			o.setFillerOrderNumber(field[3]);
			o.setPlacerGroupNumber(field[4]);
			o.setOrderStatus(field[5]);
			o.setResponseFlag(field[6]);
			o.setQuantityTiming(field[7]);
			o.setParent(field[8]);
			o.setDateTimeofTransaction(field[9]);
			o.setEnteredBy(field[10]);
			o.setVerifiedBy(field[11]);
			o.setOrderingProvider(field[12]);
			o.setEntererLocation(field[13]);
			o.setCallBackPhoneNumber(field[14]);
			o.setOrderEffectiveDateTime(field[15]);
			o.setOrderControlCodeReason(field[16]);
			o.setEnteringOrganization(field[17]);
			o.setEnteringDevice(field[18]);
			o.setActionBy(field[19]);
			o.setAdvancedBeneficiaryNoticeCode(field[20]);
			o.setOrderingFacilityName(field[21]);
			o.setOrderingFacilityAddress(field[22]);
			o.setOrderingFacilityPhoneNumber(field[23]);
			o.setOrderingProviderAddress(field[24]);
			o.setOrderStatusModifier(field[25]);
			o.setAdvancedBeneficiaryNoticeOverrideReason(field[26]);
			o.setFillerExpectedAvailabilityDateTime(field[27]);
			o.setConfidentialityCode(field[28]);
			o.setOrderType(field[29]);
			o.setEntererAuthorizationMode(field[30]);
		
		}
		catch(ArrayIndexOutOfBoundsException ae){}	
			
		persist(o);
		
	}
	
	private static void processPD1(int route, String messageBodyId, String hl7){
		
		pd1 p = new pd1();
		p.init();
		String[] field = hl7.split("\\|");
		
		for (int x=0;x<field.length;x++){
			if (field[x]!=null){
				if (field[x].length() >= 100){
					field[x] = field[x].substring(0, 95) + "...";
				}
			}
		}
		
		try{
		
			p.setMessagebodyid(messageBodyId);
			p.setRoute(route);
			p.setLivingdependency(field[1]);
			p.setLivingarrangement(field[2]);
			p.setPatientprimaryfacility(field[3]);
			p.setPatientprimarycareprovidernameandddno(field[4]);
			p.setStudentindicator(field[5]);
			p.setHandicap(field[6]);
			p.setLivingwillcode(field[7]);
			p.setOrgandonorcode(field[8]);
			p.setSeparatebill(field[9]);
			p.setDuplicatepatient(field[10]);
			p.setPublicitycode(field[11]);
			p.setProtectionindicator(field[12]);
			p.setProtectiontndicatoreffectivedate(field[13]);
			p.setPlaceofworship(field[14]);
			p.setAdvancedirectivecode(field[15]);
			p.setImmunizationregistrystatus(field[16]);
			p.setImmunizationregistrystatuseffectivedate(field[17]);
			p.setPublicitycodeeffectivedate(field[18]);
			p.setMilitarybranch(field[19]);
			p.setMilitaryrankgrade(field[20]);
			p.setMilitarystatus(field[21]);
		
		}
		catch(ArrayIndexOutOfBoundsException ae){}	
			
		persist(p);
		
	}
	
	private static void processTQ1(int route, String messageBodyId, String hl7){
		
		tq1 t = new tq1();
		t.init();
		String[] field = hl7.split("\\|");
		
		for (int x=0;x<field.length;x++){
			if (field[x]!=null){
				if (field[x].length() >= 100){
					field[x] = field[x].substring(0, 95) + "...";
				}
			}
		}
		
		try{
		
			t.setMessagebodyid(messageBodyId);
			t.setRoute(route);
			t.setSetid(field[1]);
			t.setQuantity(field[2]);
			t.setRepeatpattern(field[3]);
			t.setExplicittime(field[4]);
			t.setRelativetimeandunits(field[5]);
			t.setServiceduration(field[6]);
			t.setStartdatetime(field[7]);
			t.setNddatetime(field[8]);
			t.setPriority(field[9]);
			t.setConditiontext(field[10]);
			t.setTextinstruction(field[11]);
			t.setConjunction(field[12]);
			t.setOccurrenceduration(field[13]);
			t.setTotaloccurrences(field[14]);
		
		}
		catch(ArrayIndexOutOfBoundsException ae){}	
			
		persist(t);
		
	}
	
	private static void processZCT(int route, String messageBodyId, String hl7){
		
		zct z = new zct();
		z.init();
		String[] field = hl7.split("\\|");
		
		for (int x=0;x<field.length;x++){
			if (field[x]!=null){
				if (field[x].length() >= 100){
					field[x] = field[x].substring(0, 95) + "...";
				}
			}
		}
		
		try{
		
			z.setMessagebodyid(messageBodyId);
			z.setRoute(route);
			z.setOne(field[1]);
			z.setTwo(field[2]);
			z.setThree(field[3]);
			z.setFour(field[4]);
			z.setFive(field[5]);
			z.setSix(field[6]);
			z.setSeven(field[7]);
			z.setEight(field[8]);
			z.setNine(field[9]);
			z.setTen(field[10]);
			z.setEleven(field[11]);
			z.setTwelve(field[12]);
		
		}
		catch(ArrayIndexOutOfBoundsException ae){}	
			
		persist(z);
		
	}
	
	private static void processMSA(int route, String messageBodyId, String hl7){
	
		msa m = new msa();
		m.init();
		String[] field = hl7.split("\\|");
		
		for (int x=0;x<field.length;x++){
			if (field[x]!=null){
				if (field[x].length() >= 100){
					field[x] = field[x].substring(0, 95) + "...";
				}
			}
		}
		
		try{
		
			m.setMessageBodyId(messageBodyId);
			m.setRoute(route);
			m.setAcknowledgmentCode(field[1]);
			m.setTextMessage(field[3]);
			m.setExpectedSequenceNumber(field[4]);
			m.setDelayedAcknowledgmentType(field[5]);
			m.setErrorCondition(field[6]);
			
		}
		
		catch(ArrayIndexOutOfBoundsException ae){}	
		
		persist(m);
		
	}
	
	private static void processDRG(int route, String messageBodyId, String hl7){
		
		drg d = new drg();
		d.init();
		String[] field = hl7.split("\\|");
		
		for (int x=0;x<field.length;x++){
			if (field[x]!=null){
				if (field[x].length() >= 100){
					field[x] = field[x].substring(0, 95) + "...";
				}
			}
		}
		
		try{
		
			d.setMessagebodyid(messageBodyId);
			d.setRoute(route);
			d.setDiagnosticrelatedgroup(field[1]);
			d.setDrgassigneddatetime(field[2]);
			d.setDrgapprovalindicator(field[3]);
			d.setDrggrouperreviewcode(field[4]);
			d.setOutliertype(field[5]);
			d.setOutlierdays(field[6]);
			d.setOutliercost(field[7]);
			d.setDrgpayor(field[8]);
			d.setOutlierreimbursement(field[9]);
			d.setConfidentialindicator(field[10]);
			d.setDrgtransfertype(field[11]);
			d.setNameofcoder(field[12]);
			d.setGrouperstatus(field[13]);
			d.setPcclvaluecode(field[14]);
			d.setEffectiveweight(field[15]);
			d.setMonetaryamount(field[16]);
			d.setStatuspatient(field[17]);
			d.setGroupersoftwarename(field[18]);
			d.setGroupersoftwareversion(field[19]);
			d.setStatusfinancialcalculation(field[20]);
			d.setRelativediscountsurcharge(field[21]);
			d.setBasiccharge(field[22]);
			d.setDiscountsurcharge(field[23]);
			d.setCalculateddays(field[24]);
			d.setStatusgender(field[25]);
			d.setStatusage(field[26]);
			d.setStatuslengthofstay(field[27]);
			d.setStatussamedayflag(field[28]);
			d.setStatusseparationmode(field[29]);
			d.setStatusweightatbirth(field[30]);
			d.setStatusrespirationminutes(field[31]);
			d.setStatusadmission(field[32]);
		
		}
		
		catch(ArrayIndexOutOfBoundsException ae){}	
		
		persist(d);
		
	}
	
	
	private static void processPRA(int route, String messageBodyId, String hl7){
		
		pra p = new pra();
		p.init();
		String[] field = hl7.split("\\|");
		
		for (int x=0;x<field.length;x++){
			if (field[x]!=null){
				if (field[x].length() >= 100){
					field[x] = field[x].substring(0, 95) + "...";
				}
			}
		}
		
		try{
		
			p.setMessagebodyid(messageBodyId);
			p.setRoute(route);
			p.setPrimarykeyvalue(field[1]);
			p.setPractitionergroup(field[2]);
			p.setPractitionercategory(field[3]);
			p.setProviderbilling(field[4]);
			p.setSpecialty(field[5]);
			p.setPractitioneridnumbers(field[6]);
			p.setPrivileges(field[7]);
			p.setDateenteredpractice(field[8]);
				
		}
		
		catch(ArrayIndexOutOfBoundsException ae){}	
		
		persist(p);
		
	}
	
	private static void processCON(int route, String messageBodyId, String hl7){
		
		cos c = new cos();
		c.init();
		String[] field = hl7.split("\\|");
		
		for (int x=0;x<field.length;x++){
			if (field[x]!=null){
				if (field[x].length() >= 100){
					field[x] = field[x].substring(0, 95) + "...";
				}
			}
		}
		
		try{
		
			c.setMessagebodyid(messageBodyId);
			c.setRoute(route);
			c.setConsenttype(field[1]);
			c.setConsentformidandversion(field[2]);
			c.setConsentformnumber(field[3]);
			c.setConsenttext(field[4]);
			c.setSubjectspecificconsenttext(field[5]);
			c.setConsentbackgroundinformation(field[6]);
			c.setSubjectspecificconsentbackgroundtext(field[7]);
			c.setConsentmode(field[8]);
			c.setConsentstatus(field[9]);
			c.setConsentdiscussiondatetime(field[10]);
			c.setConsentdecisiondatetime(field[11]);
			c.setConsenteffectivedatetime(field[12]);
			c.setConsentenddatetime(field[13]);
			c.setSubjectcompetenceindicator(field[14]);
			c.setTranslatorassistanceindicator(field[15]);
			c.setLanguagetranslatedto(field[16]);
			c.setInformationalmaterialsuppliedindicator(field[17]);
			c.setConsentbypassreason(field[18]);
			c.setConsentdisclosurelevel(field[19]);
			c.setConsentnondisclosurereason(field[20]);
			c.setNonsubjectconsenterreason(field[21]);
			c.setConsenterid(field[22]);
			c.setRelationshiptosubject(field[23]);
				
		}
		
		catch(ArrayIndexOutOfBoundsException ae){}	
		
		persist(c);
		
	}
	
	private static void processERR(String ID, String interfaceName, String hl7){
		
		err e = new err();
		e.init();
		String[] field = hl7.split("\\|");
		
		for (int x=0;x<field.length;x++){
			if (field[x]!=null){
				if (field[x].length() >= 100){
					field[x] = field[x].substring(0, 95) + "...";
				}
			}
		}
		
		try{
		
			e.setErrorCodeAndLocation(field[1]);
			e.setErrorLocation(field[2]);
			e.setHl7ErrorCode(field[3]);
			e.setSeverity(field[4]);
			e.setApplicationErrorCode(field[5]);
			e.setApplicationErrorParameter(field[6]);
			e.setDiagnosticInformation(field[7]);
			e.setUserMessage(field[8]);
			e.setInformPersonIndicator(field[9]);
			e.setOverrideType(field[10]);
			e.setOverrideReasonCode(field[11]);
			e.setHelpDeskContactPoint(field[12]);
			e.setHl7Interface(field[13]);
			e.setMessageControlId(field[14]);
			
		}
		
		catch(ArrayIndexOutOfBoundsException ae){}	
		
		e.setMessageControlId(messageControlId);
		e.setHl7Interface(INTERFACE);
		
		persist(e);
		
	}
	
	private static void processRXA(String ID, String interfaceName, String hl7){
		
		rxa r = new rxa();
		r.init();
		String[] field = hl7.split("\\|");
		
		try{
		
			r.setGiveSubIDCounter(field[1]);
			r.setAdministrationSubIDCounter(field[2]);
			r.setDateTimeStartofAdministration(field[3]);
			r.setDateTimeEndofAdministration(field[4]);
			r.setAdministeredCode(field[5]);
			r.setAdministeredAmount(field[6]);
			r.setAdministeredUnits(field[7]);
			r.setAdministeredDosageForm(field[8]);
			r.setAdministrationNotes(field[9]);
			r.setAdministeringProvider(field[10]);
			r.setAdministeredatLocation(field[11]);
			r.setAdministeredPerTimeUnit(field[12]);
			r.setAdministeredStrength(field[13]);
			r.setAdministeredStrengthUnits(field[14]);
			r.setSubstanceLotNumber(field[15]);
			r.setSubstanceExpirationDate(field[16]);
			r.setSubstanceManufacturerName(field[17]);
			r.setSubstanceTreatmentRefusalReason(field[18]);
			r.setIndication(field[19]);
			r.setCompletionStatus(field[20]);
			r.setActionCode(field[21]);
			r.setSystemEntryDateTime(field[22]);
			r.setAdministeredDrugStrengthVolume(field[23]);
			r.setAdministeredDrugStrengthVolumeUnits(field[24]);
			r.setAdministeredBarcodeIdentifier(field[25]);
			r.setPharmacyOrderType(field[26]);

			
		}
		catch(ArrayIndexOutOfBoundsException ae){}	
			
		r.setMessageControlId(messageControlId);
		r.setHl7Interface(INTERFACE);
		
		persist(r);
		
	}
	
	private static void processOBR(int route, String messageBodyId, String hl7){
		
		obr o = new obr();
		o.init();
		String[] field = hl7.split("\\|");
		
		for (int x=0;x<field.length;x++){
			if (field[x]!=null){
				if (field[x].length() >= 100){
					field[x] = field[x].substring(0, 95) + "...";
				}
			}
		}
		
		try{
			
			o.setMessageBodyId(messageBodyId);
			o.setRoute(route);
			o.setSetID(field[1]);
			o.setPlacerOrderNumber(field[2]);
			o.setFillerOrderNumber(field[3]);
			o.setUniversalServiceIdentifier(field[4]);
			o.setPriority(field[5]);
			o.setRequestedDateTime(field[6]);
			o.setObservationDateTime(field[7]);
			o.setObservationEndDateTime(field[8]);
			o.setCollectionVolume(field[9]);
			o.setCollectorIdentifier(field[10]);
			o.setSpecimenActionCode(field[11]);
			o.setDangerCode(field[12]);
			o.setRelevantClinicalInformation(field[13]);
			o.setSpecimenReceivedDateTime(field[14]);
			o.setSpecimenSource(field[15]);
			o.setOrderingProvider(field[16]);
			o.setOrderCallbackPhoneNumber(field[17]);
			o.setPlacerField1(field[18]);
			o.setPlacerField2(field[19]);
			o.setFillerField1(field[20]);
			o.setFillerField2(field[21]);
			o.setResultsRptStatusChngDateTime(field[22]);
			o.setChargetoPractice(field[23]);
			o.setDiagnosticServSectID(field[24]);
			o.setResultStatus(field[25]);
			o.setParentResult(field[26]);
			o.setQuantityTiming(field[27]);
			o.setResultCopiesTo(field[28]);
			o.setParent(field[29]);
			o.setTransportationMode(field[30]);
			o.setReasonforStudy(field[31]);
			o.setPrincipalResultInterpreter(field[32]);
			o.setAssistantResultInterpreter(field[33]);
			o.setTechnician(field[34]);
			o.setTranscriptionist(field[35]);
			o.setScheduledDateTime(field[36]);
			o.setNumberofSampleContainers(field[37]);
			o.setTransportLogisticsofCollectedSample(field[38]);
			o.setCollectorsComment(field[39]);
			o.setTransportArrangementResponsibility(field[40]);
			o.setTransportArranged(field[41]);
			o.setEscortRequired(field[42]);
			o.setPlannedPatientTransportComment(field[43]);
			o.setProcedureCode(field[44]);
			o.setProcedureCodeModifier(field[45]);
			o.setPlacerSupplementalServiceInformation(field[46]);
			o.setFillerSupplementalServiceInformation(field[47]);
			o.setMedicallyNecessaryDuplicateProcedureReason(field[48]);
			o.setResultHandling(field[49]);
			
		}
		catch(ArrayIndexOutOfBoundsException ae){}
		
		persist(o);
		
	}
	
	
private static void processSPM(int route, String messageBodyId, String hl7){
		
		spm s = new spm();
		s.init();
		String[] field = hl7.split("\\|");
		
		for (int x=0;x<field.length;x++){
			if (field[x]!=null){
				if (field[x].length() >= 100){
					field[x] = field[x].substring(0, 95) + "...";
				}
			}
		}
		
		try{
			
			s.setMessagebodyid(messageBodyId);
			s.setRoute(route);
			s.setSetid(field[1]);
			s.setSpecimenid(field[2]);
			s.setSpecimenparentids(field[3]);
			s.setSpecimentype(field[4]);
			s.setSpecimentypemodifier(field[5]);
			s.setSpecimenadditives(field[6]);
			s.setSpecimencollectionmethod(field[7]);
			s.setSpecimensourcesite(field[8]);
			s.setSpecimensourcesitemodifier(field[9]);
			s.setSpecimencollectionsite(field[10]);
			s.setSpecimenrole(field[11]);
			s.setSpecimencollectionamount(field[12]);
			s.setGroupedspecimencount(field[13]);
			s.setSpecimendescription(field[14]);
			s.setSpecimenhandlingcode(field[15]);
			s.setSpecimenriskcode(field[16]);
			s.setSpecimencollectiondatetime(field[17]);
			s.setSpecimenreceiveddatetime(field[18]);
			s.setSpecimenexpirationdatetime(field[19]);
			s.setSpecimenavailability(field[20]);
			s.setSpecimenrejectreason(field[21]);
			s.setSpecimenquality(field[22]);
			s.setSpecimenappropriateness(field[23]);
			s.setSpecimencondition(field[24]);
			s.setSpecimencurrentquantity(field[25]);
			s.setNumberofspecimencontainers(field[26]);
			s.setContainertype(field[27]);
			s.setContainercondition(field[28]);
			s.setSpecimenchildrole(field[29]);
			
			
		}
		catch(ArrayIndexOutOfBoundsException ae){}
		
		persist(s);
		
	}
	
private static void processNK1(int route, String messageBodyId, String hl7){
		
		nk1 n = new nk1();
		n.init();
		String[] field = hl7.split("\\|");
		
		for (int x=0;x<field.length;x++){
			if (field[x]!=null){
				if (field[x].length() >= 100){
					field[x] = field[x].substring(0, 95) + "...";
				}
			}
		}
		
		try{
			n.setMessagebodyid(messageBodyId);
			n.setRoute(route);
			n.setSetid(field[1]);
			n.setName(field[2]);
			n.setRelationship(field[3]);
			n.setAddress(field[4]);
			n.setPhonenumber(field[5]);
			n.setBusinessphonenumber(field[6]);
			n.setContactrole(field[7]);
			n.setStartdate(field[8]);
			n.setEnddate(field[9]);
			n.setAssociatedpartiesjobtitle(field[10]);
			n.setAssociatedpartiesjobcodeclass(field[11]);
			n.setAssociatedpartiesemployeenumber(field[12]);
			n.setOrganizationname(field[13]);
			n.setMaritalstatus(field[14]);
			n.setAdministrativesex(field[15]);
			n.setDatetimeofbirth(field[16]);
			n.setLivingdependency(field[17]);
			n.setAmbulatorystatus(field[18]);
			n.setCitizenship(field[19]);
			n.setPrimarylanguage(field[20]);
			n.setLivingarrangement(field[21]);
			n.setPublicitycode(field[22]);
			n.setProtectionindicator(field[23]);
			n.setStudentindicator(field[24]);
			n.setReligion(field[25]);
			n.setMothersmaidenname(field[26]);
			n.setAationality(field[27]);
			n.setEthnicgroup(field[28]);
			n.setContactreason(field[29]);
			n.setContactpersonsname(field[30]);
			n.setContactpersonstelephonenumber(field[31]);
			n.setContactpersonsaddress(field[32]);
			n.setAssociatedpartysidentifiers(field[33]);
			n.setJobstatus(field[34]);
			n.setRace(field[35]);
			n.setHandicap(field[36]);
			n.setContactpersonsocialsecuritynumber(field[37]);
			n.setXextofkinbirthplace(field[38]);
			n.setVipindicator(field[39]);
		}
		catch(ArrayIndexOutOfBoundsException ae){}
		
		persist(n);
			
	}
	
	private static void processOBX(int route, String messageBodyId, String hl7){
		
		System.out.println("OBX raw: "+hl7);
		
		obx x = new obx();
		x.init();
		String[] field = hl7.split("\\|");
		
		for (int y=0;y<field.length;y++){
			if (field[y]!=null){
				if (y==3 || y==5){
					if (field[y].length() >= 500){
						field[y] = field[y].substring(0, 495) + "...";
					}
				}
				else{ 
					if (field[y].length() >= 100){
						field[y] = field[y].substring(0, 95) + "...";
					}
				}
			}
		}
		
		
		try{
		
			x.setMessagebodyid(messageBodyId);
			x.setRoute(route);
			x.setSetID(field[1]);
			x.setValueType(field[2]);
			x.setObservationIdentifier(field[3]);
			x.setObservationSubID(field[4]);
			x.setObservationValue(field[5]);
			x.setUnits(field[6]);
			x.setReferencesRange(field[7]);
			x.setAbnormalFlags(field[8]);
			x.setProbability(field[9]);
			x.setNatureofAbnormalTest(field[10]);
			x.setObservationResultStatus(field[11]);
			x.setEffectiveDateofReferenceRange(field[12]);
			x.setUserDefinedAccessChecks(field[13]);
			x.setDateTimeoftheObservation(field[14]);
			x.setProducersID(field[15]);
			x.setResponsibleObserver(field[16]);
			x.setObservationMethod(field[17]);
			x.setEquipmentInstanceIdentifier(field[18]);
			x.setDateTimeoftheAnalysis(field[19]);
		
		}
		catch(ArrayIndexOutOfBoundsException ae){}
			
		persist(x);
		
	}
	
	private static void processDSP(String s){
		
		dsp d = new dsp();
		d.init();
		String[] field = s.split("\\|");
		
		try{
		
			d.setSetId(field[1]);
			d.setDisplayLevel(field[2]);
			d.setDataLine(field[3]);
			d.setLogicalBreakPoint(field[4]);
			d.setResultId(field[5]);
		}
		catch(ArrayIndexOutOfBoundsException ae){}
			
		d.setMessageControlId(messageControlId);
		d.setIguanaInterface(INTERFACE);
		
		persist(d);
		
	}
		
	private static void processMFI(int route, String messageBodyId, String hl7){
		
		mfi m = new mfi();
		m.init();
		String[] field = hl7.split("\\|");
		
		for (int y=0;y<field.length;y++){
			if (field[y]!=null){
				if (field[y].length() >= 100){
					field[y] = field[y].substring(0, 95) + "...";
				}
			}
		}
		
		try{
		
			m.setMessagebodyid(messageBodyId);
			m.setRoute(route);
			m.setMasterFileIdentifier(field[1]);
			m.setMasterFileApplicationIdentifier(field[2]);
			m.setFileLevelEventCode(field[3]);
			m.setEnteredDateTime(field[4]);
			m.setEffectiveDateTime(field[5]);
			m.setResponseLevelCode(field[6]);
			
		}
		catch(ArrayIndexOutOfBoundsException ae){}
			
		persist(m);
		
	}
	
	
	private static void processSTF(int route, String messageBodyId, String hl7){
		
		stf s = new stf();
		s.init();
		String[] field = hl7.split("\\|");
		
		for (int y=0;y<field.length;y++){
			if (field[y]!=null){
				if (field[y].length() >= 100){
					field[y] = field[y].substring(0, 95) + "...";
				}
			}
		}
		
		try{
		
			s.setMessagebodyid(messageBodyId);
			s.setRoute(route);
			s.setPrimaryKeyValue(field[1]);
			s.setStaffIdentifierList(field[2]);
			s.setStaffName(field[3]);
			s.setStaffType(field[4]);
			s.setAdministrativeSex(field[5]);
			s.setDateTimeofBirth(field[6]);
			s.setActiveInactiveFlag(field[7]);
			s.setDepartment(field[8]);
			s.setHospitalService(field[9]);
			s.setPhone(field[10]);
			s.setOfficeHomeAddressBirthplace(field[11]);
			s.setInstitutionActivationDate(field[12]);
			s.setInstitutionInactivationDate(field[13]);
			s.setBackupPersonID(field[14]);
			s.setEmailAddress(field[15]);
			s.setPreferredMethodofContact(field[16]);
			s.setMaritalStatus(field[17]);
			s.setJobTitle(field[18]);
			s.setJobCodeClass(field[19]);
			s.setEmploymentStatusCode(field[20]);
			s.setAdditionalInsuredonAuto(field[21]);
			s.setDriverLicenseNumber(field[22]);
			s.setCopyAutoIns(field[23]);
			s.setAutoInsExpires(field[24]);
			s.setDateLastDMVReview(field[25]);
			s.setDateNextDMVReview(field[26]);
			s.setRace(field[27]);
			s.setEthnicGroup(field[28]);
			s.setReactivationApprovalIndicator(field[29]);
			s.setCitizenship(field[30]);
			s.setDeathDateandTime(field[31]);
			s.setDeathIndicator(field[32]);
			s.setInstitutionRelationshipTypeCode(field[33]);
			s.setInstitutionRelationshipPeriod(field[34]);
			s.setExpectedReturnDate(field[35]);
			s.setCostCenterCode(field[36]);
			s.setGenericClassificationIndicator(field[37]);
			s.setInactiveReasonCode(field[38]);
			
		}
		catch(ArrayIndexOutOfBoundsException ae){}
			
		persist(s);
		
	}
	
	private static void processDG1(int route, String messageBodyId, String hl7){
		
		dg1 d = new dg1();
		d.init();
		String[] field = hl7.split("\\|");
		
		for (int x=0;x<field.length;x++){
			if (field[x]!=null){
				if (field[x].length() >= 100){
					field[x] = field[x].substring(0, 95) + "...";
				}
			}
		}
		
		
		try{
		
			d.setMessagebodyid(messageBodyId);
			d.setRoute(route);
			d.setSetId(field[1]);
			d.setDiagnosisCodingMethod(field[2]);
			d.setDiagnosisCode(field[3]);
			d.setDiagnosisDescription(field[4]);
			d.setDiagnosisDatetime(field[5]);
			d.setDiagnosisType(field[6]);
			d.setMajorDiagnosticCategory(field[7]);
			d.setDiagnosticRelatedGroup(field[8]);
			d.setDrgApprovalIndicator(field[9]);
			d.setDrgGrouperReviewCode(field[10]);
			d.setOutlierType(field[11]);
			d.setOutlierDays(field[12]);
			d.setOutlierCost(field[13]);
			d.setGrouperVersionAndType(field[14]);
			d.setDiagnosisPriority(field[15]);
			d.setDiagnosingClinician(field[16]);
			d.setDiagnosisClassification(field[17]);
			d.setConfidentialIndicator(field[18]);
			d.setAttestationDatetime(field[19]);
			d.setDiagnosisIdentifier(field[20]);
			d.setDiagnosisActionCode(field[21]);
			
		}
		catch(ArrayIndexOutOfBoundsException ae){}
			
		persist(d);
	}
	
	
	private static void processIN1(int route, String messageBodyId, String hl7){
		
		in1 i = new in1();
		i.init();
		String[] field = hl7.split("\\|");
		
		for (int x=0;x<field.length;x++){
			if (field[x]!=null){
				if (field[x].length() >= 100){
					field[x] = field[x].substring(0, 95) + "...";
				}
			}
		}
		
		try{
		
			i.setMessagebodyid(messageBodyId);
			i.setRoute(route);
			i.setSetId(field[1]);
			i.setInsurancePlanID(field[2]);
			i.setInsuranceCompanyId(field[3]);
			i.setInsuranceCompanyName(field[4]);
			i.setInsuranceCompanyAddress(field[5]);
			i.setInsuranceCoContactPerson(field[6]);
			i.setInsuranceCoPhoneNumber(field[7]);
			i.setGroupNumber(field[8]);
			i.setGroupName(field[9]);
			i.setInsuredGroupEmpId(field[10]);
			i.setInsuredGroupEmpName(field[11]);
			i.setPlanEffectiveDate(field[12]);
			i.setPlanExpirationDate(field[13]);
			i.setAuthorizationInformation(field[14]);
			i.setPlanType(field[15]);
			i.setNameOfInsured(field[16]);
			i.setInsuredRelationshipToPatient(field[17]);
			i.setInsuredDateOfBirth(field[18]);
			i.setInsuredAddress(field[19]);
			i.setAssignmentOfBenefits(field[20]);
			i.setCoordinationOfBenefits(field[21]);
			i.setCoordOfBenPriority(field[22]);
			i.setNoticeOfAdmissionFlag(field[23]);
			i.setNoticeOfAdmissionDate(field[24]);
			i.setReportOfEligibilityFlag(field[25]);
			i.setReportOfEligibilityDate(field[26]);
			i.setReleaseInformationCode(field[27]);
			i.setPreAdmitCert(field[28]);
			i.setVerificationDateTime(field[29]);
			i.setVerificationBy(field[30]);
			i.setTypeOfAgreementCode(field[31]);
			i.setBillingStatus(field[32]);
			i.setLifetimeReserveDays(field[33]);
			i.setDelayBeforeLRDay(field[34]);
			i.setCompanyPlanCode(field[35]);
			i.setPolicyNumber(field[36]);
			i.setPolicyDeductible(field[37]);
			i.setPolicyLimitAmount(field[38]);
			i.setPolicyLimitDays(field[39]);
			i.setRoomRateSemiPrivate(field[40]);
			i.setRoomRatePrivate(field[41]);
			i.setInsuredEmploymentStatus(field[42]);
			i.setInsuredAdministrativeSex(field[43]);
			i.setInsuredEmployerAddress(field[44]);
			i.setVerificationStatus(field[45]);
			i.setPriorInsurancePlanId(field[46]);
			i.setCoverageType(field[47]);
			i.setHandicap(field[48]);
			i.setInsuredIdNumber(field[49]);
			i.setSignatureCode(field[50]);
			i.setSignatureCodeDate(field[51]);
			i.setInsuredBirthPlace(field[52]);
			i.setvIPIndicator(field[53]);
			
		}
		catch(ArrayIndexOutOfBoundsException ae){}
		
		persist(i);
		
	}
	
	private static void processIN2(int route, String messageBodyId, String hl7){
	
		in2 i = new in2();
		i.init();
		String[] field = hl7.split("\\|");
		
		for (int x=0;x<field.length;x++){
			if (field[x]!=null){
				if (field[x].length() >= 100){
					field[x] = field[x].substring(0, 95) + "...";
				}
			}
		}
		
		try{
		
			i.setMessagebodyid(messageBodyId);
			i.setRoute(route);
			i.setInsuredsEmployeeID(field[1]);
			i.setInsuredsSocialSecurityNumber(field[2]);
			i.setInsuredsEmployersNameandID(field[3]);
			i.setEmployerInformationData(field[4]);
			i.setMailClaimParty(field[5]);
			i.setMedicareHealthInsCardNumber(field[6]);
			i.setMedicaidCaseName(field[7]);
			i.setMedicaidCaseNumber(field[8]);
			i.setMilitarySponsorName(field[9]);
			i.setMilitaryIDNumber(field[10]);
			i.setDependentOfMilitaryRecipient(field[11]);
			i.setMilitaryOrganization(field[12]);
			i.setMilitaryStation(field[13]);
			i.setMilitaryService(field[14]);
			i.setMilitaryRankGrade(field[15]);
			i.setMilitaryStatus(field[16]);
			i.setMilitaryRetireDate(field[17]);
			i.setMilitaryNonAvailCertOnFile(field[18]);
			i.setBabyCoverage(field[19]);
			i.setCombineBabyBill(field[20]);
			i.setBloodDeductible(field[21]);
			i.setSpecialCoverageApprovalName(field[22]);
			i.setSpecialCoverageApprovalTitle(field[23]);
			i.setNonCoveredInsuranceCode(field[24]);
			i.setPayorID(field[25]);
			i.setPayorSubscriberID(field[26]);
			i.setEligibilitySource(field[27]);
			i.setRoomCoverageTypeAmount(field[28]);
			i.setPolicyTypeAmount(field[29]);
			i.setDailyDeductible(field[30]);
			i.setLivingDependency(field[31]);
			i.setAmbulatoryStatus(field[32]);
			i.setCitizenship(field[33]);
			i.setPrimaryLanguage(field[34]);
			i.setLivingArrangement(field[35]);
			i.setPublicityCode(field[36]);
			i.setProtectionIndicator(field[37]);
			i.setStudentIndicator(field[38]);
			i.setReligion(field[39]);
			i.setMothersMaidenName(field[40]);
			i.setNationality(field[41]);
			i.setEthnicGroup(field[42]);
			i.setMaritalStatus(field[43]);
			i.setInsuredsEmploymentStartDate(field[44]);
			i.setEmploymentStopDate(field[45]);
			i.setJobTitle(field[46]);
			i.setJobCodeClass(field[47]);
			i.setJobStatus(field[48]);
			i.setEmployerContactPersonName(field[49]);
			i.setEmployerContactPersonPhoneNumber(field[50]);
			i.setEmployerContactReason(field[51]);
			i.setInsuredsContactPersonsName(field[52]);
			i.setInsuredsContactPersonPhoneNumber(field[53]);
			i.setInsuredsContactPersonReason(field[54]);
			i.setRelationshiptothePatientStartDate(field[55]);
			i.setRelationshiptothePatientStopDate(field[56]);
			i.setInsuranceCoContactReason(field[57]);
			i.setInsuranceCoContactPhoneNumber(field[58]);
			i.setPolicyScope(field[59]);
			i.setPolicySource(field[60]);
			i.setPatientMemberNumber(field[61]);
			i.setGuarantorsRelationshiptoInsured(field[62]);
			i.setInsuredsPhoneNumberHome(field[63]);
			i.setInsuredsEmployerPhoneNumber(field[64]);
			i.setMilitaryHandicappedProgram(field[65]);
			i.setSuspendFlag(field[66]);
			i.setCopayLimitFlag(field[67]);
			i.setStoplossLimitFlag(field[68]);
			i.setInsuredOrganizationNameandID(field[69]);
			i.setInsuredEmployerOrganizationNameandID(field[70]);
			i.setRace(field[71]);
			i.setcMSPatientsRelationshiptoInsured(field[72]);
			
		}
		catch(ArrayIndexOutOfBoundsException ae){}
			
		persist(i);
		
	}
	
	private static void processIN3(int route, String messageBodyId, String hl7){
		
		in3 i = new in3();
		i.init();
		String[] field = hl7.split("\\|");
		
		for (int x=0;x<field.length;x++){
			if (field[x]!=null){
				if (field[x].length() >= 100){
					field[x] = field[x].substring(0, 95) + "...";
				}
			}
		}
		
		try{
		
			i.setMessagebodyid(messageBodyId);
			i.setRoute(route);
			i.setSetID(field[1]);
			i.setCertificationNumber(field[2]);
			i.setCertifiedBy(field[3]);
			i.setCertificationRequired(field[4]);
			i.setPenalty(field[5]);
			i.setCertificationDateTime(field[6]);
			i.setCertificationModifyDateTime(field[7]);
			i.setOperator(field[8]);
			i.setCertificationBeginDate(field[9]);
			i.setCertificationEndDate(field[10]);
			i.setDays(field[11]);
			i.setNonConcurCodeDescription(field[12]);
			i.setNonConcurEffectiveDateTime(field[13]);
			i.setPhysicianReviewer(field[14]);
			i.setCertificationContact(field[15]);
			i.setCertificationContactPhoneNumber(field[16]);
			i.setAppealReason(field[17]);
			i.setCertificationAgency(field[18]);
			i.setCertificationAgencyPhoneNumber(field[19]);
			i.setPreCertificationRequirement(field[20]);
			i.setCaseManager(field[21]);
			i.setSecondOpinionDate(field[22]);
			i.setSecondOpinionStatus(field[23]);
			i.setSecondOpinionDocumentationReceived(field[24]);
			i.setSecondOpinionPhysician(field[25]);
			
		}
		catch(ArrayIndexOutOfBoundsException ae){}
			
		persist(i);
		
	}
	
	private static void processPV1(int route, String messageBodyId, String hl7){
		
		pv1 p = new pv1();
		p.init();
		String[] field = hl7.split("\\|");
		
		for (int x=0;x<field.length;x++){
			if (field[x]!=null){
				if (field[x].length() >= 100){
					field[x] = field[x].substring(0, 95) + "...";
				}
			}
		}
		
		
		try{
		
			p.setMessageBodyId(messageBodyId);
			p.setRoute(route);
			p.setSetID(field[1]);
			p.setPatientClass(field[2]);
			p.setAssignedPatientLocation(field[3]);
			p.setAdmissionType(field[4]);
			p.setPreadmitNumber(field[5]);
			p.setPriorPatientLocation(field[6]);
			p.setAttendingDoctor(field[7]);
			p.setReferringDoctor(field[8]);
			p.setConsultingDoctor(field[9]);
			p.setHospitalService(field[10]);
			p.setTemporaryLocation(field[11]);
			p.setPreadmitTestIndicator(field[12]);
			p.setReadmissionIndicator(field[13]);
			p.setAdmitSource(field[14]);
			p.setAmbulatoryStatus(field[15]);
			p.setVIPIndicator(field[16]);
			p.setAdmittingDoctor(field[17]);
			p.setPatientType(field[18]);
			p.setVisitNumber(field[19]);
			p.setFinancialClass(field[20]);
			p.setChargePriceIndicator(field[21]);
			p.setCourtesyCode(field[22]);
			p.setCreditRating(field[23]);
			p.setContractCode(field[24]);
			p.setContractEffectiveDate(field[25]);
			p.setContractAmount(field[26]);
			p.setContractPeriod(field[27]);
			p.setInterestCode(field[28]);
			p.setTransfertoBadDebtCode(field[29]);
			p.setTransfertoBadDebtDate(field[30]);
			p.setBadDebtAgencyCode(field[31]);
			p.setBadDebtTransferAmount(field[32]);
			p.setBadDebtRecoveryAmount(field[33]);
			p.setDeleteAccountIndicator(field[34]);
			p.setDeleteAccountDate(field[35]);
			p.setDischargeDisposition(field[36]);
			p.setDischargedtoLocation(field[37]);
			p.setDietType(field[38]);
			p.setServicingFacility(field[39]);
			p.setBedStatus(field[40]);
			p.setAccountStatus(field[41]);
			p.setPendingLocation(field[42]);
			p.setPriorTemporaryLocation(field[43]);
			p.setAdmitDateTime(field[44]);
			p.setDischargeDateTime(field[45]);
			p.setCurrentPatientBalance(field[46]);
			p.setTotalCharges(field[47]);
			p.setTotalAdjustments(field[48]);
			p.setTotalPayments(field[49]);
			p.setAlternateVisitID(field[50]);
			p.setVisitIndicator(field[51]);
			p.setOtherHealthcareProvider(field[52]);
			
		}
		catch(ArrayIndexOutOfBoundsException ae){}
			
		persist(p);
		
	}
	
	private static void processPID(int route, String messageBodyId, String hl7){
		
		pid p = new pid();
		p.init();
		String[] field = hl7.split("\\|");
		
		for (int x=0;x<field.length;x++){
			if (field[x]!=null){
				if (x==2 || x==3 || x==4){
					if (field[x].length() >= 500){
						field[x] = field[x].substring(0, 495) + "...";
					}
				}
				else{ 
					if (field[x].length() >= 100){
						field[x] = field[x].substring(0, 95) + "...";
					}
				}
			}
		}
		
		try{
		
			p.setMessageBodyId(messageBodyId);
			p.setRoute(route);
			p.setSetId(field[1]);
			p.setPatientId(field[2]);
			p.setPatientIdentifierList(field[3]);
			p.setAlternatePatientId(field[4]);
			p.setPatientName(field[5]);
			p.setMotherMaidenName(field[6]);
			p.setDateOfBirth(field[7]);
			p.setAdministrativeSex(field[8]);
			p.setPatientAlias(field[9]);
			p.setRace(field[10]);
			p.setPatientAddress(field[11]);
			p.setCountyCode(field[12]);
			p.setPhoneNumberHome(field[13]);
			p.setPhoneNumberBusiness(field[14]);
			p.setPrimaryLanguage(field[15]);
			p.setMaritalStatus(field[16]);
			p.setReligion(field[17]);
			p.setPatientAccountNumber(field[18]);
			p.setSsnNumber(field[19]);
			p.setDriverLicenseNumber(field[20]);
			p.setMotherIdentifier(field[21]);
			p.setEthnicGroup(field[22]);
			p.setBirthPlace(field[23]);
			p.setMultipleBirthIndicator(field[24]);
			p.setBirthOrder(field[25]);
			p.setCitizenship(field[26]);
			p.setVeteransMilitaryStatus(field[27]);
			p.setNationality(field[28]);
			p.setPatientDeathDatetime(field[29]);
			p.setPatientDeathIndicator(field[30]);
			p.setIdentityUnknownIndicator(field[31]);
			p.setIdentityReliabilityCode(field[32]);
			p.setLastUpdateDatetime(field[33]);
			p.setLastUpdateFacility(field[34]);
			p.setSpeciesCode(field[35]);
			p.setBreedCode(field[36]);
			p.setStrain(field[37]);
			p.setProductionClassCode(field[38]);
			p.setTribalCitizenship(field[39]);
			
		}
		catch(ArrayIndexOutOfBoundsException ae){}

		persist(p);
		
	}
	
	
	private static void processITM(String ID, String interfaceName, String hl7){
		
		itm i = new itm();
		i.init();
		String[] field = hl7.split("\\|");
		
		for (int x=0;x<field.length;x++){
			if (field[x]!=null){
				if (field[x].length() >= 100){
					field[x] = field[x].substring(0, 95) + "...";
				}
			}
		}
		
		try{
		
			i.setItemIdentifier(field[1]);
			i.setItemDescription(field[2]);
			i.setItemStatus(field[3]);
			i.setItemType(field[4]);
			i.setItemCategory(field[5]);
			i.setSubjecttoExpirationIndicator(field[6]);
			i.setManufacturerIdentifier(field[7]);
			i.setManufacturerName(field[8]);
			i.setManufacturerCatalogNumber(field[9]);
			i.setManufacturerLabelerIdentificationCode(field[10]);
			i.setPatientChargeableIndicator(field[11]);
			i.setTransactionCode(field[12]);
			i.setTransactionamountunit(field[13]);
			i.setStockedItemIndicator(field[14]);
			i.setSupplyRiskCodes(field[15]);
			i.setApprovingRegulatoryAgency(field[16]);
			i.setLatexIndicator(field[17]);
			i.setRulingAct(field[18]);
			i.setItemNaturalAccountCode(field[19]);
			i.setApprovedToBuyQuantity(field[20]);
			i.setApprovedToBuyPrice(field[21]);
			i.setTaxableItemIndicator(field[22]);
			i.setFreightChargeIndicator(field[23]);
			i.setItemSetIndicator(field[24]);
			i.setItemSetIdentifier(field[25]);
			i.setTrackDepartmentUsageIndicator(field[26]);
			i.setProcedureCode(field[27]);
			i.setProcedureCodeModifier(field[28]);
			i.setSpecialHandlingCode(field[29]);
			
		}
		catch(ArrayIndexOutOfBoundsException ae){}
			
		i.setMessageControlId(messageControlId);
		i.setHl7Interface(INTERFACE);
		
		persist(i);
		
	}
	
	
	private static void processIVT(String ID, String interfaceName, String hl7){
		
		ivt i = new ivt();
		i.init();
		String[] field = hl7.split("\\|");
		
		for (int x=0;x<field.length;x++){
			if (field[x]!=null){
				if (field[x].length() >= 100){
					field[x] = field[x].substring(0, 95) + "...";
				}
			}
		}
		
		try{
		
			i.setSetId(field[1]);
			i.setInventoryLocationIdentifier(field[2]);
			i.setInventoryLocationName(field[3]);
			i.setSourceLocationIdentifier(field[4]);
			i.setSourceLocationName(field[5]);
			i.setItemStatus(field[6]);
			i.setBinLocationIdentifier(field[7]);
			i.setOrderPackaging(field[8]);
			i.setIssuePackaging(field[9]);
			i.setDefaultInventoryAssetAccount(field[10]);
			i.setPatientChargeableIndicator(field[11]);
			i.setTransactionCode(field[12]);
			i.setTransactionamountunit(field[13]);
			i.setItemImportanceCode(field[14]);
			i.setStockedItemIndicator(field[15]);
			i.setConsignmentItemIndicator(field[16]);
			i.setReusableItemIndicator(field[17]);
			i.setReusableCost(field[18]);
			i.setSubstituteItemIdentifier(field[19]);
			i.setLatexFreeSubstituteItemIdentifier(field[20]);
			i.setRecommendedReorderTheory(field[21]);
			i.setRecommendedSafetyStockDays(field[22]);
			i.setRecommendedMaximumDaysInventory(field[23]);
			i.setRecommendedOrderPoint(field[24]);
			i.setRecommendedOrderAmount(field[25]);
			i.setOperatingRoomParLevelIndicator(field[26]);
			
		}
		catch(ArrayIndexOutOfBoundsException ae){}
			
		i.setMessageControlId(messageControlId);
		i.setHl7Interface(INTERFACE);
		
		persist(i);
		
	}
	
	
	private static void processMFE(int route, String messageBodyId, String hl7){
		
		mfe m = new mfe();
		m.init();
		String[] field = hl7.split("\\|");
		
		for (int x=0;x<field.length;x++){
			if (field[x]!=null){
				if (field[x].length() >= 100){
					field[x] = field[x].substring(0, 95) + "...";
				}
			}
		}
		
		try{
		
			m.setMessagebodyid(messageBodyId);
			m.setRoute(route);
			m.setRecordLevelEventCode(field[1]);
			m.setmFNControlID(field[2]);
			m.setEffectiveDateTime(field[3]);
			m.setPrimaryKeyValue(field[4]);
			m.setPrimaryKeyValueType(field[5]);
			m.setEnteredDateTime(field[6]);
			m.setEnteredBy(field[7]);
			
		}
		catch(ArrayIndexOutOfBoundsException ae){}
			
		persist(m);
		
	}
	
	private static void processNTE(int route, String messageBodyId, String hl7){
		
		System.out.println("NTE raw: "+hl7);
		
		nte n = new nte();
		n.init();
		String[] field = hl7.split("\\|");
		
		for (int x=0;x<field.length;x++){
			if (field[x]!=null){
				if (field[x].length() >= 100){
					field[x] = field[x].substring(0, 95) + "...";
				}
			}
		}
		
		try{
		
			n.setMessagebodyid(messageBodyId);
			n.setRoute(route);
			n.setSetID(field[1]);
			n.setSourceofComment(field[2]);
			n.setComment(field[3]);
			n.setCommentType(field[4]);
			
		}
		catch(ArrayIndexOutOfBoundsException ae){}
			
		persist(n);
		
	}
		
	private static void processPKG(String ID, String interfaceName, String hl7){
		
		pkg p = new pkg();
		p.init();
		String[] field = hl7.split("\\|");
		
		for (int x=0;x<field.length;x++){
			if (field[x]!=null){
				if (field[x].length() >= 100){
					field[x] = field[x].substring(0, 95) + "...";
				}
			}
		}
		
		try{
		
			p.setSetId(field[1]);
			p.setPackagingUnits(field[2]);
			p.setDefaultOrderUnitOfMeasureIndicator(field[3]);
			p.setPackageQuantity(field[4]);
			p.setPrice(field[5]);
			p.setFutureItemPrice(field[6]);
			p.setFutureItemPriceEffectiveDate(field[7]);
			
		}
		catch(ArrayIndexOutOfBoundsException ae){}
			
		p.setMessageControlId(messageControlId);
		p.setHl7Interface(INTERFACE);
		
		persist(p);
		
	}
	
	private static void processVND(String ID, String interfaceName, String hl7){
		
		vnd v = new vnd();
		v.init();
		String[] field = hl7.split("\\|");
		
		for (int x=0;x<field.length;x++){
			if (field[x]!=null){
				if (field[x].length() >= 100){
					field[x] = field[x].substring(0, 95) + "...";
				}
			}
		}
		
		try{
		
			v.setSetId(field[1]);
			v.setVendorIdentifier(field[2]);
			v.setVendorName(field[3]);
			v.setVendorCatalogNumber(field[4]);
			v.setPrimaryVendorIndicator(field[5]);
			
		}
		catch(ArrayIndexOutOfBoundsException ae){}
			
		v.setMessageControlId(messageControlId);
		v.setHl7Interface(INTERFACE);
		
		persist(v);
		
	}
	
	private static void processZDS(String ID, String interfaceName, String hl7){
		
		zds z = new zds();
		z.init();
		String[] field = hl7.split("\\|");
		
		for (int x=0;x<field.length;x++){
			if (field[x]!=null){
				if (field[x].length() >= 100){
					field[x] = field[x].substring(0, 95) + "...";
				}
			}
		}
		
		try{
		
			z.setReferencePointer(field[1]);
			z.setApplicationID(field[2]);
			z.setTypeofData(field[3]);
			z.setSubtype(field[4]);
			
		}
		catch(ArrayIndexOutOfBoundsException ae){}
			
		z.setMessageControlId(messageControlId);
		z.setHl7Interface(INTERFACE);
		
		persist(z);
		
	}
	
	private static void processEVN(int route, String messageBodyId, String hl7){
		
		evn e = new evn();
		e.init();
		String[] field = hl7.split("\\|");
		
		for (int x=0;x<field.length;x++){
			if (field[x]!=null){
				if (field[x].length() >= 100){
					field[x] = field[x].substring(0, 95) + "...";
				}
			}
		}
		
		try{
			e.setMessagebodyid(messageBodyId);
			e.setRoute(route);
			e.setEventTypeCode(field[1]);
			e.setRecordedDateTime(field[2]);
			e.setDateTimePlannedEvent(field[3]);
			e.setEventReasonCode(field[4]);
			e.setOperatorID(field[5]);
			e.setEventOccurred(field[6]);
			e.setEventFacility(field[7]);
			
		}
		catch(ArrayIndexOutOfBoundsException ae){}
			
		persist(e);
		
	}
	
	
	private static void processSCH(String ID, String interfaceName, String hl7){
		
		sch s = new sch();
		s.init();
		String[] field = hl7.split("\\|");
		
		for (int x=0;x<field.length;x++){
			if (field[x]!=null){
				if (field[x].length() >= 100){
					field[x] = field[x].substring(0, 95) + "...";
				}
			}
		}
		
		try{
		
			s.setPlacerAppointmentID(field[1]);
			s.setFillerAppointmentID(field[2]);
			s.setOccurrenceNumber(field[3]);
			s.setPlacerGroupNumber(field[4]);
			s.setScheduleID(field[5]);
			s.setEventReason(field[6]);
			s.setAppointmentReason(field[7]);
			s.setAppointmentType(field[8]);
			s.setAppointmentDuration(field[9]);
			s.setAppointmentDurationUnits(field[10]);
			s.setAppointmentTimingQuantity(field[11]);
			s.setPlacerContactPerson(field[12]);
			s.setPlacerContactPhoneNumber(field[13]);
			s.setPlacerContactAddress(field[14]);
			s.setPlacerContactLocation(field[15]);
			s.setFillerContactPerson(field[16]);
			s.setFillerContactPhoneNumber(field[17]);
			s.setFillerContactAddress(field[18]);
			s.setFillerContactLocation(field[19]);
			s.setEnteredByPerson(field[20]);
			s.setEnteredByPhoneNumber(field[21]);
			s.setEnteredByLocation(field[22]);
			s.setParentPlacerAppointmentID(field[23]);
			s.setParentFillerAppointmentID(field[24]);
			s.setFillerStatusCode(field[25]);
			s.setPlacerOrderNumber(field[26]);
			s.setFillerOrderNumber(field[27]);
			
		}
		catch(ArrayIndexOutOfBoundsException ae){}
			
		s.setMessageControlId(messageControlId);
		s.setHl7Interface(INTERFACE);
		
		persist(s);
		
	}
	
	
	private static void processPV2(int route, String messageBodyId, String hl7){
	
		pv2 p = new pv2();
		p.init();
		String[] field = hl7.split("\\|");
		
		for (int x=0;x<field.length;x++){
			if (field[x]!=null){
				if (field[x].length() >= 100){
					field[x] = field[x].substring(0, 95) + "...";
				}
			}
		}
		
		try{
		
			p.setMessagebodyid(messageBodyId);
			p.setRoute(route);
			p.setPriorPendingLocation(field[1]);
			p.setAccommodationCode(field[2]);
			p.setAdmitReason(field[3]);
			p.setTransferReason(field[4]);
			p.setPatientValuables(field[5]);
			p.setPatientValuablesLocation(field[6]);
			p.setVisitUserCode(field[7]);
			p.setExpectedAdmitDateTime(field[8]);
			p.setExpectedDischargeDateTime(field[9]);
			p.setEstimatedLengthofInpatientStay(field[10]);
			p.setActualLengthofInpatientStay(field[11]);
			p.setVisitDescription(field[12]);
			p.setReferralSourceCode(field[13]);
			p.setPreviousServiceDate(field[14]);
			p.setEmploymentIllnessRelatedIndicator(field[15]);
			p.setPurgeStatusCode(field[16]);
			p.setPurgeStatusDate(field[17]);
			p.setSpecialProgramCode(field[18]);
			p.setRetentionIndicator(field[19]);
			p.setExpectedNumberofInsurancePlans(field[20]);
			p.setVisitPublicityCode(field[21]);
			p.setVisitProtectionIndicator(field[22]);
			p.setClinicOrganizationName(field[23]);
			p.setPatientStatusCode(field[24]);
			p.setVisitPriorityCode(field[25]);
			p.setPreviousTreatmentDate(field[26]);
			p.setExpectedDischargeDisposition(field[27]);
			p.setSignatureonFileDate(field[28]);
			p.setFirstSimilarIllnessDate(field[29]);
			p.setPatientChargeAdjustmentCode(field[30]);
			p.setRecurringServiceCode(field[31]);
			p.setBillingMediaCode(field[32]);
			p.setExpectedSurgeryDateandTime(field[33]);
			p.setMilitaryPartnershipCode(field[34]);
			p.setMilitaryNonAvailabilityCode(field[35]);
			p.setNewbornBabyIndicator(field[36]);
			p.setBabyDetainedIndicator(field[37]);
			p.setModeofArrivalCode(field[38]);
			p.setRecreationalDrugUseCode(field[39]);
			p.setAdmissionLevelofCareCode(field[40]);
			p.setPrecautionCode(field[41]);
			p.setPatientConditionCode(field[42]);
			p.setLivingWillCode(field[43]);
			p.setOrganDonorCode(field[44]);
			p.setAdvanceDirectiveCode(field[45]);
			p.setPatientStatusEffectiveDate(field[46]);
			p.setExpectedLOAReturnDateTime(field[47]);
			p.setExpectedPreadmissionTestingDateTime(field[48]);
			p.setNotifyClergyCode(field[49]);

			
		}
		catch(ArrayIndexOutOfBoundsException ae){}
			
		persist(p);
		
	}
	
	private static void processAIS(String ID, String interfaceName, String hl7){
		
		ais a = new ais();
		a.init();
		String[] field = hl7.split("\\|");
		
		for (int x=0;x<field.length;x++){
			if (field[x]!=null){
				if (field[x].length() >= 100){
					field[x] = field[x].substring(0, 95) + "...";
				}
			}
		}
		
		try{
		
			a.setSetID(field[1]);
			a.setSegmentActionCode(field[2]);
			a.setUniversalServiceIdentifier(field[3]);
			a.setStartDateTime(field[4]);
			a.setStartDateTimeOffset(field[5]);
			a.setStartDateTimeOffsetUnits(field[6]);
			a.setDuration(field[7]);
			a.setDurationUnits(field[8]);
			a.setAllowSubstitutionCode(field[9]);
			a.setFillerStatusCode(field[10]);
			a.setPlacerSupplementalServiceInformation(field[11]);
			a.setFillerSupplementalServiceInformation(field[12]);
		
		}
		catch(ArrayIndexOutOfBoundsException ae){}
			
		a.setMessageControlId(messageControlId);
		a.setHl7Interface(INTERFACE);
		
		persist(a);
		
	}
	
	private static void processAIL(String ID, String interfaceName, String hl7){
		
		ail a = new ail();
		a.init();
		String[] field = hl7.split("\\|");
		
		for (int x=0;x<field.length;x++){
			if (field[x]!=null){
				if (field[x].length() >= 100){
					field[x] = field[x].substring(0, 95) + "...";
				}
			}
		}
		
		try{
		
			a.setSetID(field[1]);
			a.setSegmentActionCode(field[2]);
			a.setLocationResourceID(field[3]);
			a.setLocationType(field[4]);
			a.setLocationGroup(field[5]);
			a.setStartDateTime(field[6]);
			a.setStartDateTimeOffset(field[7]);
			a.setStartDateTimeOffsetUnits(field[8]);
			a.setDuration(field[9]);
			a.setDurationUnits(field[10]);
			a.setAllowSubstitutionCode(field[11]);
			a.setFillerStatusCode(field[12]);
		
		}
		catch(ArrayIndexOutOfBoundsException ae){}
			
		a.setMessageControlId(messageControlId);
		a.setHl7Interface(INTERFACE);
		
		persist(a);
		
	}
	
	
	private static void processROL(int route, String messageBodyId, String hl7){
		
		rol r = new rol();
		r.init();
		String[] field = hl7.split("\\|");
		
		for (int x=0;x<field.length;x++){
			if (field[x]!=null){
				if (field[x].length() >= 100){
					field[x] = field[x].substring(0, 95) + "...";
				}
			}
		}
		
		try{
		
			r.setMessagebodyid(messageBodyId);
			r.setRoute(route);
			r.setRoleInstanceID(field[1]);
			r.setActionCode(field[2]);
			r.setRole(field[3]);
			r.setRolePerson(field[4]);
			r.setRoleBeginDateTime(field[5]);
			r.setRoleEndDateTime(field[6]);
			r.setRoleDuration(field[7]);
			r.setRoleActionReason(field[8]);
			r.setProviderType(field[9]);
			r.setOrganizationUnitType(field[10]);
			r.setOfficeHomeAddressBirthplace(field[11]);
			r.setPhone(field[12]);
		
		}
		catch(ArrayIndexOutOfBoundsException ae){}
			
		persist(r);
		
	}
	
	private static void processQAK(String ID, String interfaceName, String hl7){
		
		qak q = new qak();
		q.init();
		String[] field = hl7.split("\\|");
		
		for (int x=0;x<field.length;x++){
			if (field[x]!=null){
				if (field[x].length() >= 100){
					field[x] = field[x].substring(0, 95) + "...";
				}
			}
		}
		
		try{
		
			q.setQueryTag(field[1]);
			q.setQueryResponseStatus(field[2]);
			q.setMessageQueryName(field[3]);
			q.setHitCount(field[4]);
			q.setThispayload(field[5]);
			q.setHitsremaining(field[6]);
			
		}
		catch(ArrayIndexOutOfBoundsException ae){}
			
		q.setMessageControlId(messageControlId);
		q.setHl7Interface(INTERFACE);
		
		persist(q);
		
	}
	
	private static void processQPD(String ID, String interfaceName, String hl7){
		
		qpd q = new qpd();
		q.init();
		String[] field = hl7.split("\\|");
		
		for (int x=0;x<field.length;x++){
			if (field[x]!=null){
				if (field[x].length() >= 100){
					field[x] = field[x].substring(0, 95) + "...";
				}
			}
		}
		
		try{
		
			q.setMessageQueryName(field[1]);
			q.setQueryTag(field[2]);
			q.setUserParameters(field[3]);
			
		}
		catch(ArrayIndexOutOfBoundsException ae){}
			
		q.setMessageControlId(messageControlId);
		q.setHl7Interface(INTERFACE);
		
		persist(q);
		
	}
	
	private static void processRCP(String ID, String interfaceName, String hl7){
		
		rcp r = new rcp();
		r.init();
		String[] field = hl7.split("\\|");
		
		for (int x=0;x<field.length;x++){
			if (field[x]!=null){
				if (field[x].length() >= 100){
					field[x] = field[x].substring(0, 95) + "...";
				}
			}
		}
		
		try{
		
			r.setQueryPriority(field[1]);
			r.setQuantityLimitedRequest(field[2]);
			r.setResponseModality(field[3]);
			r.setExecutionandDeliveryTime(field[4]);
			r.setModifyIndicator(field[5]);
			r.setSortbyField(field[6]);
			r.setSegmentgroupinclusion(field[7]);
			
		}
		catch(ArrayIndexOutOfBoundsException ae){}
			
		r.setMessageControlId(messageControlId);
		r.setHl7Interface(INTERFACE);
		
		persist(r);
		
	}
	
	private static void processAIG(String ID, String interfaceName, String hl7){
		
		aig a = new aig();
		a.init();
		String[] field = hl7.split("\\|");
		
		for (int x=0;x<field.length;x++){
			if (field[x]!=null){
				if (field[x].length() >= 100){
					field[x] = field[x].substring(0, 95) + "...";
				}
			}
		}
		
		try{
		
			a.setSetID(field[1]);
			a.setSegmentActionCode(field[2]);
			a.setResourceID(field[3]);
			a.setResourceType(field[4]);
			a.setResourceGroup(field[5]);
			a.setResourceQuantity(field[6]);
			a.setResourceQuantityUnits(field[7]);
			a.setStartDatetTime(field[8]);
			a.setStartDateTimeOffset(field[9]);
			a.setStartDateTimeOffsetUnits(field[10]);
			a.setDuration(field[11]);
			a.setDurationUnits(field[12]);
			a.setAllowSubstitutionCode(field[13]);
			a.setFillerStatusCode(field[14]);
		
		}
		catch(ArrayIndexOutOfBoundsException ae){}
			
		a.setMessageControlId(messageControlId);
		a.setHl7Interface(INTERFACE);
		
		persist(a);
		
	}
	
	private static void processSuspended(ResultSet rs){
		
		suspended s = new suspended();
		s.init();
		try{
		
			s.setHid(rs.getString(1));
			s.setHtimeCreated(rs.getString(2));
			s.setHsessionId(rs.getString(3));
			s.setHstatus(rs.getString(4));
			s.setHsourceConfigName(rs.getString(5));
			s.setHtargetConfigName(rs.getString(6));
			s.setMid(rs.getString(7));
			s.setMoriginalDocId(rs.getString(8));
		
		}
		catch(SQLException se){}
			
		s.setMessageControlId(messageControlId);
		s.setHl7Interface(INTERFACE);
		
		persist(s);
		
	}
		
	private static void processCirResponse(ResultSet rs){
		
		cir c = new cir();
		c.init();
		
		try{
		
			c.setSendingApplication(rs.getString(1));
			c.setSendingFacility(rs.getString(2));
			c.setReceivingApplication(rs.getString(3));
			c.setReceivingFacility(rs.getString(4));
			c.setResponseDateTime(rs.getString(5));
			c.setMessageControlId(rs.getString(6));
			c.setPatientIdentifierList(rs.getString(7));
			c.setImmAdminDate(rs.getString(8));
			c.setImmAdminCode(rs.getString(9));
			c.setImmActionCode(rs.getString(10));
			c.setOrderingProvider(rs.getString(11));
			c.setErrorCodeAndLocation(rs.getString(12));
			c.setErrorLocation(rs.getString(13));
			c.setHl7ErrorCode(rs.getString(14));
			c.setSeverity(rs.getString(15));
			c.setAppErrorCode(rs.getString(16));
			c.setAppErrorParameter(rs.getString(17));
			c.setDiagnosticInfo(rs.getString(18));
			c.setUserMessage(rs.getString(19));
		}
		catch(SQLException se){}
			
		c.setHl7Interface(INTERFACE);
		
		persist(c);
		
	}
	
	private static void processVolumetrics(ResultSet rs){
		
		volumetric v = new volumetric();
		v.init();
		
		try{
		
			v.setSource("QMED");
			v.setFacility(rs.getString(1));
			v.setDatatype(rs.getString(2));
			v.setTimecreated(rs.getString(3));
			
		}
		catch(SQLException se){}
			
		persist(v);
		
	}
	
	private static void processZAD(String ID, String interfaceName, String hl7){
		
		zad z = new zad();
		z.init();
		String[] field = hl7.split("\\|");
		
		for (int x=0;x<field.length;x++){
			if (field[x]!=null){
				if (field[x].length() >= 100){
					field[x] = field[x].substring(0, 95) + "...";
				}
			}
		}
		
		try{
		
			z.setSchedulingprocno(field[1]);
			z.setDepartmentdetails(field[2]);
			z.setAlternateResourceID(field[3]);
		
		}
		catch(ArrayIndexOutOfBoundsException ae){}
			
		z.setMessageControlId(messageControlId);
		z.setHl7Interface(INTERFACE);
		
		persist(z);
		
	}
	
	private static void processFT1(int route, String messageBodyId, String hl7){
		
		ft1 f = new ft1();
		f.init();
		String[] field = hl7.split("\\|");
		
		for (int x=0;x<field.length;x++){
			if (field[x]!=null){
				if (field[x].length() >= 100){
					field[x] = field[x].substring(0, 95) + "...";
				}
			}
		}
		
		try{
		
			f.setMessagebodyid(messageBodyId);
			f.setRoute(route);
			f.setSetID(field[1]);
			f.setTransactionID(field[2]);
			f.setTransactionBatchID(field[3]);
			f.setTransactionDate(field[4]);
			f.setTransactionPostingDate(field[5]);
			f.setTransactionType(field[6]);
			f.setTransactionCode(field[7]);
			f.setTransactionDescription(field[8]);
			f.setTransactionDescriptionAlt(field[9]);
			f.setTransactionQuantity(field[10]);
			f.setTransactionAmountExtended(field[11]);
			f.setTransactionAmountUnit(field[12]);
			f.setDepartmentCode(field[13]);
			f.setInsurancePlanID(field[14]);
			f.setInsuranceAmount(field[15]);
			f.setAssignedPatientLocation(field[16]);
			f.setFeeSchedule(field[17]);
			f.setPatientType(field[18]);
			f.setDiagnosisCode(field[19]);
			f.setPerformedByCode(field[20]);
			f.setOrderedByCode(field[21]);
			f.setUnitCost(field[22]);
			f.setFillerOrderNumber(field[23]);
			f.setEnteredByCode(field[24]);
			f.setProcedureCode(field[25]);
			f.setProcedureCodeModifier(field[26]);
			
		}
		catch(ArrayIndexOutOfBoundsException ae){} 
			
		persist(f);
		
	}
	
	private static void processRAW(int route, String messageBodyId, String hl7){	
		
		if(hl7.length()>5){
			System.out.println("Process Raw route="+route+" messageBodyId="+messageBodyId+" hl7=");
			hl7 h = new hl7();
			h.init();
			try{
			h.setRawcontent(hl7);
			}
			catch(ArrayIndexOutOfBoundsException ae){ae.printStackTrace();}
			
			h.setMessagebodyid(messageBodyId);
			h.setRoute(route);
		
			persist(h);
		}
	}
	
	private static void processEnsembleConfiguration(ResultSet rs){
		
		boolean hasPortDefined=false,hasIpDefined=false;
		SimpleDateFormat sdf = new SimpleDateFormat("MM/dd/yyyy HH:mm:ss");
		String refreshed = sdf.format(new Date());
		String searchString,port,ip;
		EnsembleConfiguration e = new EnsembleConfiguration();
		
		try{
		
			if (rs.getString(6) != null){
				
				//if(rs.getString(5).equalsIgnoreCase("PACS1OPERATION")){
				//	System.out.println("PACS1OPERATION: "+rs.getString(6));
				//}
				
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
				
				e.setEnvironment(rs.getString(1));
				e.setProduction(rs.getString(2));
				e.setNamespace(rs.getString(3));
				e.setCategory(rs.getString(4));
				e.setHl7Interface(rs.getString(5));
				e.setPort(port);
				e.setEnabled(rs.getString(7));
				e.setClassName(rs.getString(8));
				e.setLastRefresh(refreshed);
				e.setRemoteIp(ip);
			
				persist(e);
			}
		}
		catch(SQLException sqlE){}
		
	}
	
	public static ArrayList go(Connection conn, ProfileBean profile){
		
		try{
			
			PropertyConfigurator.configure("c:/home/java/cfg/postgre_config-JDBC.properties");
			SchemaBuilder schemaBuilder = new SchemaBuilder();
			log.info("Loading data from this source: "+profile.getConnection());
			log.info(profile.getCacheSql().replaceAll("'", "\""));
			log.info("sourceConfig = "+profile.getSourceConfig()+" targetconfig = "+profile.getTargetConfig()+" last refresh = "+profile.getLastRefresh());
			pstmt = conn.prepareStatement(profile.getCacheSql());
			pstmt.setString(1, profile.getSourceConfig());
			pstmt.setString(2, profile.getTargetConfig());
			pstmt.setString(3, profile.getLastRefresh());
			String hl7Segment="";
			String hl7Pattern="";
			String[] hl7Fields;
			rs = pstmt.executeQuery();
			if (segmentList.size() > 0) segmentList.clear();
			
			while(rs.next()){
				
				
				System.out.println("LoadQueryTool: "+profile.getNamespace());
				
				if(profile.getNamespace().equalsIgnoreCase("ENSEPIC1V2")) processRAW(profile.getRoute(),rs.getString(1),rs.getString(2));
					
				String[] segments = rs.getString(2).split("\r");
				int i;
				
				for(i=0;i<segments.length;i++){
					hl7Segment = segments[i].substring(0,3);
					
					if(hl7Segment.equalsIgnoreCase("MSH")){
						hl7Fields = segments[i].split("\\|");
						hl7Pattern = hl7Fields[8]+":";
						mshCount++;
					}
					
					if(!segmentList.contains(hl7Segment)) segmentList.add(hl7Segment);
					hl7Pattern = hl7Pattern + hl7Segment+"^";
				}
				
				if (!patternList.contains(hl7Pattern)) patternList.add(hl7Pattern);
				hl7Pattern="";
				
				if(rs.getString(2).substring(0,3).equalsIgnoreCase("MSH")){
					processMSH(profile.getRoute(),rs.getString(1),rs.getString(2));
					mshCount++;
				}
				
				for(i=0;i<segments.length;i++){
					if(segments[i].substring(0,3).equalsIgnoreCase("PID")){
						processPID(profile.getRoute(),rs.getString(1),segments[i]);
						break;
					}
				}
				
				for(i=0;i<segments.length;i++){
					if(segments[i].substring(0,3).equalsIgnoreCase("PV1")){
						processPV1(profile.getRoute(),rs.getString(1),segments[i]);
						break;
					}
				}
				
				for(i=0;i<segments.length;i++){
					try{
						if(segments[i].substring(0,3).equalsIgnoreCase("ORC")){
						processORC(profile.getRoute(),rs.getString(1),segments[i]);
						break;
					}
					}
					catch(Exception e){
						System.out.println("skipping invalid segment : "+segments[i]);
					}
				}
				
				for(i=0;i<segments.length;i++){
					try{
						if(segments[i].substring(0,3).equalsIgnoreCase("OBR")){
							processOBR(profile.getRoute(),rs.getString(1),segments[i]);
						}
					}
					catch(Exception e){
						System.out.println("skipping invalid segment : "+segments[i]);
					}
				}
				
				for(i=0;i<segments.length;i++){
					try{
						if(segments[i].substring(0,3).equalsIgnoreCase("MRG")){
							processMRG(profile.getRoute(),rs.getString(1),segments[i]);
						}
					}
					catch(Exception e){
						System.out.println("skipping invalid segment : "+segments[i]);
					}
				}
				
				for(i=0;i<segments.length;i++){
					try{
						if(segments[i].substring(0,3).equalsIgnoreCase("SPM")){
							processSPM(profile.getRoute(),rs.getString(1),segments[i]);
						}
					}
					catch(Exception e){
						System.out.println("skipping invalid segment : "+segments[i]);
					}
				}
				
				for(i=0;i<segments.length;i++){
					try{
						if(segments[i].substring(0,3).equalsIgnoreCase("OBX")){
							processOBX(profile.getRoute(),rs.getString(1),segments[i]);
						}
					}
					catch(Exception e){
						System.out.println("skipping invalid segment : "+segments[i]);
					}
				}
				
				for(i=0;i<segments.length;i++){
					try{
						if(segments[i].substring(0,3).equalsIgnoreCase("NTE")){
							processNTE(profile.getRoute(),rs.getString(1),segments[i]);
						}
					}
					catch(Exception e){
						System.out.println("skipping invalid segment : "+segments[i]);
					}
				}
				
				for(i=0;i<segments.length;i++){
					try{
						if(segments[i].substring(0,3).equalsIgnoreCase("DG1")){
							processDG1(profile.getRoute(),rs.getString(1),segments[i]);
						}
					}
					catch(Exception e){
						System.out.println("skipping invalid segment : "+segments[i]);
					}
				}
				
				for(i=0;i<segments.length;i++){
					try{
						if(segments[i].substring(0,3).equalsIgnoreCase("MSA")){
							processMSA(profile.getRoute(),rs.getString(1),segments[i]);
						break;
						}
					}
					catch(Exception e){
						System.out.println("skipping invalid segment : "+segments[i]);
					}
				}
				
				for(i=0;i<segments.length;i++){
					try{
						if(segments[i].substring(0,3).equalsIgnoreCase("PD1")){
							processPD1(profile.getRoute(),rs.getString(1),segments[i]);
						break;
						}
					}
					catch(Exception e){
						System.out.println("skipping invalid segment : "+segments[i]);
					}
				}
				
				for(i=0;i<segments.length;i++){
					try{
						if(segments[i].substring(0,3).equalsIgnoreCase("TQ1")){
							processTQ1(profile.getRoute(),rs.getString(1),segments[i]);
						break;
						}
					}
					catch(Exception e){
						System.out.println("skipping invalid segment : "+segments[i]);
					}
				}
				
				for(i=0;i<segments.length;i++){
					try{
						if(segments[i].substring(0,3).equalsIgnoreCase("ZCT")){
							processZCT(profile.getRoute(),rs.getString(1),segments[i]);
						break;
						}
					}
					catch(Exception e){
						System.out.println("skipping invalid segment : "+segments[i]);
					}
				}
				
				for(i=0;i<segments.length;i++){
					try{
						if(segments[i].substring(0,3).equalsIgnoreCase("MFI")){
							processMFI(profile.getRoute(),rs.getString(1),segments[i]);
						break;
						}
					}
					catch(Exception e){
						System.out.println("skipping invalid segment : "+segments[i]);
					}
				}
				
				for(i=0;i<segments.length;i++){
					try{
						if(segments[i].substring(0,3).equalsIgnoreCase("MFE")){
							processMFE(profile.getRoute(),rs.getString(1),segments[i]);
						break;
						}
					}
					catch(Exception e){
						System.out.println("skipping invalid segment : "+segments[i]);
					}
				}
				
				for(i=0;i<segments.length;i++){
					try{
						if(segments[i].substring(0,3).equalsIgnoreCase("STF")){
							processSTF(profile.getRoute(),rs.getString(1),segments[i]);
						break;
						}
					}
					catch(Exception e){
						System.out.println("skipping invalid segment : "+segments[i]);
					}
				}
				
				for(i=0;i<segments.length;i++){
					try{
						if(segments[i].substring(0,3).equalsIgnoreCase("EVN")){
							processEVN(profile.getRoute(),rs.getString(1),segments[i]);
						break;
						}
					}
					catch(Exception e){
						System.out.println("skipping invalid segment : "+segments[i]);
					}
				}
				
				for(i=0;i<segments.length;i++){
					try{
						if(segments[i].substring(0,3).equalsIgnoreCase("FT1")){
							processFT1(profile.getRoute(),rs.getString(1),segments[i]);
						break;
						}
					}
					catch(Exception e){
						System.out.println("skipping invalid segment : "+segments[i]);
					}
				}
				
				for(i=0;i<segments.length;i++){
					try{
						if(segments[i].substring(0,3).equalsIgnoreCase("PRA")){
							processPRA(profile.getRoute(),rs.getString(1),segments[i]);
						break;
						}
					}
					catch(Exception e){
						System.out.println("skipping invalid segment : "+segments[i]);
					}
				}
				
				for(i=0;i<segments.length;i++){
					try{
						if(segments[i].substring(0,3).equalsIgnoreCase("ROL")){
							processROL(profile.getRoute(),rs.getString(1),segments[i]);
						break;
						}
					}
					catch(Exception e){
						System.out.println("skipping invalid segment : "+segments[i]);
					}
				}
				
				for(i=0;i<segments.length;i++){
					try{
						if(segments[i].substring(0,3).equalsIgnoreCase("NK1")){
							processNK1(profile.getRoute(),rs.getString(1),segments[i]);
						break;
						}
					}
					catch(Exception e){
						System.out.println("skipping invalid segment : "+segments[i]);
					}
				}
				
				for(i=0;i<segments.length;i++){
					try{
						if(segments[i].substring(0,3).equalsIgnoreCase("PV2")){
							processPV2(profile.getRoute(),rs.getString(1),segments[i]);
						break;
						}
					}
					catch(Exception e){
						System.out.println("skipping invalid segment : "+segments[i]);
					}
				}
				
				for(i=0;i<segments.length;i++){
					try{
						if(segments[i].substring(0,3).equalsIgnoreCase("IN1")){
							processIN1(profile.getRoute(),rs.getString(1),segments[i]);
						break;
						}
					}
					catch(Exception e){
						System.out.println("skipping invalid segment : "+segments[i]);
					}
				}
				
				for(i=0;i<segments.length;i++){
					try{
						if(segments[i].substring(0,3).equalsIgnoreCase("IN2")){
							processIN2(profile.getRoute(),rs.getString(1),segments[i]);
						break;
						}
					}
					catch(Exception e){
						System.out.println("skipping invalid segment : "+segments[i]);
					}
				}
				
				for(i=0;i<segments.length;i++){
					try{
						if(segments[i].substring(0,3).equalsIgnoreCase("IN3")){
							processIN3(profile.getRoute(),rs.getString(1),segments[i]);
						break;
						}
					}
					catch(Exception e){
						System.out.println("skipping invalid segment : "+segments[i]);
					}
				}
				
				for(i=0;i<segments.length;i++){
					try{
						if(segments[i].substring(0,3).equalsIgnoreCase("DRG")){
							processDRG(profile.getRoute(),rs.getString(1),segments[i]);
						break;
						}
					}
					catch(Exception e){
						System.out.println("skipping invalid segment : "+segments[i]);
					}
				}
				
				for(i=0;i<segments.length;i++){
					try{
						if(segments[i].substring(0,3).equalsIgnoreCase("CON")){
							processCON(profile.getRoute(),rs.getString(1),segments[i]);
						break;
						}
					}
					catch(Exception e){
						System.out.println("skipping invalid segment : "+segments[i]);
					}
				}
				
				for(i=0;i<segments.length;i++){
					try{
						if(segments[i].substring(0,3).equalsIgnoreCase("GT1")){
							processGT1(profile.getRoute(),rs.getString(1),segments[i]);
						break;
						}
					}
					catch(Exception e){
						System.out.println("skipping invalid segment : "+segments[i]);
					}
				}	
			}
			
			System.out.println("\nSEGMENT PATTERNS for "+mshCount+" transactions");
			for (String chris : patternList) System.out.println("Schema Pattern: "+chris);
			System.out.println("\n");
			log.info(INTERFACE+": "+mshCount+" hl7 transactions were loaded into MessageWarehouse");
			mshCount=0;
			
			/////////schemaBuilder.Make(patternList,profile.getRoute());
			
			
		}
		catch(Exception e){
			
			log.error(e.getMessage()+"   "+INTERFACE);
			System.out.println("LoadQueryTool exception: "+e.getMessage());
		}
		
		JDBCManager.closePreparedStatement(pstmt);
		JDBCManager.closeResultSet(rs);
		return segmentList;

	}
}

