package com.cisc181.core;


import java.util.UUID;

import com.cisc181.eNums.eMajor;

public class Course {
	
	public int GradePoints;
	
	public String CourseName;
	
	public UUID CourseID;

	public eMajor Major;
	
	
	Course( int GradePoints, String CourseName, UUID CourseID, eMajor Major){
	this.GradePoints = GradePoints;
	this.CourseName = CourseName;
	this.CourseID = CourseID;
	this.Major = Major;
	}
	
	public int getGradePoints(){
		return GradePoints;
	}
	
	public void setGradePoints(int GradePoints){
		this.GradePoints = GradePoints;
	}
	
	public String getCourseName(){
		return CourseName;
	}
	
	public void setCourseName(String CourseName){
		this.CourseName = CourseName;
	}
	
	public UUID getCourseID(){
		return CourseID;
	}
}
