package com.gf.ny.src;

public class qak {

	private static int id;
	private static String queryTag;
	private static String queryResponseStatus;
	private static String messageQueryName;
	private static String hitCount;
	private static String thispayload;
	private static String hitsremaining;
	private static String messageControlId;
	private static String hl7Interface;
	
	public void init(){
		
		this.queryTag="";
		this.queryResponseStatus="";
		this.messageQueryName="";
		this.hitCount="";
		this.thispayload="";
		this.hitsremaining="";
		this.messageControlId="";
		this.hl7Interface="";

	}
	
	public void setId(int i){
		this.id = i;
	}
	public int getId(){
		return this.id;
	}
	public void setQueryTag(String s){
	   this.queryTag = s;
	}
	public String getQueryTag(){
	   return this.queryTag;
	}
	public void setQueryResponseStatus(String s){
	   this.queryResponseStatus = s;
	}
	public String getQueryResponseStatus(){
	   return this.queryResponseStatus;
	}
	public void setMessageQueryName(String s){
	   this.messageQueryName = s;
	}
	public String getMessageQueryName(){
	   return this.messageQueryName;
	}
	public void setHitCount(String s){
	   this.hitCount = s;
	}
	public String getHitCount(){
	   return this.hitCount;
	}
	public void setThispayload(String s){
	   this.thispayload = s;
	}
	public String getThispayload(){
	   return this.thispayload;
	}
	public void setHitsremaining(String s){
	   this.hitsremaining = s;
	}
	public String getHitsremaining(){
	   return this.hitsremaining;
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
