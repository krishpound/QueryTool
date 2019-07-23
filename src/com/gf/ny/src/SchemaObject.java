package com.gf.ny.src;

public class SchemaObject {
	
	private int route;
	private String message;
	private String segment;
	private int position;
	private String follows;
	private String group;
	private boolean optional;
	private boolean repeatable;
	private int patternLength;
	private String compareValue;

	public SchemaObject(){
		this.route=0;
		this.message="";
		this.segment="";
		this.position=0;
		this.follows="";
		this.group="";
		this.optional=false;
		this.repeatable=false;
		this.patternLength=0;
		this.compareValue="";
	}
	
	public void setRoute(int i){
		this.route = i;
	}
	public int getRoute(){
		return this.route;
	}
	public void setMessage(String s){
	   this.message = s;
	}
	public String getMessage(){
	   return this.message;
	}
	public void setSegment(String s){
	   this.segment = s;
	}
	public String getSegment(){
	   return this.segment;
	}
	public void setPosition(int i){
	   this.position = i;
	}
	public int getPosition(){
	   return this.position;
	}
	public void setFollows(String s){
	   this.follows = s;
	}
	public String getFollows(){
	   return this.follows;
	}
	public void setGroup(String s){
	   this.group = s;
	}
	public String getGroup(){
	   return this.group;
	}
	public void setOptional(boolean b){
	   this.optional = b;
	}
	public boolean getOptional(){
	   return this.optional;
	}
	public void setRepeatable(boolean b){
	   this.repeatable = b;
	}
	public boolean getRepeatable(){
	   return this.repeatable;
	}
	public void setPatternLength(int i){
		this.patternLength = i;
	}
	public int getPatternLength(){
		return this.patternLength;
	}
	public void setCompareValue(String s){
		this.compareValue = s;
	}
	public String getCompareValue(){
		return this.getRoute()+this.getMessage()+this.getSegment();
	}
}
