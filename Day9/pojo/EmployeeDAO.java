package com.htc.Day9.pojo;

import java.util.List;

public interface EmployeeDAO {
boolean addEmployee(Employee e) ;
boolean removeEmployee(String employeeId);
Employee getEmployee(String employeeId) throws EmployeeNotFoundException;
boolean updateEmployee(String EmployeeId,String jobId);

List<Employee> getEmployees();

}
