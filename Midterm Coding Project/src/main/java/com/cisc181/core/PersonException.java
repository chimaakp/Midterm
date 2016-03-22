package com.cisc181.core;

public class PersonException extends Exception {
	
	public Person pe;
	
	PersonException(Person pe){
		this.pe = pe;
	}

}
