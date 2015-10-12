package com.cisc181.core;

import java.util.UUID;

public class Section {
	
	//Constructor that generates a semester ID
	public Section(UUID courseID, UUID SemesterID, int room){
		this.SectionID = UUID.randomUUID();
		this.CourseID = courseID;
		this.SemesterID = SemesterID;
		this.RoomID = room;
	}

	UUID CourseID;
	/**
	 * @return the courseID
	 */
	public UUID getCourseID() {
		return CourseID;
	}

	/**
	 * @return the semesterID
	 */
	public UUID getSemesterID() {
		return SemesterID;
	}

	/**
	 * @return the sectionID
	 */
	public UUID getSectionID() {
		return SectionID;
	}

	/**
	 * @return the roomID
	 */
	public int getRoomID() {
		return RoomID;
	}

	/**
	 * @param roomID the roomID to set
	 */
	public void setRoomID(int roomID) {
		RoomID = roomID;
	}

	UUID SemesterID;
	UUID SectionID;
	int RoomID;
	
	
}
