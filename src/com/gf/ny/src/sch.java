package com.gf.ny.src;

public class sch {

	private static int id;
	private static String placerAppointmentID;
	private static String fillerAppointmentID;
	private static String occurrenceNumber;
	private static String placerGroupNumber;
	private static String scheduleID;
	private static String eventReason;
	private static String appointmentReason;
	private static String appointmentType;
	private static String appointmentDuration;
	private static String appointmentDurationUnits;
	private static String appointmentTimingQuantity;
	private static String placerContactPerson;
	private static String placerContactPhoneNumber;
	private static String placerContactAddress;
	private static String placerContactLocation;
	private static String fillerContactPerson;
	private static String fillerContactPhoneNumber;
	private static String fillerContactAddress;
	private static String fillerContactLocation;
	private static String enteredByPerson;
	private static String enteredByPhoneNumber;
	private static String enteredByLocation;
	private static String parentPlacerAppointmentID;
	private static String parentFillerAppointmentID;
	private static String fillerStatusCode;
	private static String placerOrderNumber;
	private static String fillerOrderNumber;
	private static String messageControlId;
	private static String hl7Interface;
	
	public void init(){
		
		this.placerAppointmentID="";
		this.fillerAppointmentID="";
		this.occurrenceNumber="";
		this.placerGroupNumber="";
		this.scheduleID="";
		this.eventReason="";
		this.appointmentReason="";
		this.appointmentType="";
		this.appointmentDuration="";
		this.appointmentDurationUnits="";
		this.appointmentTimingQuantity="";
		this.placerContactPerson="";
		this.placerContactPhoneNumber="";
		this.placerContactAddress="";
		this.placerContactLocation="";
		this.fillerContactPerson="";
		this.fillerContactPhoneNumber="";
		this.fillerContactAddress="";
		this.fillerContactLocation="";
		this.enteredByPerson="";
		this.enteredByPhoneNumber="";
		this.enteredByLocation="";
		this.parentPlacerAppointmentID="";
		this.parentFillerAppointmentID="";
		this.fillerStatusCode="";
		this.placerOrderNumber="";
		this.fillerOrderNumber="";
		this.messageControlId="";
		this.hl7Interface="";
		
	}
	
	public void setId(int i){
		this.id = i;
	}
	public int getId(){
		return this.id;
	}
	public void setPlacerAppointmentID(String s){
	   this.placerAppointmentID = s;
	}
	public String getPlacerAppointmentID(){
	   return this.placerAppointmentID;
	}
	public void setFillerAppointmentID(String s){
	   this.fillerAppointmentID = s;
	}
	public String getFillerAppointmentID(){
	   return this.fillerAppointmentID;
	}
	public void setOccurrenceNumber(String s){
	   this.occurrenceNumber = s;
	}
	public String getOccurrenceNumber(){
	   return this.occurrenceNumber;
	}
	public void setPlacerGroupNumber(String s){
	   this.placerGroupNumber = s;
	}
	public String getPlacerGroupNumber(){
	   return this.placerGroupNumber;
	}
	public void setScheduleID(String s){
	   this.scheduleID = s;
	}
	public String getScheduleID(){
	   return this.scheduleID;
	}
	public void setEventReason(String s){
	   this.eventReason = s;
	}
	public String getEventReason(){
	   return this.eventReason;
	}
	public void setAppointmentReason(String s){
	   this.appointmentReason = s;
	}
	public String getAppointmentReason(){
	   return this.appointmentReason;
	}
	public void setAppointmentType(String s){
	   this.appointmentType = s;
	}
	public String getAppointmentType(){
	   return this.appointmentType;
	}
	public void setAppointmentDuration(String s){
	   this.appointmentDuration = s;
	}
	public String getAppointmentDuration(){
	   return this.appointmentDuration;
	}
	public void setAppointmentDurationUnits(String s){
	   this.appointmentDurationUnits = s;
	}
	public String getAppointmentDurationUnits(){
	   return this.appointmentDurationUnits;
	}
	public void setAppointmentTimingQuantity(String s){
	   this.appointmentTimingQuantity = s;
	}
	public String getAppointmentTimingQuantity(){
	   return this.appointmentTimingQuantity;
	}
	public void setPlacerContactPerson(String s){
	   this.placerContactPerson = s;
	}
	public String getPlacerContactPerson(){
	   return this.placerContactPerson;
	}
	public void setPlacerContactPhoneNumber(String s){
	   this.placerContactPhoneNumber = s;
	}
	public String getPlacerContactPhoneNumber(){
	   return this.placerContactPhoneNumber;
	}
	public void setPlacerContactAddress(String s){
	   this.placerContactAddress = s;
	}
	public String getPlacerContactAddress(){
	   return this.placerContactAddress;
	}
	public void setPlacerContactLocation(String s){
	   this.placerContactLocation = s;
	}
	public String getPlacerContactLocation(){
	   return this.placerContactLocation;
	}
	public void setFillerContactPerson(String s){
	   this.fillerContactPerson = s;
	}
	public String getFillerContactPerson(){
	   return this.fillerContactPerson;
	}
	public void setFillerContactPhoneNumber(String s){
	   this.fillerContactPhoneNumber = s;
	}
	public String getFillerContactPhoneNumber(){
	   return this.fillerContactPhoneNumber;
	}
	public void setFillerContactAddress(String s){
	   this.fillerContactAddress = s;
	}
	public String getFillerContactAddress(){
	   return this.fillerContactAddress;
	}
	public void setFillerContactLocation(String s){
	   this.fillerContactLocation = s;
	}
	public String getFillerContactLocation(){
	   return this.fillerContactLocation;
	}
	public void setEnteredByPerson(String s){
	   this.enteredByPerson = s;
	}
	public String getEnteredByPerson(){
	   return this.enteredByPerson;
	}
	public void setEnteredByPhoneNumber(String s){
	   this.enteredByPhoneNumber = s;
	}
	public String getEnteredByPhoneNumber(){
	   return this.enteredByPhoneNumber;
	}
	public void setEnteredByLocation(String s){
	   this.enteredByLocation = s;
	}
	public String getEnteredByLocation(){
	   return this.enteredByLocation;
	}
	public void setParentPlacerAppointmentID(String s){
	   this.parentPlacerAppointmentID = s;
	}
	public String getParentPlacerAppointmentID(){
	   return this.parentPlacerAppointmentID;
	}
	public void setParentFillerAppointmentID(String s){
	   this.parentFillerAppointmentID = s;
	}
	public String getParentFillerAppointmentID(){
	   return this.parentFillerAppointmentID;
	}
	public void setFillerStatusCode(String s){
	   this.fillerStatusCode = s;
	}
	public String getFillerStatusCode(){
	   return this.fillerStatusCode;
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
