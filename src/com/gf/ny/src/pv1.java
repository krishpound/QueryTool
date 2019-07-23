package com.gf.ny.src;

public class pv1 {

	private static int id;
	private static String setID;
	private static String patientClass;
	private static String assignedPatientLocation;
	private static String admissionType;
	private static String preadmitNumber;
	private static String priorPatientLocation;
	private static String attendingDoctor;
	private static String referringDoctor;
	private static String consultingDoctor;
	private static String hospitalService;
	private static String temporaryLocation;
	private static String preadmitTestIndicator;
	private static String reAdmissionIndicator;
	private static String admitSource;
	private static String ambulatoryStatus;
	private static String VIPIndicator;
	private static String admittingDoctor;
	private static String patientType;
	private static String visitNumber;
	private static String financialClass;
	private static String chargePriceIndicator;
	private static String courtesyCode;
	private static String creditRating;
	private static String contractCode;
	private static String contractEffectiveDate;
	private static String contractAmount;
	private static String contractPeriod;
	private static String interestCode;
	private static String transfertoBadDebtCode;
	private static String transfertoBadDebtDate;
	private static String badDebtAgencyCode;
	private static String badDebtTransferAmount;
	private static String badDebtRecoveryAmount;
	private static String deleteAccountIndicator;
	private static String deleteAccountDate;
	private static String dischargeDisposition;
	private static String dischargedtoLocation;
	private static String dietType;
	private static String servicingFacility;
	private static String bedStatus;
	private static String accountStatus;
	private static String pendingLocation;
	private static String priorTemporaryLocation;
	private static String admitDateTime;
	private static String dischargeDateTime;
	private static String currentPatientBalance;
	private static String totalCharges;
	private static String totalAdjustments;
	private static String totalPayments;
	private static String alternateVisitID;
	private static String visitIndicator;
	private static String otherHealthcareProvider;
	private static String segment;
	private static String messageBodyId;
	private static int route;
	
	public void init(){
		
		this.setID="";
		this.patientClass="";
		this.assignedPatientLocation="";
		this.admissionType="";
		this.preadmitNumber="";
		this.priorPatientLocation="";
		this.attendingDoctor="";
		this.referringDoctor="";
		this.consultingDoctor="";
		this.hospitalService="";
		this.temporaryLocation="";
		this.preadmitTestIndicator="";
		this.reAdmissionIndicator="";
		this.admitSource="";
		this.ambulatoryStatus="";
		this.VIPIndicator="";
		this.admittingDoctor="";
		this.patientType="";
		this.visitNumber="";
		this.financialClass="";
		this.chargePriceIndicator="";
		this.courtesyCode="";
		this.creditRating="";
		this.contractCode="";
		this.contractEffectiveDate="";
		this.contractAmount="";
		this.contractPeriod="";
		this.interestCode="";
		this.transfertoBadDebtCode="";
		this.transfertoBadDebtDate="";
		this.badDebtAgencyCode="";
		this.badDebtTransferAmount="";
		this.badDebtRecoveryAmount="";
		this.deleteAccountIndicator="";
		this.deleteAccountDate="";
		this.dischargeDisposition="";
		this.dischargedtoLocation="";
		this.dietType="";
		this.servicingFacility="";
		this.bedStatus="";
		this.accountStatus="";
		this.pendingLocation="";
		this.priorTemporaryLocation="";
		this.admitDateTime="";
		this.dischargeDateTime="";
		this.currentPatientBalance="";
		this.totalCharges="";
		this.totalAdjustments="";
		this.totalPayments="";
		this.alternateVisitID="";
		this.visitIndicator="";
		this.otherHealthcareProvider="";
		this.segment="pv1";
		this.messageBodyId="";
		this.route=0;
		
	}
	
	public pv1(){};
	
