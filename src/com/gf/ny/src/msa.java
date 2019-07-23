package com.gf.ny.src;

public class msa {

	private static int id;
	private static String acknowledgmentCode;
	private static String textMessage;
	private static String expectedSequenceNumber;
	private static String delayedAcknowledgmentType;
	private static String errorCondition;
	private static String segment;
	private static String messageBodyId;
	private static int route;
	
		public void init(){
			
			this.acknowledgmentCode="";
			this.textMessage="";
			this.expectedSequenceNumber="";
			this.delayedAcknowledgmentType="";
			this.errorCondition="";
			this.segment="msa";
			this.messageBodyId="";
			this.route=0;
			
			
		}
	
		public void setId(int i){
		   this.id = i;
		}
		public int getId(){
		   return this.id;
		}
		public void setAcknowledgmentCode(String s){
		   this.acknowledgmentCode = s;
		}
		public String getAcknowledgmentCode(){
		   return this.acknowledgmentCode;
		}
		public void setTextMessage(String s){
		   this.textMessage = s;
		}
		public String getTextMessage(){
		   return this.textMessage;
		}
		public void setExpectedSequenceNumber(String s){
		   this.expectedSequenceNumber = s;
		}
		public String getExpectedSequenceNumber(){
		   return this.expectedSequenceNumber;
		}
		public void setDelayedAcknowledgmentType(String s){
		   this.delayedAcknowledgmentType = s;
		}
		public String getDelayedAcknowledgmentType(){
		   return this.delayedAcknowledgmentType;
		}
		public void setErrorCondition(String s){
		   this.errorCondition = s;
		}
		public String getErrorCondition(){
		   return this.errorCondition;
		}
		public void setSegment(String s){
		   	this.segment = s;
		}
		public String getSegment(){
		 	return this.segment;
		}
		public void setMessageBodyId(String s){
		  	this.messageBodyId = s;
		}
		public String getMessageBodyId(){
		   	return this.messageBodyId;
		}
		public int getRoute() {
		    return route;
		}
		public void setRoute(int i) {
		    this.route = i;
		}
}
