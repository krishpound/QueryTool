package com.gf.ny.src;

public class vnd {

	private static int id;
	private static String setId;
	private static String vendorIdentifier;
	private static String vendorName;
	private static String vendorCatalogNumber;
	private static String primaryVendorIndicator;
	private static String messageControlId;
	private static String hl7Interface;
	
	public void init(){
		
		this.setId="";
		this.vendorIdentifier="";
		this.vendorName="";
		this.vendorCatalogNumber="";
		this.primaryVendorIndicator="";
		this.messageControlId="";
		this.hl7Interface="";
		
	}
	
	public void setId(int i){
		this.id = i;
	}
	public int getId(){
		return this.id;
	}
	public void setSetId(String s){
	   this.setId = s;
	}
	public String getSetId(){
	   return this.setId;
	}
	public void setVendorIdentifier(String s){
	   this.vendorIdentifier = s;
	}
	public String getVendorIdentifier(){
	   return this.vendorIdentifier;
	}
	public void setVendorName(String s){
	   this.vendorName = s;
	}
	public String getVendorName(){
	   return this.vendorName;
	}
	public void setVendorCatalogNumber(String s){
	   this.vendorCatalogNumber = s;
	}
	public String getVendorCatalogNumber(){
	   return this.vendorCatalogNumber;
	}
	public void setPrimaryVendorIndicator(String s){
	   this.primaryVendorIndicator = s;
	}
	public String getPrimaryVendorIndicator(){
	   return this.primaryVendorIndicator;
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
