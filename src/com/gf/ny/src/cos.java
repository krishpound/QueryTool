package com.gf.ny.src;

public class cos {

	private static int id;
	private static String consenttype;
	private static String consentformidandversion;
	private static String consentformnumber;
	private static String consenttext;
	private static String subjectspecificconsenttext;
	private static String consentbackgroundinformation;
	private static String subjectspecificconsentbackgroundtext;
	private static String consentmode;
	private static String consentstatus;
	private static String consentdiscussiondatetime;
	private static String consentdecisiondatetime;
	private static String consenteffectivedatetime;
	private static String consentenddatetime;
	private static String subjectcompetenceindicator;
	private static String translatorassistanceindicator;
	private static String languagetranslatedto;
	private static String informationalmaterialsuppliedindicator;
	private static String consentbypassreason;
	private static String consentdisclosurelevel;
	private static String consentnondisclosurereason;
	private static String nonsubjectconsenterreason;
	private static String consenterid;
	private static String relationshiptosubject;
	private static String messagebodyid;
	private static String segment;
	private static int route;
	
	public void init(){
		consenttype="";
		consentformidandversion="";
		consentformnumber="";
		consenttext="";
		subjectspecificconsenttext="";
		consentbackgroundinformation="";
		subjectspecificconsentbackgroundtext="";
		consentmode="";
		consentstatus="";
		consentdiscussiondatetime="";
		consentdecisiondatetime="";
		consenteffectivedatetime="";
		consentenddatetime="";
		subjectcompetenceindicator="";
		translatorassistanceindicator="";
		languagetranslatedto="";
		informationalmaterialsuppliedindicator="";
		consentbypassreason="";
		consentdisclosurelevel="";
		consentnondisclosurereason="";
		nonsubjectconsenterreason="";
		consenterid="";
		relationshiptosubject="";
		messagebodyid="";
		segment="con";
		route=0;
	}
	
	public void setId(int i){
		this.id = i;
	}
	public int getId(){
		return this.id;
	}
	public void setConsenttype(String s){
	   this.consenttype = s;
	}
	public String getConsenttype(){
	   return this.consenttype;
	}
	public void setConsentformidandversion(String s){
	   this.consentformidandversion = s;
	}
	public String getConsentformidandversion(){
	   return this.consentformidandversion;
	}
	public void setConsentformnumber(String s){
	   this.consentformnumber = s;
	}
	public String getConsentformnumber(){
	   return this.consentformnumber;
	}
	public void setConsenttext(String s){
	   this.consenttext = s;
	}
	public String getConsenttext(){
	   return this.consenttext;
	}
	public void setSubjectspecificconsenttext(String s){
	   this.subjectspecificconsenttext = s;
	}
	public String getSubjectspecificconsenttext(){
	   return this.subjectspecificconsenttext;
	}
	public void setConsentbackgroundinformation(String s){
	   this.consentbackgroundinformation = s;
	}
	public String getConsentbackgroundinformation(){
	   return this.consentbackgroundinformation;
	}
	public void setSubjectspecificconsentbackgroundtext(String s){
	   this.subjectspecificconsentbackgroundtext = s;
	}
	public String getSubjectspecificconsentbackgroundtext(){
	   return this.subjectspecificconsentbackgroundtext;
	}
	public void setConsentmode(String s){
	   this.consentmode = s;
	}
	public String getConsentmode(){
	   return this.consentmode;
	}
	public void setConsentstatus(String s){
	   this.consentstatus = s;
	}
	public String getConsentstatus(){
	   return this.consentstatus;
	}
	public void setConsentdiscussiondatetime(String s){
	   this.consentdiscussiondatetime = s;
	}
	public String getConsentdiscussiondatetime(){
	   return this.consentdiscussiondatetime;
	}
	public void setConsentdecisiondatetime(String s){
	   this.consentdecisiondatetime = s;
	}
	public String getConsentdecisiondatetime(){
	   return this.consentdecisiondatetime;
	}
	public void setConsenteffectivedatetime(String s){
	   this.consenteffectivedatetime = s;
	}
	public String getConsenteffectivedatetime(){
	   return this.consenteffectivedatetime;
	}
	public void setConsentenddatetime(String s){
	   this.consentenddatetime = s;
	}
	public String getConsentenddatetime(){
	   return this.consentenddatetime;
	}
	public void setSubjectcompetenceindicator(String s){
	   this.subjectcompetenceindicator = s;
	}
	public String getSubjectcompetenceindicator(){
	   return this.subjectcompetenceindicator;
	}
	public void setTranslatorassistanceindicator(String s){
	   this.translatorassistanceindicator= s;
	}
	public String getTranslatorassistanceindicator(){
	   return this.translatorassistanceindicator;
	}
	public void setLanguagetranslatedto(String s){
	   this.languagetranslatedto = s;
	}
	public String getLanguagetranslatedto(){
	   return this.languagetranslatedto;
	}
	public void setInformationalmaterialsuppliedindicator(String s){
	   this.informationalmaterialsuppliedindicator = s;
	}
	public String getInformationalmaterialsuppliedindicator(){
	   return this.informationalmaterialsuppliedindicator;
	}
	public void setConsentbypassreason(String s){
	   this.consentbypassreason = s;
	}
	public String getConsentbypassreason(){
	   return this.consentbypassreason;
	}
	public void setConsentdisclosurelevel(String s){
	   this.consentdisclosurelevel = s;
	}
	public String getConsentdisclosurelevel(){
	   return this.consentdisclosurelevel;
	}
	public void setConsentnondisclosurereason(String s){
	   this.consentnondisclosurereason = s;
	}
	public String getConsentnondisclosurereason(){
	   return this.consentnondisclosurereason;
	}
	public void setNonsubjectconsenterreason(String s){
	   this.nonsubjectconsenterreason = s;
	}
	public String getNonsubjectconsenterreason(){
	   return this.nonsubjectconsenterreason;
	}
	public void setConsenterid(String s){
	   this.consenterid = s;
	}
	public String getConsenterid(){
	   return this.consenterid;
	}
	public void setRelationshiptosubject(String s){
	   this.relationshiptosubject = s;
	}
	public String getRelationshiptosubject(){
	   return this.relationshiptosubject;
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
