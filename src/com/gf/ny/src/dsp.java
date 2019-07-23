package com.gf.ny.src;

public class dsp {

	private static int id;
	private static String setId;
	private static String displayLevel;
	private static String dataLine;
	private static String logicalBreakPoint; 
	private static String resultId;
	private static String messageControlId;
	private static String iguanaInterface;
	
	public void init(){
		
		this.setId="";
		this.displayLevel="";
		this.dataLine="";
		this.logicalBreakPoint=""; 
		this.resultId="";
		this.messageControlId="";
		this.iguanaInterface="";
		
	}
	
	public dsp() {}
    public int getId(){
        return id;
    }
    public void setId(int i) {
        id = i;
    }
	public void setSetId(String s){
		setId = s;
	}
	public String getSetId(){
		return setId;
	}
	public void setDisplayLevel(String s){
		displayLevel = s;
	}
	public String getDisplayLevel(){
		return displayLevel;
	}
	public void setDataLine(String s){
		dataLine = s;
	}
	public String getDataLine(){
		return dataLine;
	}
	public void setLogicalBreakPoint(String s){
		logicalBreakPoint = s;
	}
	public String getLogicalBreakPoint(){
		return logicalBreakPoint;
	}
	public void setResultId(String s){
		resultId = s;
	}
	public String getResultId(){
		return resultId;
	}
	public void setMessageControlId(String s){
		messageControlId = s;
	}
	public String getMessageControlId(){
		return messageControlId;
	}
	public void setIguanaInterface(String s){
		iguanaInterface = s;
	}
	public String getIguanaInterface(){
		return iguanaInterface;
	}
}
