package com.cisc181.core;

import java.util.UUID;

import com.cisc181.eNums.eMajor;

public class Course {

	UUID courseID;
	String CourseName;
	int GradePoints;
	eMajor Major;
	
	public Course(String course, int grade, eMajor major){
		this.courseID = UUID.randomUUID();
		this.CourseName = course;
		this.GradePoints = grade;
		this.Major = major;
	}
	/**
	 * @return the courseName
	 */
	public String getCourseName() {
		return CourseName;
	}
	/**
	 * @param courseName the courseName to set
	 */
	public void setCourseName(String courseName) {
		CourseName = courseName;
	}
	/**
	 * @return the gradePoints
	 */
	public int getGradePoints() {
		return GradePoints;
	}
	/**
	 * @param gradePoints the gradePoints to set
	 */
	public void setGradePoints(int gradePoints) {
		GradePoints = gradePoints;
	}
	/**
	 * @return the major
	 */
	public eMajor getMajor() {
		return Major;
	}
	/**
	 * @param major the major to set
	 */
	public void setMajor(eMajor major) {
		Major = major;
	}
}
