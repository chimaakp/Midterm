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
	
	public void setGrade(double Grade){
		this.Grade = Grade;
	}
	
	public double getGrade(){
		return Grade;
	}
	
	public void setSectionID(UUID SectionID){
		this.SectionID = SectionID;
	}
	
	public void setStudentID(UUID StudentID){
		this.StudentID = StudentID;
	}
	
	public void setEnrollmentID(UUID EnrollmentID){
		this.EnrollmentID = EnrollmentID;
	}
	
	public UUID getSectionID(){
		return SectionID;
	}
	
	public UUID getStudentID(){
		return StudentID;
	}
	
	public UUID getEnrollmentID(){
		return EnrollmentID;
	}
}
