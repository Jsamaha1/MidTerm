package com.cisc181.core;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;

import com.cisc181.core.*;
import com.cisc181.eNums.eMajor;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class Student_Test {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	// Creates the courses and adds them to an ArrayList
	ArrayList<Course> courses = new ArrayList<Course>();
	Course Physics = new Course("Phys207", 100, eMajor.PHYSICS);
	Course Chem = new Course("Chem103", 100, eMajor.CHEM);
	Course Econ = new Course("Econ101", 100, eMajor.BUSINESS);
	
	courses.add(Physics);
	courses.add(Chem);
	courses.add(Econ);
	
	// Creates Semesters and adds them to an ArrayList
	Date startDate;
	Date endDate;
	Calendar cal = Calendar.getInstance();
	cal.set(2014, 8, 23);
	startDate = cal.getTime();
	cal.set(2013, 12, 13);
	endDate = cal.getTime();
	
	ArrayList<Semester> semesters = new ArrayList<Semester>();
	Semester Fall = new Semester(startDate, endDate);
	semesters.add(Fall);
	
	cal.set(2015, 2, 7);
	startDate = cal.getTime();
	cal.set(2015, 5, 27);
	endDate = cal.getTime();
	
	Semester Spring = new Semester(startDate, endDate);
	semesters.add(Spring);
	
	//Creates the sections and adds them to an ArrayList
	Section physFall = new Section(Physics.courseID,Fall.SemesterID, 23);
	Section physSpring = new Section(Physics.courseID, Spring.SemesterID, 25);
	Section chemFall = new Section(Chem.courseID, Fall.SemesterID, 34);
	Section chemSpring = new Section(Chem.courseID, Spring.SemesterID, 45);
	Section econFall = new Section(Econ.courseID, Fall.SemesterID, 10);
	Section econSpring = new Section(Econ.courseID, Spring.SemesterID, 12);
	
	ArrayList<Section> courseSections = new ArrayList<Section>();
	courseSections.add(physFall);
	courseSections.add(physSpring);
	courseSections.add(chemFall);
	courseSections.add(chemSpring);
	courseSections.add(econFall);
	courseSections.add(econSpring);
	
	cal.set(1995, 6, 23);
	Date birthDate = cal.getTime();
	Student stud1 = new Student("Jacques", "Simon", "Samaha", birthDate, eMajor.PHYSICS, "123 Street ln.", "8571420099","js@udel.edu");
	Student stud2 = new Student("John", "Sampson", "Laurel", birthDate, eMajor.CHEM, "143 Street ln.", "8523420099","lok@udel.edu");
	Student stud3 = new Student("Laurel", "Dianah", "Lance", birthDate, eMajor.PHYSICS, "199 Street ln.", "8571422399","abc@udel.edu");
	Student stud4 = new Student("Oliver", "Robert", "Queen", birthDate, eMajor.NURSING, "902 Street ln.", "1235556789","oq@udel.edu");
	Student stud5 = new Student("Thea", "Dearden", "Queen", birthDate, eMajor.PHYSICS, "902 Street ln.", "1235556789","mq@udel.edu");
	Student stud6 = new Student("Barry", "Flash", "Allen", birthDate, eMajor.CHEM, "903 Street ln.", "8575550099","ba@udel.edu");
	Student stud7 = new Student("Ray", "Atom", "Palmer", birthDate, eMajor.COMPSI, "904 Street ln.", "5551420099","rp@udel.edu");
	Student stud8 = new Student("Felicity", "Season3", "Smoakes", birthDate, eMajor.COMPSI, "234 Street ln.", "8571425555","fs@udel.edu");
	Student stud9 = new Student("Annalise", "Wtf", "Keating", birthDate, eMajor.BUSINESS, "213 Street ln.", "8555550099","ak@udel.edu");
	Student stud10 = new Student("Jean", "Phoenix", "Gray", birthDate, eMajor.PHYSICS, "616 Street ln.", "5555552134","jg@udel.edu");
	
	ArrayList<Student> students = new ArrayList<Student>();
	students.add(stud1);
	students.add(stud2);
	students.add(stud3);
	students.add(stud4);
	students.add(stud5);
	students.add(stud6);
	students.add(stud7);
	students.add(stud8);
	students.add(stud9);
	students.add(stud10);
	}
	

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void test() {
		//WOULDN'T READ MY BEFORE CLASS SO I REPASTED IT HERE
		// Creates the courses and adds them to an ArrayList
			ArrayList<Course> courses = new ArrayList<Course>();
			Course Physics = new Course("Phys207", 100, eMajor.PHYSICS);
			Course Chem = new Course("Chem103", 100, eMajor.CHEM);
			Course Econ = new Course("Econ101", 100, eMajor.BUSINESS);
			
			courses.add(Physics);
			courses.add(Chem);
			courses.add(Econ);
			
			// Creates Semesters and adds them to an ArrayList
			Date startDate;
			Date endDate;
			Calendar cal = Calendar.getInstance();
			cal.set(2014, 8, 23);
			startDate = cal.getTime();
			cal.set(2013, 12, 13);
			endDate = cal.getTime();
			
			ArrayList<Semester> semesters = new ArrayList<Semester>();
			Semester Fall = new Semester(startDate, endDate);
			semesters.add(Fall);
			
			cal.set(2015, 2, 7);
			startDate = cal.getTime();
			cal.set(2015, 5, 27);
			endDate = cal.getTime();
			
			Semester Spring = new Semester(startDate, endDate);
			semesters.add(Spring);
			
			//Creates the sections and adds them to an ArrayList
			Section physFall = new Section(Physics.courseID,Fall.SemesterID, 23);
			Section physSpring = new Section(Physics.courseID, Spring.SemesterID, 25);
			Section chemFall = new Section(Chem.courseID, Fall.SemesterID, 34);
			Section chemSpring = new Section(Chem.courseID, Spring.SemesterID, 45);
			Section econFall = new Section(Econ.courseID, Fall.SemesterID, 10);
			Section econSpring = new Section(Econ.courseID, Spring.SemesterID, 12);
			
			ArrayList<Section> courseSections = new ArrayList<Section>();
			courseSections.add(physFall);
			courseSections.add(physSpring);
			courseSections.add(chemFall);
			courseSections.add(chemSpring);
			courseSections.add(econFall);
			courseSections.add(econSpring);
			
			cal.set(1995, 6, 23);
			Date birthDate = cal.getTime();
			Student stud1 = new Student("Jacques", "Simon", "Samaha", birthDate, eMajor.PHYSICS, "123 Street ln.", "8571420099","js@udel.edu");
			Student stud2 = new Student("John", "Sampson", "Laurel", birthDate, eMajor.CHEM, "143 Street ln.", "8523420099","lok@udel.edu");
			Student stud3 = new Student("Laurel", "Dianah", "Lance", birthDate, eMajor.PHYSICS, "199 Street ln.", "8571422399","abc@udel.edu");
			Student stud4 = new Student("Oliver", "Robert", "Queen", birthDate, eMajor.NURSING, "902 Street ln.", "1235556789","oq@udel.edu");
			Student stud5 = new Student("Thea", "Dearden", "Queen", birthDate, eMajor.PHYSICS, "902 Street ln.", "1235556789","mq@udel.edu");
			Student stud6 = new Student("Barry", "Flash", "Allen", birthDate, eMajor.CHEM, "903 Street ln.", "8575550099","ba@udel.edu");
			Student stud7 = new Student("Ray", "Atom", "Palmer", birthDate, eMajor.COMPSI, "904 Street ln.", "5551420099","rp@udel.edu");
			Student stud8 = new Student("Felicity", "Season3", "Smoakes", birthDate, eMajor.COMPSI, "234 Street ln.", "8571425555","fs@udel.edu");
			Student stud9 = new Student("Annalise", "Wtf", "Keating", birthDate, eMajor.BUSINESS, "213 Street ln.", "8555550099","ak@udel.edu");
			Student stud10 = new Student("Jean", "Phoenix", "Gray", birthDate, eMajor.PHYSICS, "616 Street ln.", "5555552134","jg@udel.edu");
			
			ArrayList<Student> students = new ArrayList<Student>();
			students.add(stud1);
			students.add(stud2);
			students.add(stud3);
			students.add(stud4);
			students.add(stud5);
			students.add(stud6);
			students.add(stud7);
			students.add(stud8);
			students.add(stud9);
			students.add(stud10);
			/*
			 * Student has no student ID parameter added to it
			 * so I am unsure how to go about enrolling them in classes
			 * But for what its worth if they did I would just use the enrollment
			 * class which looks for Student ID, but again I have no idea where the studentID
			 * comes from.
			 */
			//Changing the major of one of the students
			students.get(0).setMajor(eMajor.BUSINESS);
	}

}
