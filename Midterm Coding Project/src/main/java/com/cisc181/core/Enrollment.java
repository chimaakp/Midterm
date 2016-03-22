package com.cisc181.core;

import java.util.UUID;

public class Enrollment {
	public UUID SectionID;
	private UUID StudentID;
	protected double Grade;
	public UUID EnrollmentID;
	
	private Enrollment(){
		
	}
	
	private Enrollment(UUID StudentID, UUID SectionID){
		
	}
	
	private double SetGrade(double Grade){
		this.Grade = Grade;
		
	}
}
