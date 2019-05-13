package com.boChungChang;

public class Manager extends Employee {
	
	
	public Manager(String firstName, String lastName, String email, double salary) {
		super(firstName, lastName, email, salary);
		this.setTitle("Manager");//default Title
		this.setBonusRate(0.2); //default bonus rate
	}
	
	public Manager() {
		this.setTitle("Manager");//default Title
		this.setBonusRate(0.2); //default bonus rate
	}
	


}
