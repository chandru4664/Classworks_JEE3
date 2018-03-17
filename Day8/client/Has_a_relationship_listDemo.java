package com.htc.Day8.client;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.htc.Day8.pojo.Department;
import com.htc.Day8.pojo.Employee;

public class Has_a_relationship_listDemo {
public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	Department training=new Department("Dt006","Training Department");
	
	List<Employee> employees=new ArrayList<>();
	
	//int[] arr=new int[10];
	
	
	
	/*	System.out.println("enter employeeId");
		String id=scan.nextLine();
		System.out.println("enter employeName");
		String name=scan.nextLine();
		System.out.println("enter salary");
		double salary=Double.parseDouble(scan.nextLine());
		System.out.println("enter JobId");
		String jobid=scan.nextLine();*/
		employees.add(new Employee("e123","xx",87584,"Finance"));
		employees.add(new Employee("E456","yy",78967,"HR"));
		
	
			
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
