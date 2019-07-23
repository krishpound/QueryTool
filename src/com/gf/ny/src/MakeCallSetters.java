package com.gf.ny.src;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.LineNumberReader;
import java.io.PrintStream;

public class MakeCallSetters {

	private static String ipath = "C:/Home/Query Tool/segments/";
	private static String opath = "C:/Home/Query Tool/call setters/";
	private static String inputFile = "NK1.txt";
	private static String outputFile = "NK1callSetters.txt";
	private static LineNumberReader lnr;
	private static FileOutputStream fos;
	private static PrintStream ps;
	private static String readLine;
	private static String var;
	
	public static void main(String[] args) {
		
try{
			
			lnr = new LineNumberReader(new FileReader(ipath+inputFile));	
			fos = new FileOutputStream(opath+outputFile);
			ps = new PrintStream(fos);
			 
			readLine = lnr.readLine();
			
			int x=1;
			
			while(readLine != null){
				
				var = readLine.substring(0,1).toUpperCase();
				var = var + readLine.substring(1).replaceAll(" ", "");
				
				ps.println("z.set"+var+"(field["+x+"]);");
				x++;
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
