package com.htc.day2.pojo;

public class Manager extends Employee  implements IPrintable{

	double benefit_rate;
	String deptId="Finance";

	public double getBenefit_rate() {
		return benefit_rate;
	}

	public void setBenefit_rate(double benefit_rate) {
		this.benefit_rate = benefit_rate;
	}

	public Manager(String employeeId, String employeeName, double salary, String jobId, double benefit_rate) {
		super(employeeId, employeeName, salary, jobId);
		this.benefit_rate = benefit_rate;
		
	}
	
	
public double grossSalary()
	{
		System.out.println("calling Manager getSalary()");
		return super.getSalary()+(super.getSalary()*benefit_rate/100);
		
	}
	

	public Manager() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Manager [benefit_rate=" + benefit_rate + ", employeeId=" + getEmployeeId() + ", employeeName=" + getEmployeeName()
				+ ", salary=" + getSalary() + ", jobId=" + getJobId() + "]";
	}

	@Override
	public void show() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public String print() {
		// TODO Auto-generated method stub
		return "generate report";
	}
	
	
	
	/*public String displayDepId()
	{
		super.deptId="Development";
		return super.deptId;
	}*/
	
}
