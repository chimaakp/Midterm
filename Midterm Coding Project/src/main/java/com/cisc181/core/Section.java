package com.cisc181.core;

import java.util.UUID;

public class Section {
	public int RoomID;
	public UUID CourseID;
	public UUID SemesterID;
	public UUID SectionID;
	
	public Section( int RoomID, UUID CourseID, UUID SemesterID, UUID SectionID){
		this.RoomID = RoomID;
		this.CourseID = CourseID;
		this.SemesterID = SemesterID;
		this.SectionID = SectionID;
		
		
	}
	
	public int getRoomID(){
		return RoomID;
	}
	
	public void setRoomID( int RoomID){
		this.RoomID = RoomID;
	}
	
	public UUID getSemesterID(){
		return SemesterID;
	}
	
	public void setSemesterID( UUID SemesterID){
		this.SemesterID = SemesterID;
	}
	
	public UUID getSectionID(){
		return SectionID;
	}
	
	public void setSectionID( UUID SectionID){
		this.SectionID = SectionID;
	}
	
}


