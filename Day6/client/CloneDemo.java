package com.htc.Day6.client;

import com.htc.Day6.pojo.Employee;

public class CloneDemo {
	public static void main(String[] args) {
		
		Employee employee=new Employee("e1234","rithika",56879.98,"Training");

try {
	Employee employee_clone=(Employee)employee.clone();
	
	System.out.println(employee_clone);
} catch (CloneNotSupportedException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}
	}

}
