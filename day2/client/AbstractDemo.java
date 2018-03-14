package com.htc.day2.client;

import com.htc.day2.pojo.Developer;
import com.htc.day2.pojo.Employee;
import com.htc.day2.pojo.Manager;

public class AbstractDemo {
public static void main(String[] args) {
	Employee employee=new Manager("e12345","Ria",56231,"MAnager_HR",1.5);
	System.out.println(employee.grossSalary());
	
	Employee employee_Dev=new Developer("e4567","sadhana",45556,"developer",8);
	
	System.out.println(employee_Dev.grossSalary());
}
}
