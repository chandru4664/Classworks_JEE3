package com.htc.day2.client;

import com.htc.day2.pojo.AsstManager;
import com.htc.day2.pojo.Employee;
import com.htc.day2.pojo.Manager;

public class InheritanceDemo {
public static void main(String[] args) {
	Employee employee=new Manager("e12345","Ria",56231,"MAnager_HR",1.5);
	System.out.println(employee.getSalary());
	//System.out.println(employee.displayDepId());
	
}
}
