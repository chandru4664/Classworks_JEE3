package com.htc.Day8.pojo;

import java.util.Comparator;

public class SalaryComparator implements Comparator<Employee> {

	@Override
	public int compare(Employee o1, Employee o2) {
		
		return new Double(o1.getSalary()).compareTo(new Double(o2.getSalary()));
	}

	

}
