package com.cisc181.core;

public class PersonException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Person pe;

	public PersonException(Person pe) {
		super();
		this.pe = pe;
	}
	public Person getPerson() {
		return pe;
	}
		
	}
