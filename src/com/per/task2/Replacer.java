//Replacer.java
//Per Sundberg 2018-06-14
package com.per.task2;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Replacer {
	
	private String changeTextOnPattern(String pattern,String intext)
	{
		String result = "";
		// Create a Pattern object
		Pattern r = Pattern.compile(pattern);

		// create matcher object.
		Matcher m = r.matcher(intext);
		if (m.find()) {
	        	result = intext.replaceAll("o", "od");
				intext = result;
		} else {
			result = "NO MATCH";
		}
		
		return result;
	}

	public String changeText(String str)
	{
		String result = str;
		
		//Replace y with om
		if(str.contains("y"))
		{
			result = str.replaceAll("y", "om");
			str = result;
		}
		
		//Replace z with och
		if(str.contains("z"))
		{
			result = str.replaceAll("y", "och");
			str = result;
		}
		
		//If "b" or "B" is just found in index position before o then  change o to od.
		String pattern = "([b,B,t,T])([o])";	
		String tempResult = changeTextOnPattern(pattern, str);
		if(tempResult != "NO MATCH")
		{
			result = tempResult;
			str = result;
		}
		
		return result;
	}
}
