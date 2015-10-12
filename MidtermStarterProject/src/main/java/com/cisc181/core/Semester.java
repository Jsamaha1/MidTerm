package com.cisc181.core;

import java.util.Date;
import java.util.UUID;

public class Semester {

	UUID SemesterID;
	Date StartDate;
	Date EndDate;
	
	// Constructor that generates a UUID
	public Semester(Date start, Date end) {
		SemesterID = UUID.randomUUID();
		this.StartDate = start;
		this.EndDate = end;
	}

	/**
	 * @return the semesterID
	 */
	public UUID getSemesterID() {
		return SemesterID;
	}

	/**
	 * @return the startDate
	 */
	public Date getStartDate() {
		return StartDate;
	}

	/**
	 * @param startDate the startDate to set
	 */
	public void setStartDate(Date startDate) {
		StartDate = startDate;
	}

	/**
	 * @return the endDate
	 */
	public Date getEndDate() {
		return EndDate;
	}

	/**
	 * @param endDate the endDate to set
	 */
	public void setEndDate(Date endDate) {
		EndDate = endDate;
	}
}
