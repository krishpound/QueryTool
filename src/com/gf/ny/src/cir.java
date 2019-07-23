package com.gf.ny.src;

public class cir {
	
	private static int id;
	private static String sendingApplication;
	private static String sendingFacility;
	private static String receivingApplication;
	private static String receivingFacility;
	private static String responseDateTime;
	private static String messageControlId;
	private static String patientIdentifierList;
	private static String immAdminDate;
	private static String immAdminCode;
	private static String immActionCode;
	private static String orderingProvider;
	private static String errorCodeAndLocation;
	private static String errorLocation;
	private static String hl7ErrorCode;
	private static String severity;
	private static String appErrorCode;
	private static String appErrorParameter;
	private static String diagnosticInfo;
	private static String userMessage;
	private static String hl7Interface;
	
	public void init(){
		
		this.sendingApplication="";
		this.sendingFacility="";
		this.receivingApplication="";
		this.receivingFacility="";
		this.responseDateTime="";
		this.messageControlId="";
		this.patientIdentifierList="";
		this.immAdminDate="";
		this.immAdminCode="";
		this.immActionCode="";
		this.orderingProvider="";
		this.errorCodeAndLocation="";
		this.errorLocation="";
		this.hl7ErrorCode="";
		this.severity="";
		this.appErrorCode="";
		this.appErrorParameter="";
		this.diagnosticInfo="";
		this.userMessage="";
		this.hl7Interface="";
		
	}
	
	public void setId(int i){
		this.id = i;
	}
	public int getId(){
		return this.id;
	}
	public void setSendingApplication(String s){
	   this.sendingApplication = s;
	}
	public String getSendingApplication(){
	   return this.sendingApplication;
	}
	public void setSendingFacility(String s){
	   this.sendingFacility = s;
	}
	public String getSendingFacility(){
	   return this.sendingFacility;
	}
	public void setReceivingApplication(String s){
	   this.receivingApplication = s;
	}
	public String getReceivingApplication(){
	   return this.receivingApplication;
	}
	public void setReceivingFacility(String s){
	   this.receivingFacility = s;
	}
	public String getReceivingFacility(){
	   return this.receivingFacility;
	}
	public void setResponseDateTime(String s){
	   this.responseDateTime = s;
	}
	public String getResponseDateTime(){
	   return this.responseDateTime;
	}
	public void setMessageControlId(String s){
	   this.messageControlId = s;
	}
	public String getMessageControlId(){
	   return this.messageControlId;
	}
	public void setPatientIdentifierList(String s){
	   this.patientIdentifierList = s;
	}
	public String getPatientIdentifierList(){
	   return this.patientIdentifierList;
	}
	public void setImmAdminDate(String s){
	   this.immAdminDate = s;
	}
	public String getImmAdminDate(){
	   return this.immAdminDate;
	}
	public void setImmAdminCode(String s){
	   this.immAdminCode = s;
	}
	public String getImmAdminCode(){
	   return this.immAdminCode;
	}
	public void setImmActionCode(String s){
	   this.immActionCode = s;
	}
	public String getImmActionCode(){
	   return this.immActionCode;
	}
	public void setOrderingProvider(String s){
	   this.orderingProvider = s;
	}
	public String getOrderingProvider(){
	   return this.orderingProvider;
	}
	public void setErrorCodeAndLocation(String s){
	   this.errorCodeAndLocation = s;
	}
	public String getErrorCodeAndLocation(){
	   return this.errorCodeAndLocation;
	}
	public void setErrorLocation(String s){
	   this.errorLocation = s;
	}
	public String getErrorLocation(){
	   return this.errorLocation;
	}
	public void setHl7ErrorCode(String s){
	   this.hl7ErrorCode = s;
	}
	public String getHl7ErrorCode(){
	   return this.hl7ErrorCode;
	}
	public void setSeverity(String s){
	   this.severity = s;
	}
	public String getSeverity(){
	   return this.severity;
	}
	public void setAppErrorCode(String s){
	   this.appErrorCode = s;
	}
	public String getAppErrorCode(){
	   return this.appErrorCode;
	}
	public void setAppErrorParameter(String s){
	   this.appErrorParameter = s;
	}
	public String getAppErrorParameter(){
	   return this.appErrorParameter;
	}
	public void setDiagnosticInfo(String s){
	   this.diagnosticInfo = s;
	}
	public String getDiagnosticInfo(){
	   return this.diagnosticInfo;
	}
	public void setUserMessage(String s){
	   this.userMessage = s;
	}
	public String getUserMessage(){
	   return this.userMessage;
	}
	public void setHl7Interface(String s){
		this.hl7Interface = s;
	}
	public String getHl7Interface(){
		return this.hl7Interface;
	}

	
}
