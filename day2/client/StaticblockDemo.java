package com.htc.day2.client;






class Demo
{
	
	
	static 
	{
		int a=10;
		System.out.println("static block received your request");
	}
	
	
	{
		
		System.out.println("ddefault block");
		
	}
	
	static void show()
	
	{
		System.out.println("static function");
		
	}
}




public class StaticblockDemo {

	
	
	
	public static void main(String[] args) {
		
		System.out.println("main function");
		Demo.show();
		/*Demo d=new Demo();
		Demo d1=new Demo();
		Demo d2=new Demo();
		Demo d3=new Demo();
	*/
	}
	
	
}
