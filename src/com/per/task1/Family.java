//Family.java
//Per Sundberg 2018-06-14
package com.per.task1;

/**
 * 
 * Class that handles the logic relation for the family.
 *
 */
public class Family {

	/**
	 * Method that takes 2 persons as in-parameter and calculate the result. 
	 * @param person1
	 * @param person2
	 * @return String
	 */
	public StringBuilder relation(String person1, String person2)
	{
		//Create instance of stringbuilder.
		StringBuilder result = new StringBuilder();
		
		//Relation logic.
		if(person1 == "Knut" && person2 == "Patrik")
			result.append(person1 + " är " + person2 +"s far");
		else if (person1 == "Patrik" && person2 == "Knut")
			result.append(person1 + " är " + person2 +"s son");
		else if (person1 == "Stina" && person2 == "Patrik")
			result.append(person1 + " är " + person2 +"s dotter");
		else if (person1 == "Stina" && person2 == "Jakob")
			result.append(person1 + " är " + person2 +"s syster");
		else result.append("Ingen sådan relation finns");
		
		return result;
	}
}
