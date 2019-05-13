package com.boChungChang;

public class Intern extends Employee{

	public Intern(String firstName, String lastName, String email, double salary) {
		super(firstName, lastName, email, salary);
		this.setTitle("Intern");//default Title
		this.setBonusRate(0); //default bonus rate
	}
	
	public Intern() {
		this.setTitle("Intern");//default Title
		this.setBonusRate(0); //default bonus rate
	}

}
