package com.htc.day7.pojo;

import java.util.Arrays;

public class Department {
	String DepartmentId;
	String DepartmentName;
	Employee[] employees;
	
	@Override
	public String toString() {
		return "Department [DepartmentId=" + DepartmentId + ", DepartmentName=" + DepartmentName + ", employees="
				+ Arrays.toString(employees) + "]";
	}

	public Department() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Department(String departmentId, String departmentName) {
		super();
		DepartmentId = departmentId;
		DepartmentName = departmentName;
	}

	public String getDepartmentId() {
		return DepartmentId;
	}

	public void setDepartmentId(String departmentId) {
		DepartmentId = departmentId;
	}

	public String getDepartmentName() {
		return DepartmentName;
	}

	public void setDepartmentName(String departmentName) {
		DepartmentName = departmentName;
	}

	public Employee[] getEmployees() {
		return employees;
	}

	public void setEmployees(Employee[] employees) {
		this.employees = employees;
	}
	
	
	
	
	

}
