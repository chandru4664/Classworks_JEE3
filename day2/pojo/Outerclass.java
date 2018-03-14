package com.htc.day2.pojo;

public class Outerclass {

	private int age;
	
	
	public void setAge(int age) {
		this.age=age;
	}
	
	public class Innerclass
	
	{
		public void disp()
		{
			System.out.println("age in outer classs"+age);
		}
		
	}
	
	
	
}
