package com.gf.ny.src;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.LineNumberReader;
import java.io.PrintStream;

public class MakeVariables {

	private static String ipath = "C:/Home/Query Tool/segments/";
	private static String opath = "C:/Home/Query Tool/variables/";
	private static String inputFile = "NK1.txt";
	private static String outputFile = "NK1variables.txt";
	private static LineNumberReader lnr;
	private static FileOutputStream fos;
	private static PrintStream ps;
	private static String readLine;
	private static String var;
	private static String firstLetter;
	private static String remainder;
	private static String output;
	
	public static void main(String[] args) {
		
try{
			
			lnr = new LineNumberReader(new FileReader(ipath+inputFile));	
			fos = new FileOutputStream(opath+outputFile);
			ps = new PrintStream(fos);
			 
			readLine = lnr.readLine();
			
			ps.println("private static int id;");
			
			while(readLine != null){
				
				String[] tokens = readLine.split(" ");
				
				for(int i=0;i<tokens.length;i++){
					
					if(i==0){
						firstLetter = tokens[i].substring(0,1).toLowerCase();
						remainder = tokens[i].substring(1);
						output = firstLetter+remainder;
					}
					else{
						output = output + tokens[i];
					}
					
					
				}
				ps.println("private static String "+output+";");
				//ps.println("    this."+output+"=\"\";");
				
				
				readLine = lnr.readLine();
				
			}
			
			ps.println("private static String messagebodyid;");
			ps.println("private static String segment;");
			ps.println("private static int route;");
		
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
