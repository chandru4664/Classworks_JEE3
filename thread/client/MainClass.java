package com.htc.thread.client;

 
	class A
	{
	    int i = 10;
	    void disp()
	    {
	    	System.out.println("A's method");
	    }
	}
	 
	class B extends A
	{
	    int i = 20;
	    void disp()
	    {
	    	System.out.println("B's method");
	    }
	}
	 
	public class MainClass
	{
	    public static void main(String[] args)
	    {
	        A a = new B();
	 a.disp();
	        System.out.println(a.i);
	    }
	}

