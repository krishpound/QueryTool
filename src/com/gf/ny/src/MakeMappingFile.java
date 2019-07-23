package com.gf.ny.src;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.LineNumberReader;
import java.io.PrintStream;

public class MakeMappingFile {

	private static String ipath = "C:/Home/Query Tool/segments/";
	private static String opath = "C:/Home/Query Tool/mapping files/";
	private static String inputFile = "NK1.txt";
	private static String outputFile = "NK1hibernatemappings.txt";
	private static String tableName="nk1";
	private static LineNumberReader lnr;
	private static FileOutputStream fos;
	private static PrintStream ps;
	private static String readLine;
	private static String db_var;
	private static String java_var;
	private static String firstLetter,remainder;
	
	public static void main(String[] args) {
		
try{
			
			lnr = new LineNumberReader(new FileReader(ipath+inputFile));
			fos = new FileOutputStream(opath+outputFile);
			ps = new PrintStream(fos);
			 
			
			ps.println("<?xml version='1.0' encoding='UTF-8'?>");
			ps.println("<!DOCTYPE hibernate-mapping PUBLIC '-//Hibernate/Hibernate Mapping DTD 3.0//EN' 'http://www.hibernate.org/dtd/hibernate-mapping-3.0.dtd'>");
			ps.println("<hibernate-mapping>");
			ps.println("  <class name='com.gf.ny.src."+tableName+"' table='"+tableName+"'>");
			ps.println("  <id name='id' type='int' column='id'><generator class='increment'/></id>");
			
		
			readLine = lnr.readLine();
			
			while(readLine != null){
				
				db_var = readLine.toLowerCase().replaceAll(" ", "_");
				
				String[] tokens = readLine.split(" ");
				
				for(int i=0;i<tokens.length;i++){
					
					if(i==0){
						firstLetter = tokens[i].substring(0,1).toLowerCase();
						remainder = tokens[i].substring(1);
						java_var = firstLetter+remainder;
					}
					else{
						java_var = java_var + tokens[i];
					}
				}
				
				ps.println("  <property name='"+java_var+"' column='"+db_var+"'/>");
				
				readLine = lnr.readLine();
				
			}
			
			//ps.println("  <property name='messageControlId' column='messagecontrolid'/>");
			//ps.println("  <property name='hl7Interface' column='interface'/>");
			ps.println("</class>");
			ps.println("</hibernate-mapping>");
			
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
