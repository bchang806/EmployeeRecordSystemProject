package com.boChungChang;

public class JuniorDeveloper extends Employee {
	

	public JuniorDeveloper(String firstName, String lastName, String email, double salary) {
		super(firstName, lastName, email, salary);
		this.setTitle("Junior Developer");//default Title
		this.setBonusRate(0.1); //default bonus rate
	}
	
	public JuniorDeveloper() {
		this.setTitle("Junior Developer");//default Title
		this.setBonusRate(0.1); //default bonus rate
		
	}


}
