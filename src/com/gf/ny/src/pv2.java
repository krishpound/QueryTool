package com.gf.ny.src;

public class pv2 {

	private static int id;
	private static String priorPendingLocation;
	private static String accommodationCode;
	private static String admitReason;
	private static String transferReason;
	private static String patientValuables;
	private static String patientValuablesLocation;
	private static String visitUserCode;
	private static String expectedAdmitDateTime;
	private static String expectedDischargeDateTime;
	private static String estimatedLengthofInpatientStay;
	private static String actualLengthofInpatientStay;
	private static String visitDescription;
	private static String referralSourceCode;
	private static String previousServiceDate;
	private static String employmentIllnessRelatedIndicator;
	private static String purgeStatusCode;
	private static String purgeStatusDate;
	private static String specialProgramCode;
	private static String retentionIndicator;
	private static String expectedNumberofInsurancePlans;
	private static String visitPublicityCode;
	private static String visitProtectionIndicator;
	private static String clinicOrganizationName;
	private static String patientStatusCode;
	private static String visitPriorityCode;
	private static String previousTreatmentDate;
	private static String expectedDischargeDisposition;
	private static String signatureonFileDate;
	private static String firstSimilarIllnessDate;
	private static String patientChargeAdjustmentCode;
	private static String recurringServiceCode;
	private static String billingMediaCode;
	private static String expectedSurgeryDateandTime;
	private static String militaryPartnershipCode;
	private static String militaryNonAvailabilityCode;
	private static String newbornBabyIndicator;
	private static String babyDetainedIndicator;
	private static String modeofArrivalCode;
	private static String recreationalDrugUseCode;
	private static String admissionLevelofCareCode;
	private static String precautionCode;
	private static String patientConditionCode;
	private static String livingWillCode;
	private static String organDonorCode;
	private static String advanceDirectiveCode;
	private static String patientStatusEffectiveDate;
	private static String expectedLOAReturnDateTime;
	private static String expectedPreadmissionTestingDateTime;
	private static String notifyClergyCode;
	private static String segment;
	private static String messagebodyid;
	private static int route;
	
	public void init(){
		
		this.priorPendingLocation="";
		this.accommodationCode="";
		this.admitReason="";
		this.transferReason="";
		this.patientValuables="";
		this.patientValuablesLocation="";
		this.visitUserCode="";
		this.expectedAdmitDateTime="";
		this.expectedDischargeDateTime="";
		this.estimatedLengthofInpatientStay="";
		this.actualLengthofInpatientStay="";
		this.visitDescription="";
		this.referralSourceCode="";
		this.previousServiceDate="";
		this.employmentIllnessRelatedIndicator="";
		this.purgeStatusCode="";
		this.purgeStatusDate="";
		this.specialProgramCode="";
		this.retentionIndicator="";
		this.expectedNumberofInsurancePlans="";
		this.visitPublicityCode="";
		this.visitProtectionIndicator="";
		this.clinicOrganizationName="";
		this.patientStatusCode="";
		this.visitPriorityCode="";
		this.previousTreatmentDate="";
		this.expectedDischargeDisposition="";
		this.signatureonFileDate="";
		this.firstSimilarIllnessDate="";
		this.patientChargeAdjustmentCode="";
		this.recurringServiceCode="";
		this.billingMediaCode="";
		this.expectedSurgeryDateandTime="";
		this.militaryPartnershipCode="";
		this.militaryNonAvailabilityCode="";
		this.newbornBabyIndicator="";
		this.babyDetainedIndicator="";
		this.modeofArrivalCode="";
		this.recreationalDrugUseCode="";
		this.admissionLevelofCareCode="";
		this.precautionCode="";
		this.patientConditionCode="";
		this.livingWillCode="";
		this.organDonorCode="";
		this.advanceDirectiveCode="";
		this.patientStatusEffectiveDate="";
		this.expectedLOAReturnDateTime="";
		this.expectedPreadmissionTestingDateTime="";
		this.notifyClergyCode="";
		this.segment="pv2";
		this.messagebodyid="";
		this.route=0;
		
	}
	
