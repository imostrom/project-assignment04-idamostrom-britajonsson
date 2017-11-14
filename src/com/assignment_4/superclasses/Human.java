package com.assignment_4.superclasses;
/**
 * The superclass Human contains the attributes name and age their getters and
 * setters.
 * 
 * @author imostrom
 * @version 1.0
 *
 */
public class Human {
	private String name = "";
	private int age = 0;

	/**
	 * Contructor Human contrains parameters name and age
	 * 
	 * @param name name of the human
	 * @param age age of the human
	 */
	public Human(String name, int age) {
		this.name = name;
		this.age = age;
	}

	/**
	 * Method that returns the name of a human
	 * 
	 * @return name - name of the human
	 */
	public String getName() {
		return name;
	}

	/**
	 * This method sets the name to a human
	 * 
	 * @param name name of the human
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * Method that returns the age of a human
	 * 
	 * @return age - age of the human
	 */
	public int getAge() {
		return age;
	}

	/**
	 * This method sets the age to a human
	 * 
	 * @param age age of the human
	 */
	public void setAge(int age) {
		this.age = age;
	}

}
