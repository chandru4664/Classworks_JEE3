package com.htc.day7.pojo;

import java.util.Comparator;

public class NameComparator  implements Comparator<Employee>{

	@Override
	public int compare(Employee o1, Employee o2) {
		
		return o1.getEmployeeName().compareTo(o2.getEmployeeName());
	}

}
