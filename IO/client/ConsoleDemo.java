package com.htc.IO.client;

import java.io.Console;

public class ConsoleDemo {
public static void main(String[] args) {
	Console console=System.console();
	System.out.println("enter the username");
	String username=console.readLine();
	System.out.println("enter the passsword");
	String password=new String(console.readPassword());
	if(password.equals("admin"))
	{
		System.out.println("valid user");
		
	}
	else
	{
		System.out.println("invalid user");
	}
}
}
