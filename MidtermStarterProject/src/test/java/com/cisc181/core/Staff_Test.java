package com.cisc181.core;

import static org.junit.Assert.*;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;

import org.junit.Before;
import org.junit.Test;
import com.cisc181.core.Staff;

import com.cisc181.eNums.eTitle;

public class Staff_Test {

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void test() {
		Date Birthdate;
		Date HiredDate;
		Calendar cal = Calendar.getInstance();
		cal.set(1970, 2, 23);
		Birthdate = cal.getTime();
		cal.set(2005, 11, 16);
		HiredDate = cal.getTime();
	
		ArrayList<Staff> staff = new ArrayList<Staff>();
		staff.add(new Staff("John", "Marcus", "Gilbert",Birthdate, "219 Chestnut"
						,"856-857-1688", "jm@udel.edu","MWF 3:30-4:40",
						1,30400.89,HiredDate,eTitle.TA));
	
		cal.set(1934, 7, 11);
		Birthdate = cal.getTime();
		cal.set(2010, 5, 23);
		HiredDate = cal.getTime();
		staff.add(new Staff("Angela", "Marie", "Martin",Birthdate, "429 E. Cleaveland"
				,"823-815-4328", "AM2@udel.edu","TR 3:30-4:40",
				2,52300.12,HiredDate,eTitle.PROFESSOR));
	
		cal.set(1945, 4, 9);
		Birthdate = cal.getTime();
		cal.set(1999, 7, 12);
		HiredDate = cal.getTime();
		staff.add(new Staff("Joseph", "Lorentz", "Grody",Birthdate, "15 Prospect"
				,"823-435-7653", "JLG@udel.edu","TR 12:30-1:45",
				2,120853.67,HiredDate,eTitle.DEAN));
		
		cal.set(1980, 12, 25);
		Birthdate = cal.getTime();
		cal.set(2011, 5, 27);
		HiredDate = cal.getTime();
		staff.add(new Staff("Christine", "Lucia", "Grody",Birthdate, "243 E. Main st."
				,"616-230-8928", "ChrisLuc@udel.edu","MWF 12:30-1:45",
				2,83412.34,HiredDate,eTitle.PROFESSOR));
		
		cal.set(1975, 2, 10);
		Birthdate = cal.getTime();
		cal.set(2015, 1, 18);
		HiredDate = cal.getTime();
		staff.add(new Staff("Rick", "Dexter", "Morgan",Birthdate, "243 W. Main st."
				,"236-420-8923", "Ridex@udel.edu","MWF 12:30-1:45",
				2,120483.34,HiredDate,eTitle.PROFESSOR));
		
		double sum = 0;
		for(int i = 0; i < 5; i++){
			double temp = staff.get(i).getSalary();
			sum += temp;
		}
		double average = sum/5;
		assertEquals("Average Sum", average, 81490.07, .1);	
	
		
	}
	
	@Test
	public void test1(){
		Date Birthdate;
		Date HiredDate;
		Calendar cal = Calendar.getInstance();
		cal.set(1975, 2, 10);
		Birthdate = cal.getTime();
		cal.set(2015, 1, 18);
		HiredDate = cal.getTime();
		Staff badPhone = new Staff("Rick", "Dexter", "Morgan",Birthdate, "243 W. Main st."
				,"sdfn", "Ridex@udel.edu","MWF 12:30-1:45",
				2,120483.34,HiredDate,eTitle.PROFESSOR);
		// If the exception was raised it would set the phone number to null (see Person)
		assertNull(badPhone.getPhone());
	}

}
