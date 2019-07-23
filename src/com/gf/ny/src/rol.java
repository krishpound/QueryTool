package com.gf.ny.src;

public class rol {

	private static int id;
	private static String roleInstanceID;
	private static String actionCode;
	private static String role;
	private static String rolePerson;
	private static String roleBeginDateTime;
	private static String roleEndDateTime;
	private static String roleDuration;
	private static String roleActionReason;
	private static String providerType;
	private static String organizationUnitType;
	private static String officeHomeAddressBirthplace;
	private static String phone;
	private static String segment;
	private static String messagebodyid;
	private static int route;
	
	
	public void init(){
		
		this.roleInstanceID="";
		this.actionCode="";
		this.role="";
		this.rolePerson="";
		this.roleBeginDateTime="";
		this.roleEndDateTime="";
		this.roleDuration="";
		this.roleActionReason="";
		this.providerType="";
		this.organizationUnitType="";
		this.officeHomeAddressBirthplace="";
		this.phone="";
		this.segment="rol";
		this.messagebodyid="";
		this.route=0;
	
	}
	
	public void setId(int i){
		this.id = i;
	}
	public int getId(){
		return this.id;
	}
	public void setRoleInstanceID(String s){
	   this.roleInstanceID = s;
	}
	public String getRoleInstanceID(){
	   return this.roleInstanceID;
	}
	public void setActionCode(String s){
	   this.actionCode = s;
	}
	public String getActionCode(){
	   return this.actionCode;
	}
	public void setRole(String s){
	   this.role = s;
	}
	public String getRole(){
	   return this.role;
	}
	public void setRolePerson(String s){
	   this.rolePerson = s;
	}
	public String getRolePerson(){
	   return this.rolePerson;
	}
	public void setRoleBeginDateTime(String s){
	   this.roleBeginDateTime = s;
	}
	public String getRoleBeginDateTime(){
	   return this.roleBeginDateTime;
	}
	public void setRoleEndDateTime(String s){
	   this.roleEndDateTime = s;
	}
	public String getRoleEndDateTime(){
	   return this.roleEndDateTime;
	}
	public void setRoleDuration(String s){
	   this.roleDuration = s;
	}
	public String getRoleDuration(){
	   return this.roleDuration;
	}
	public void setRoleActionReason(String s){
	   this.roleActionReason = s;
	}
	public String getRoleActionReason(){
	   return this.roleActionReason;
	}
	public void setProviderType(String s){
	   this.providerType = s;
	}
	public String getProviderType(){
	   return this.providerType;
	}
	public void setOrganizationUnitType(String s){
	   this.organizationUnitType = s;
	}
	public String getOrganizationUnitType(){
	   return this.organizationUnitType;
	}
	public void setOfficeHomeAddressBirthplace(String s){
	   this.officeHomeAddressBirthplace = s;
	}
	public String getOfficeHomeAddressBirthplace(){
	   return this.officeHomeAddressBirthplace;
	}
	public void setPhone(String s){
	   this.phone = s;
	}
	public String getPhone(){
	   return this.phone;
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
