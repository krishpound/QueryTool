package com.gf.ny.src;

public class in1 {

	private static int id;
	private static String setId;
	private static String insurancePlanID;
	private static String insuranceCompanyId;
	private static String insuranceCompanyName;
	private static String insuranceCompanyAddress;
	private static String insuranceCoContactPerson;
	private static String insuranceCoPhoneNumber;
	private static String groupNumber;
	private static String groupName;
	private static String insuredGroupEmpId;
	private static String insuredGroupEmpName;
	private static String planEffectiveDate;
	private static String planExpirationDate;
	private static String authorizationInformation;
	private static String planType;
	private static String nameOfInsured;
	private static String insuredRelationshipToPatient;
	private static String insuredDateOfBirth;
	private static String insuredAddress;
	private static String assignmentOfBenefits;
	private static String coordinationOfBenefits;
	private static String coordOfBenPriority;
	private static String noticeOfAdmissionFlag;
	private static String noticeOfAdmissionDate;
	private static String reportOfEligibilityFlag;
	private static String reportOfEligibilityDate;
	private static String releaseInformationCode;
	private static String preAdmitCert;
	private static String verificationDateTime;
	private static String verificationBy;
	private static String typeOfAgreementCode;
	private static String billingStatus;
	private static String lifetimeReserveDays;
	private static String delayBeforeLRDay;
	private static String companyPlanCode;
	private static String policyNumber;
	private static String policyDeductible;
	private static String policyLimitAmount;
	private static String policyLimitDays;
	private static String roomRateSemiPrivate;
	private static String roomRatePrivate;
	private static String insuredEmploymentStatus;
	private static String insuredAdministrativeSex;
	private static String insuredEmployerAddress;
	private static String verificationStatus;
	private static String priorInsurancePlanId;
	private static String coverageType;
	private static String handicap;
	private static String insuredIdNumber;
	private static String signatureCode;
	private static String signatureCodeDate;
	private static String insuredBirthPlace;
	private static String vIPIndicator;
	private static String segment;
	private static String messagebodyid;
	private static int route;
	
    public void init(){
    	
        this.setId="";
        this.insurancePlanID="";
        this.insuranceCompanyId="";
        this.insuranceCompanyName="";
        this.insuranceCompanyAddress="";
        this.insuranceCoContactPerson="";
        this.insuranceCoPhoneNumber="";
        this.groupNumber="";
        this.groupName="";
        this.insuredGroupEmpId="";
        this.insuredGroupEmpName="";
        this.planEffectiveDate="";
        this.planExpirationDate="";
        this.authorizationInformation="";
        this.planType="";
        this.nameOfInsured="";
        this.insuredRelationshipToPatient="";
        this.insuredDateOfBirth="";
        this.insuredAddress="";
        this.assignmentOfBenefits="";
        this.coordinationOfBenefits="";
        this.coordOfBenPriority="";
        this.noticeOfAdmissionFlag="";
        this.noticeOfAdmissionDate="";
        this.reportOfEligibilityFlag="";
        this.reportOfEligibilityDate="";
        this.releaseInformationCode="";
        this.preAdmitCert="";
        this.verificationDateTime="";
        this.verificationBy="";
        this.typeOfAgreementCode="";
        this.billingStatus="";
        this.lifetimeReserveDays="";
        this.delayBeforeLRDay="";
        this.companyPlanCode="";
        this.policyNumber="";
        this.policyDeductible="";
        this.policyLimitAmount="";
        this.policyLimitDays="";
        this.roomRateSemiPrivate="";
        this.roomRatePrivate="";
        this.insuredEmploymentStatus="";
        this.insuredAdministrativeSex="";
        this.insuredEmployerAddress="";
        this.verificationStatus="";
        this.priorInsurancePlanId="";
        this.coverageType="";
        this.handicap="";
        this.insuredIdNumber="";
        this.signatureCode="";
        this.signatureCodeDate="";
        this.insuredBirthPlace="";
        this.vIPIndicator="";
        this.segment="in1";
		this.messagebodyid="";
		this.route=0;
    	
    }
    
