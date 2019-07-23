package com.gf.ny.src;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.LineNumberReader;
import java.io.PrintStream;

public class Step1FixHl7Names {

	private static String path = "c:\\home\\chithra\\";
	private static String inputFile = "IN3.txt";
	private static String outputFile = "IN3Fixed.txt";
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
			
			while(readLine != null){
				
				var = readLine.replaceAll("-", "").replaceAll("_", "").replaceAll("/", "").replaceAll("\\.","").replaceAll(" ", "");
				ps.println(var);
				readLine = lnr.readLine();
				
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
