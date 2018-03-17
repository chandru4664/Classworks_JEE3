package com.htc.Day8.pojo;

import java.util.Arrays;
import java.util.List;

public class Department {
	String DepartmentId;
	String DepartmentName;
	List<Employee> employees;
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
	public List<Employee> getEmployees() {
		return employees;
	}
	public void setEmployees(List<Employee> employees) {
		this.employees = employees;
	}
	public Department(String departmentId, String departmentName) {
		super();
		DepartmentId = departmentId;
		DepartmentName = departmentName;
	}
	public Department() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((DepartmentId == null) ? 0 : DepartmentId.hashCode());
		result = prime * result + ((DepartmentName == null) ? 0 : DepartmentName.hashCode());
		result = prime * result + ((employees == null) ? 0 : employees.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Department other = (Department) obj;
		if (DepartmentId == null) {
			if (other.DepartmentId != null)
				return false;
		} else if (!DepartmentId.equals(other.DepartmentId))
			return false;
		if (DepartmentName == null) {
			if (other.DepartmentName != null)
				return false;
		} else if (!DepartmentName.equals(other.DepartmentName))
			return false;
		if (employees == null) {
			if (other.employees != null)
				return false;
		} else if (!employees.equals(other.employees))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Department [DepartmentId=" + DepartmentId + ", DepartmentName=" + DepartmentName + ", employees="
				+ employees + "]";
	}
	

	
	
	

}
