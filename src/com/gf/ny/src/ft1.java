package com.gf.ny.src;

public class ft1 {
	
	private static int id;
	private static String setID;
	private static String transactionID;
	private static String transactionBatchID;
	private static String transactionDate;
	private static String transactionPostingDate;
	private static String transactionType;
	private static String transactionCode;
	private static String transactionDescription;
	private static String transactionDescriptionAlt;
	private static String transactionQuantity;
	private static String transactionAmountExtended;
	private static String transactionAmountUnit;
	private static String departmentCode;
	private static String insurancePlanID;
	private static String insuranceAmount;
	private static String assignedPatientLocation;
	private static String feeSchedule;
	private static String patientType;
	private static String diagnosisCode;
	private static String performedByCode;
	private static String orderedByCode;
	private static String unitCost;
	private static String fillerOrderNumber;
	private static String enteredByCode;
	private static String procedureCode;
	private static String procedureCodeModifier;
	private static String segment;
	private static String messagebodyid;
	private static int route;
	
	public void init(){
		
		this.setID="";
		this.transactionID="";
		this.transactionBatchID="";
		this.transactionDate="";
		this.transactionPostingDate="";
		this.transactionType="";
		this.transactionCode="";
		this.transactionDescription="";
		this.transactionDescriptionAlt="";
		this.transactionQuantity="";
		this.transactionAmountExtended="";
		this.transactionAmountUnit="";
		this.departmentCode="";
		this.insurancePlanID="";
		this.insuranceAmount="";
		this.assignedPatientLocation="";
		this.feeSchedule="";
		this.patientType="";
		this.diagnosisCode="";
		this.performedByCode="";
		this.orderedByCode="";
		this.unitCost="";
		this.fillerOrderNumber="";
		this.enteredByCode="";
		this.procedureCode="";
		this.procedureCodeModifier="";
		this.segment="ft1";
		this.messagebodyid="";
		this.route=0;
		
	}
	
	public void setId(int i){
		this.id = i;
	}
	public int getId(){
		return this.id;
	}
	public void setSetID(String s){
	   this.setID = s;
	}
	public String getSetID(){
	   return this.setID;
	}
	public void setTransactionID(String s){
	   this.transactionID = s;
	}
	public String getTransactionID(){
	   return this.transactionID;
	}
	public void setTransactionBatchID(String s){
	   this.transactionBatchID = s;
	}
	public String getTransactionBatchID(){
	   return this.transactionBatchID;
	}
	public void setTransactionDate(String s){
	   this.transactionDate = s;
	}
	public String getTransactionDate(){
	   return this.transactionDate;
	}
	public void setTransactionPostingDate(String s){
	   this.transactionPostingDate = s;
	}
	public String getTransactionPostingDate(){
	   return this.transactionPostingDate;
	}
	public void setTransactionType(String s){
	   this.transactionType = s;
	}
	public String getTransactionType(){
	   return this.transactionType;
	}
	public void setTransactionCode(String s){
	   this.transactionCode = s;
	}
	public String getTransactionCode(){
	   return this.transactionCode;
	}
	public void setTransactionDescription(String s){
	   this.transactionDescription = s;
	}
	public String getTransactionDescription(){
	   return this.transactionDescription;
	}
	public void setTransactionDescriptionAlt(String s){
	   this.transactionDescriptionAlt = s;
	}
	public String getTransactionDescriptionAlt(){
	   return this.transactionDescriptionAlt;
	}
	public void setTransactionQuantity(String s){
	   this.transactionQuantity = s;
	}
	public String getTransactionQuantity(){
	   return this.transactionQuantity;
	}
	public void setTransactionAmountExtended(String s){
	   this.transactionAmountExtended = s;
	}
	public String getTransactionAmountExtended(){
	   return this.transactionAmountExtended;
	}
	public void setTransactionAmountUnit(String s){
	   this.transactionAmountUnit = s;
	}
	public String getTransactionAmountUnit(){
	   return this.transactionAmountUnit;
	}
	public void setDepartmentCode(String s){
	   this.departmentCode = s;
	}
	public String getDepartmentCode(){
	   return this.departmentCode;
	}
	public void setInsurancePlanID(String s){
	   this.insurancePlanID = s;
	}
	public String getInsurancePlanID(){
	   return this.insurancePlanID;
	}
	public void setInsuranceAmount(String s){
	   this.insuranceAmount = s;
	}
	public String getInsuranceAmount(){
	   return this.insuranceAmount;
	}
	public void setAssignedPatientLocation(String s){
	   this.assignedPatientLocation = s;
	}
	public String getAssignedPatientLocation(){
	   return this.assignedPatientLocation;
	}
	public void setFeeSchedule(String s){
	   this.feeSchedule = s;
	}
	public String getFeeSchedule(){
	   return this.feeSchedule;
	}
	public void setPatientType(String s){
	   this.patientType = s;
	}
	public String getPatientType(){
	   return this.patientType;
	}
	public void setDiagnosisCode(String s){
	   this.diagnosisCode = s;
	}
	public String getDiagnosisCode(){
	   return this.diagnosisCode;
	}
	public void setPerformedByCode(String s){
	   this.performedByCode = s;
	}
	public String getPerformedByCode(){
	   return this.performedByCode;
	}
	public void setOrderedByCode(String s){
	   this.orderedByCode = s;
	}
	public String getOrderedByCode(){
	   return this.orderedByCode;
	}
	public void setUnitCost(String s){
	   this.unitCost = s;
	}
	public String getUnitCost(){
	   return this.unitCost;
	}
	public void setFillerOrderNumber(String s){
	   this.fillerOrderNumber = s;
	}
	public String getFillerOrderNumber(){
	   return this.fillerOrderNumber;
	}
	public void setEnteredByCode(String s){
	   this.enteredByCode = s;
	}
	public String getEnteredByCode(){
	   return this.enteredByCode;
	}
	public void setProcedureCode(String s){
	   this.procedureCode = s;
	}
	public String getProcedureCode(){
	   return this.procedureCode;
	}
	public void setProcedureCodeModifier(String s){
	   this.procedureCodeModifier = s;
	}
	public String getProcedureCodeModifier(){
	   return this.procedureCodeModifier;
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
