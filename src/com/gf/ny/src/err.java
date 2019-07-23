package com.gf.ny.src;

public class err {

	private static int id;
	private static String errorCodeAndLocation;
	private static String errorLocation;
	private static String hl7ErrorCode;
	private static String severity;
	private static String applicationErrorCode;
	private static String applicationErrorParameter;
	private static String diagnosticInformation;
	private static String userMessage;
	private static String informPersonIndicator;
	private static String overrideType;
	private static String overrideReasonCode;
	private static String helpDeskContactPoint;
	private static String hl7Interface;
	private static String messageControlId;
	
		public void init(){
			
			this.errorCodeAndLocation="";
			this.errorLocation="";
			this.hl7ErrorCode="";
			this.severity="";
			this.applicationErrorCode="";
			this.applicationErrorParameter="";
			this.diagnosticInformation="";
			this.userMessage="";
			this.informPersonIndicator="";
			this.overrideType="";
			this.overrideReasonCode="";
			this.helpDeskContactPoint="";
			this.hl7Interface="";
			this.messageControlId="";
			
		}
	
		public void setId(int i){
		   this.id = i;
		}
		public int getId(){
		   return this.id;
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
		public void setApplicationErrorCode(String s){
		   this.applicationErrorCode = s;
		}
		public String getApplicationErrorCode(){
		   return this.applicationErrorCode;
		}
		public void setApplicationErrorParameter(String s){
		   this.applicationErrorParameter = s;
		}
		public String getApplicationErrorParameter(){
		   return this.applicationErrorParameter;
		}
		public void setDiagnosticInformation(String s){
		   this.diagnosticInformation = s;
		}
		public String getDiagnosticInformation(){
		   return this.diagnosticInformation;
		}
		public void setUserMessage(String s){
		   this.userMessage = s;
		}
		public String getUserMessage(){
		   return this.userMessage;
		}
		public void setInformPersonIndicator(String s){
		   this.informPersonIndicator = s;
		}
		public String getInformPersonIndicator(){
		   return this.informPersonIndicator;
		}
		public void setOverrideType(String s){
		   this.overrideType = s;
		}
		public String getOverrideType(){
		   return this.overrideType;
		}
		public void setOverrideReasonCode(String s){
		   this.overrideReasonCode = s;
		}
		public String getOverrideReasonCode(){
		   return this.overrideReasonCode;
		}
		public void setHelpDeskContactPoint(String s){
		   this.helpDeskContactPoint = s;
		}
		public String getHelpDeskContactPoint(){
		   return this.helpDeskContactPoint;
		}
		public void setHl7Interface(String s){
		   this.hl7Interface = s;
		}
		public String getHl7Interface(){
		   return this.hl7Interface;
		}
		public void setMessageControlId(String s){
		   this.messageControlId = s;
		}
		public String getMessageControlId(){
		   return this.messageControlId;
		}

}
