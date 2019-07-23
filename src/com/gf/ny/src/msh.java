package com.gf.ny.src;

public class msh {
    
	private static int id;
    private static String sendingApp;
    private static String sendingFacility;
    private static String receivingApp;
    private static String receivingFacility;
    private static String datetimeOfMessage;
    private static String messageType;
    private static String messageControlId;
    private static String processingId;
    private static String versionId;
    private static String segment;
	private static String messageBodyId;
	private static int route;
	
	public void init(){
		
		this.sendingApp="";
		this.sendingFacility="";
		this.receivingApp="";
		this.receivingFacility="";
		this.datetimeOfMessage="";
		this.messageType="";
		this.messageControlId="";
		this.processingId="";
		this.versionId="";
		this.segment="msh";
		this.messageBodyId="";
		this.route=0;
		
	}
    
    public msh() {}
    public int getId() {
        return id;
    }
    public void setId(int i) {
        this.id = i;
    }
    public void setSendingApp(String s){
    	this.sendingApp = s;
    }
    public String getSendingApp(){
    	return this.sendingApp;
    }
    public void setSendingFacility(String s){
    	this.sendingFacility = s;
    }
    public String getSendingFacility(){
    	return this.sendingFacility;
    }
    public void setReceivingApp(String s){
    	this.receivingApp = s;
    }
    public String getReceivingApp(){
    	return this.receivingApp;
    }
    public void setReceivingFacility(String s){
    	this.receivingFacility = s;
    }
    public String getReceivingFacility(){
    	return this.receivingFacility;
    }
    public void setDatetimeOfMessage(String s){
    	this.datetimeOfMessage = s;
    }
    public String getDatetimeOfMessage(){
    	return this.datetimeOfMessage;
    }
    public void setMessageType(String s){
    	this.messageType = s;
    }
    public String getMessageType(){
    	return this.messageType;
    }
    public void setMessageControlId(String s){
    	this.messageControlId = s;
    }
    public String getMessageControlId(){
    	return this.messageControlId;
    }
    public void setProcessingId(String s){
    	this.processingId = s;
    }
    public String getProcessingId(){
    	return this.processingId;
    }
    public void setVersionId(String s){
    	this.versionId = s;
    }
    public String getVersionId(){
    	return this.versionId;
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