    public boolean isPopulated(){
    	
    	int segmentLength = setId.length() + 
    	insurancePlanID.length() + 
    	insuranceCompanyId.length() + 
    	insuranceCompanyName.length() + 
    	insuranceCompanyAddress.length() + 
    	insuranceCoContactPerson.length() + 
    	insuranceCoPhoneNumber.length() + 
    	groupNumber.length() + 
    	groupName.length() + 
    	insuredGroupEmpId.length() + 
    	insuredGroupEmpName.length() + 
    	planEffectiveDate.length() + 
    	planExpirationDate.length() + 
    	authorizationInformation.length() + 
    	planType.length() + 
    	nameOfInsured.length() + 
    	insuredRelationshipToPatient.length() + 
    	insuredDateOfBirth.length() + 
    	insuredAddress.length() + 
    	assignmentOfBenefits.length() + 
    	coordinationOfBenefits.length() + 
    	coordOfBenPriority.length() + 
    	noticeOfAdmissionFlag.length() + 
    	noticeOfAdmissionDate.length() + 
    	reportOfEligibilityFlag.length() + 
    	reportOfEligibilityDate.length() + 
    	releaseInformationCode.length() + 
    	preAdmitCert.length() + 
    	verificationDateTime.length() + 
    	verificationBy.length() + 
    	typeOfAgreementCode.length() + 
    	billingStatus.length() + 
    	lifetimeReserveDays.length() + 
    	delayBeforeLRDay.length() + 
    	companyPlanCode.length() + 
    	policyNumber.length() + 
    	policyDeductible.length() + 
    	policyLimitAmount.length() + 
    	policyLimitDays.length() + 
    	roomRateSemiPrivate.length() + 
    	roomRatePrivate.length() + 
    	insuredEmploymentStatus.length() + 
    	insuredAdministrativeSex.length() + 
    	insuredEmployerAddress.length() + 
    	verificationStatus.length() + 
    	priorInsurancePlanId.length() + 
    	coverageType.length() + 
    	handicap.length() + 
    	insuredIdNumber.length() + 
    	signatureCode.length() + 
    	signatureCodeDate.length() + 
    	insuredBirthPlace.length() + 
    	vIPIndicator.length();  
    	
    	boolean rc = (segmentLength > 0) ? true:false;
    	return rc;
    	
    }
    
    
    public int getId(){
        return id;
    }
    public void setId(int i) {
        id = i;
    }
    
