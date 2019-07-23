package com.gf.ny.src;

public class qpd {

	private static int id;
	private static String messageQueryName;
	private static String queryTag;
	private static String userParameters;
	private static String messageControlId;
	private static String hl7Interface;
	
	public void init(){
		
		this.messageQueryName="";
		this.queryTag="";
		this.userParameters="";
		this.messageControlId="";
		this.hl7Interface="";

	}
	
	public void setId(int i){
		this.id = i;
	}
	public int getId(){
		return this.id;
	}
	public void setMessageQueryName(String s){
	   this.messageQueryName = s;
	}
	public String getMessageQueryName(){
	   return this.messageQueryName;
	}
	public void setQueryTag(String s){
	   this.queryTag = s;
	}
	public String getQueryTag(){
	   return this.queryTag;
	}
	public void setUserParameters(String s){
	   this.userParameters = s;
	}
	public String getUserParameters(){
	   return this.userParameters;
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
