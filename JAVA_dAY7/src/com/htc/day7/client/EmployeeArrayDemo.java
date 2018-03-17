package com.htc.day7.client;

import java.util.Arrays;

import com.htc.day7.pojo.Employee;
import com.htc.day7.pojo.NameComparator;
import com.htc.day7.pojo.SalaryComparator;

public class EmployeeArrayDemo {
public static void main(String[] args) {
	
	
	Employee emp=new Employee("E1234","ria",67884,"traingin");
	Employee emp1=new Employee("E178","anu",56884,"traingin");
	Employee emp2=new Employee("E190","hari",77884,"traingin");
	
	Employee[] employees= {emp,
			emp1,emp2};
	
	
	System.out.println("Based on salary");
	Arrays.sort(employees,new SalaryComparator());
	for (Employee employee : employees) {
		System.out.println(employee);
	}
	
	System.out.println("Based on Name");
	
	Arrays.sort(employees,new NameComparator());
	for (Employee employee : employees) {
		System.out.println(employee);
	}

}
}
