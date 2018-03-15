package com.htc.Day6.client;

import com.htc.Day6.pojo.Employee;

public class CopyDemo {

	
	public static void main(String[] args) {
		Employee employee=new Employee("e1234","rit",56879.98,"Training");
		System.out.println(employee.hashCode());
		System.out.println(employee);
		
		Employee employee2=employee;
		
		System.out.println(employee2.hashCode());
		System.out.println(employee2);
		
		Employee employee_copy=new Employee(employee.getEmployeeId(),employee.getEmployeeName(),employee.getSalary(),employee.getJobId());
		/*String id=employee.getEmployeeId();
		String name=employee.getEmployeeName();
		double salary=employee.getSalary();
		String job=employee.getJobId();
		employee_copy.setEmployeeId(id);
		employee_copy.setEmployeeName(name);
		employee_copy.setSalary(salary);
		employee_copy.setJobId(job);*/
		
		
		
		System.out.println(employee_copy.hashCode());
		System.out.println(employee_copy);
		
		
	}
}
