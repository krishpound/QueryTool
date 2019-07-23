package com.gf.ny.src;

public class zad {

	private static int id;
	private static String schedulingprocno;
	private static String departmentdetails;
	private static String alternateResourceID;
	private static String messageControlId;
	private static String hl7Interface;
	
	public void init(){
		
		this.schedulingprocno="";
		this.departmentdetails="";
		this.alternateResourceID="";
		this.messageControlId="";
		this.hl7Interface="";
		
	}
	
	public void setId(int i){
		this.id = i;
	}
	public int getId(){
		return this.id;
	}
	public void setSchedulingprocno(String s){
	   this.schedulingprocno = s;
	}
	public String getSchedulingprocno(){
	   return this.schedulingprocno;
	}
	public void setDepartmentdetails(String s){
	   this.departmentdetails = s;
	}
	public String getDepartmentdetails(){
	   return this.departmentdetails;
	}
	public void setAlternateResourceID(String s){
	   this.alternateResourceID = s;
	}
	public String getAlternateResourceID(){
	   return this.alternateResourceID;
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
