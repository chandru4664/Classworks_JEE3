package com.htc.day7.client;

import java.util.Scanner;

import com.htc.day7.pojo.Department;
import com.htc.day7.pojo.Employee;

public class HasrelationshipDemo {
public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	
	Department training=new Department("Dt006","Training Department");
	Employee[] employees=new Employee[3];
	
	//int[] arr=new int[10];
	
	for (int i = 0; i < employees.length; i++) {
		employees[i]=new Employee();
		System.out.println("enter employeeId");
		employees[i].setEmployeeId(scan.nextLine());
		System.out.println("enter employeName");
		employees[i].setEmployeeName(scan.nextLine());
		System.out.println("enter salary");
		employees[i].setSalary(Double.parseDouble(scan.nextLine()));
		System.out.println("enter JobId");
		employees[i].setJobId(scan.nextLine());
	}
			
	training.setEmployees(employees);
	
	System.out.println("department Id"+training.getDepartmentId());
	System.out.println("department Name"+training.getDepartmentName());
	System.out.println("--------------------------------------------------------");
	
	System.out.println("employeeId\t\t\t\temmployeeName\t\tsalary\t\tjodId\t\t");
	for (Employee employee : training.getEmployees()) {
		
		System.out.println(employee.getEmployeeId()+"\t\t"+employee.getEmployeeName()+"\t\t"+employee.getSalary()+"\t\t"+employee.getJobId());
		
	}
	
	
	
	
	
	
	
	
	
	

	
}
}
