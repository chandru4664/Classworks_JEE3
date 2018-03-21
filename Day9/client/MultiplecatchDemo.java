package com.htc.Day9.client;

public class MultiplecatchDemo {
public static void main(String[] args) {
	try
	{
		String str=null;
		System.out.println(str.concat("Welcome"));
	}
	
	catch(ArithmeticException ae)
	{
System.out.println(ae);
	}
	catch(ClassCastException cc)
	{
		System.out.println(cc);
		
	}
	catch(Exception e)
	{
		System.out.println(e);
	}
	
	
	
}
}
