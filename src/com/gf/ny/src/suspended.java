package com.gf.ny.src;

public class suspended {

	private static int id;
	private static String hid;
	private static String htimeCreated;
	private static String hsessionId;
	private static String hstatus;
	private static String hsourceConfigName;
	private static String htargetConfigName;
	private static String mid;
	private static String moriginalDocId;
	private static String messageControlId;
	private static String hl7Interface;
	
	public void init(){
		
		this.hid="";
		this.htimeCreated="";
		this.hsessionId="";
		this.hstatus="";
		this.hsourceConfigName="";
		this.htargetConfigName="";
		this.mid="";
		this.moriginalDocId="";
		this.messageControlId="";
		this.hl7Interface="";
		
	}
	
	public void setId(int i){
		this.id = i;
	}
	public int getId(){
		return this.id;
	}
	public void setHid(String s){
	   this.hid = s;
	}
	public String getHid(){
	   return this.hid;
	}
	public void setHtimeCreated(String s){
	   this.htimeCreated = s;
	}
	public String getHtimeCreated(){
	   return this.htimeCreated;
	}
	public void setHsessionId(String s){
	   this.hsessionId = s;
	}
	public String getHsessionId(){
	   return this.hsessionId;
	}
	public void setHstatus(String s){
	   this.hstatus = s;
	}
	public String getHstatus(){
	   return this.hstatus;
	}
	public void setHsourceConfigName(String s){
	   this.hsourceConfigName = s;
	}
	public String getHsourceConfigName(){
	   return this.hsourceConfigName;
	}
	public void setHtargetConfigName(String s){
	   this.htargetConfigName = s;
	}
	public String getHtargetConfigName(){
	   return this.htargetConfigName;
	}
	public void setMid(String s){
	   this.mid = s;
	}
	public String getMid(){
	   return this.mid;
	}
	public void setMoriginalDocId(String s){
	   this.moriginalDocId = s;
	}
	public String getMoriginalDocId(){
	   return this.moriginalDocId;
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
