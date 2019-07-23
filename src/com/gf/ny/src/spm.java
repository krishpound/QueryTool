package com.gf.ny.src;

public class spm {
	
	private static int id;
	private static String setid;
	private static String specimenid;
	private static String specimenparentids;
	private static String specimentype;
	private static String specimentypemodifier;
	private static String specimenadditives;
	private static String specimencollectionmethod;
	private static String specimensourcesite;
	private static String specimensourcesitemodifier;
	private static String specimencollectionsite;
	private static String specimenrole;
	private static String specimencollectionamount;
	private static String groupedspecimencount;
	private static String specimendescription;
	private static String specimenhandlingcode;
	private static String specimenriskcode;
	private static String specimencollectiondatetime;
	private static String specimenreceiveddatetime;
	private static String specimenexpirationdatetime;
	private static String specimenavailability;
	private static String specimenrejectreason;
	private static String specimenquality;
	private static String specimenappropriateness;
	private static String specimencondition;
	private static String specimencurrentquantity;
	private static String numberofspecimencontainers;
	private static String containertype;
	private static String containercondition;
	private static String specimenchildrole;
	private static int route;
	private static String segment;
	private static String messagebodyid;
	
	public void init(){
		
		this.setid="";
		this.specimenid="";
		this.specimenparentids="";
		this.specimentype="";
		this.specimentypemodifier="";
		this.specimenadditives="";
		this.specimencollectionmethod="";
		this.specimensourcesite="";
		this.specimensourcesitemodifier="";
		this.specimencollectionsite="";
		this.specimenrole="";
		this.specimencollectionamount="";
		this.groupedspecimencount="";
		this.specimendescription="";
		this.specimenhandlingcode="";
		this.specimenriskcode="";
		this.specimencollectiondatetime="";
		this.specimenreceiveddatetime="";
		this.specimenexpirationdatetime="";
		this.specimenavailability="";
		this.specimenrejectreason="";
		this.specimenquality="";
		this.specimenappropriateness="";
		this.specimencondition="";
		this.specimencurrentquantity="";
		this.numberofspecimencontainers="";
		this.containertype="";
		this.containercondition="";
		this.specimenchildrole="";
		this.route=0;
		this.segment="spm";
		this.messagebodyid="";
		
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
	public void setSpecimenid(String s){
	   this.specimenid = s;
	}
	public String getSpecimenid(){
	   return this.specimenid;
	}
	public void setSpecimenparentids(String s){
	   this.specimenparentids = s;
	}
	public String getSpecimenparentids(){
	   return this.specimenparentids;
	}
	public void setSpecimentype(String s){
	   this.specimentype = s;
	}
	public String getSpecimentype(){
	   return this.specimentype;
	}
	public void setSpecimentypemodifier(String s){
	   this.specimentypemodifier = s;
	}
	public String getSpecimentypemodifier(){
	   return this.specimentypemodifier;
	}
	public void setSpecimenadditives(String s){
	   this.specimenadditives = s;
	}
	public String getSpecimenadditives(){
	   return this.specimenadditives;
	}
	public void setSpecimencollectionmethod(String s){
	   this.specimencollectionmethod = s;
	}
	public String getSpecimencollectionmethod(){
	   return this.specimencollectionmethod;
	}
	public void setSpecimensourcesite(String s){
	   this.specimensourcesite = s;
	}
	public String getSpecimensourcesite(){
	   return this.specimensourcesite;
	}
	public void setSpecimensourcesitemodifier(String s){
	   this.specimensourcesitemodifier = s;
	}
	public String getSpecimensourcesitemodifier(){
	   return this.specimensourcesitemodifier;
	}
	public void setSpecimencollectionsite(String s){
	   this.specimencollectionsite = s;
	}
	public String getSpecimencollectionsite(){
	   return this.specimencollectionsite;
	}
	public void setSpecimenrole(String s){
	   this.specimenrole = s;
	}
	public String getSpecimenrole(){
	   return this.specimenrole;
	}
	public void setSpecimencollectionamount(String s){
	   this.specimencollectionamount = s;
	}
	public String getSpecimencollectionamount(){
	   return this.specimencollectionamount;
	}
	public void setGroupedspecimencount(String s){
	   this.groupedspecimencount = s;
	}
	public String getGroupedspecimencount(){
	   return this.groupedspecimencount;
	}
	public void setSpecimendescription(String s){
	   this.specimendescription = s;
	}
	public String getSpecimendescription(){
	   return this.specimendescription;
	}
	public void setSpecimenhandlingcode(String s){
	   this.specimenhandlingcode = s;
	}
	public String getSpecimenhandlingcode(){
	   return this.specimenhandlingcode;
	}
	public void setSpecimenriskcode(String s){
	   this.specimenriskcode = s;
	}
	public String getSpecimenriskcode(){
	   return this.specimenriskcode;
	}
	public void setSpecimencollectiondatetime(String s){
	   this.specimencollectiondatetime = s;
	}
	public String getSpecimencollectiondatetime(){
	   return this.specimencollectiondatetime;
	}
	public void setSpecimenreceiveddatetime(String s){
	   this.specimenreceiveddatetime = s;
	}
	public String getSpecimenreceiveddatetime(){
	   return this.specimenreceiveddatetime;
	}
	public void setSpecimenexpirationdatetime(String s){
	   this.specimenexpirationdatetime = s;
	}
	public String getSpecimenexpirationdatetime(){
	   return this.specimenexpirationdatetime;
	}
	public void setSpecimenavailability(String s){
	   this.specimenavailability = s;
	}
	public String getSpecimenavailability(){
	   return this.specimenavailability;
	}
	public void setSpecimenrejectreason(String s){
	   this.specimenrejectreason = s;
	}
	public String getSpecimenrejectreason(){
	   return this.specimenrejectreason;
	}
	public void setSpecimenquality(String s){
	   this.specimenquality = s;
	}
	public String getSpecimenquality(){
	   return this.specimenquality;
	}
	public void setSpecimenappropriateness(String s){
	   this.specimenappropriateness = s;
	}
	public String getSpecimenappropriateness(){
	   return this.specimenappropriateness;
	}
	public void setSpecimencondition(String s){
	   this.specimencondition = s;
	}
	public String getSpecimencondition(){
	   return this.specimencondition;
	}
	public void setSpecimencurrentquantity(String s){
	   this.specimencurrentquantity = s;
	}
	public String getSpecimencurrentquantity(){
	   return this.specimencurrentquantity;
	}
	public void setNumberofspecimencontainers(String s){
	   this.numberofspecimencontainers = s;
	}
	public String getNumberofspecimencontainers(){
	   return this.numberofspecimencontainers;
	}
	public void setContainertype(String s){
	   this.containertype = s;
	}
	public String getContainertype(){
	   return this.containertype;
	}
	public void setContainercondition(String s){
	   this.containercondition = s;
	}
	public String getContainercondition(){
	   return this.containercondition;
	}
	public void setSpecimenchildrole(String s){
	   this.specimenchildrole = s;
	}
	public String getSpecimenchildrole(){
	   return this.specimenchildrole;
	}
	public void setRoute(int i){
	   this.route = i;
	}
	public int getRoute(){
	   return this.route;
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
	

}
