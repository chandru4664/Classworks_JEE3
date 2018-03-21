package com.htc.Day9.client;

import com.htc.Day9.pojo.Employee;
import com.htc.Day9.pojo.EmployeeDAO;
import com.htc.Day9.pojo.EmployeeDAOImpl;
import com.htc.Day9.pojo.EmployeeNotFoundException;

public class UserDefinedExceptionDemo {
public static void main(String[] args) {
EmployeeDAO dao=new EmployeeDAOImpl();
	
	dao.addEmployee(new Employee("e1234","xxx",67979,"hR_rep"));
	dao.addEmployee(new Employee("e1254","sss",4579,"hR_timeoffice"));
	dao.addEmployee(new Employee("e154","ggg",65679,"hR_payroll"));
	
	try {
		System.out.println(dao.getEmployee("e125"));
	} catch (EmployeeNotFoundException e) {
		// TODO Auto-generated catch block
		System.out.println(e.getMessage());
	}
}
}
