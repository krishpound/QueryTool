package com.gf.ny.src;

public class orc {
    
	private static int id;
	private static String orderControl;
	private static String placerOrderNumber;
	private static String fillerOrderNumber;
	private static String placerGroupNumber;
	private static String orderStatus;
	private static String responseFlag;
	private static String quantityTiming;
	private static String parent;
	private static String dateTimeofTransaction;
	private static String enteredBy;
	private static String verifiedBy;
	private static String orderingProvider;
	private static String entererLocation;
	private static String callBackPhoneNumber;
	private static String orderEffectiveDateTime;
	private static String orderControlCodeReason;
	private static String enteringOrganization;
	private static String enteringDevice;
	private static String actionBy;
	private static String advancedBeneficiaryNoticeCode;
	private static String orderingFacilityName;
	private static String orderingFacilityAddress;
	private static String orderingFacilityPhoneNumber;
	private static String orderingProviderAddress;
	private static String orderStatusModifier;
	private static String advancedBeneficiaryNoticeOverrideReason;
	private static String fillerExpectedAvailabilityDateTime;
	private static String confidentialityCode;
	private static String orderType;
	private static String entererAuthorizationMode;
	private static String segment;
	private static String messageBodyId;
	private static int route;
	
	
	public void init(){
		
		this.orderControl="";
		this.placerOrderNumber="";
		this.fillerOrderNumber="";
		this.placerGroupNumber="";
		this.orderStatus="";
		this.responseFlag="";
		this.quantityTiming="";
		this.parent="";
		this.dateTimeofTransaction="";
		this.enteredBy="";
		this.verifiedBy="";
		this.orderingProvider="";
		this.entererLocation="";
		this.callBackPhoneNumber="";
		this.orderEffectiveDateTime="";
		this.orderControlCodeReason="";
		this.enteringOrganization="";
		this.enteringDevice="";
		this.actionBy="";
		this.advancedBeneficiaryNoticeCode="";
		this.orderingFacilityName="";
		this.orderingFacilityAddress="";
		this.orderingFacilityPhoneNumber="";
		this.orderingProviderAddress="";
		this.orderStatusModifier="";
		this.advancedBeneficiaryNoticeOverrideReason="";
		this.fillerExpectedAvailabilityDateTime="";
		this.confidentialityCode="";
		this.orderType="";
		this.segment="orc";
		this.messageBodyId="";
		this.route=0;
		
	}
	
	public void setId(int i){
		this.id = i;
	}
	public int getId(){
		return this.id;
	}
	public void setOrderControl(String s){
	   this.orderControl = s;
	}
	public String getOrderControl(){
	   return this.orderControl;
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
	public void setPlacerGroupNumber(String s){
	   this.placerGroupNumber = s;
	}
	public String getPlacerGroupNumber(){
	   return this.placerGroupNumber;
	}
	public void setOrderStatus(String s){
	   this.orderStatus = s;
	}
	public String getOrderStatus(){
	   return this.orderStatus;
	}
	public void setResponseFlag(String s){
	   this.responseFlag = s;
	}
	public String getResponseFlag(){
	   return this.responseFlag;
	}
	public void setQuantityTiming(String s){
	   this.quantityTiming = s;
	}
	public String getQuantityTiming(){
	   return this.quantityTiming;
	}
	public void setParent(String s){
	   this.parent = s;
	}
	public String getParent(){
	   return this.parent;
	}
	public void setDateTimeofTransaction(String s){
	   this.dateTimeofTransaction = s;
	}
	public String getDateTimeofTransaction(){
	   return this.dateTimeofTransaction;
	}
	public void setEnteredBy(String s){
	   this.enteredBy = s;
	}
	public String getEnteredBy(){
	   return this.enteredBy;
	}
	public void setVerifiedBy(String s){
	   this.verifiedBy = s;
	}
	public String getVerifiedBy(){
	   return this.verifiedBy;
	}
	public void setOrderingProvider(String s){
	   this.orderingProvider = s;
	}
	public String getOrderingProvider(){
	   return this.orderingProvider;
	}
	public void setEntererLocation(String s){
	   this.entererLocation = s;
	}
	public String getEntererLocation(){
	   return this.entererLocation;
	}
	public void setCallBackPhoneNumber(String s){
	   this.callBackPhoneNumber = s;
	}
	public String getCallBackPhoneNumber(){
	   return this.callBackPhoneNumber;
	}
	public void setOrderEffectiveDateTime(String s){
	   this.orderEffectiveDateTime = s;
	}
	public String getOrderEffectiveDateTime(){
	   return this.orderEffectiveDateTime;
	}
	public void setOrderControlCodeReason(String s){
	   this.orderControlCodeReason = s;
	}
	public String getOrderControlCodeReason(){
	   return this.orderControlCodeReason;
	}
	public void setEnteringOrganization(String s){
	   this.enteringOrganization = s;
	}
	public String getEnteringOrganization(){
	   return this.enteringOrganization;
	}
	public void setEnteringDevice(String s){
	   this.enteringDevice = s;
	}
	public String getEnteringDevice(){
	   return this.enteringDevice;
	}
	public void setActionBy(String s){
	   this.actionBy = s;
	}
	public String getActionBy(){
	   return this.actionBy;
	}
	public void setAdvancedBeneficiaryNoticeCode(String s){
	   this.advancedBeneficiaryNoticeCode = s;
	}
	public String getAdvancedBeneficiaryNoticeCode(){
	   return this.advancedBeneficiaryNoticeCode;
	}
	public void setOrderingFacilityName(String s){
	   this.orderingFacilityName = s;
	}
	public String getOrderingFacilityName(){
	   return this.orderingFacilityName;
	}
	public void setOrderingFacilityAddress(String s){
	   this.orderingFacilityAddress = s;
	}
	public String getOrderingFacilityAddress(){
	   return this.orderingFacilityAddress;
	}
	public void setOrderingFacilityPhoneNumber(String s){
	   this.orderingFacilityPhoneNumber = s;
	}
	public String getOrderingFacilityPhoneNumber(){
	   return this.orderingFacilityPhoneNumber;
	}
	public void setOrderingProviderAddress(String s){
	   this.orderingProviderAddress = s;
	}
	public String getOrderingProviderAddress(){
	   return this.orderingProviderAddress;
	}
	public void setOrderStatusModifier(String s){
	   this.orderStatusModifier = s;
	}
	public String getOrderStatusModifier(){
	   return this.orderStatusModifier;
	}
	public void setAdvancedBeneficiaryNoticeOverrideReason(String s){
	   this.advancedBeneficiaryNoticeOverrideReason = s;
	}
	public String getAdvancedBeneficiaryNoticeOverrideReason(){
	   return this.advancedBeneficiaryNoticeOverrideReason;
	}
	public void setFillerExpectedAvailabilityDateTime(String s){
	   this.fillerExpectedAvailabilityDateTime = s;
	}
	public String getFillerExpectedAvailabilityDateTime(){
	   return this.fillerExpectedAvailabilityDateTime;
	}
	public void setConfidentialityCode(String s){
	   this.confidentialityCode = s;
	}
	public String getConfidentialityCode(){
	   return this.confidentialityCode;
	}
	public void setOrderType(String s){
	   this.orderType = s;
	}
	public String getOrderType(){
	   return this.orderType;
	}
	public void setEntererAuthorizationMode(String s){
	   this.entererAuthorizationMode = s;
	}
	public String getEntererAuthorizationMode(){
	   return this.entererAuthorizationMode;
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