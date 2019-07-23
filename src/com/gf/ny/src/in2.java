package com.gf.ny.src;

public class in2 {

	private static int id;
	private static String insuredsEmployeeID;
	private static String insuredsSocialSecurityNumber;
	private static String insuredsEmployersNameandID;
	private static String employerInformationData;
	private static String mailClaimParty;
	private static String medicareHealthInsCardNumber;
	private static String medicaidCaseName;
	private static String medicaidCaseNumber;
	private static String militarySponsorName;
	private static String militaryIDNumber;
	private static String dependentOfMilitaryRecipient;
	private static String militaryOrganization;
	private static String militaryStation;
	private static String militaryService;
	private static String militaryRankGrade;
	private static String militaryStatus;
	private static String militaryRetireDate;
	private static String militaryNonAvailCertOnFile;
	private static String babyCoverage;
	private static String combineBabyBill;
	private static String bloodDeductible;
	private static String specialCoverageApprovalName;
	private static String specialCoverageApprovalTitle;
	private static String nonCoveredInsuranceCode;
	private static String payorID;
	private static String payorSubscriberID;
	private static String eligibilitySource;
	private static String roomCoverageTypeAmount;
	private static String policyTypeAmount;
	private static String dailyDeductible;
	private static String livingDependency;
	private static String ambulatoryStatus;
	private static String citizenship;
	private static String primaryLanguage;
	private static String livingArrangement;
	private static String publicityCode;
	private static String protectionIndicator;
	private static String studentIndicator;
	private static String religion;
	private static String mothersMaidenName;
	private static String nationality;
	private static String ethnicGroup;
	private static String maritalStatus;
	private static String insuredsEmploymentStartDate;
	private static String employmentStopDate;
	private static String jobTitle;
	private static String jobCodeClass;
	private static String jobStatus;
	private static String employerContactPersonName;
	private static String employerContactPersonPhoneNumber;
	private static String employerContactReason;
	private static String insuredsContactPersonsName;
	private static String insuredsContactPersonPhoneNumber;
	private static String insuredsContactPersonReason;
	private static String relationshiptothePatientStartDate;
	private static String relationshiptothePatientStopDate;
	private static String insuranceCoContactReason;
	private static String insuranceCoContactPhoneNumber;
	private static String policyScope;
	private static String policySource;
	private static String patientMemberNumber;
	private static String guarantorsRelationshiptoInsured;
	private static String insuredsPhoneNumberHome;
	private static String insuredsEmployerPhoneNumber;
	private static String militaryHandicappedProgram;
	private static String suspendFlag;
	private static String copayLimitFlag;
	private static String stoplossLimitFlag;
	private static String insuredOrganizationNameandID;
	private static String insuredEmployerOrganizationNameandID;
	private static String race;
	private static String cMSPatientsRelationshiptoInsured;
	private static String segment;
	private static String messagebodyid;
	private static int route;
	
	public void init(){
		
	    this.insuredsEmployeeID="";
	    this.insuredsSocialSecurityNumber="";
	    this.insuredsEmployersNameandID="";
	    this.employerInformationData="";
	    this.mailClaimParty="";
	    this.medicareHealthInsCardNumber="";
	    this.medicaidCaseName="";
	    this.medicaidCaseNumber="";
	    this.militarySponsorName="";
	    this.militaryIDNumber="";
	    this.dependentOfMilitaryRecipient="";
	    this.militaryOrganization="";
	    this.militaryStation="";
	    this.militaryService="";
	    this.militaryRankGrade="";
	    this.militaryStatus="";
	    this.militaryRetireDate="";
	    this.militaryNonAvailCertOnFile="";
	    this.babyCoverage="";
	    this.combineBabyBill="";
	    this.bloodDeductible="";
	    this.specialCoverageApprovalName="";
	    this.specialCoverageApprovalTitle="";
	    this.nonCoveredInsuranceCode="";
	    this.payorID="";
	    this.payorSubscriberID="";
	    this.eligibilitySource="";
	    this.roomCoverageTypeAmount="";
	    this.policyTypeAmount="";
	    this.dailyDeductible="";
	    this.livingDependency="";
	    this.ambulatoryStatus="";
	    this.citizenship="";
	    this.primaryLanguage="";
	    this.livingArrangement="";
	    this.publicityCode="";
	    this.protectionIndicator="";
	    this.studentIndicator="";
	    this.religion="";
	    this.mothersMaidenName="";
	    this.nationality="";
	    this.ethnicGroup="";
	    this.maritalStatus="";
	    this.insuredsEmploymentStartDate="";
	    this.employmentStopDate="";
	    this.jobTitle="";
	    this.jobCodeClass="";
	    this.jobStatus="";
	    this.employerContactPersonName="";
	    this.employerContactPersonPhoneNumber="";
	    this.employerContactReason="";
	    this.insuredsContactPersonsName="";
	    this.insuredsContactPersonPhoneNumber="";
	    this.insuredsContactPersonReason="";
	    this.relationshiptothePatientStartDate="";
	    this.relationshiptothePatientStopDate="";
	    this.insuranceCoContactReason="";
	    this.insuranceCoContactPhoneNumber="";
	    this.policyScope="";
	    this.policySource="";
	    this.patientMemberNumber="";
	    this.guarantorsRelationshiptoInsured="";
	    this.insuredsPhoneNumberHome="";
	    this.insuredsEmployerPhoneNumber="";
	    this.militaryHandicappedProgram="";
	    this.suspendFlag="";
	    this.copayLimitFlag="";
	    this.stoplossLimitFlag="";
	    this.insuredOrganizationNameandID="";
	    this.insuredEmployerOrganizationNameandID="";
	    this.race="";
	    this.cMSPatientsRelationshiptoInsured="";
	    this.segment="in2";
		this.messagebodyid="";
		this.route=0;
		
	}
	
