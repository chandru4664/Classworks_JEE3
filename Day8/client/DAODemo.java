package com.htc.Day8.client;

import com.htc.Day8.pojo.Employee;
import com.htc.Day8.pojo.EmployeeDAO;
import com.htc.Day8.pojo.EmployeeDAOImpl;

public class DAODemo {
public static void main(String[] args) {
	EmployeeDAO dao=new EmployeeDAOImpl();
	
	dao.addEmployee(new Employee("e1234","xxx",67979,"hR_rep"));
	dao.addEmployee(new Employee("e1254","sss",4579,"hR_timeoffice"));
	dao.addEmployee(new Employee("e154","ggg",65679,"hR_payroll"));
	
	System.out.println(dao.getEmployee("e1254"));
}
}
