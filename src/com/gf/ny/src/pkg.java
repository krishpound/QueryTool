package com.gf.ny.src;

public class pkg {
	
	private static int id;
	private static String setId;
	private static String packagingUnits;
	private static String defaultOrderUnitOfMeasureIndicator;
	private static String packageQuantity;
	private static String price;
	private static String futureItemPrice;
	private static String futureItemPriceEffectiveDate;
	private static String messageControlId;
	private static String hl7Interface;
	
	public void init(){
		
		this.setId="";
		this.packagingUnits="";
		this.defaultOrderUnitOfMeasureIndicator="";
		this.packageQuantity="";
		this.price="";
		this.futureItemPrice="";
		this.futureItemPriceEffectiveDate="";
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
	public void setPackagingUnits(String s){
	   this.packagingUnits = s;
	}
	public String getPackagingUnits(){
	   return this.packagingUnits;
	}
	public void setDefaultOrderUnitOfMeasureIndicator(String s){
	   this.defaultOrderUnitOfMeasureIndicator = s;
	}
	public String getDefaultOrderUnitOfMeasureIndicator(){
	   return this.defaultOrderUnitOfMeasureIndicator;
	}
	public void setPackageQuantity(String s){
	   this.packageQuantity = s;
	}
	public String getPackageQuantity(){
	   return this.packageQuantity;
	}
	public void setPrice(String s){
	   this.price = s;
	}
	public String getPrice(){
	   return this.price;
	}
	public void setFutureItemPrice(String s){
	   this.futureItemPrice = s;
	}
	public String getFutureItemPrice(){
	   return this.futureItemPrice;
	}
	public void setFutureItemPriceEffectiveDate(String s){
	   this.futureItemPriceEffectiveDate = s;
	}
	public String getFutureItemPriceEffectiveDate(){
	   return this.futureItemPriceEffectiveDate;
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
