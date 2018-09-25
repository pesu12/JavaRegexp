//MainProgram.java
//Per Sundberg 2018-06-14
package com.per.task2;

import com.per.task1.Family;

/*
 * Class that starts the program and that gets result from method
 * relation.
 */
public class MainProgram {

	/**
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		
		String text = "at To";
		
		//Create instance of class Family
		Replacer replacer = new Replacer();
		
		System.out.println(replacer.changeText(text));
	}
}
