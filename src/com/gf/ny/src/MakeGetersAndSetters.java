package com.gf.ny.src;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.LineNumberReader;
import java.io.PrintStream;

public class MakeGetersAndSetters {

	private static String ipath = "C:/Home/Query Tool/segments/";
	private static String opath = "C:/Home/Query Tool/getters and setters/";
	private static String inputFile = "NK1.txt";
	private static String outputFile = "NK1gettersAndSetters.txt";
	private static LineNumberReader lnr;
	private static FileOutputStream fos;
	private static PrintStream ps;
	private static String readLine;
	private static String var,var2;
	
	public static void main(String[] args) {
		
try{
			
			lnr = new LineNumberReader(new FileReader(ipath+inputFile));	
			fos = new FileOutputStream(opath+outputFile);
			ps = new PrintStream(fos);
			
			ps.println("public void setId(int i){");
			ps.println("	this.id = i;");
			ps.println("}");
			ps.println("public int getId(){");
			ps.println("	return this.id;");
			ps.println("}");
			
			readLine = lnr.readLine();
			
			while(readLine != null){
				
				var = readLine.substring(0,1).toUpperCase();
				var = var + readLine.substring(1).replaceAll(" ", "");
				
				var2 = readLine.substring(0,1).toLowerCase();
				var2 = var2 + readLine.substring(1).replaceAll(" ", "");
				
				ps.println("public void set"+var+"(String s){");
				ps.println("   this."+var2+" = s;");
				ps.println("}");
				ps.println("public String get"+var+"(){");
				ps.println("   return this."+var2+";");
				ps.println("}");
				
				readLine = lnr.readLine();
				
			}
			
			//ps.println("public void setMessageControlId(String s){");
			//ps.println("	this.messageControlId = s;");
		    //ps.println("}");
		    //ps.println("public String getMessageControlId(){");
		    //ps.println("	return this.messageControlId;");
		    //ps.println("}");
		    //ps.println("public void setHl7Interface(String s){");
		    //ps.println("	this.hl7Interface = s;");
		    //ps.println("}");
		    //ps.println("public String getHl7Interface(){");
		    //ps.println("	return this.hl7Interface;");
		    //ps.println("}");
			
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
