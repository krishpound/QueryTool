package com.gf.ny.src;

public class rcp {

	private static int id;
	private static String queryPriority;
	private static String quantityLimitedRequest;
	private static String responseModality;
	private static String executionandDeliveryTime;
	private static String modifyIndicator;
	private static String sortbyField;
	private static String segmentgroupinclusion;
	private static String messageControlId;
	private static String hl7Interface;
	
public void init(){
		
		this.queryPriority="";
		this.quantityLimitedRequest="";
		this.responseModality="";
		this.executionandDeliveryTime="";
		this.modifyIndicator="";
		this.sortbyField="";
		this.segmentgroupinclusion="";
		this.messageControlId="";
		this.hl7Interface="";

	}
	
public void setId(int i){
	this.id = i;
}
public int getId(){
	return this.id;
}
public void setQueryPriority(String s){
   this.queryPriority = s;
}
public String getQueryPriority(){
   return this.queryPriority;
}
public void setQuantityLimitedRequest(String s){
   this.quantityLimitedRequest = s;
}
public String getQuantityLimitedRequest(){
   return this.quantityLimitedRequest;
}
public void setResponseModality(String s){
   this.responseModality = s;
}
public String getResponseModality(){
   return this.responseModality;
}
public void setExecutionandDeliveryTime(String s){
   this.executionandDeliveryTime = s;
}
public String getExecutionandDeliveryTime(){
   return this.executionandDeliveryTime;
}
public void setModifyIndicator(String s){
   this.modifyIndicator = s;
}
public String getModifyIndicator(){
   return this.modifyIndicator;
}
public void setSortbyField(String s){
   this.sortbyField = s;
}
public String getSortbyField(){
   return this.sortbyField;
}
public void setSegmentgroupinclusion(String s){
   this.segmentgroupinclusion = s;
}
public String getSegmentgroupinclusion(){
   return this.segmentgroupinclusion;
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
