package com.gf.ny.src;

public class tq1 {

	private static int id;
	private static String setid;
	private static String quantity;
	private static String repeatpattern;
	private static String explicittime;
	private static String relativetimeandunits;
	private static String serviceduration;
	private static String startdatetime;
	private static String nddatetime;
	private static String priority;
	private static String conditiontext;
	private static String textinstruction;
	private static String conjunction;
	private static String occurrenceduration;
	private static String totaloccurrences;
	private static int route;
	private static String messagebodyid;
	private static String segment;
	
	public void init(){
		
		setid="";
		quantity="";
		repeatpattern="";
		explicittime="";
		relativetimeandunits="";
		serviceduration="";
		startdatetime="";
		nddatetime="";
		priority="";
		conditiontext="";
		textinstruction="";
		conjunction="";
		occurrenceduration="";
		totaloccurrences="";
		route=0;
		messagebodyid="";
		segment="tq1";
	}
	
	public void setId(int i){
		this.id = i;
	}
	public int getId(){
		return this.id;
	}
	public void setSetid(String s){
	   this.setid = s;
	}
	public String getSetid(){
	   return this.setid;
	}
	public void setQuantity(String s){
	   this.quantity = s;
	}
	public String getQuantity(){
	   return this.quantity;
	}
	public void setRepeatpattern(String s){
	   this.repeatpattern = s;
	}
	public String getRepeatpattern(){
	   return this.repeatpattern;
	}
	public void setExplicittime(String s){
	   this.explicittime = s;
	}
	public String getExplicittime(){
	   return this.explicittime;
	}
	public void setRelativetimeandunits(String s){
	   this.relativetimeandunits = s;
	}
	public String getRelativetimeandunits(){
	   return this.relativetimeandunits;
	}
	public void setServiceduration(String s){
	   this.serviceduration = s;
	}
	public String getServiceduration(){
	   return this.serviceduration;
	}
	public void setStartdatetime(String s){
	   this.startdatetime = s;
	}
	public String getStartdatetime(){
	   return this.startdatetime;
	}
	public void setNddatetime(String s){
	   this.nddatetime = s;
	}
	public String getNddatetime(){
	   return this.nddatetime;
	}
	public void setPriority(String s){
	   this.priority = s;
	}
	public String getPriority(){
	   return this.priority;
	}
	public void setConditiontext(String s){
	   this.conditiontext = s;
	}
	public String getConditiontext(){
	   return this.conditiontext;
	}
	public void setTextinstruction(String s){
	   this.textinstruction = s;
	}
	public String getTextinstruction(){
	   return this.textinstruction;
	}
	public void setConjunction(String s){
	   this.conjunction = s;
	}
	public String getConjunction(){
	   return this.conjunction;
	}
	public void setOccurrenceduration(String s){
	   this.occurrenceduration = s;
	}
	public String getOccurrenceduration(){
	   return this.occurrenceduration;
	}
	public void setTotaloccurrences(String s){
	   this.totaloccurrences = s;
	}
	public String getTotaloccurrences(){
	   return this.totaloccurrences;
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
