package com.gf.ny.src;

import java.util.regex.*;

public class RegexCheck{

	public static boolean findPattern(String regexPattern, String stringToSearch){
		
		boolean foundIt=false;
		Pattern p;
		Matcher m;
		
		if(stringToSearch!=null){
			
			p = Pattern.compile(regexPattern,Pattern.CASE_INSENSITIVE);
			m = p.matcher(stringToSearch);
	
			if (m.find()){
				foundIt=true;
			}
		}
		
		return foundIt;
		
	}
	
	public static String grabData(String regexPattern, String stringToSearch){
		
		String data="";
		Pattern p;
		Matcher m;
		
		if(stringToSearch!=null){
			
			p = Pattern.compile(regexPattern,Pattern.CASE_INSENSITIVE);
			m = p.matcher(stringToSearch);
	
			while(m.find()){
	            data = data +m.group();
	        }
		
		}
		
		return data;
		
	}
	
}