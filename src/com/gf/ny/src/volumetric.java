package com.gf.ny.src;

public class volumetric {
	
	private static int id;
	private static String source;
	private static String facility;
	private static String datatype;
	private static String timecreated;

	public void init(){
		
		this.source="";
		this.facility="";
		this.datatype="";
		this.timecreated="";
		
	}
	
	public void setId(int i){
		this.id = i;
	}
	public int getId(){
		return this.id;
	}
	public void setSource(String s){
	   this.source = s;
	}
	public String getSource(){
	   return this.source;
	}
	public void setFacility(String s){
	   this.facility = s;
	}
	public String getFacility(){
	   return this.facility;
	}
	public void setDatatype(String s){
		this.datatype = s;
	}
	public String getDatatype(){
		return this.datatype;
	}
	public void setTimecreated(String s){
		this.timecreated = s;
	}
	public String getTimecreated(){
		return this.timecreated;
	}
}