	public void setSetId(String s){
		   this.setId = s;
		}
		public String getSetId(){
		   return this.setId;
		}
		public void setInsurancePlanID(String s){
		   this.insurancePlanID = s;
		}
		public String getInsurancePlanID(){
		   return this.insurancePlanID;
		}
		public void setInsuranceCompanyId(String s){
		   this.insuranceCompanyId = s;
		}
		public String getInsuranceCompanyId(){
		   return this.insuranceCompanyId;
		}
		public void setInsuranceCompanyName(String s){
		   this.insuranceCompanyName = s;
		}
		public String getInsuranceCompanyName(){
		   return this.insuranceCompanyName;
		}
		public void setInsuranceCompanyAddress(String s){
		   this.insuranceCompanyAddress = s;
		}
		public String getInsuranceCompanyAddress(){
		   return this.insuranceCompanyAddress;
		}
		public void setInsuranceCoContactPerson(String s){
		   this.insuranceCoContactPerson = s;
		}
		public String getInsuranceCoContactPerson(){
		   return this.insuranceCoContactPerson;
		}
		public void setInsuranceCoPhoneNumber(String s){
		   this.insuranceCoPhoneNumber = s;
		}
		public String getInsuranceCoPhoneNumber(){
		   return this.insuranceCoPhoneNumber;
		}
		public void setGroupNumber(String s){
		   this.groupNumber = s;
		}
		public String getGroupNumber(){
		   return this.groupNumber;
		}
		public void setGroupName(String s){
		   this.groupName = s;
		}
		public String getGroupName(){
		   return this.groupName;
		}
		public void setInsuredGroupEmpId(String s){
		   this.insuredGroupEmpId = s;
		}
		public String getInsuredGroupEmpId(){
		   return this.insuredGroupEmpId;
		}
		public void setInsuredGroupEmpName(String s){
		   this.insuredGroupEmpName = s;
		}
		public String getInsuredGroupEmpName(){
		   return this.insuredGroupEmpName;
		}
		public void setPlanEffectiveDate(String s){
		   this.planEffectiveDate = s;
		}
		public String getPlanEffectiveDate(){
		   return this.planEffectiveDate;
		}
		public void setPlanExpirationDate(String s){
		   this.planExpirationDate = s;
		}
		public String getPlanExpirationDate(){
		   return this.planExpirationDate;
		}
		public void setAuthorizationInformation(String s){
		   this.authorizationInformation = s;
		}
		public String getAuthorizationInformation(){
		   return this.authorizationInformation;
		}
		public void setPlanType(String s){
		   this.planType = s;
		}
		public String getPlanType(){
		   return this.planType;
		}
		public void setNameOfInsured(String s){
		   this.nameOfInsured = s;
		}
		public String getNameOfInsured(){
		   return this.nameOfInsured;
		}
		public void setInsuredRelationshipToPatient(String s){
		   this.insuredRelationshipToPatient = s;
		}
		public String getInsuredRelationshipToPatient(){
		   return this.insuredRelationshipToPatient;
		}
		public void setInsuredDateOfBirth(String s){
		   this.insuredDateOfBirth = s;
		}
		public String getInsuredDateOfBirth(){
		   return this.insuredDateOfBirth;
		}
		public void setInsuredAddress(String s){
		   this.insuredAddress = s;
		}
		public String getInsuredAddress(){
		   return this.insuredAddress;
		}
		public void setAssignmentOfBenefits(String s){
		   this.assignmentOfBenefits = s;
		}
		public String getAssignmentOfBenefits(){
		   return this.assignmentOfBenefits;
		}
		public void setCoordinationOfBenefits(String s){
		   this.coordinationOfBenefits = s;
		}
		public String getCoordinationOfBenefits(){
		   return this.coordinationOfBenefits;
		}
		public void setCoordOfBenPriority(String s){
		   this.coordOfBenPriority = s;
		}
		public String getCoordOfBenPriority(){
		   return this.coordOfBenPriority;
		}
		public void setNoticeOfAdmissionFlag(String s){
		   this.noticeOfAdmissionFlag = s;
		}
		public String getNoticeOfAdmissionFlag(){
		   return this.noticeOfAdmissionFlag;
		}
		public void setNoticeOfAdmissionDate(String s){
		   this.noticeOfAdmissionDate = s;
		}
		public String getNoticeOfAdmissionDate(){
		   return this.noticeOfAdmissionDate;
		}
		public void setReportOfEligibilityFlag(String s){
		   this.reportOfEligibilityFlag = s;
		}
		public String getReportOfEligibilityFlag(){
		   return this.reportOfEligibilityFlag;
		}
		public void setReportOfEligibilityDate(String s){
		   this.reportOfEligibilityDate = s;
		}
		public String getReportOfEligibilityDate(){
		   return this.reportOfEligibilityDate;
		}
		public void setReleaseInformationCode(String s){
		   this.releaseInformationCode = s;
		}
		public String getReleaseInformationCode(){
		   return this.releaseInformationCode;
		}
		public void setPreAdmitCert(String s){
		   this.preAdmitCert = s;
		}
		public String getPreAdmitCert(){
		   return this.preAdmitCert;
		}
		public void setVerificationDateTime(String s){
		   this.verificationDateTime = s;
		}
		public String getVerificationDateTime(){
		   return this.verificationDateTime;
		}
		public void setVerificationBy(String s){
		   this.verificationBy = s;
		}
		public String getVerificationBy(){
		   return this.verificationBy;
		}
		public void setTypeOfAgreementCode(String s){
		   this.typeOfAgreementCode = s;
		}
		public String getTypeOfAgreementCode(){
		   return this.typeOfAgreementCode;
		}
		public void setBillingStatus(String s){
		   this.billingStatus = s;
		}
		public String getBillingStatus(){
		   return this.billingStatus;
		}
		public void setLifetimeReserveDays(String s){
		   this.lifetimeReserveDays = s;
		}
		public String getLifetimeReserveDays(){
		   return this.lifetimeReserveDays;
		}
		public void setDelayBeforeLRDay(String s){
		   this.delayBeforeLRDay = s;
		}
		public String getDelayBeforeLRDay(){
		   return this.delayBeforeLRDay;
		}
		public void setCompanyPlanCode(String s){
		   this.companyPlanCode = s;
		}
		public String getCompanyPlanCode(){
		   return this.companyPlanCode;
		}
		public void setPolicyNumber(String s){
		   this.policyNumber = s;
		}
		public String getPolicyNumber(){
		   return this.policyNumber;
		}
		public void setPolicyDeductible(String s){
		   this.policyDeductible = s;
		}
		public String getPolicyDeductible(){
		   return this.policyDeductible;
		}
		public void setPolicyLimitAmount(String s){
		   this.policyLimitAmount = s;
		}
		public String getPolicyLimitAmount(){
		   return this.policyLimitAmount;
		}
		public void setPolicyLimitDays(String s){
		   this.policyLimitDays = s;
		}
		public String getPolicyLimitDays(){
		   return this.policyLimitDays;
		}
		public void setRoomRateSemiPrivate(String s){
		   this.roomRateSemiPrivate = s;
		}
		public String getRoomRateSemiPrivate(){
		   return this.roomRateSemiPrivate;
		}
		public void setRoomRatePrivate(String s){
		   this.roomRatePrivate = s;
		}
		public String getRoomRatePrivate(){
		   return this.roomRatePrivate;
		}
		public void setInsuredEmploymentStatus(String s){
		   this.insuredEmploymentStatus = s;
		}
		public String getInsuredEmploymentStatus(){
		   return this.insuredEmploymentStatus;
		}
		public void setInsuredAdministrativeSex(String s){
		   this.insuredAdministrativeSex = s;
		}
		public String getInsuredAdministrativeSex(){
		   return this.insuredAdministrativeSex;
		}
		public void setInsuredEmployerAddress(String s){
		   this.insuredEmployerAddress = s;
		}
		public String getInsuredEmployerAddress(){
		   return this.insuredEmployerAddress;
		}
		public void setVerificationStatus(String s){
		   this.verificationStatus = s;
		}
		public String getVerificationStatus(){
		   return this.verificationStatus;
		}
		public void setPriorInsurancePlanId(String s){
		   this.priorInsurancePlanId = s;
		}
		public String getPriorInsurancePlanId(){
		   return this.priorInsurancePlanId;
		}
		public void setCoverageType(String s){
		   this.coverageType = s;
		}
		public String getCoverageType(){
		   return this.coverageType;
		}
		public void setHandicap(String s){
		   this.handicap = s;
		}
		public String getHandicap(){
		   return this.handicap;
		}
		public void setInsuredIdNumber(String s){
		   this.insuredIdNumber = s;
		}
		public String getInsuredIdNumber(){
		   return this.insuredIdNumber;
		}
		public void setSignatureCode(String s){
		   this.signatureCode = s;
		}
		public String getSignatureCode(){
		   return this.signatureCode;
		}
		public void setSignatureCodeDate(String s){
		   this.signatureCodeDate = s;
		}
		public String getSignatureCodeDate(){
		   return this.signatureCodeDate;
		}
		public void setInsuredBirthPlace(String s){
		   this.insuredBirthPlace = s;
		}
		public String getInsuredBirthPlace(){
		   return this.insuredBirthPlace;
		}
		public void setvIPIndicator(String s){
		   this.vIPIndicator = s;
		}
		public String getvIPIndicator(){
		   return this.vIPIndicator;
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
