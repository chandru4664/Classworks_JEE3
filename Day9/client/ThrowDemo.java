package com.htc.Day9.client;

public class ThrowDemo {
	
	
	int age=8;
	void checkage() throws ArithmeticException
	{
	if(age<10)
	{
		throw new ArithmeticException("age not valid");
	}
	}
	
	void callcheckage()throws ArithmeticException
	{
		checkage();
	}
	
	
public static void main(String[] args) {
	ThrowDemo t=new ThrowDemo();
	try
	{
	t.callcheckage();
	}
	catch(ArithmeticException ae)
	{
		System.out.println(ae);
	}
	System.out.println("end of program");
	
}
}