	public void setId(int i){
		this.id = i;
	}
	public int getId(){
		return this.id;
	}
	public void setPriorPendingLocation(String s){
	   this.priorPendingLocation = s;
	}
	public String getPriorPendingLocation(){
	   return this.priorPendingLocation;
	}
	public void setAccommodationCode(String s){
	   this.accommodationCode = s;
	}
	public String getAccommodationCode(){
	   return this.accommodationCode;
	}
	public void setAdmitReason(String s){
	   this.admitReason = s;
	}
	public String getAdmitReason(){
	   return this.admitReason;
	}
	public void setTransferReason(String s){
	   this.transferReason = s;
	}
	public String getTransferReason(){
	   return this.transferReason;
	}
	public void setPatientValuables(String s){
	   this.patientValuables = s;
	}
	public String getPatientValuables(){
	   return this.patientValuables;
	}
	public void setPatientValuablesLocation(String s){
	   this.patientValuablesLocation = s;
	}
	public String getPatientValuablesLocation(){
	   return this.patientValuablesLocation;
	}
	public void setVisitUserCode(String s){
	   this.visitUserCode = s;
	}
	public String getVisitUserCode(){
	   return this.visitUserCode;
	}
	public void setExpectedAdmitDateTime(String s){
	   this.expectedAdmitDateTime = s;
	}
	public String getExpectedAdmitDateTime(){
	   return this.expectedAdmitDateTime;
	}
	public void setExpectedDischargeDateTime(String s){
	   this.expectedDischargeDateTime = s;
	}
	public String getExpectedDischargeDateTime(){
	   return this.expectedDischargeDateTime;
	}
	public void setEstimatedLengthofInpatientStay(String s){
	   this.estimatedLengthofInpatientStay = s;
	}
	public String getEstimatedLengthofInpatientStay(){
	   return this.estimatedLengthofInpatientStay;
	}
	public void setActualLengthofInpatientStay(String s){
	   this.actualLengthofInpatientStay = s;
	}
	public String getActualLengthofInpatientStay(){
	   return this.actualLengthofInpatientStay;
	}
	public void setVisitDescription(String s){
	   this.visitDescription = s;
	}
	public String getVisitDescription(){
	   return this.visitDescription;
	}
	public void setReferralSourceCode(String s){
	   this.referralSourceCode = s;
	}
	public String getReferralSourceCode(){
	   return this.referralSourceCode;
	}
	public void setPreviousServiceDate(String s){
	   this.previousServiceDate = s;
	}
	public String getPreviousServiceDate(){
	   return this.previousServiceDate;
	}
	public void setEmploymentIllnessRelatedIndicator(String s){
	   this.employmentIllnessRelatedIndicator = s;
	}
	public String getEmploymentIllnessRelatedIndicator(){
	   return this.employmentIllnessRelatedIndicator;
	}
	public void setPurgeStatusCode(String s){
	   this.purgeStatusCode = s;
	}
	public String getPurgeStatusCode(){
	   return this.purgeStatusCode;
	}
	public void setPurgeStatusDate(String s){
	   this.purgeStatusDate = s;
	}
	public String getPurgeStatusDate(){
	   return this.purgeStatusDate;
	}
	public void setSpecialProgramCode(String s){
	   this.specialProgramCode = s;
	}
	public String getSpecialProgramCode(){
	   return this.specialProgramCode;
	}
	public void setRetentionIndicator(String s){
	   this.retentionIndicator = s;
	}
	public String getRetentionIndicator(){
	   return this.retentionIndicator;
	}
	public void setExpectedNumberofInsurancePlans(String s){
	   this.expectedNumberofInsurancePlans = s;
	}
	public String getExpectedNumberofInsurancePlans(){
	   return this.expectedNumberofInsurancePlans;
	}
	public void setVisitPublicityCode(String s){
	   this.visitPublicityCode = s;
	}
	public String getVisitPublicityCode(){
	   return this.visitPublicityCode;
	}
	public void setVisitProtectionIndicator(String s){
	   this.visitProtectionIndicator = s;
	}
	public String getVisitProtectionIndicator(){
	   return this.visitProtectionIndicator;
	}
	public void setClinicOrganizationName(String s){
	   this.clinicOrganizationName = s;
	}
	public String getClinicOrganizationName(){
	   return this.clinicOrganizationName;
	}
	public void setPatientStatusCode(String s){
	   this.patientStatusCode = s;
	}
	public String getPatientStatusCode(){
	   return this.patientStatusCode;
	}
	public void setVisitPriorityCode(String s){
	   this.visitPriorityCode = s;
	}
	public String getVisitPriorityCode(){
	   return this.visitPriorityCode;
	}
	public void setPreviousTreatmentDate(String s){
	   this.previousTreatmentDate = s;
	}
	public String getPreviousTreatmentDate(){
	   return this.previousTreatmentDate;
	}
	public void setExpectedDischargeDisposition(String s){
	   this.expectedDischargeDisposition = s;
	}
	public String getExpectedDischargeDisposition(){
	   return this.expectedDischargeDisposition;
	}
	public void setSignatureonFileDate(String s){
	   this.signatureonFileDate = s;
	}
	public String getSignatureonFileDate(){
	   return this.signatureonFileDate;
	}
	public void setFirstSimilarIllnessDate(String s){
	   this.firstSimilarIllnessDate = s;
	}
	public String getFirstSimilarIllnessDate(){
	   return this.firstSimilarIllnessDate;
	}
	public void setPatientChargeAdjustmentCode(String s){
	   this.patientChargeAdjustmentCode = s;
	}
	public String getPatientChargeAdjustmentCode(){
	   return this.patientChargeAdjustmentCode;
	}
	public void setRecurringServiceCode(String s){
	   this.recurringServiceCode = s;
	}
	public String getRecurringServiceCode(){
	   return this.recurringServiceCode;
	}
	public void setBillingMediaCode(String s){
	   this.billingMediaCode = s;
	}
	public String getBillingMediaCode(){
	   return this.billingMediaCode;
	}
	public void setExpectedSurgeryDateandTime(String s){
	   this.expectedSurgeryDateandTime = s;
	}
	public String getExpectedSurgeryDateandTime(){
	   return this.expectedSurgeryDateandTime;
	}
	public void setMilitaryPartnershipCode(String s){
	   this.militaryPartnershipCode = s;
	}
	public String getMilitaryPartnershipCode(){
	   return this.militaryPartnershipCode;
	}
	public void setMilitaryNonAvailabilityCode(String s){
	   this.militaryNonAvailabilityCode = s;
	}
	public String getMilitaryNonAvailabilityCode(){
	   return this.militaryNonAvailabilityCode;
	}
	public void setNewbornBabyIndicator(String s){
	   this.newbornBabyIndicator = s;
	}
	public String getNewbornBabyIndicator(){
	   return this.newbornBabyIndicator;
	}
	public void setBabyDetainedIndicator(String s){
	   this.babyDetainedIndicator = s;
	}
	public String getBabyDetainedIndicator(){
	   return this.babyDetainedIndicator;
	}
	public void setModeofArrivalCode(String s){
	   this.modeofArrivalCode = s;
	}
	public String getModeofArrivalCode(){
	   return this.modeofArrivalCode;
	}
	public void setRecreationalDrugUseCode(String s){
	   this.recreationalDrugUseCode = s;
	}
	public String getRecreationalDrugUseCode(){
	   return this.recreationalDrugUseCode;
	}
	public void setAdmissionLevelofCareCode(String s){
	   this.admissionLevelofCareCode = s;
	}
	public String getAdmissionLevelofCareCode(){
	   return this.admissionLevelofCareCode;
	}
	public void setPrecautionCode(String s){
	   this.precautionCode = s;
	}
	public String getPrecautionCode(){
	   return this.precautionCode;
	}
	public void setPatientConditionCode(String s){
	   this.patientConditionCode = s;
	}
	public String getPatientConditionCode(){
	   return this.patientConditionCode;
	}
	public void setLivingWillCode(String s){
	   this.livingWillCode = s;
	}
	public String getLivingWillCode(){
	   return this.livingWillCode;
	}
	public void setOrganDonorCode(String s){
	   this.organDonorCode = s;
	}
	public String getOrganDonorCode(){
	   return this.organDonorCode;
	}
	public void setAdvanceDirectiveCode(String s){
	   this.advanceDirectiveCode = s;
	}
	public String getAdvanceDirectiveCode(){
	   return this.advanceDirectiveCode;
	}
	public void setPatientStatusEffectiveDate(String s){
	   this.patientStatusEffectiveDate = s;
	}
	public String getPatientStatusEffectiveDate(){
	   return this.patientStatusEffectiveDate;
	}
	public void setExpectedLOAReturnDateTime(String s){
	   this.expectedLOAReturnDateTime = s;
	}
	public String getExpectedLOAReturnDateTime(){
	   return this.expectedLOAReturnDateTime;
	}
	public void setExpectedPreadmissionTestingDateTime(String s){
	   this.expectedPreadmissionTestingDateTime = s;
	}
	public String getExpectedPreadmissionTestingDateTime(){
	   return this.expectedPreadmissionTestingDateTime;
	}
	public void setNotifyClergyCode(String s){
	   this.notifyClergyCode = s;
	}
	public String getNotifyClergyCode(){
	   return this.notifyClergyCode;
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
