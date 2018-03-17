package com.htc.Day8.pojo;

import java.util.List;

public interface EmployeeDAO {
boolean addEmployee(Employee e);
boolean removeEmployee(String employeeId);
Employee getEmployee(String employeeId);
boolean updateEmployee(String EmployeeId,String jobId);

List<Employee> getEmployees();

}
