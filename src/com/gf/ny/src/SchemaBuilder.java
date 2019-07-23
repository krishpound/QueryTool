package com.gf.ny.src;
import java.util.*;

public class SchemaBuilder {
	
	
	private static ArrayList<String> messageList = new ArrayList<String>();
	private static ArrayList<SchemaObject> segmentObjList = new ArrayList<SchemaObject>();
	private static ArrayList<SchemaObject> masterObjList = new ArrayList<SchemaObject>();
	private static Map<String,Integer> messageSizeMap=new HashMap<String,Integer>();
	private static Map<String,Integer> segmentCountMap = new HashMap<String,Integer>();
	private static Map<String,Integer> messageCountMap = new HashMap<String,Integer>();
	private static Map<Integer,String> schemaMap = new HashMap<Integer,String>();
	private static String pattern;
	private static String message;
	private static String[] dataChunk;
	private static String[] segment;
	private static String lastSegment="";

	public void Analyze(){
		
		ArrayList<String> segmentsAtThisPosition = new ArrayList<String>();
		String segmentName;
		int segmentCount;
		int messageCount;
		
		for(String messageType : messageList){
			
			for (int i=0;i<messageSizeMap.get(messageType);i++){	
				///loop through pattern positions from 0 to maximum segments found in this type of message
				
				for (SchemaObject object : segmentObjList){
					if(object.getMessage().equalsIgnoreCase(messageType)){
						
						segmentName = object.getSegment();
						segmentCount = segmentCountMap.get(messageType+segmentName);
						messageCount = messageCountMap.get(messageType);
						
						System.out.println("SchemaBuilder/Analyze: "+segmentName+" occurs "+segmentCount+" times in "+messageCount+" messages.");
						
						
						
						if(object.getPosition()==i){
							if (!segmentsAtThisPosition.contains(i+":"+object.getSegment())) segmentsAtThisPosition.add(i+":"+object.getSegment()+"^");
						}
					}	
				}
			}
		}
	}
	
	public void Make(ArrayList<String> patternList, int route){
		
		System.out.println("SchemaBuilder: Hello");
		SchemaObject thisObj;
		SchemaObject lastObj;
		boolean repeatable=false;
		String key;
		
		try{
			
			for (String pattern : patternList){
				pattern = pattern.substring(0, pattern.length()-1);
				message = pattern.substring(0,7);
				dataChunk = pattern.split(":");
				segment = dataChunk[1].split("\\^");
				if(!messageList.contains(message)) messageList.add(message);
				lastObj=null;
			
				for (int i=0;i<segment.length;i++){
					
					key = message+segment[i];
					if(segmentCountMap.containsKey(key)){
						segmentCountMap.put(key, segmentCountMap.get(key) + 1);
						System.out.println("count for "+key+" incremented to "+segmentCountMap.get(key));
					} 
					else{
						segmentCountMap.put(key, 1);
					}
					if(messageCountMap.containsKey(message)){
						messageCountMap.put(message, messageCountMap.get(message) + 1);
						System.out.println("count for "+message+" incremented to "+messageCountMap.get(message));
					} 
					else{
						messageCountMap.put(message, 1);
					}
					System.out.println(segment[i]+" segment");
					thisObj = new SchemaObject();
					thisObj.setRoute(route);
					thisObj.setMessage(message);
					thisObj.setSegment(segment[i]);
					thisObj.setPosition(i);
					thisObj.setFollows(lastSegment);
					thisObj.setPatternLength(segment.length);
				
					if(lastObj!=null){
						repeatable  = (thisObj.getCompareValue().equalsIgnoreCase(lastObj.getCompareValue())) ? true:false;
						if (!lastObj.getRepeatable()){
							lastObj.setRepeatable(repeatable);
							System.out.println("add "+lastObj.getSegment()+" to schema with repeatable = "+lastObj.getRepeatable());
							segmentObjList.add(lastObj);
						}
						else{
							System.out.println("remove duplicate "+lastObj.getSegment()+" from schema");
						}
					}
				
					lastObj = new SchemaObject();
					lastObj.setRoute(route);
					lastObj.setMessage(message);
					lastObj.setSegment(segment[i]);
					lastObj.setPosition(i);
					lastObj.setFollows(lastSegment);
					lastObj.setPatternLength(segment.length);
					lastObj.setRepeatable(repeatable);
					
				}
		
				if(lastObj!=null){
					if (!lastObj.getRepeatable()){
						System.out.println("add "+lastObj.getSegment()+" to schema with repeatable = "+lastObj.getRepeatable());
						segmentObjList.add(lastObj);
					}
					else{
						System.out.println("remove duplicate "+lastObj.getSegment()+" from schema");
					}
				}
			
				if(messageSizeMap.containsKey(message)){if(segment.length > messageSizeMap.get(message)) messageSizeMap.put(message, segment.length);}
				else{messageSizeMap.put(message, segment.length);}
			}
		
			Analyze();
		
			System.out.println("SchemaBuilder: reviewed "+messageList.size()+" message types for route "+route);
			for (String m : messageList) System.out.println("SchemaBuilder: "+m);
			System.out.println("SchemaBuilder: Bye\n");
		
		}
		catch(Exception e){
			System.out.println("SchemaBuilder exception");
			e.printStackTrace();
		}
	}
}
	

