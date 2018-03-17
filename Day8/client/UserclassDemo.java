package com.htc.Day8.client;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

import com.htc.Day8.pojo.Employee;
import com.htc.Day8.pojo.NameComparator;
import com.htc.Day8.pojo.SalaryComparator;

public class UserclassDemo {
public static void main(String[] args) {

	Set<Employee> employees=new TreeSet<>(new SalaryComparator());
	
	employees.add(new Employee("e123","xx",87584,"Finance_manager"));
	employees.add(new Employee("E456","yy",78967,"HR_finance"));
	employees.add(new Employee("e1256","rr",8584,"HK"));
	employees.add(new Employee("E489","zz",78967,"HP"));
	
	//Collections.sort(employees,new NameComparator());
	
	
	for (Employee employee : employees) {
		System.out.println(employee);
		
	}
	
	
	
}
}
