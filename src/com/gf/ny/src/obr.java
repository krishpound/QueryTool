package com.gf.ny.src;

public class obr {

	private static int id;
	private static String setID;
	private static String placerOrderNumber;
	private static String fillerOrderNumber;
	private static String universalServiceIdentifier;
	private static String priority;
	private static String requestedDateTime;
	private static String observationDateTime;
	private static String observationEndDateTime;
	private static String collectionVolume;
	private static String collectorIdentifier;
	private static String specimenActionCode;
	private static String dangerCode;
	private static String relevantClinicalInformation;
	private static String specimenReceivedDateTime;
	private static String specimenSource;
	private static String orderingProvider;
	private static String orderCallbackPhoneNumber;
	private static String placerField1;
	private static String placerField2;
	private static String fillerField1;
	private static String fillerField2;
	private static String resultsRptStatusChngDateTime;
	private static String chargetoPractice;
	private static String diagnosticServSectID;
	private static String resultStatus;
	private static String parentResult;
	private static String quantityTiming;
	private static String resultCopiesTo;
	private static String parent;
	private static String transportationMode;
	private static String reasonforStudy;
	private static String principalResultInterpreter;
	private static String assistantResultInterpreter;
	private static String technician;
	private static String transcriptionist;
	private static String scheduledDateTime;
	private static String numberofSampleContainers;
	private static String transportLogisticsofCollectedSample;
	private static String collectorsComment;
	private static String transportArrangementResponsibility;
	private static String transportArranged;
	private static String escortRequired;
	private static String plannedPatientTransportComment;
	private static String procedureCode;
	private static String procedureCodeModifier;
	private static String placerSupplementalServiceInformation;
	private static String fillerSupplementalServiceInformation;
	private static String medicallyNecessaryDuplicateProcedureReason;
	private static String resultHandling;
	private static String segment;
	private static String messageBodyId;
	private static int route;
	
	public void init(){
		
		this.setID="";
		this.placerOrderNumber="";
		this.fillerOrderNumber="";
		this.universalServiceIdentifier="";
		this.priority="";
		this.requestedDateTime="";
		this.observationDateTime="";
		this.observationEndDateTime="";
		this.collectionVolume="";
		this.collectorIdentifier="";
		this.specimenActionCode="";
		this.dangerCode="";
		this.relevantClinicalInformation="";
		this.specimenReceivedDateTime="";
		this.specimenSource="";
		this.orderingProvider="";
		this.orderCallbackPhoneNumber="";
		this.placerField1="";
		this.placerField2="";
		this.fillerField1="";
		this.fillerField2="";
		this.resultsRptStatusChngDateTime="";
		this.chargetoPractice="";
		this.diagnosticServSectID="";
		this.resultStatus="";
		this.parentResult="";
		this.quantityTiming="";
		this.resultCopiesTo="";
		this.parent="";
		this.transportationMode="";
		this.reasonforStudy="";
		this.principalResultInterpreter="";
		this.assistantResultInterpreter="";
		this.technician="";
		this.transcriptionist="";
		this.scheduledDateTime="";
		this.numberofSampleContainers="";
		this.transportLogisticsofCollectedSample="";
		this.collectorsComment="";
		this.transportArrangementResponsibility="";
		this.transportArranged="";
		this.escortRequired="";
		this.plannedPatientTransportComment="";
		this.procedureCode="";
		this.procedureCodeModifier="";
		this.placerSupplementalServiceInformation="";
		this.fillerSupplementalServiceInformation="";
		this.medicallyNecessaryDuplicateProcedureReason="";
		this.resultHandling="";
		this.segment="obr";
		this.messageBodyId="";
		this.route=0;
		
	}
	
