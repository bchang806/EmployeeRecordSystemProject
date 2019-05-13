package com.boChungChang;

import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class Menu {
	Scanner input = new Scanner(System.in);

	public Menu() {
		
	}
	
	public void startMenu(List<Employee> employee) {
    	boolean isRunning = true;
    	int selectMenu = 0;
    	while (isRunning) {
    		this.showMenu();
        	try {
        		selectMenu = input.nextInt();
        		while(selectMenu < 1 || selectMenu > 6) {
            		System.out.println("Please Enter Number 1 ~ 6 to Select Menu");
            		this.showMenu();
            		selectMenu = input.nextInt();
            	}
        		switch (selectMenu) {
        		case 1:
        			this.addNewEmployee(employee);        			
        			break;
        		case 2:
        			this.removeEmployee(employee);
        			break;
        		case 3:
        			this.updateEmployee(employee);       			
        			break;
        		case 4:
        			this.checkEmployee(employee);
        			break;
        		case 5:
        			this.showEmployee(employee);
        			break;
        		case 6:
        			isRunning = false;
        			break;
        		}
   		
        	}    	  
        	catch(InputMismatchException e){        		
        		System.err.println("Entered value is not an integer or is too large");  
        		isRunning = false;
        	}
        	catch(Exception e) {
        		System.err.println("Exception occurred");
        		isRunning = false;
        	}

    	}   	
    	System.out.println("----------------End of program--------------");
		
	}
	
    public boolean addNewEmployee(List<Employee> employee) {
    	System.out.println("Enter First Name of the Employee You Want to Add Or enter 0 to Go Back to Menu");
    	String firstName = input.next();
    	if (firstName.equals("0")) {
    		return false;
    	}
    	System.out.println("Enter Last Name of the Employee You Want to Add Or enter 0 to Go Back to Menu");
    	String lastName = input.next();
    	if (lastName.equals("0")) {
    		return false;
    	}
    	System.out.println("Enter Email of the Employee You Want to Add Or enter 0 to Go Back to Menu");
    	String email = input.next();
    	if (email.equals("0")) {
    		return false;
    	}
    	System.out.println("Enter Salary of the Employee You Want to Add Or enter 0 to Go Back to Menu");
    	double salary = input.nextDouble();
    	if (salary == 0) {
    		return false;
    	}
    	this.showTitle();
    	int selectTitle = input.nextInt();
    	while(selectTitle < 1 || selectTitle > 5) {
    		System.out.println();
    		System.out.println("Please Enter Number 1 ~ 5 to Select Title");
    		this.showTitle();
    		selectTitle = input.nextInt();
    	}
    	Employee emp;   	
    	switch(selectTitle) {
    	case 1:
    		emp = new Manager(firstName, lastName, email, salary);
    		employee.add(emp);
    		break;        		
    	case 2:
    		emp = new SeniorDeveloper(firstName, lastName, email, salary);
    		employee.add(emp);
    		break;           		
    	case 3:
    		emp = new JuniorDeveloper(firstName, lastName, email, salary);
    		employee.add(emp);
    		break;          		
    	case 4:	
    		emp = new EntryLevelDeveloper(firstName, lastName, email, salary);
    		employee.add(emp);
    		break;
    	case 5:
    		emp = new Intern(firstName, lastName, email, salary);
    		employee.add(emp);
    		break;
    	}
    	System.out.println("An Employee Has Been Successfully Added!\n");
    	return false;
    }
    
    public void showMenu() {
    	System.out.println("**************Menu*****************");
    	System.out.println("*  1.Add a new Employee Record    *");
    	System.out.println("*  2.Delete an Employee Record    *");
    	System.out.println("*  3.Update an Employee Record    *");
    	System.out.println("*  4.Check an Employee Record     *");
    	System.out.println("*  5.Output All Employee Records  *");
    	System.out.println("*  6.Exit                         *");
    	System.out.println("***********************************");
    }
    
    
    public boolean updateEmployee(List<Employee> emp) {
    	System.out.println("****Update Employee From the Company****");
    	System.out.println("Enter First Name of the Employee You Want to Update From the Employee Record System Or enter 0 to Go Back to Menu");
    	String firstName = input.next();
    	if (firstName.equals("0")) {
    		return false;
    	}
    	System.out.println("Enter Last Name of the Employee You Want to Update From the Employee Record System Or enter 0 to Go Back to Menu");
    	String lastName = input.next();
    	if (lastName.equals("0")) {
    		return false;
    	}
    	for (int i = 0; i < emp.size(); i++) {
    		if (emp.get(i).getFirstName().contains(firstName) && emp.get(i).getLastName().contains(lastName)) {
    			System.out.println(emp.get(i).getFirstName() + " " + emp.get(i).getLastName() + " is in the Employee Record System.");
    			this.showUpdateOption();
    			int select = input.nextInt();
    			while (select < 1 || select > 6) {
    				System.out.println("Wrong Input - Please Select 1 - 5 to Update Employee Info or 6 to Return to Menu");
    				this.showUpdateOption();
        			select = input.nextInt();
    			}
    			int selectTitle = 0;
    			String newFirstName = emp.get(i).getFirstName();
    			String newLastName = emp.get(i).getLastName();
    			String newEmail = emp.get(i).getEmail();
    			double newSalary = emp.get(i).getSalary();
    			while (true) {
    				switch (select) {
    				case 1:
    					this.showTitle();
    					selectTitle = input.nextInt();
    					while(selectTitle < 1 || selectTitle > 5) {
    			    		System.out.println();
    			    		System.out.println("Please Enter Number 1 ~ 5 to Select Title");
    			    		this.showTitle();
    			    		selectTitle = input.nextInt();
    			    	}
    					break;
    				case 2:
    					System.out.println("Please Enter First Name of the Employee You Want to Update ");
    					newFirstName = input.next();
    					break;
    				case 3:
    					System.out.println("Please Enter Last Name of the Employee You Want to Update ");
    					newLastName = input.next();
    					break;
    				case 4:
    					System.out.println("Please Enter Email Address of the Employee You Want to Update ");
    					newEmail = input.next();
    					break;
    				case 5:
    					System.out.println("Please Enter the Salary of the Employee You Want to Update ");
    					newSalary = input.nextDouble();
    					break;
    				case 6:
    					System.out.println("Return to Menu");
    					return false; 					   					
    				}
    				System.out.println("Enter 1 to Update More Information or Enter 2 to Save the Update");
    				int check = input.nextInt();
    				if (check == 1) {
    					this.showUpdateOption();
    	    			select = input.nextInt();
    				}
    				if (check == 2) {
    					Employee updatedEmployee;
    			    	switch(selectTitle) {
    			    	case 1:
    			    		updatedEmployee = new Manager(newFirstName, newLastName, newEmail, newSalary);
    			    		emp.add(updatedEmployee);
    			    		break;        		
    			    	case 2:
    			    		updatedEmployee = new SeniorDeveloper(newFirstName, newLastName, newEmail, newSalary);
    			    		emp.add(updatedEmployee);
    			    		break;           		
    			    	case 3:
    			    		updatedEmployee = new JuniorDeveloper(newFirstName, newLastName, newEmail, newSalary);
    			    		emp.add(updatedEmployee);
    			    		break;          		
    			    	case 4:	
    			    		updatedEmployee = new EntryLevelDeveloper(newFirstName, newLastName, newEmail, newSalary);
    			    		emp.add(updatedEmployee);
    			    		break;
    			    	case 5:
    			    		updatedEmployee = new Intern(newFirstName, newLastName, newEmail, newSalary);
    			    		emp.add(updatedEmployee);
    			    		break;
    			    	}
    			    	emp.remove(i); // remove old employee record from the system
    			    	Employee.removeEmployee();
    			    	return false;
    				}    						
    			}   			
    		}
    	}
    	System.out.println("---Unable to Find " + firstName + " " + lastName + " in the Employee Record System ---");
		return false;
    }
    
    public boolean checkEmployee(List<Employee> emp) {
    	System.out.println("****Check Employee from the Employee Record System****");
    	System.out.println("Enter First Name of the Employee You Want to Check from the Employee Record System Or enter 0 to Go Back to Menu");
    	String firstName = input.next();
    	if (firstName.equals("0")) {
    		return false;
    	}
    	System.out.println("Enter Last Name of the Employee You Want to Check from the Employee Record System Or enter 0 to Go Back to Menu");
    	String lastName = input.next();
    	if (lastName.equals("0")) {
    		return false;
    	}
    	for (int i = 0; i < emp.size(); i++) {
    		if (emp.get(i).getFirstName().contains(firstName) && emp.get(i).getLastName().contains(lastName)) {
    			System.out.println(emp.get(i).getFirstName() + " " + emp.get(i).getLastName() + " is in the Employee Record System.");
    			System.out.println("---------Returning to Menu----------");
    	    	System.out.println();
    			return false;
    		}
    	}
    	System.out.println("---Unable to Find " + firstName + " " + lastName + " in the Employee Record System ---");
    	System.out.println("---------Returning to Menu----------");
    	System.out.println();
    	return false;
    }
    
 
    
    public void showEmployee(List<Employee> emp) {
    	System.out.println("Current Number of Employees in the Company: " + Employee.numberOfEmployee());
    	System.out.println();
    	System.out.println(String.format("%22s %15s %15s %15s %15s %15s %20s %15s %10s",
    			 "Title", "|", "First Name", "|", "Last Name", "|", "Email", "|", "Total Pay"));
    	
    	
    	for (int i = 0; i < emp.size(); i++) {
    		/*System.out.println(String.format("%22s %15s %15s %15s %15s %15s %20s %15s %10.2f",
    				employee.get(i).getTitle(), "|", employee.get(i).getFirstName(), "|", employee.get(i).getLastName(), "|",
    				employee.get(i).getEmail(), "|", (employee.get(i).getSalary() + employee.get(i).getSalary()*employee.get(i).getBonusRate())));   		
    		*/
    		System.out.println(emp.get(i).toString());
    		
    	}
    	System.out.println();
    	
    }
    
    public void showTitle() {
    	System.out.println("Select Job Title");
    	System.out.println("1.Manager");
    	System.out.println("2.Senior Developer");
    	System.out.println("3.Junior Developer");
    	System.out.println("4.Entry Level Developer");
    	System.out.println("5.Intern");
    }
    
    public void showUpdateOption() {
		System.out.println("Which Information Do You Want to Update");
		System.out.println("1.Title");
		System.out.println("2.First Name");
		System.out.println("3.Last Name");
		System.out.println("4.Email");
		System.out.println("5.Salary");
		System.out.println("6.Return to Menu");
    }
    
    public int checkSelectTitle(int selectTitle) {
    	int title = selectTitle;
    	while(title < 1 || title > 5) {
    		System.out.println();
    		System.out.println("Please Enter Number 1 ~ 5 to Select Title");
    		this.showTitle();
    		title = input.nextInt();
    	}
    	return title;
    }
    
    public boolean removeEmployee(List<Employee> emp) {
    	
    	System.out.println("****Remove Employee from the Employee Record System****");
    	System.out.println("Enter First Name of the Employee You Want to Remove From the Employee Record System Or enter 0 to Go Back to Menu");
    	String firstName = input.next();
    	if (firstName.equals("0")) {
    		return false;
    	}
    	System.out.println("Enter Last Name of the Employee You Want to Remove From the Employee Record System Or enter 0 to Go Back to Menu");
    	String lastName = input.next();
    	if (lastName.equals("0")) {
    		return false;
    	}
    	for (int i = 0; i < emp.size(); i++) {
    		if (emp.get(i).getFirstName().contains(firstName) && emp.get(i).getLastName().contains(lastName)) {
    			emp.remove(i);
    			Employee.removeEmployee();
    			System.out.println("---" + firstName + " " + lastName + " Has Been Removed From the Employee Record System---");
    			System.out.println("---------Returning to Menu----------");
    	    	System.out.println();
    			return false;
    		}
    	}
    	System.out.println("---Unable to Find " + firstName + " " + lastName + " in the Employee Record System ---");
    	System.out.println("---------Returning to Menu----------");
    	System.out.println();
    	return false;
    	
    }

}
