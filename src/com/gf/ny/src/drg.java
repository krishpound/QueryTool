package com.gf.ny.src;

public class drg {

	private static int id;
	private static String diagnosticrelatedgroup;
	private static String drgassigneddatetime;
	private static String drgapprovalindicator;
	private static String drggrouperreviewcode;
	private static String outliertype;
	private static String outlierdays;
	private static String outliercost;
	private static String drgpayor;
	private static String outlierreimbursement;
	private static String confidentialindicator;
	private static String drgtransfertype;
	private static String nameofcoder;
	private static String grouperstatus;
	private static String pcclvaluecode;
	private static String effectiveweight;
	private static String monetaryamount;
	private static String statuspatient;
	private static String groupersoftwarename;
	private static String groupersoftwareversion;
	private static String statusfinancialcalculation;
	private static String relativediscountsurcharge;
	private static String basiccharge;
	private static String discountsurcharge;
	private static String calculateddays;
	private static String statusgender;
	private static String statusage;
	private static String statuslengthofstay;
	private static String statussamedayflag;
	private static String statusseparationmode;
	private static String statusweightatbirth;
	private static String statusrespirationminutes;
	private static String statusadmission;
	private static String messagebodyid;
	private static String segment;
	private static int route;
	
	public void init(){
		diagnosticrelatedgroup="";
		drgassigneddatetime="";
		drgapprovalindicator="";
		drggrouperreviewcode="";
		outliertype="";
		outlierdays="";
		outliercost="";
		drgpayor="";
		outlierreimbursement="";
		confidentialindicator="";
		drgtransfertype="";
		nameofcoder="";
		grouperstatus="";
		pcclvaluecode="";
		effectiveweight="";
		monetaryamount="";
		statuspatient="";
		groupersoftwarename="";
		groupersoftwareversion="";
		statusfinancialcalculation="";
		relativediscountsurcharge="";
		basiccharge="";
		discountsurcharge="";
		calculateddays="";
		statusgender="";
		statusage="";
		statuslengthofstay="";
		statussamedayflag="";
		statusseparationmode="";
		statusweightatbirth="";
		statusrespirationminutes="";
		statusadmission="";
		messagebodyid="";
		segment="drg";
		route=0;	
	}
	
	public void setId(int i){
		this.id = i;
	}
	public int getId(){
		return this.id;
	}
	public void setDiagnosticrelatedgroup(String s){
	   this.diagnosticrelatedgroup = s;
	}
	public String getDiagnosticrelatedgroup(){
	   return this.diagnosticrelatedgroup;
	}
	public void setDrgassigneddatetime(String s){
	   this.drgassigneddatetime = s;
	}
	public String getDrgassigneddatetime(){
	   return this.drgassigneddatetime;
	}
	public void setDrgapprovalindicator(String s){
	   this.drgapprovalindicator = s;
	}
	public String getDrgapprovalindicator(){
	   return this.drgapprovalindicator;
	}
	public void setDrggrouperreviewcode(String s){
	   this.drggrouperreviewcode = s;
	}
	public String getDrggrouperreviewcode(){
	   return this.drggrouperreviewcode;
	}
	public void setOutliertype(String s){
	   this.outliertype = s;
	}
	public String getOutliertype(){
	   return this.outliertype;
	}
	public void setOutlierdays(String s){
	   this.outlierdays = s;
	}
	public String getOutlierdays(){
	   return this.outlierdays;
	}
	public void setOutliercost(String s){
	   this.outliercost = s;
	}
	public String getOutliercost(){
	   return this.outliercost;
	}
	public void setDrgpayor(String s){
	   this.drgpayor = s;
	}
	public String getDrgpayor(){
	   return this.drgpayor;
	}
	public void setOutlierreimbursement(String s){
	   this.outlierreimbursement = s;
	}
	public String getOutlierreimbursement(){
	   return this.outlierreimbursement;
	}
	public void setConfidentialindicator(String s){
	   this.confidentialindicator = s;
	}
	public String getConfidentialindicator(){
	   return this.confidentialindicator;
	}
	public void setDrgtransfertype(String s){
	   this.drgtransfertype = s;
	}
	public String getDrgtransfertype(){
	   return this.drgtransfertype;
	}
	public void setNameofcoder(String s){
	   this.nameofcoder = s;
	}
	public String getNameofcoder(){
	   return this.nameofcoder;
	}
	public void setGrouperstatus(String s){
	   this.grouperstatus = s;
	}
	public String getGrouperstatus(){
	   return this.grouperstatus;
	}
	public void setPcclvaluecode(String s){
	   this.pcclvaluecode = s;
	}
	public String getPcclvaluecode(){
	   return this.pcclvaluecode;
	}
	public void setEffectiveweight(String s){
	   this.effectiveweight = s;
	}
	public String getEffectiveweight(){
	   return this.effectiveweight;
	}
	public void setMonetaryamount(String s){
	   this.monetaryamount = s;
	}
	public String getMonetaryamount(){
	   return this.monetaryamount;
	}
	public void setStatuspatient(String s){
	   this.statuspatient = s;
	}
	public String getStatuspatient(){
	   return this.statuspatient;
	}
	public void setGroupersoftwarename(String s){
	   this.groupersoftwarename = s;
	}
	public String getGroupersoftwarename(){
	   return this.groupersoftwarename;
	}
	public void setGroupersoftwareversion(String s){
	   this.groupersoftwareversion = s;
	}
	public String getGroupersoftwareversion(){
	   return this.groupersoftwareversion;
	}
	public void setStatusfinancialcalculation(String s){
	   this.statusfinancialcalculation = s;
	}
	public String getStatusfinancialcalculation(){
	   return this.statusfinancialcalculation;
	}
	public void setRelativediscountsurcharge(String s){
	   this.relativediscountsurcharge = s;
	}
	public String getRelativediscountsurcharge(){
	   return this.relativediscountsurcharge;
	}
	public void setBasiccharge(String s){
	   this.basiccharge = s;
	}
	public String getBasiccharge(){
	   return this.basiccharge;
	}
	public void setDiscountsurcharge(String s){
	   this.discountsurcharge = s;
	}
	public String getDiscountsurcharge(){
	   return this.discountsurcharge;
	}
	public void setCalculateddays(String s){
	   this.calculateddays = s;
	}
	public String getCalculateddays(){
	   return this.calculateddays;
	}
	public void setStatusgender(String s){
	   this.statusgender = s;
	}
	public String getStatusgender(){
	   return this.statusgender;
	}
	public void setStatusage(String s){
	   this.statusage = s;
	}
	public String getStatusage(){
	   return this.statusage;
	}
	public void setStatuslengthofstay(String s){
	   this.statuslengthofstay = s;
	}
	public String getStatuslengthofstay(){
	   return this.statuslengthofstay;
	}
	public void setStatussamedayflag(String s){
	   this.statussamedayflag = s;
	}
	public String getStatussamedayflag(){
	   return this.statussamedayflag;
	}
	public void setStatusseparationmode(String s){
	   this.statusseparationmode = s;
	}
	public String getStatusseparationmode(){
	   return this.statusseparationmode;
	}
	public void setStatusweightatbirth(String s){
	   this.statusweightatbirth = s;
	}
	public String getStatusweightatbirth(){
	   return this.statusweightatbirth;
	}
	public void setStatusrespirationminutes(String s){
	   this.statusrespirationminutes = s;
	}
	public String getStatusrespirationminutes(){
	   return this.statusrespirationminutes;
	}
	public void setStatusadmission(String s){
	   this.statusadmission = s;
	}
	public String getStatusadmission(){
	   return this.statusadmission;
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
