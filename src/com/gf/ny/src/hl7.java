package com.gf.ny.src;

public class hl7 {

	private static int id; 
	private static String rawcontent;
	private static String messagebodyid;
	private static int route;
	
	
	public void init(){
		this.rawcontent="";
		this.messagebodyid="";
		this.route=0;
	}
	
	public void setId(int i){
		this.id = i;
	}
	public int getId(){
		return this.id;
	}
	public void setRawcontent(String s){
	   this.rawcontent = s;
	}
	public String getRawcontent(){
	   return this.rawcontent;
	}
	public void setMessagebodyid(String s){
		this.messagebodyid = s;
	}
	public String getMessagebodyid(){
		return this.messagebodyid;
	}
	public void setRoute(int i){
		this.route=i;
	}
	public int getRoute(){
		return this.route;
	}
	
}
