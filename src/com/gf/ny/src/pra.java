package com.gf.ny.src;

public class pra {

	private static int id;
	private static String primarykeyvalue;
	private static String practitionergroup;
	private static String practitionercategory;
	private static String providerbilling;
	private static String specialty;
	private static String practitioneridnumbers;
	private static String privileges;
	private static String dateenteredpractice;
	private static int route;
	private static String messagebodyid;
	private static String segment;
	
	public void init(){
	
		primarykeyvalue="";
		practitionergroup="";
		practitionercategory="";
		providerbilling="";
		specialty="";
		practitioneridnumbers="";
		privileges="";
		dateenteredpractice="";
		route=0;
		messagebodyid="";
		segment="pra";
	}

	public void setId(int i){
		this.id = i;
	}
	public int getId(){
		return this.id;
	}
	public void setPrimarykeyvalue(String s){
	   this.primarykeyvalue = s;
	}
	public String getPrimarykeyvalue(){
	   return this.primarykeyvalue;
	}
	public void setPractitionergroup(String s){
	   this.practitionergroup = s;
	}
	public String getPractitionergroup(){
	   return this.practitionergroup;
	}
	public void setPractitionercategory(String s){
	   this.practitionercategory = s;
	}
	public String getPractitionercategory(){
	   return this.practitionercategory;
	}
	public void setProviderbilling(String s){
	   this.providerbilling = s;
	}
	public String getProviderbilling(){
	   return this.providerbilling;
	}
	public void setSpecialty(String s){
	   this.specialty = s;
	}
	public String getSpecialty(){
	   return this.specialty;
	}
	public void setPractitioneridnumbers(String s){
	   this.practitioneridnumbers = s;
	}
	public String getPractitioneridnumbers(){
	   return this.practitioneridnumbers;
	}
	public void setPrivileges(String s){
	   this.privileges = s;
	}
	public String getPrivileges(){
	   return this.privileges;
	}
	public void setDateenteredpractice(String s){
	   this.dateenteredpractice = s;
	}
	public String getDateenteredpractice(){
	   return this.dateenteredpractice;
	}
	public void setRoute(int i){
	   this.route = i;
	}
	public int getRoute(){
	   return this.route;
	}
	public void setMessagebodyid(String s){
	   this.messagebodyid = s;
	}
	public String getMessagebodyid(){
	   return this.messagebodyid;
	}
	public void setSegment(String s){
	   this.segment = s;
	}
	public String getSegment(){
	   return this.segment;
	}
}