package com.gf.ny.src;

public class zds {

	private static int id;
	private static String referencePointer;
	private static String applicationID;
	private static String typeofData;
	private static String subtype;
	private static String messageControlId;
	private static String hl7Interface;
	
	public void init(){
		
		this.referencePointer="";
		this.applicationID="";
		this.typeofData="";
		this.subtype="";
		this.messageControlId="";
		this.hl7Interface="";
		
	}
	
	public void setId(int i){
		this.id = i;
	}
	public int getId(){
		return this.id;
	}
	public void setReferencePointer(String s){
	   this.referencePointer = s;
	}
	public String getReferencePointer(){
	   return this.referencePointer;
	}
	public void setApplicationID(String s){
	   this.applicationID = s;
	}
	public String getApplicationID(){
	   return this.applicationID;
	}
	public void setTypeofData(String s){
	   this.typeofData = s;
	}
	public String getTypeofData(){
	   return this.typeofData;
	}
	public void setSubtype(String s){
	   this.subtype = s;
	}
	public String getSubtype(){
	   return this.subtype;
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
