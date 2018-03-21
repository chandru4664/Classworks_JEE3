package com.htc.Day9.client;

import java.io.FileInputStream;

public class ExceptionDemo {
public static void main(String[] args) {
	int[] arr=new int[10];
	try
		{
		
		
		arr[10]=100;
		
	}
	catch(ArrayIndexOutOfBoundsException aie)
	{
		System.out.println(aie);
	}
	
	finally
	{
		
		try
		{
			int i=Integer.parseInt("123r");
		}
		catch(NumberFormatException nf)
		{
			System.out.println(nf);
		}
		System.out.println("finally block");
	}
	System.out.println("end of the program");
}
}