	public boolean isPopulated(){
		
		int segmentLength = insuredsEmployeeID.length() + 
		insuredsSocialSecurityNumber.length() + 
		insuredsEmployersNameandID.length() + 
		employerInformationData.length() + 
		mailClaimParty.length() + 
		medicareHealthInsCardNumber.length() + 
		medicaidCaseName.length() + 
		medicaidCaseNumber.length() + 
		militarySponsorName.length() + 
		militaryIDNumber.length() + 
		dependentOfMilitaryRecipient.length() + 
		militaryOrganization.length() + 
		militaryStation.length() + 
		militaryService.length() + 
		militaryRankGrade.length() + 
		militaryStatus.length() + 
		militaryRetireDate.length() + 
		militaryNonAvailCertOnFile.length() + 
		babyCoverage.length() + 
		combineBabyBill.length() + 
		bloodDeductible.length() + 
		specialCoverageApprovalName.length() + 
		specialCoverageApprovalTitle.length() + 
		nonCoveredInsuranceCode.length() + 
		payorID.length() + 
		payorSubscriberID.length() + 
		eligibilitySource.length() + 
		roomCoverageTypeAmount.length() + 
		policyTypeAmount.length() + 
		dailyDeductible.length() + 
		livingDependency.length() + 
		ambulatoryStatus.length() + 
		citizenship.length() + 
		primaryLanguage.length() + 
		livingArrangement.length() + 
		publicityCode.length() + 
		protectionIndicator.length() + 
		studentIndicator.length() + 
		religion.length() + 
		mothersMaidenName.length() + 
		nationality.length() + 
		ethnicGroup.length() + 
		maritalStatus.length() + 
		insuredsEmploymentStartDate.length() + 
		employmentStopDate.length() + 
		jobTitle.length() + 
		jobCodeClass.length() + 
		jobStatus.length() + 
		employerContactPersonName.length() + 
		employerContactPersonPhoneNumber.length() + 
		employerContactReason.length() + 
		insuredsContactPersonsName.length() + 
		insuredsContactPersonPhoneNumber.length() + 
		insuredsContactPersonReason.length() + 
		relationshiptothePatientStartDate.length() + 
		relationshiptothePatientStopDate.length() + 
		insuranceCoContactReason.length() + 
		insuranceCoContactPhoneNumber.length() + 
		policyScope.length() + 
		policySource.length() + 
		patientMemberNumber.length() + 
		guarantorsRelationshiptoInsured.length() + 
		insuredsPhoneNumberHome.length() + 
		insuredsEmployerPhoneNumber.length() + 
		militaryHandicappedProgram.length() + 
		suspendFlag.length() + 
		copayLimitFlag.length() + 
		stoplossLimitFlag.length() + 
		insuredOrganizationNameandID.length() + 
		insuredEmployerOrganizationNameandID.length() + 
		race.length() + 
		cMSPatientsRelationshiptoInsured.length();
		
		boolean rc = (segmentLength > 0) ? true:false;
    	return rc;
	
	}
	
	public int getId(){
        return id;
    }
    public void setId(int i) {
        id = i;
    }
	
