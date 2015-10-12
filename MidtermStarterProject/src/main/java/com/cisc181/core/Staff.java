package com.cisc181.core;

import java.util.Date;

import com.cisc181.eNums.eTitle;

public class Staff extends Employee {

	 // Uses an eTitle to determine the title.
	 private eTitle Title;

	   public Staff(eTitle title){
	        this.Title = title;
	    }

	    public void setTitle(eTitle title){
	        this.Title = title;
	    }
	    public eTitle getTitle(){
	        return this.Title;
	    }

    

    
	public Staff(String FirstName, String MiddleName, String LastName,
			Date DOB, String Address, String Phone_number, String Email,
			String officeHours, int rank, double salary, Date hireDate,
			eTitle Title) 
	
	{
		super(FirstName, MiddleName, LastName, DOB, Address, Phone_number,
				Email, officeHours, salary, hireDate);
		
		this.Title = Title;
	}

	public static void Staff(String string, String string2, String string3, Date birthdate, String string4,
			String string5, String string6, String string7, int i, double d, Date hiredDate, eTitle ta) {
		// TODO Auto-generated method stub
		
	}


}