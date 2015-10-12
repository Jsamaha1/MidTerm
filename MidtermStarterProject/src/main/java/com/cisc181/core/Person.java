package com.cisc181.core;

import java.util.Calendar;
import java.util.Date;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*
 * comment
 */
public abstract class Person {

	private Date DOB;
	private String FirstName;
	private String MiddleName;
	private String LastName;
	private String address;
	private String phone_number;
	private String email_address;

	public String getFirstName() {
		return FirstName;
	}

	public void setFirstName(String FirstName) {
		this.FirstName = FirstName;
	}

	public String getMiddleName() {
		return MiddleName;
	}

	public void setMiddleName(String MiddleName) {
		this.MiddleName = MiddleName;
	}

	public String getLastName() {
		return LastName;
	}

	public void setLastName(String LastName) {
		this.LastName = LastName;
	}

	public Date getDOB() {
		return DOB;
	}

	public void setDOB(Date DOB) throws PersonException {
		// Sets the dates to a calander to make it easy to compare the year
		Calendar dobCal = Calendar.getInstance();
		Calendar today = Calendar.getInstance();
		dobCal.setTime(DOB);
		
		// Throws the exception if the year is > 100, using this as an argument
		if((dobCal.get(Calendar.YEAR) - today.get(Calendar.YEAR))> 100)
			throw new PersonException(this);
		else
			this.DOB = DOB;
	}

	public void setAddress(String newAddress) {
		address = newAddress;
	}

	public String getAddress() {
		return address;
	}

	public void setPhone(String newPhone_number) throws PersonException{
		// Use a regular expression to determine the type of number
		String regex = "^\\(?([0-9]{3})\\)?[-.\\s]?([0-9]{3})[-.\\s]?([0-9]{4})$";
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(newPhone_number);
		// If the phone number is of the right format throw an error 
		if(matcher.matches())
			phone_number = newPhone_number;
		else
			throw new PersonException(this);
	}

	public String getPhone() {
		return phone_number;
	}

	public void setEmail(String newEmail) {
		email_address = newEmail;
	}

	public String getEmail() {
		return email_address;
	}

	/*
	 * Constructors No Arg Constructor
	 */
	public Person() {

	}

	/*
	 * Constructors Constructor with arguments
	 */

	public Person(String FirstName, String MiddleName, String LastName,
			Date DOB, String Address, String Phone_number, String Email) {
		this.FirstName = FirstName;
		this.MiddleName = MiddleName;
		this.LastName = LastName;
		try{
		this.setDOB(DOB);
		} catch(PersonException e) {
			e.printStackTrace();
		}
		this.address = Address;
		try{
		this.setPhone(Phone_number);
		} catch(PersonException e) {
			e.printStackTrace();
			this.phone_number = null;
		}
		this.email_address = Email;
		
	}

	public void PrintName() {
		System.out.println(this.FirstName + ' ' + this.MiddleName + ' '
				+ this.LastName);
	}

	public void PrintDOB() {
		System.out.println(this.DOB);
	}

	public int PrintAge() {
		Calendar today = Calendar.getInstance();
		Calendar birthDate = Calendar.getInstance();

		int age = 0;
		birthDate.setTime(this.DOB);
		if (birthDate.after(today)) {
			throw new IllegalArgumentException("Can't be born in the future");
		}
		age = today.get(Calendar.YEAR) - birthDate.get(Calendar.YEAR);

		// If birth date is greater than todays date (after 2 days adjustment of
		// leap year) then decrement age one year
		if ((birthDate.get(Calendar.DAY_OF_YEAR)
				- today.get(Calendar.DAY_OF_YEAR) > 3)
				|| (birthDate.get(Calendar.MONTH) > today.get(Calendar.MONTH))) {
			age--;

			// If birth date and todays date are of same month and birth day of
			// month is greater than todays day of month then decrement age
		} else if ((birthDate.get(Calendar.MONTH) == today.get(Calendar.MONTH))
				&& (birthDate.get(Calendar.DAY_OF_MONTH) > today
						.get(Calendar.DAY_OF_MONTH))) {
			age--;
		}

		System.out.println("age is " + age);

		return age;

	}
}