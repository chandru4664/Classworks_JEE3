package com.htc.Day9.client;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ThrowsDemo {

	static void m() throws ArithmeticException
	{
		int i=10/0;
	}
	
	static void n() throws ArithmeticException
	{
		m();
	}
	
	static void q() throws ArithmeticException
	{
		n();
	}
	
	public static void main(String[] args) throws FileNotFoundException, ClassNotFoundException {
		FileInputStream file=new FileInputStream("hello.txt");
		Class.forName("org.Driver.postgresql");
		
		/*try
		{
		q();
		}
		catch(ArithmeticException ae)
		{
			ae.printStackTrace();
		}*/
		
		System.out.println("end of program");
	}
	
	
}
