package com.boChungChang;

public abstract class Employee {
	
	private String firstName;
	private String lastName;
	private String email;
	private String title;
	private double salary;
	private double bonusRate = 0;
	private static int countEmployee = 0;
	
	public Employee() {
		countEmployee += 1;
	}
	
	public Employee(String firstName, String lastName, String email, double salary) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.salary = salary;
		
		countEmployee += 1;
		
	}
	
	public String toString() {
		double totalPay = this.getSalary() + (this.getSalary() * this.getBonusRate());		
		return String.format("%22s %15s %15s %15s %15s %15s %20s %15s %10.2f",
				this.getTitle(), "|", this.getFirstName(), "|", this.getLastName(), "|",
				this.getEmail(), "|", totalPay);   		
		
		
	}
	
	public String getFirstName() {
		return firstName;
	}
	
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	
	public String getLastName() {
		return lastName;
	}
	
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	public static int numberOfEmployee() {
		return countEmployee;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public double getBonusRate() {
		return bonusRate;
	}

	public void setBonusRate(double bonusRate) {
		this.bonusRate = bonusRate;
	}
	
	public static void removeEmployee() {
		countEmployee -=1;
	}
	
	public void raiseSalary(double raise) {
		this.salary += raise;
	}
	
	 
	
}
