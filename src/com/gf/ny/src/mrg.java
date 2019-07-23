package com.gf.ny.src;

public class mrg{
	
	private static int id;
	private static String priorpatientidentifierlist;
	private static String prioralternatepatientid;
	private static String priorpatientaccountnumber;
	private static String priorpatientid;
	private static String priorvisitnumber;
	private static String prioralternatevisitid;
	private static String priorpatientname;
	private static String messagebodyid;
	private static String segment;
	private static int route;
	

	public void init(){
		
		this.priorpatientidentifierlist="";
		this.prioralternatepatientid="";
		this.priorpatientaccountnumber="";
		this.priorpatientid="";
		this.priorvisitnumber="";
		this.prioralternatevisitid="";
		this.priorpatientname="";
		this.messagebodyid="";
		this.segment="mrg";
		this.route=0;
		
	}

public void setId(int i){
	this.id = i;
}
public int getId(){
	return this.id;
}
public void setPriorpatientidentifierlist(String s){
   this.priorpatientidentifierlist = s;
}
public String getPriorpatientidentifierlist(){
   return this.priorpatientidentifierlist;
}
public void setPrioralternatepatientid(String s){
   this.prioralternatepatientid = s;
}
public String getPrioralternatepatientid(){
   return this.prioralternatepatientid;
}
public void setPriorpatientaccountnumber(String s){
   this.priorpatientaccountnumber = s;
}
public String getPriorpatientaccountnumber(){
   return this.priorpatientaccountnumber;
}
public void setPriorpatientid(String s){
   this.priorpatientid = s;
}
public String getPriorpatientid(){
   return this.priorpatientid;
}
public void setPriorvisitnumber(String s){
   this.priorvisitnumber = s;
}
public String getPriorvisitnumber(){
   return this.priorvisitnumber;
}
public void setPrioralternatevisitid(String s){
   this.prioralternatevisitid = s;
}
public String getPrioralternatevisitid(){
   return this.prioralternatevisitid;
}
public void setPriorpatientname(String s){
   this.priorpatientname = s;
}
public String getPriorpatientname(){
   return this.priorpatientname;
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