package com.htc.day2.pojo;

public class Developer extends Employee implements IPrintable,IPrintable.I2 {
	public static final double EXTRAPAY=250.00;
	int extra_hours;

	public int getExtra_hours() {
		return extra_hours;
	}

	public void setExtra_hours(int extra_hours) {
		this.extra_hours = extra_hours;
	}

	@Override
	public double grossSalary() {
		// TODO Auto-generated method stub
		System.out.println("Developer method");
		return super.getSalary()+extra_hours*EXTRAPAY;
	}

	public Developer(String employeeId, String employeeName, double salary, String jobId, int extra_hours) {
		super(employeeId, employeeName, salary, jobId);
		this.extra_hours = extra_hours;
	}

	@Override
	public String fillAttendence() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void show() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public String print() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void getReport() {
		// TODO Auto-generated method stub
		
	}

	
	
	}

	

	


