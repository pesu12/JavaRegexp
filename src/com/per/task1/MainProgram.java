//MainProgram.java
//Per Sundberg 2018-06-14
package com.per.task1;

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
		
		//Create instance of class Family
		Family family = new Family();
		
		//Call method relation and display result on console.
		System.out.println(family.relation("Knut", "Patrik"));
		System.out.println(family.relation("Patrik", "Knut"));
		System.out.println(family.relation("Stina", "Patrik"));		
		System.out.println(family.relation("Stina", "Jakob"));		
		System.out.println(family.relation("Stina", "Stina"));	
	}
}