	public void setInsuredsEmployeeID(String s){
		   this.insuredsEmployeeID = s;
		}
		public String getInsuredsEmployeeID(){
		   return this.insuredsEmployeeID;
		}
		public void setInsuredsSocialSecurityNumber(String s){
		   this.insuredsSocialSecurityNumber = s;
		}
		public String getInsuredsSocialSecurityNumber(){
		   return this.insuredsSocialSecurityNumber;
		}
		public void setInsuredsEmployersNameandID(String s){
		   this.insuredsEmployersNameandID = s;
		}
		public String getInsuredsEmployersNameandID(){
		   return this.insuredsEmployersNameandID;
		}
		public void setEmployerInformationData(String s){
		   this.employerInformationData = s;
		}
		public String getEmployerInformationData(){
		   return this.employerInformationData;
		}
		public void setMailClaimParty(String s){
		   this.mailClaimParty = s;
		}
		public String getMailClaimParty(){
		   return this.mailClaimParty;
		}
		public void setMedicareHealthInsCardNumber(String s){
		   this.medicareHealthInsCardNumber = s;
		}
		public String getMedicareHealthInsCardNumber(){
		   return this.medicareHealthInsCardNumber;
		}
		public void setMedicaidCaseName(String s){
		   this.medicaidCaseName = s;
		}
		public String getMedicaidCaseName(){
		   return this.medicaidCaseName;
		}
		public void setMedicaidCaseNumber(String s){
		   this.medicaidCaseNumber = s;
		}
		public String getMedicaidCaseNumber(){
		   return this.medicaidCaseNumber;
		}
		public void setMilitarySponsorName(String s){
		   this.militarySponsorName = s;
		}
		public String getMilitarySponsorName(){
		   return this.militarySponsorName;
		}
		public void setMilitaryIDNumber(String s){
		   this.militaryIDNumber = s;
		}
		public String getMilitaryIDNumber(){
		   return this.militaryIDNumber;
		}
		public void setDependentOfMilitaryRecipient(String s){
		   this.dependentOfMilitaryRecipient = s;
		}
		public String getDependentOfMilitaryRecipient(){
		   return this.dependentOfMilitaryRecipient;
		}
		public void setMilitaryOrganization(String s){
		   this.militaryOrganization = s;
		}
		public String getMilitaryOrganization(){
		   return this.militaryOrganization;
		}
		public void setMilitaryStation(String s){
		   this.militaryStation = s;
		}
		public String getMilitaryStation(){
		   return this.militaryStation;
		}
		public void setMilitaryService(String s){
		   this.militaryService = s;
		}
		public String getMilitaryService(){
		   return this.militaryService;
		}
		public void setMilitaryRankGrade(String s){
		   this.militaryRankGrade = s;
		}
		public String getMilitaryRankGrade(){
		   return this.militaryRankGrade;
		}
		public void setMilitaryStatus(String s){
		   this.militaryStatus = s;
		}
		public String getMilitaryStatus(){
		   return this.militaryStatus;
		}
		public void setMilitaryRetireDate(String s){
		   this.militaryRetireDate = s;
		}
		public String getMilitaryRetireDate(){
		   return this.militaryRetireDate;
		}
		public void setMilitaryNonAvailCertOnFile(String s){
		   this.militaryNonAvailCertOnFile = s;
		}
		public String getMilitaryNonAvailCertOnFile(){
		   return this.militaryNonAvailCertOnFile;
		}
		public void setBabyCoverage(String s){
		   this.babyCoverage = s;
		}
		public String getBabyCoverage(){
		   return this.babyCoverage;
		}
		public void setCombineBabyBill(String s){
		   this.combineBabyBill = s;
		}
		public String getCombineBabyBill(){
		   return this.combineBabyBill;
		}
		public void setBloodDeductible(String s){
		   this.bloodDeductible = s;
		}
		public String getBloodDeductible(){
		   return this.bloodDeductible;
		}
		public void setSpecialCoverageApprovalName(String s){
		   this.specialCoverageApprovalName = s;
		}
		public String getSpecialCoverageApprovalName(){
		   return this.specialCoverageApprovalName;
		}
		public void setSpecialCoverageApprovalTitle(String s){
		   this.specialCoverageApprovalTitle = s;
		}
		public String getSpecialCoverageApprovalTitle(){
		   return this.specialCoverageApprovalTitle;
		}
		public void setNonCoveredInsuranceCode(String s){
		   this.nonCoveredInsuranceCode = s;
		}
		public String getNonCoveredInsuranceCode(){
		   return this.nonCoveredInsuranceCode;
		}
		public void setPayorID(String s){
		   this.payorID = s;
		}
		public String getPayorID(){
		   return this.payorID;
		}
		public void setPayorSubscriberID(String s){
		   this.payorSubscriberID = s;
		}
		public String getPayorSubscriberID(){
		   return this.payorSubscriberID;
		}
		public void setEligibilitySource(String s){
		   this.eligibilitySource = s;
		}
		public String getEligibilitySource(){
		   return this.eligibilitySource;
		}
		public void setRoomCoverageTypeAmount(String s){
		   this.roomCoverageTypeAmount = s;
		}
		public String getRoomCoverageTypeAmount(){
		   return this.roomCoverageTypeAmount;
		}
		public void setPolicyTypeAmount(String s){
		   this.policyTypeAmount = s;
		}
		public String getPolicyTypeAmount(){
		   return this.policyTypeAmount;
		}
		public void setDailyDeductible(String s){
		   this.dailyDeductible = s;
		}
		public String getDailyDeductible(){
		   return this.dailyDeductible;
		}
		public void setLivingDependency(String s){
		   this.livingDependency = s;
		}
		public String getLivingDependency(){
		   return this.livingDependency;
		}
		public void setAmbulatoryStatus(String s){
		   this.ambulatoryStatus = s;
		}
		public String getAmbulatoryStatus(){
		   return this.ambulatoryStatus;
		}
		public void setCitizenship(String s){
		   this.citizenship = s;
		}
		public String getCitizenship(){
		   return this.citizenship;
		}
		public void setPrimaryLanguage(String s){
		   this.primaryLanguage = s;
		}
		public String getPrimaryLanguage(){
		   return this.primaryLanguage;
		}
		public void setLivingArrangement(String s){
		   this.livingArrangement = s;
		}
		public String getLivingArrangement(){
		   return this.livingArrangement;
		}
		public void setPublicityCode(String s){
		   this.publicityCode = s;
		}
		public String getPublicityCode(){
		   return this.publicityCode;
		}
		public void setProtectionIndicator(String s){
		   this.protectionIndicator = s;
		}
		public String getProtectionIndicator(){
		   return this.protectionIndicator;
		}
		public void setStudentIndicator(String s){
		   this.studentIndicator = s;
		}
		public String getStudentIndicator(){
		   return this.studentIndicator;
		}
		public void setReligion(String s){
		   this.religion = s;
		}
		public String getReligion(){
		   return this.religion;
		}
		public void setMothersMaidenName(String s){
		   this.mothersMaidenName = s;
		}
		public String getMothersMaidenName(){
		   return this.mothersMaidenName;
		}
		public void setNationality(String s){
		   this.nationality = s;
		}
		public String getNationality(){
		   return this.nationality;
		}
		public void setEthnicGroup(String s){
		   this.ethnicGroup = s;
		}
		public String getEthnicGroup(){
		   return this.ethnicGroup;
		}
		public void setMaritalStatus(String s){
		   this.maritalStatus = s;
		}
		public String getMaritalStatus(){
		   return this.maritalStatus;
		}
		public void setInsuredsEmploymentStartDate(String s){
		   this.insuredsEmploymentStartDate = s;
		}
		public String getInsuredsEmploymentStartDate(){
		   return this.insuredsEmploymentStartDate;
		}
		public void setEmploymentStopDate(String s){
		   this.employmentStopDate = s;
		}
		public String getEmploymentStopDate(){
		   return this.employmentStopDate;
		}
		public void setJobTitle(String s){
		   this.jobTitle = s;
		}
		public String getJobTitle(){
		   return this.jobTitle;
		}
		public void setJobCodeClass(String s){
		   this.jobCodeClass = s;
		}
		public String getJobCodeClass(){
		   return this.jobCodeClass;
		}
		public void setJobStatus(String s){
		   this.jobStatus = s;
		}
		public String getJobStatus(){
		   return this.jobStatus;
		}
		public void setEmployerContactPersonName(String s){
		   this.employerContactPersonName = s;
		}
		public String getEmployerContactPersonName(){
		   return this.employerContactPersonName;
		}
		public void setEmployerContactPersonPhoneNumber(String s){
		   this.employerContactPersonPhoneNumber = s;
		}
		public String getEmployerContactPersonPhoneNumber(){
		   return this.employerContactPersonPhoneNumber;
		}
		public void setEmployerContactReason(String s){
		   this.employerContactReason = s;
		}
		public String getEmployerContactReason(){
		   return this.employerContactReason;
		}
		public void setInsuredsContactPersonsName(String s){
		   this.insuredsContactPersonsName = s;
		}
		public String getInsuredsContactPersonsName(){
		   return this.insuredsContactPersonsName;
		}
		public void setInsuredsContactPersonPhoneNumber(String s){
		   this.insuredsContactPersonPhoneNumber = s;
		}
		public String getInsuredsContactPersonPhoneNumber(){
		   return this.insuredsContactPersonPhoneNumber;
		}
		public void setInsuredsContactPersonReason(String s){
		   this.insuredsContactPersonReason = s;
		}
		public String getInsuredsContactPersonReason(){
		   return this.insuredsContactPersonReason;
		}
		public void setRelationshiptothePatientStartDate(String s){
		   this.relationshiptothePatientStartDate = s;
		}
		public String getRelationshiptothePatientStartDate(){
		   return this.relationshiptothePatientStartDate;
		}
		public void setRelationshiptothePatientStopDate(String s){
		   this.relationshiptothePatientStopDate = s;
		}
		public String getRelationshiptothePatientStopDate(){
		   return this.relationshiptothePatientStopDate;
		}
		public void setInsuranceCoContactReason(String s){
		   this.insuranceCoContactReason = s;
		}
		public String getInsuranceCoContactReason(){
		   return this.insuranceCoContactReason;
		}
		public void setInsuranceCoContactPhoneNumber(String s){
		   this.insuranceCoContactPhoneNumber = s;
		}
		public String getInsuranceCoContactPhoneNumber(){
		   return this.insuranceCoContactPhoneNumber;
		}
		public void setPolicyScope(String s){
		   this.policyScope = s;
		}
		public String getPolicyScope(){
		   return this.policyScope;
		}
		public void setPolicySource(String s){
		   this.policySource = s;
		}
		public String getPolicySource(){
		   return this.policySource;
		}
		public void setPatientMemberNumber(String s){
		   this.patientMemberNumber = s;
		}
		public String getPatientMemberNumber(){
		   return this.patientMemberNumber;
		}
		public void setGuarantorsRelationshiptoInsured(String s){
		   this.guarantorsRelationshiptoInsured = s;
		}
		public String getGuarantorsRelationshiptoInsured(){
		   return this.guarantorsRelationshiptoInsured;
		}
		public void setInsuredsPhoneNumberHome(String s){
		   this.insuredsPhoneNumberHome = s;
		}
		public String getInsuredsPhoneNumberHome(){
		   return this.insuredsPhoneNumberHome;
		}
		public void setInsuredsEmployerPhoneNumber(String s){
		   this.insuredsEmployerPhoneNumber = s;
		}
		public String getInsuredsEmployerPhoneNumber(){
		   return this.insuredsEmployerPhoneNumber;
		}
		public void setMilitaryHandicappedProgram(String s){
		   this.militaryHandicappedProgram = s;
		}
		public String getMilitaryHandicappedProgram(){
		   return this.militaryHandicappedProgram;
		}
		public void setSuspendFlag(String s){
		   this.suspendFlag = s;
		}
		public String getSuspendFlag(){
		   return this.suspendFlag;
		}
		public void setCopayLimitFlag(String s){
		   this.copayLimitFlag = s;
		}
		public String getCopayLimitFlag(){
		   return this.copayLimitFlag;
		}
		public void setStoplossLimitFlag(String s){
		   this.stoplossLimitFlag = s;
		}
		public String getStoplossLimitFlag(){
		   return this.stoplossLimitFlag;
		}
		public void setInsuredOrganizationNameandID(String s){
		   this.insuredOrganizationNameandID = s;
		}
		public String getInsuredOrganizationNameandID(){
		   return this.insuredOrganizationNameandID;
		}
		public void setInsuredEmployerOrganizationNameandID(String s){
		   this.insuredEmployerOrganizationNameandID = s;
		}
		public String getInsuredEmployerOrganizationNameandID(){
		   return this.insuredEmployerOrganizationNameandID;
		}
		public void setRace(String s){
		   this.race = s;
		}
		public String getRace(){
		   return this.race;
		}
		public void setcMSPatientsRelationshiptoInsured(String s){
		   this.cMSPatientsRelationshiptoInsured = s;
		}
		public String getcMSPatientsRelationshiptoInsured(){
		   return this.cMSPatientsRelationshiptoInsured;
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
