package com.gf.ny.src;

public class mfe {

	private static int id;
	private static String recordLevelEventCode;
	private static String mFNControlID;
	private static String effectiveDateTime;
	private static String primaryKeyValue;
	private static String primaryKeyValueType;
	private static String enteredDateTime;
	private static String enteredBy;
	private static String segment;
	private static String messagebodyid;
	private static int route;
	
	public void init(){
		
		this.recordLevelEventCode="";
		this.mFNControlID="";
		this.effectiveDateTime="";
		this.primaryKeyValue="";
		this.primaryKeyValueType="";
		this.enteredDateTime="";
		this.enteredBy="";
		this.segment="mfe";
		this.messagebodyid="";
		this.route=0;
		
	}
	
	public void setId(int i){
		this.id = i;
	}
	public int getId(){
		return this.id;
	}
	public void setRecordLevelEventCode(String s){
		   this.recordLevelEventCode = s;
		}
		public String getRecordLevelEventCode(){
		   return this.recordLevelEventCode;
		}
		public void setmFNControlID(String s){
		   this.mFNControlID = s;
		}
		public String getmFNControlID(){
		   return this.mFNControlID;
		}
		public void setEffectiveDateTime(String s){
		   this.effectiveDateTime = s;
		}
		public String getEffectiveDateTime(){
		   return this.effectiveDateTime;
		}
		public void setPrimaryKeyValue(String s){
		   this.primaryKeyValue = s;
		}
		public String getPrimaryKeyValue(){
		   return this.primaryKeyValue;
		}
		public void setPrimaryKeyValueType(String s){
		   this.primaryKeyValueType = s;
		}
		public String getPrimaryKeyValueType(){
		   return this.primaryKeyValueType;
		}
		public void setEnteredDateTime(String s){
		   this.enteredDateTime = s;
		}
		public String getEnteredDateTime(){
		   return this.enteredDateTime;
		}
		public void setEnteredBy(String s){
		   this.enteredBy = s;
		}
		public String getEnteredBy(){
		   return this.enteredBy;
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
