package com.gf.ny.src;

public class evn {

	private static int id;
	private static String eventTypeCode;
	private static String recordedDateTime;
	private static String dateTimePlannedEvent;
	private static String eventReasonCode;
	private static String operatorID;
	private static String eventOccurred;
	private static String eventFacility;
	private static String segment;
	private static String messagebodyid;
	private static int route;
	
	public void init(){
		
		this.eventTypeCode="";
		this.recordedDateTime="";
		this.dateTimePlannedEvent="";
		this.eventReasonCode="";
		this.operatorID="";
		this.eventOccurred="";
		this.eventFacility="";
		this.segment="evn";
		this.messagebodyid="";
		this.route=0;
		
	}
	
	public void setId(int i){
		this.id = i;
	}
	public int getId(){
		return this.id;
	}
	public void setEventTypeCode(String s){
	   this.eventTypeCode = s;
	}
	public String getEventTypeCode(){
	   return this.eventTypeCode;
	}
	public void setRecordedDateTime(String s){
	   this.recordedDateTime = s;
	}
	public String getRecordedDateTime(){
	   return this.recordedDateTime;
	}
	public void setDateTimePlannedEvent(String s){
	   this.dateTimePlannedEvent = s;
	}
	public String getDateTimePlannedEvent(){
	   return this.dateTimePlannedEvent;
	}
	public void setEventReasonCode(String s){
	   this.eventReasonCode = s;
	}
	public String getEventReasonCode(){
	   return this.eventReasonCode;
	}
	public void setOperatorID(String s){
	   this.operatorID = s;
	}
	public String getOperatorID(){
	   return this.operatorID;
	}
	public void setEventOccurred(String s){
	   this.eventOccurred = s;
	}
	public String getEventOccurred(){
	   return this.eventOccurred;
	}
	public void setEventFacility(String s){
	   this.eventFacility = s;
	}
	public String getEventFacility(){
	   return this.eventFacility;
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
