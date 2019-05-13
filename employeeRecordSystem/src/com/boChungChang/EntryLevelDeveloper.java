package com.boChungChang;

public class EntryLevelDeveloper extends Employee{
	

	public EntryLevelDeveloper(String firstName, String lastName, String email, double salary) {
		super(firstName, lastName, email, salary);
		this.setTitle("Entry Level Developer");//default Title
		this.setBonusRate(0.05); //default bonus rate
	}
	
	public EntryLevelDeveloper() {
		this.setTitle("Entry Level Developer");//default Title
		this.setBonusRate(0.05); //default bonus rate
	}

}
