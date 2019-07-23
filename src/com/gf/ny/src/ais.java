package com.gf.ny.src;

public class ais {

	private static int id;
	private static String setID;
	private static String segmentActionCode;
	private static String universalServiceIdentifier;
	private static String startDateTime;
	private static String startDateTimeOffset;
	private static String startDateTimeOffsetUnits;
	private static String duration;
	private static String durationUnits;
	private static String allowSubstitutionCode;
	private static String fillerStatusCode;
	private static String placerSupplementalServiceInformation;
	private static String fillerSupplementalServiceInformation;
	private static String messageControlId;
	private static String hl7Interface;
	
	public void init(){
		
		this.setID="";
		this.segmentActionCode="";
		this.universalServiceIdentifier="";
		this.startDateTime="";
		this.startDateTimeOffset="";
		this.startDateTimeOffsetUnits="";
		this.duration="";
		this.durationUnits="";
		this.allowSubstitutionCode="";
		this.fillerStatusCode="";
		this.placerSupplementalServiceInformation="";
		this.fillerSupplementalServiceInformation="";
		this.messageControlId="";
		this.hl7Interface="";
		
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
	public void setSegmentActionCode(String s){
	   this.segmentActionCode = s;
	}
	public String getSegmentActionCode(){
	   return this.segmentActionCode;
	}
	public void setUniversalServiceIdentifier(String s){
	   this.universalServiceIdentifier = s;
	}
	public String getUniversalServiceIdentifier(){
	   return this.universalServiceIdentifier;
	}
	public void setStartDateTime(String s){
	   this.startDateTime = s;
	}
	public String getStartDateTime(){
	   return this.startDateTime;
	}
	public void setStartDateTimeOffset(String s){
	   this.startDateTimeOffset = s;
	}
	public String getStartDateTimeOffset(){
	   return this.startDateTimeOffset;
	}
	public void setStartDateTimeOffsetUnits(String s){
	   this.startDateTimeOffsetUnits = s;
	}
	public String getStartDateTimeOffsetUnits(){
	   return this.startDateTimeOffsetUnits;
	}
	public void setDuration(String s){
	   this.duration = s;
	}
	public String getDuration(){
	   return this.duration;
	}
	public void setDurationUnits(String s){
	   this.durationUnits = s;
	}
	public String getDurationUnits(){
	   return this.durationUnits;
	}
	public void setAllowSubstitutionCode(String s){
	   this.allowSubstitutionCode = s;
	}
	public String getAllowSubstitutionCode(){
	   return this.allowSubstitutionCode;
	}
	public void setFillerStatusCode(String s){
	   this.fillerStatusCode = s;
	}
	public String getFillerStatusCode(){
	   return this.fillerStatusCode;
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
	public void setMessageControlId(String s){
		this.messageControlId = s;
	}
	public String getMessageControlId(){
		return this.messageControlId;
	}
	public void setHl7Interface(String s){
		this.hl7Interface = s;
	}
	public String getHl7Interface(){
		return this.hl7Interface;
	}

	
}
