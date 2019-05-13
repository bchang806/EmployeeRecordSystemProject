package com.boChungChang;

public class SeniorDeveloper extends Employee {


	public SeniorDeveloper(String firstName, String lastName, String email, double salary) {
		super(firstName, lastName, email, salary);
		this.setTitle("Senior Developer");//default Title
		this.setBonusRate(0.15); //default bonus rate
	}
	
	public SeniorDeveloper() {
		this.setTitle("Senior Developer");//default Title
		this.setBonusRate(0.15); //default bonus rate
	}

}
