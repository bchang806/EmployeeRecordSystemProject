package com.boChungChang;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
    	List<Employee> employee = new ArrayList<Employee>();  	
    	loadDefaultEmployee(employee);  	
    	Menu menu = new Menu();
    	menu.startMenu(employee);
    } 
    
    public static void loadDefaultEmployee(List<Employee> employee) {
    	Employee john = new Manager("John", "Doe", "john@gamil.com", 100000);
    	employee.add(john);   	
    	Employee peter = new EntryLevelDeveloper("Peter", "Parker", "peter@gamil.com", 50000);
       	employee.add(peter);       	   	
    	Employee eddie = new JuniorDeveloper("Eddie", "Brock", "eddie@gamil.com", 80000);
    	employee.add(eddie);   	
    	Employee gwen = new SeniorDeveloper("Gwen ", "Stacy", "gwen@gamil.com", 100000);
    	employee.add(gwen);   	
    	Employee mary = new EntryLevelDeveloper("Mary", "Jane", "mary@gamil.com", 50000);
    	employee.add(mary);
    }
}
