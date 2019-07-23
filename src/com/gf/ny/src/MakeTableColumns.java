package com.gf.ny.src;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.LineNumberReader;
import java.io.PrintStream;

public class MakeTableColumns {

	private static String ipath = "C:/Home/Query Tool/segments/";
	private static String opath = "C:/Home/Query Tool/tables/";
	private static String inputFile = "NK1.txt";
	private static String outputFile = "NK1databasecolumns.txt";
	private static String tableName = "nk1";
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
			
			ps.println("create table "+tableName+" (");
			ps.println("id integer,");
			
			while(readLine != null){
				
				var = readLine.toLowerCase().trim().replaceAll(" ", "_");
				ps.println(var+" varchar(100),");
				readLine = lnr.readLine();
				
			}
			
			ps.println("route int,");
			ps.println("messagebodyid varchar(100),");
			ps.println("segment varchar(100)");
			ps.println(")");
		
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