	public void setId(int i){
		   id = i;
		}
		public int getId(){
		   return id;
		}
		public void setSetID(String s){
		   setID = s;
		}
		public String getSetID(){
		   return setID;
		}
		public void setPatientClass(String s){
		   patientClass = s;
		}
		public String getPatientClass(){
		   return patientClass;
		}
		public void setAssignedPatientLocation(String s){
		   assignedPatientLocation = s;
		}
		public String getAssignedPatientLocation(){
		   return assignedPatientLocation;
		}
		public void setAdmissionType(String s){
		   admissionType = s;
		}
		public String getAdmissionType(){
		   return admissionType;
		}
		public void setPreadmitNumber(String s){
		   preadmitNumber = s;
		}
		public String getPreadmitNumber(){
		   return preadmitNumber;
		}
		public void setPriorPatientLocation(String s){
		   priorPatientLocation = s;
		}
		public String getPriorPatientLocation(){
		   return priorPatientLocation;
		}
		public void setAttendingDoctor(String s){
		   attendingDoctor = s;
		}
		public String getAttendingDoctor(){
		   return attendingDoctor;
		}
		public void setReferringDoctor(String s){
		   referringDoctor = s;
		}
		public String getReferringDoctor(){
		   return referringDoctor;
		}
		public void setConsultingDoctor(String s){
		   consultingDoctor = s;
		}
		public String getConsultingDoctor(){
		   return consultingDoctor;
		}
		public void setHospitalService(String s){
		   hospitalService = s;
		}
		public String getHospitalService(){
		   return hospitalService;
		}
		public void setTemporaryLocation(String s){
		   temporaryLocation = s;
		}
		public String getTemporaryLocation(){
		   return temporaryLocation;
		}
		public void setPreadmitTestIndicator(String s){
		   preadmitTestIndicator = s;
		}
		public String getPreadmitTestIndicator(){
		   return preadmitTestIndicator;
		}
		public void setReadmissionIndicator(String s){
		   reAdmissionIndicator = s;
		}
		public String getReadmissionIndicator(){
		   return reAdmissionIndicator;
		}
		public void setAdmitSource(String s){
		   admitSource = s;
		}
		public String getAdmitSource(){
		   return admitSource;
		}
		public void setAmbulatoryStatus(String s){
		   ambulatoryStatus = s;
		}
		public String getAmbulatoryStatus(){
		   return ambulatoryStatus;
		}
		public void setVIPIndicator(String s){
		   VIPIndicator = s;
		}
		public String getVIPIndicator(){
		   return VIPIndicator;
		}
		public void setAdmittingDoctor(String s){
		   admittingDoctor = s;
		}
		public String getAdmittingDoctor(){
		   return admittingDoctor;
		}
		public void setPatientType(String s){
		   patientType = s;
		}
		public String getPatientType(){
		   return patientType;
		}
		public void setVisitNumber(String s){
		   visitNumber = s;
		}
		public String getVisitNumber(){
		   return visitNumber;
		}
		public void setFinancialClass(String s){
		   financialClass = s;
		}
		public String getFinancialClass(){
		   return financialClass;
		}
		public void setChargePriceIndicator(String s){
		   chargePriceIndicator = s;
		}
		public String getChargePriceIndicator(){
		   return chargePriceIndicator;
		}
		public void setCourtesyCode(String s){
		   courtesyCode = s;
		}
		public String getCourtesyCode(){
		   return courtesyCode;
		}
		public void setCreditRating(String s){
		   creditRating = s;
		}
		public String getCreditRating(){
		   return creditRating;
		}
		public void setContractCode(String s){
		   contractCode = s;
		}
		public String getContractCode(){
		   return contractCode;
		}
		public void setContractEffectiveDate(String s){
		   contractEffectiveDate = s;
		}
		public String getContractEffectiveDate(){
		   return contractEffectiveDate;
		}
		public void setContractAmount(String s){
		   contractAmount = s;
		}
		public String getContractAmount(){
		   return contractAmount;
		}
		public void setContractPeriod(String s){
		   contractPeriod = s;
		}
		public String getContractPeriod(){
		   return contractPeriod;
		}
		public void setInterestCode(String s){
		   interestCode = s;
		}
		public String getInterestCode(){
		   return interestCode;
		}
		public void setTransfertoBadDebtCode(String s){
		   transfertoBadDebtCode = s;
		}
		public String getTransfertoBadDebtCode(){
		   return transfertoBadDebtCode;
		}
		public void setTransfertoBadDebtDate(String s){
		   transfertoBadDebtDate = s;
		}
		public String getTransfertoBadDebtDate(){
		   return transfertoBadDebtDate;
		}
		public void setBadDebtAgencyCode(String s){
		   badDebtAgencyCode = s;
		}
		public String getBadDebtAgencyCode(){
		   return badDebtAgencyCode;
		}
		public void setBadDebtTransferAmount(String s){
		   badDebtTransferAmount = s;
		}
		public String getBadDebtTransferAmount(){
		   return badDebtTransferAmount;
		}
		public void setBadDebtRecoveryAmount(String s){
		   badDebtRecoveryAmount = s;
		}
		public String getBadDebtRecoveryAmount(){
		   return badDebtRecoveryAmount;
		}
		public void setDeleteAccountIndicator(String s){
		   deleteAccountIndicator = s;
		}
		public String getDeleteAccountIndicator(){
		   return deleteAccountIndicator;
		}
		public void setDeleteAccountDate(String s){
		   deleteAccountDate = s;
		}
		public String getDeleteAccountDate(){
		   return deleteAccountDate;
		}
		public void setDischargeDisposition(String s){
		   dischargeDisposition = s;
		}
		public String getDischargeDisposition(){
		   return dischargeDisposition;
		}
		public void setDischargedtoLocation(String s){
		   dischargedtoLocation = s;
		}
		public String getDischargedtoLocation(){
		   return dischargedtoLocation;
		}
		public void setDietType(String s){
		   dietType = s;
		}
		public String getDietType(){
		   return dietType;
		}
		public void setServicingFacility(String s){
		   servicingFacility = s;
		}
		public String getServicingFacility(){
		   return servicingFacility;
		}
		public void setBedStatus(String s){
		   bedStatus = s;
		}
		public String getBedStatus(){
		   return bedStatus;
		}
		public void setAccountStatus(String s){
		   accountStatus = s;
		}
		public String getAccountStatus(){
		   return accountStatus;
		}
		public void setPendingLocation(String s){
		   pendingLocation = s;
		}
		public String getPendingLocation(){
		   return pendingLocation;
		}
		public void setPriorTemporaryLocation(String s){
		   priorTemporaryLocation = s;
		}
		public String getPriorTemporaryLocation(){
		   return priorTemporaryLocation;
		}
		public void setAdmitDateTime(String s){
		   admitDateTime = s;
		}
		public String getAdmitDateTime(){
		   return admitDateTime;
		}
		public void setDischargeDateTime(String s){
		   dischargeDateTime = s;
		}
		public String getDischargeDateTime(){
		   return dischargeDateTime;
		}
		public void setCurrentPatientBalance(String s){
		   currentPatientBalance = s;
		}
		public String getCurrentPatientBalance(){
		   return currentPatientBalance;
		}
		public void setTotalCharges(String s){
		   totalCharges = s;
		}
		public String getTotalCharges(){
		   return totalCharges;
		}
		public void setTotalAdjustments(String s){
		   totalAdjustments = s;
		}
		public String getTotalAdjustments(){
		   return totalAdjustments;
		}
		public void setTotalPayments(String s){
		   totalPayments = s;
		}
		public String getTotalPayments(){
		   return totalPayments;
		}
		public void setAlternateVisitID(String s){
		   alternateVisitID = s;
		}
		public String getAlternateVisitID(){
		   return alternateVisitID;
		}
		public void setVisitIndicator(String s){
		   visitIndicator = s;
		}
		public String getVisitIndicator(){
		   return visitIndicator;
		}
		public void setOtherHealthcareProvider(String s){
		   otherHealthcareProvider = s;
		}
		public String getOtherHealthcareProvider(){
		   return otherHealthcareProvider;
		}
		public void setSegment(String s){
		  	this.segment = s;
		}
		public String getSegment(){
		  	return this.segment;
		}
		public void setMessageBodyId(String s){
		  	this.messageBodyId = s;
		}
		public String getMessageBodyId(){
		  	return this.messageBodyId;
		}
		public int getRoute() {
		    return route;
		}
		public void setRoute(int i) {
		    this.route = i;
		}
}
