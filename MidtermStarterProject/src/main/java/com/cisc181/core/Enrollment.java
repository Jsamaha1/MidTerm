package com.cisc181.core;

import java.util.UUID;

public class Enrollment {

	UUID SectionID;
	UUID StudentID;
	UUID EnrollmentID;
	double Grade;
	
	// Private no arg constructor
	private Enrollment() {
		
	}
	
	// Public constructor taking a section and a student ID
	// Generates an EnrollmentID
	public Enrollment(UUID section, UUID student){
		this.SectionID = section;
		this.StudentID = student;
		this.EnrollmentID = UUID.randomUUID();
	}
	
	public void setGrade(double grade){
		this.Grade = grade;
	}
	
}
