package com.gf.ny.src;

public class EnsembleConfiguration {

	private static int id;
	private static String environment;
	private static String production;
	private static String namespace;
	private static String category;
	private static String hl7Interface;
	private static String port;
	private static String enabled;
	private static String className;
	private static String lastRefresh;
	private static String remoteIp;
	
	public void setId(int i){
		this.id = i;
	}
	public int getId(){
		return this.id;
	}
	public void setEnvironment(String s){
	   this.environment = s;
	}
	public String getEnvironment(){
	   return this.environment;
	}
	public void setProduction(String s){
	   this.production = s;
	}
	public String getProduction(){
	   return this.production;
	}
	public void setNamespace(String s){
	   this.namespace = s;
	}
	public String getNamespace(){
	   return this.namespace;
	}
	public void setCategory(String s){
	   this.category = s;
	}
	public String getCategory(){
	   return this.category;
	}
	public void setHl7Interface(String s){
	   this.hl7Interface = s;
	}
	public String getHl7Interface(){
	   return this.hl7Interface;
	}
	public void setPort(String s){
	   this.port = s;
	}
	public String getPort(){
	   return this.port;
	}
	public void setEnabled(String s){
	   this.enabled = s;
	}
	public String getEnabled(){
	   return this.enabled;
	}
	public void setClassName(String s){
		this.className = s;
	}
	public String getClassName(){
		return this.className;
	}
	public void setLastRefresh(String s){
		this.lastRefresh = s;
	}
	public String getLastRefresh(){
		return this.lastRefresh;
	}
	public void setRemoteIp(String s){
		this.remoteIp = s;
	}
	public String getRemoteIp(){
		return this.remoteIp;
	}
}
