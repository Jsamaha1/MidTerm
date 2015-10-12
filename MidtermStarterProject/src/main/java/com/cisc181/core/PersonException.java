package com.cisc181.core;

public class PersonException extends Exception{
	private Person personToTest;
	
	// Constructor that takes a person as an argument
	public PersonException(Person PersonError){
		this.personToTest = PersonError;
	}
}
