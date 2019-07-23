package com.gf.ny.src;

public class in3 {

	private static int id;
	private static String setID;
	private static String certificationNumber;
	private static String certifiedBy;
	private static String certificationRequired;
	private static String penalty;
	private static String certificationDateTime;
	private static String certificationModifyDateTime;
	private static String operator;
	private static String certificationBeginDate;
	private static String certificationEndDate;
	private static String days;
	private static String nonConcurCodeDescription;
	private static String nonConcurEffectiveDateTime;
	private static String physicianReviewer;
	private static String certificationContact;
	private static String certificationContactPhoneNumber;
	private static String appealReason;
	private static String certificationAgency;
	private static String certificationAgencyPhoneNumber;
	private static String preCertificationRequirement;
	private static String caseManager;
	private static String secondOpinionDate;
	private static String secondOpinionStatus;
	private static String secondOpinionDocumentationReceived;
	private static String secondOpinionPhysician;
	private static String segment;
	private static String messagebodyid;
	private static int route;
	
	
	public void init(){
		
	    this.setID="";
	    this.certificationNumber="";
	    this.certifiedBy="";
	    this.certificationRequired="";
	    this.penalty="";
	    this.certificationDateTime="";
	    this.certificationModifyDateTime="";
	    this.operator="";
	    this.certificationBeginDate="";
	    this.certificationEndDate="";
	    this.days="";
	    this.nonConcurCodeDescription="";
	    this.nonConcurEffectiveDateTime="";
	    this.physicianReviewer="";
	    this.certificationContact="";
	    this.certificationContactPhoneNumber="";
	    this.appealReason="";
	    this.certificationAgency="";
	    this.certificationAgencyPhoneNumber="";
	    this.preCertificationRequirement="";
	    this.caseManager="";
	    this.secondOpinionDate="";
	    this.secondOpinionStatus="";
	    this.secondOpinionDocumentationReceived="";
	    this.secondOpinionPhysician="";
	    this.segment="in3";
		this.messagebodyid="";
		this.route=0;
		
	}
	
	public boolean isPopulated(){
		
		int segmentLength  = setID.length() + 
		certificationNumber.length() + 
		certifiedBy.length() + 
		certificationRequired.length() + 
		penalty.length() + 
		certificationDateTime.length() + 
		certificationModifyDateTime.length() + 
		operator.length() + 
		certificationBeginDate.length() + 
		certificationEndDate.length() + 
		days.length() + 
		nonConcurCodeDescription.length() + 
		nonConcurEffectiveDateTime.length() + 
		physicianReviewer.length() + 
		certificationContact.length() + 
		certificationContactPhoneNumber.length() + 
		appealReason.length() + 
		certificationAgency.length() + 
		certificationAgencyPhoneNumber.length() + 
		preCertificationRequirement.length() + 
		caseManager.length() + 
		secondOpinionDate.length() + 
		secondOpinionStatus.length() + 
		secondOpinionDocumentationReceived.length() + 
		secondOpinionPhysician.length();
		
		boolean rc = (segmentLength > 0) ? true:false;
    	return rc;
	
	}
	
	
	public int getId(){
        return id;
    }
    public void setId(int i) {
        id = i;
    }
	
