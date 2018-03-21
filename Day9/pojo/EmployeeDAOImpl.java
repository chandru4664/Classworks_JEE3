package com.htc.Day9.pojo;

import java.util.ArrayList;
import java.util.List;

public class EmployeeDAOImpl implements EmployeeDAO {
	
	List<Employee> employeelist=new ArrayList<>();

	@Override
	public boolean addEmployee(Employee e) {
		boolean flag=false;
		
		employeelist.add(e);
		flag=true;
		
		return flag;
	}

	@Override
	public boolean removeEmployee(String employeeId) {
		boolean flag=false;
		for (Employee employee : employeelist) {
			if(employee.getEmployeeId().equals(employeeId))
			{
				employeelist.remove(employee);
				flag=true;
				break;
			}
		}
		
		
		return flag;
	}

	@Override
	public Employee getEmployee(String employeeId) throws EmployeeNotFoundException {
		
		Employee result=null;
	
		for (Employee employee : employeelist) {
			if(employee.getEmployeeId().equals(employeeId))
			{
				result=employee;
			}
		}
		
		if(result==null)
		{
			throw new EmployeeNotFoundException("Invalid EmployeeId ");
		}
		return result;
	}

	@Override
	public boolean updateEmployee(String EmployeeId, String jobId) {
		boolean flag=false;
		for (Employee employee : employeelist) {
			if(employee.getEmployeeId().equals(EmployeeId))
			{
				employee.setJobId(jobId);
				flag=true;
				break;
			}
		}
		return false;
	}

	@Override
	public List<Employee> getEmployees() {
		// TODO Auto-generated method stub
		return employeelist;
	}
	

}
