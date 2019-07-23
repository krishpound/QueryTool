package com.gf.ny.src;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.LineNumberReader;
import java.io.PrintStream;
import java.util.Hashtable;
import java.util.Enumeration;

public class SpecimenSourceMapping {

	private static String path = "c:\\home\\alegentcreighton\\profiling\\";
	private static String inputFile = "TEST_BT_MICRO_UNPROCESSED.txt";
	private static String outputFile = "TEST_BT_MICRO_PROCESSED.txt";
	private static LineNumberReader lnr;
	private static FileOutputStream fos;
	private static PrintStream ps;
	private static String readLine;
	private static String[] fields;
	private static String db_var;
	private static String java_var;
	private static String firstLetter,remainder;
	private static String segmentId,lastSegmentId,setId,lastSetId,observationId,observationValue;
	private static Hashtable hashtable = new Hashtable();
	
	public static void main(String[] args) {
		
try{
			
			lnr = new LineNumberReader(new FileReader(path+inputFile));	
			fos = new FileOutputStream(path+outputFile);
			ps = new PrintStream(fos);
			 
			readLine = lnr.readLine();
			
			while(readLine != null){
				
				fields = readLine.split("\\|");
				segmentId = fields[0];
				setId = fields[1];
				
				if(segmentId.equalsIgnoreCase("OBX")){
					
					observationId = fields[3];
					observationValue = fields[5];
					
					if(lastSegmentId.equalsIgnoreCase("OBR")){
						
						if(observationId.contains("^MICSOURCE^")){
							
							hashtable.put(lastSetId,observationValue);
							
						}
					}
					
				}
				
				if(!segmentId.equalsIgnoreCase("OBX")){
					lastSegmentId = segmentId;
					lastSetId = setId;
				}
				
				readLine = lnr.readLine();
				
			}
			
			System.out.println("hashtable has "+hashtable.size()+" entries.");
			
			System.out.println("Retrieving all keys from the Hashtable");
		       
	        Enumeration e = hashtable.keys();
	       
	        while( e. hasMoreElements() ){        
	            System.out.println(e.nextElement());
	        }
			
	        System.out.println("Retrieving all values from the Hashtable");
	        
	        e = hashtable.elements();
	       
	        while(e. hasMoreElements()){        
	            System.out.println(e.nextElement());    
	        }
			
		
		}
		catch(FileNotFoundException fnfe){
			fnfe.printStackTrace();
		}
		catch(Exception e){
			e.printStackTrace();
		}
		finally{
			try{
				System.out.println("Closing streams...");
				ps.close();
				fos.close();
				lnr.close();
			}
			catch(IOException ioe){
				ioe.printStackTrace();
			}
		}
		
		System.out.println("All done.");
	
	}
}
