package com.htc.Day9.pojo;

public class EmployeeNotFoundException extends Exception {
	String error_messsage;

	public EmployeeNotFoundException() {
		super();
		// TODO Auto-generated constructor stub
	}

	public EmployeeNotFoundException(String message) {
		//super(message);
		
		this.error_messsage=message;
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "EmployeeNotFoundException [error_messsage=" + error_messsage + "]";
	}

	@Override
	public String getMessage() {
		// TODO Auto-generated method stub
		return this.error_messsage;
	}
	
	
	
	

}