	public void setId(int i){
		this.id = i;
	}
	public int getId(){
		return this.id;
	}
	public void setSetID(String s){
	   this.setID = s;
	}
	public String getSetID(){
	   return this.setID;
	}
	public void setPlacerOrderNumber(String s){
	   this.placerOrderNumber = s;
	}
	public String getPlacerOrderNumber(){
	   return this.placerOrderNumber;
	}
	public void setFillerOrderNumber(String s){
	   this.fillerOrderNumber = s;
	}
	public String getFillerOrderNumber(){
	   return this.fillerOrderNumber;
	}
	public void setUniversalServiceIdentifier(String s){
	   this.universalServiceIdentifier = s;
	}
	public String getUniversalServiceIdentifier(){
	   return this.universalServiceIdentifier;
	}
	public void setPriority(String s){
	   this.priority = s;
	}
	public String getPriority(){
	   return this.priority;
	}
	public void setRequestedDateTime(String s){
	   this.requestedDateTime = s;
	}
	public String getRequestedDateTime(){
	   return this.requestedDateTime;
	}
	public void setObservationDateTime(String s){
	   this.observationDateTime = s;
	}
	public String getObservationDateTime(){
	   return this.observationDateTime;
	}
	public void setObservationEndDateTime(String s){
	   this.observationEndDateTime = s;
	}
	public String getObservationEndDateTime(){
	   return this.observationEndDateTime;
	}
	public void setCollectionVolume(String s){
	   this.collectionVolume = s;
	}
	public String getCollectionVolume(){
	   return this.collectionVolume;
	}
	public void setCollectorIdentifier(String s){
	   this.collectorIdentifier = s;
	}
	public String getCollectorIdentifier(){
	   return this.collectorIdentifier;
	}
	public void setSpecimenActionCode(String s){
	   this.specimenActionCode = s;
	}
	public String getSpecimenActionCode(){
	   return this.specimenActionCode;
	}
	public void setDangerCode(String s){
	   this.dangerCode = s;
	}
	public String getDangerCode(){
	   return this.dangerCode;
	}
	public void setRelevantClinicalInformation(String s){
	   this.relevantClinicalInformation = s;
	}
	public String getRelevantClinicalInformation(){
	   return this.relevantClinicalInformation;
	}
	public void setSpecimenReceivedDateTime(String s){
	   this.specimenReceivedDateTime = s;
	}
	public String getSpecimenReceivedDateTime(){
	   return this.specimenReceivedDateTime;
	}
	public void setSpecimenSource(String s){
	   this.specimenSource = s;
	}
	public String getSpecimenSource(){
	   return this.specimenSource;
	}
	public void setOrderingProvider(String s){
	   this.orderingProvider = s;
	}
	public String getOrderingProvider(){
	   return this.orderingProvider;
	}
	public void setOrderCallbackPhoneNumber(String s){
	   this.orderCallbackPhoneNumber = s;
	}
	public String getOrderCallbackPhoneNumber(){
	   return this.orderCallbackPhoneNumber;
	}
	public void setPlacerField1(String s){
	   this.placerField1 = s;
	}
	public String getPlacerField1(){
	   return this.placerField1;
	}
	public void setPlacerField2(String s){
	   this.placerField2 = s;
	}
	public String getPlacerField2(){
	   return this.placerField2;
	}
	public void setFillerField1(String s){
	   this.fillerField1 = s;
	}
	public String getFillerField1(){
	   return this.fillerField1;
	}
	public void setFillerField2(String s){
	   this.fillerField2 = s;
	}
	public String getFillerField2(){
	   return this.fillerField2;
	}
	public void setResultsRptStatusChngDateTime(String s){
	   this.resultsRptStatusChngDateTime = s;
	}
	public String getResultsRptStatusChngDateTime(){
	   return this.resultsRptStatusChngDateTime;
	}
	public void setChargetoPractice(String s){
	   this.chargetoPractice = s;
	}
	public String getChargetoPractice(){
	   return this.chargetoPractice;
	}
	public void setDiagnosticServSectID(String s){
	   this.diagnosticServSectID = s;
	}
	public String getDiagnosticServSectID(){
	   return this.diagnosticServSectID;
	}
	public void setResultStatus(String s){
	   this.resultStatus = s;
	}
	public String getResultStatus(){
	   return this.resultStatus;
	}
	public void setParentResult(String s){
	   this.parentResult = s;
	}
	public String getParentResult(){
	   return this.parentResult;
	}
	public void setQuantityTiming(String s){
	   this.quantityTiming = s;
	}
	public String getQuantityTiming(){
	   return this.quantityTiming;
	}
	public void setResultCopiesTo(String s){
	   this.resultCopiesTo = s;
	}
	public String getResultCopiesTo(){
	   return this.resultCopiesTo;
	}
	public void setParent(String s){
	   this.parent = s;
	}
	public String getParent(){
	   return this.parent;
	}
	public void setTransportationMode(String s){
	   this.transportationMode = s;
	}
	public String getTransportationMode(){
	   return this.transportationMode;
	}
	public void setReasonforStudy(String s){
	   this.reasonforStudy = s;
	}
	public String getReasonforStudy(){
	   return this.reasonforStudy;
	}
	public void setPrincipalResultInterpreter(String s){
	   this.principalResultInterpreter = s;
	}
	public String getPrincipalResultInterpreter(){
	   return this.principalResultInterpreter;
	}
	public void setAssistantResultInterpreter(String s){
	   this.assistantResultInterpreter = s;
	}
	public String getAssistantResultInterpreter(){
	   return this.assistantResultInterpreter;
	}
	public void setTechnician(String s){
	   this.technician = s;
	}
	public String getTechnician(){
	   return this.technician;
	}
	public void setTranscriptionist(String s){
	   this.transcriptionist = s;
	}
	public String getTranscriptionist(){
	   return this.transcriptionist;
	}
	public void setScheduledDateTime(String s){
	   this.scheduledDateTime = s;
	}
	public String getScheduledDateTime(){
	   return this.scheduledDateTime;
	}
	public void setNumberofSampleContainers(String s){
	   this.numberofSampleContainers = s;
	}
	public String getNumberofSampleContainers(){
	   return this.numberofSampleContainers;
	}
	public void setTransportLogisticsofCollectedSample(String s){
	   this.transportLogisticsofCollectedSample = s;
	}
	public String getTransportLogisticsofCollectedSample(){
	   return this.transportLogisticsofCollectedSample;
	}
	public void setCollectorsComment(String s){
	   this.collectorsComment = s;
	}
	public String getCollectorsComment(){
	   return this.collectorsComment;
	}
	public void setTransportArrangementResponsibility(String s){
	   this.transportArrangementResponsibility = s;
	}
	public String getTransportArrangementResponsibility(){
	   return this.transportArrangementResponsibility;
	}
	public void setTransportArranged(String s){
	   this.transportArranged = s;
	}
	public String getTransportArranged(){
	   return this.transportArranged;
	}
	public void setEscortRequired(String s){
	   this.escortRequired = s;
	}
	public String getEscortRequired(){
	   return this.escortRequired;
	}
	public void setPlannedPatientTransportComment(String s){
	   this.plannedPatientTransportComment = s;
	}
	public String getPlannedPatientTransportComment(){
	   return this.plannedPatientTransportComment;
	}
	public void setProcedureCode(String s){
	   this.procedureCode = s;
	}
	public String getProcedureCode(){
	   return this.procedureCode;
	}
	public void setProcedureCodeModifier(String s){
	   this.procedureCodeModifier = s;
	}
	public String getProcedureCodeModifier(){
	   return this.procedureCodeModifier;
	}
	public void setPlacerSupplementalServiceInformation(String s){
	   this.placerSupplementalServiceInformation = s;
	}
	public String getPlacerSupplementalServiceInformation(){
	   return this.placerSupplementalServiceInformation;
	}
	public void setFillerSupplementalServiceInformation(String s){
	   this.fillerSupplementalServiceInformation = s;
	}
	public String getFillerSupplementalServiceInformation(){
	   return this.fillerSupplementalServiceInformation;
	}
	public void setMedicallyNecessaryDuplicateProcedureReason(String s){
	   this.medicallyNecessaryDuplicateProcedureReason = s;
	}
	public String getMedicallyNecessaryDuplicateProcedureReason(){
	   return this.medicallyNecessaryDuplicateProcedureReason;
	}
	public void setResultHandling(String s){
	   this.resultHandling = s;
	}
	public String getResultHandling(){
	   return this.resultHandling;
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
