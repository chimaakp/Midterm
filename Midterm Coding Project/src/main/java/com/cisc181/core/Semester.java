package com.cisc181.core;
import java.util.Date;
import java.util.UUID;

public class Semester {
	public Date StartDate;
	public Date EndDate;
	public UUID SemesterID;

	
	public Semester(Date StartDate, Date EndDate, UUID SemesterID){
		this.StartDate = StartDate;
		this.EndDate = EndDate;
		this.SemesterID = SemesterID;
	}
	
	public Date getStartDate(){
		return StartDate;
	}
	
	public void setStartDate( Date StartDate){
		this.StartDate = StartDate;
	}
	
	public Date getEndDate(Date EndDate){
		return EndDate;
	}
	
	public void setEndDate( Date EndDate){
		this.EndDate = EndDate;
	}
	
	public UUID getSemesterID(){
		return SemesterID;
	}
	
	public void setSemesterID( UUID SemesterID){
		this.SemesterID = SemesterID;
	}
}
