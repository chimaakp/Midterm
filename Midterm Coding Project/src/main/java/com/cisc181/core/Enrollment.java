package com.cisc181.core;

import java.util.UUID;

public class Enrollment {
	public UUID SectionID;
	private UUID StudentID;
	protected double Grade;
	public UUID EnrollmentID;
	
	private Enrollment(){
		this.EnrollmentID = UUID.randomUUID();
	}
	
	private Enrollment(UUID StudentID, UUID SectionID){
		this();
		this.StudentID = UUID.randomUUID();
		this.SectionID = UUID.randomUUID();
		
	}
	
	private double SetGrade(double Grade){
		this.Grade = Grade;
		
	}
}
