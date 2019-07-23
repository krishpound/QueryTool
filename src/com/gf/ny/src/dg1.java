package com.gf.ny.src;

public class dg1 {

	private static int id ;
	private static String setId;
	private static String diagnosisCodingMethod;
	private static String diagnosisCode;
	private static String diagnosisDescription;
	private static String diagnosisDatetime;
	private static String diagnosisType;
	private static String majorDiagnosticCategory;
	private static String diagnosticRelatedGroup;
	private static String drgApprovalIndicator;
	private static String drgGrouperReviewCode;
	private static String outlierType;
	private static String outlierDays;
	private static String outlierCost;
	private static String grouperVersionAndType;
	private static String diagnosisPriority;
	private static String diagnosingClinician;
	private static String diagnosisClassification;
	private static String confidentialIndicator;
	private static String attestationDatetime;
	private static String diagnosisIdentifier;
	private static String diagnosisActionCode;
	private static int route;
	private static String segment;
	private static String messagebodyid;
	
	public void init(){
		
		this.setId="";
		this.diagnosisCodingMethod="";
		this.diagnosisCode="";
		this.diagnosisDescription="";
		this.diagnosisDatetime="";
		this.diagnosisType="";
		this.majorDiagnosticCategory="";
		this.diagnosticRelatedGroup="";
		this.drgApprovalIndicator="";
		this.drgGrouperReviewCode="";
		this.outlierType="";
		this.outlierDays="";
		this.outlierCost="";
		this.grouperVersionAndType="";
		this.diagnosisPriority="";
		this.diagnosingClinician="";
		this.diagnosisClassification="";
		this.confidentialIndicator="";
		this.attestationDatetime="";
		this.diagnosisIdentifier="";
		this.diagnosisActionCode="";
		this.route=0;
		this.segment="dg1";
		this.messagebodyid="";
		
	}
	
	public boolean isPopulated(){
		
		int segmentLength = setId.length() +
		diagnosisCodingMethod.length() +
		diagnosisCode.length() +
		diagnosisDescription.length() +
		diagnosisDatetime.length() +
		diagnosisType.length() +
		majorDiagnosticCategory.length() +
		diagnosticRelatedGroup.length() +
		drgApprovalIndicator.length() +
		drgGrouperReviewCode.length() +
		outlierType.length() +
		outlierDays.length() +
		outlierCost.length() +
		grouperVersionAndType.length() +
		diagnosisPriority.length() +
		diagnosingClinician.length() +
		diagnosisClassification.length() +
		confidentialIndicator.length() +
		attestationDatetime.length() +
		diagnosisIdentifier.length() +
		diagnosisActionCode.length();
		
		boolean rc = (segmentLength > 0) ? true:false;
    	return rc;
	}
	
	
	public void dg1(){}
	public void setId (int i){
		   id  = i;
		}
		public int getId (){
		   return id ;
		}
		public void setSetId(String s){
		   setId = s;
		}
		public String getSetId(){
		   return setId;
		}
		public void setDiagnosisCodingMethod(String s){
		   diagnosisCodingMethod = s;
		}
		public String getDiagnosisCodingMethod(){
		   return diagnosisCodingMethod;
		}
		public void setDiagnosisCode(String s){
		   diagnosisCode = s;
		}
		public String getDiagnosisCode(){
		   return diagnosisCode;
		}
		public void setDiagnosisDescription(String s){
		   diagnosisDescription = s;
		}
		public String getDiagnosisDescription(){
		   return diagnosisDescription;
		}
		public void setDiagnosisDatetime(String s){
		   diagnosisDatetime = s;
		}
		public String getDiagnosisDatetime(){
		   return diagnosisDatetime;
		}
		public void setDiagnosisType(String s){
		   diagnosisType = s;
		}
		public String getDiagnosisType(){
		   return diagnosisType;
		}
		public void setMajorDiagnosticCategory(String s){
		   majorDiagnosticCategory = s;
		}
		public String getMajorDiagnosticCategory(){
		   return majorDiagnosticCategory;
		}
		public void setDiagnosticRelatedGroup(String s){
		   diagnosticRelatedGroup = s;
		}
		public String getDiagnosticRelatedGroup(){
		   return diagnosticRelatedGroup;
		}
		public void setDrgApprovalIndicator(String s){
		   drgApprovalIndicator = s;
		}
		public String getDrgApprovalIndicator(){
		   return drgApprovalIndicator;
		}
		public void setDrgGrouperReviewCode(String s){
		   drgGrouperReviewCode = s;
		}
		public String getDrgGrouperReviewCode(){
		   return drgGrouperReviewCode;
		}
		public void setOutlierType(String s){
		   outlierType = s;
		}
		public String getOutlierType(){
		   return outlierType;
		}
		public void setOutlierDays(String s){
		   outlierDays = s;
		}
		public String getOutlierDays(){
		   return outlierDays;
		}
		public void setOutlierCost(String s){
		   outlierCost = s;
		}
		public String getOutlierCost(){
		   return outlierCost;
		}
		public void setGrouperVersionAndType(String s){
		   grouperVersionAndType = s;
		}
		public String getGrouperVersionAndType(){
		   return grouperVersionAndType;
		}
		public void setDiagnosisPriority(String s){
		   diagnosisPriority = s;
		}
		public String getDiagnosisPriority(){
		   return diagnosisPriority;
		}
		public void setDiagnosingClinician(String s){
		   diagnosingClinician = s;
		}
		public String getDiagnosingClinician(){
		   return diagnosingClinician;
		}
		public void setDiagnosisClassification(String s){
		   diagnosisClassification = s;
		}
		public String getDiagnosisClassification(){
		   return diagnosisClassification;
		}
		public void setConfidentialIndicator(String s){
		   confidentialIndicator = s;
		}
		public String getConfidentialIndicator(){
		   return confidentialIndicator;
		}
		public void setAttestationDatetime(String s){
		   attestationDatetime = s;
		}
		public String getAttestationDatetime(){
		   return attestationDatetime;
		}
		public void setDiagnosisIdentifier(String s){
		   diagnosisIdentifier = s;
		}
		public String getDiagnosisIdentifier(){
		   return diagnosisIdentifier;
		}
		public void setDiagnosisActionCode(String s){
		   diagnosisActionCode = s;
		}
		public String getDiagnosisActionCode(){
		   return diagnosisActionCode;
		}
		public void setRoute(int i){
		   this.route = i;
		}
		public int getRoute(){
		   return this.route;
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

}