	public void setSetID(String s){
		   this.setID = s;
		}
		public String getSetID(){
		   return this.setID;
		}
		public void setCertificationNumber(String s){
		   this.certificationNumber = s;
		}
		public String getCertificationNumber(){
		   return this.certificationNumber;
		}
		public void setCertifiedBy(String s){
		   this.certifiedBy = s;
		}
		public String getCertifiedBy(){
		   return this.certifiedBy;
		}
		public void setCertificationRequired(String s){
		   this.certificationRequired = s;
		}
		public String getCertificationRequired(){
		   return this.certificationRequired;
		}
		public void setPenalty(String s){
		   this.penalty = s;
		}
		public String getPenalty(){
		   return this.penalty;
		}
		public void setCertificationDateTime(String s){
		   this.certificationDateTime = s;
		}
		public String getCertificationDateTime(){
		   return this.certificationDateTime;
		}
		public void setCertificationModifyDateTime(String s){
		   this.certificationModifyDateTime = s;
		}
		public String getCertificationModifyDateTime(){
		   return this.certificationModifyDateTime;
		}
		public void setOperator(String s){
		   this.operator = s;
		}
		public String getOperator(){
		   return this.operator;
		}
		public void setCertificationBeginDate(String s){
		   this.certificationBeginDate = s;
		}
		public String getCertificationBeginDate(){
		   return this.certificationBeginDate;
		}
		public void setCertificationEndDate(String s){
		   this.certificationEndDate = s;
		}
		public String getCertificationEndDate(){
		   return this.certificationEndDate;
		}
		public void setDays(String s){
		   this.days = s;
		}
		public String getDays(){
		   return this.days;
		}
		public void setNonConcurCodeDescription(String s){
		   this.nonConcurCodeDescription = s;
		}
		public String getNonConcurCodeDescription(){
		   return this.nonConcurCodeDescription;
		}
		public void setNonConcurEffectiveDateTime(String s){
		   this.nonConcurEffectiveDateTime = s;
		}
		public String getNonConcurEffectiveDateTime(){
		   return this.nonConcurEffectiveDateTime;
		}
		public void setPhysicianReviewer(String s){
		   this.physicianReviewer = s;
		}
		public String getPhysicianReviewer(){
		   return this.physicianReviewer;
		}
		public void setCertificationContact(String s){
		   this.certificationContact = s;
		}
		public String getCertificationContact(){
		   return this.certificationContact;
		}
		public void setCertificationContactPhoneNumber(String s){
		   this.certificationContactPhoneNumber = s;
		}
		public String getCertificationContactPhoneNumber(){
		   return this.certificationContactPhoneNumber;
		}
		public void setAppealReason(String s){
		   this.appealReason = s;
		}
		public String getAppealReason(){
		   return this.appealReason;
		}
		public void setCertificationAgency(String s){
		   this.certificationAgency = s;
		}
		public String getCertificationAgency(){
		   return this.certificationAgency;
		}
		public void setCertificationAgencyPhoneNumber(String s){
		   this.certificationAgencyPhoneNumber = s;
		}
		public String getCertificationAgencyPhoneNumber(){
		   return this.certificationAgencyPhoneNumber;
		}
		public void setPreCertificationRequirement(String s){
		   this.preCertificationRequirement = s;
		}
		public String getPreCertificationRequirement(){
		   return this.preCertificationRequirement;
		}
		public void setCaseManager(String s){
		   this.caseManager = s;
		}
		public String getCaseManager(){
		   return this.caseManager;
		}
		public void setSecondOpinionDate(String s){
		   this.secondOpinionDate = s;
		}
		public String getSecondOpinionDate(){
		   return this.secondOpinionDate;
		}
		public void setSecondOpinionStatus(String s){
		   this.secondOpinionStatus = s;
		}
		public String getSecondOpinionStatus(){
		   return this.secondOpinionStatus;
		}
		public void setSecondOpinionDocumentationReceived(String s){
		   this.secondOpinionDocumentationReceived = s;
		}
		public String getSecondOpinionDocumentationReceived(){
		   return this.secondOpinionDocumentationReceived;
		}
		public void setSecondOpinionPhysician(String s){
		   this.secondOpinionPhysician = s;
		}
		public String getSecondOpinionPhysician(){
		   return this.secondOpinionPhysician;
		}
		public void setSegment(String s){
		   	this.segment = s;
		}
		public String getSegment(){
		   	return this.segment;
		}
		public void setMessagebodyid(String s){
		   	this.messagebodyid = s;
		}
		public String getMessagebodyid(){
		   	return this.messagebodyid;
		}
		public int getRoute() {
		       return route;
		}
		public void setRoute(int i) {
		       this.route = i;
		}
	
}
