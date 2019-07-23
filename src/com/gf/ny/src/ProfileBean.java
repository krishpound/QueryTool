package com.gf.ny.src;

public class ProfileBean {

	private int id;
	private int route;
	private String environment;
	private String namespace;
	private String sourceConfig;
	private String targetConfig;
	private String frequency;   
	private String cacheSql;
	private String lastRefresh;
	private String connection;
	
	public void setId(int i){
		this.id = i;
	}
	public int getId(){
		return this.id;
	}
	public void setRoute(int i){
		this.route = i;
	}
	public int getRoute(){
		return this.route;
	}
	public void setEnvironment(String s){
	   this.environment = s;
	}
	public String getEnvironment(){
	   return this.environment;
	}
	public void setNamespace(String s){
	   this.namespace = s;
	}
	public String getNamespace(){
	   return this.namespace;
	}
	public void setSourceConfig(String s){
		this.sourceConfig = s;
	}
	public String getSourceConfig(){
		 return this.sourceConfig;
	}
	public void setTargetConfig(String s){
		this.targetConfig = s;
	}
	public String getTargetConfig(){
		 return this.targetConfig;
	}
	public void setFrequency(String s){
		this.frequency = s;
	}
	public String getFrequency(){
		 return this.frequency;
	}
	public void setCacheSql(String s){
		s = s.replaceAll("\"", "'");
		this.cacheSql = s;
	}
	public String getCacheSql(){
		 return this.cacheSql;
	}
	public void setLastRefresh(String s){
		this.lastRefresh = s;
	}
	public String getLastRefresh(){
		 return this.lastRefresh;
	}	
	public void setConnection(String s){
		this.connection = s;
	}
	public String getConnection(){
		return this.getEnvironment()+"_"+this.getNamespace();
	}	
}
