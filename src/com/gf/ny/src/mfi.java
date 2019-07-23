package com.gf.ny.src;

public class mfi {

	private static int id;
	private static String masterFileIdentifier;
	private static String masterFileApplicationIdentifier;
	private static String fileLevelEventCode;
	private static String enteredDateTime;
	private static String effectiveDateTime;
	private static String responseLevelCode;
	private static String segment;
	private static String messagebodyid;
	private static int route;
	
	public void init(){
		
		this.masterFileIdentifier="";
		this.masterFileApplicationIdentifier="";
		this.fileLevelEventCode="";
		this.enteredDateTime="";
		this.effectiveDateTime="";
		this.responseLevelCode="";
		this.segment="mfi";
		this.messagebodyid="";
		this.route=0;
	
	}
	
	public void setId(int i){
		this.id = i;
	}
	public int getId(){
		return this.id;
	}
	public void setMasterFileIdentifier(String s){
	   this.masterFileIdentifier = s;
	}
	public String getMasterFileIdentifier(){
	   return this.masterFileIdentifier;
	}
	public void setMasterFileApplicationIdentifier(String s){
	   this.masterFileApplicationIdentifier = s;
	}
	public String getMasterFileApplicationIdentifier(){
	   return this.masterFileApplicationIdentifier;
	}
	public void setFileLevelEventCode(String s){
	   this.fileLevelEventCode = s;
	}
	public String getFileLevelEventCode(){
	   return this.fileLevelEventCode;
	}
	public void setEnteredDateTime(String s){
	   this.enteredDateTime = s;
	}
	public String getEnteredDateTime(){
	   return this.enteredDateTime;
	}
	public void setEffectiveDateTime(String s){
	   this.effectiveDateTime = s;
	}
	public String getEffectiveDateTime(){
	   return this.effectiveDateTime;
	}
	public void setResponseLevelCode(String s){
	   this.responseLevelCode = s;
	}
	public String getResponseLevelCode(){
	   return this.responseLevelCode;
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
