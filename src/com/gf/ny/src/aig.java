package com.gf.ny.src;

public class aig {
	
	private static int id;
	private static String setID;
	private static String segmentActionCode;
	private static String resourceID;
	private static String resourceType;
	private static String resourceGroup;
	private static String resourceQuantity;
	private static String resourceQuantityUnits;
	private static String startDatetTime;
	private static String startDateTimeOffset;
	private static String startDateTimeOffsetUnits;
	private static String duration;
	private static String durationUnits;
	private static String allowSubstitutionCode;
	private static String fillerStatusCode;
	private static String messageControlId;
	private static String hl7Interface;
	
	public void init(){
		
		this.setID="";
		this.segmentActionCode="";
		this.resourceID="";
		this.resourceType="";
		this.resourceGroup="";
		this.resourceQuantity="";
		this.resourceQuantityUnits="";
		this.startDatetTime="";
		this.startDateTimeOffset="";
		this.startDateTimeOffsetUnits="";
		this.duration="";
		this.durationUnits="";
		this.allowSubstitutionCode="";
		this.fillerStatusCode="";
		this.messageControlId="";
		this.hl7Interface="";
		
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
	public void setSegmentActionCode(String s){
	   this.segmentActionCode = s;
	}
	public String getSegmentActionCode(){
	   return this.segmentActionCode;
	}
	public void setResourceID(String s){
	   this.resourceID = s;
	}
	public String getResourceID(){
	   return this.resourceID;
	}
	public void setResourceType(String s){
	   this.resourceType = s;
	}
	public String getResourceType(){
	   return this.resourceType;
	}
	public void setResourceGroup(String s){
	   this.resourceGroup = s;
	}
	public String getResourceGroup(){
	   return this.resourceGroup;
	}
	public void setResourceQuantity(String s){
	   this.resourceQuantity = s;
	}
	public String getResourceQuantity(){
	   return this.resourceQuantity;
	}
	public void setResourceQuantityUnits(String s){
	   this.resourceQuantityUnits = s;
	}
	public String getResourceQuantityUnits(){
	   return this.resourceQuantityUnits;
	}
	public void setStartDatetTime(String s){
	   this.startDatetTime = s;
	}
	public String getStartDatetTime(){
	   return this.startDatetTime;
	}
	public void setStartDateTimeOffset(String s){
	   this.startDateTimeOffset = s;
	}
	public String getStartDateTimeOffset(){
	   return this.startDateTimeOffset;
	}
	public void setStartDateTimeOffsetUnits(String s){
	   this.startDateTimeOffsetUnits = s;
	}
	public String getStartDateTimeOffsetUnits(){
	   return this.startDateTimeOffsetUnits;
	}
	public void setDuration(String s){
	   this.duration = s;
	}
	public String getDuration(){
	   return this.duration;
	}
	public void setDurationUnits(String s){
	   this.durationUnits = s;
	}
	public String getDurationUnits(){
	   return this.durationUnits;
	}
	public void setAllowSubstitutionCode(String s){
	   this.allowSubstitutionCode = s;
	}
	public String getAllowSubstitutionCode(){
	   return this.allowSubstitutionCode;
	}
	public void setFillerStatusCode(String s){
	   this.fillerStatusCode = s;
	}
	public String getFillerStatusCode(){
	   return this.fillerStatusCode;
	}
	public void setMessageControlId(String s){
		this.messageControlId = s;
	}
	public String getMessageControlId(){
		return this.messageControlId;
	}
	public void setHl7Interface(String s){
		this.hl7Interface = s;
	}
	public String getHl7Interface(){
		return this.hl7Interface;
	}


}
