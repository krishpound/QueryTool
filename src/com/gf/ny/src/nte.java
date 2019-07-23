package com.gf.ny.src;

public class nte {
	
	private static int id;
	private static String setID;
	private static String sourceofComment;
	private static String comment;
	private static String commentType;
	private static int route;
	private static String segment;
	private static String messagebodyid;
	
	public void init(){
		
		this.setID="";
		this.sourceofComment="";
		this.comment="";
		this.commentType="";
		this.route=0;
		this.segment="nte";
		this.messagebodyid="";
		
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
	public void setSourceofComment(String s){
	   this.sourceofComment = s;
	}
	public String getSourceofComment(){
	   return this.sourceofComment;
	}
	public void setComment(String s){
	   this.comment = s;
	}
	public String getComment(){
	   return this.comment;
	}
	public void setCommentType(String s){
	   this.commentType = s;
	}
	public String getCommentType(){
	   return this.commentType;
	}
	public void setRoute(int i){
	   this.route = i;
	}
	public int getRoute(){
	   return this.route;
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


}
