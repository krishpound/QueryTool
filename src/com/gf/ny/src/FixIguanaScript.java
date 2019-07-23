package com.gf.ny.src;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.LineNumberReader;
import java.io.PrintStream;

public class FixIguanaScript {

	private static String path = "C:\\home\\AlegentCreighton\\scripts\\";
	private static String inputFile = "cma_outbound_cerner_oldside.txt";
	private static String outputFile = "cma_outbound_cerner_newside.txt";
	private static LineNumberReader lnr;
	private static FileOutputStream fos;
	private static PrintStream ps;
	private static String readLine;
	private static String var;
	
	public static void main(String[] args) {
		
try{
			
			lnr = new LineNumberReader(new FileReader(path+inputFile));	
			fos = new FileOutputStream(path+outputFile);
			ps = new PrintStream(fos);
			 
			readLine = lnr.readLine();
			
			int x=1;
			
			while(readLine != null){
				
				
				
				ps.println("\t"+readLine);
				readLine = lnr.readLine();
				x++;
				
			}
		
			System.out.println("Input file contains "+x+" lines.");
			
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
