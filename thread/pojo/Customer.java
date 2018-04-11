package com.htc.thread.pojo;

public class Customer {

	int amount=15000;
	
	public synchronized void withdraw(int amount)
	{
		
		System.out.println("withdraw method called");
		
		if(this.amount<amount)
		{
			System.out.println("there is no sufficient balance");
			try
			{
				wait();
			}
			catch(Exception e)
			{
				e.printStackTrace();
			}
		}
			this.amount-=amount;
			
			System.out.println("withdraw successfully completed");
		
		
		
	}
	
	
	
	public synchronized void deposit(int amount)
	{
		System.out.println("going to deposit");
		
		this.amount=amount;
		System.out.println("deposit completed");
		
		notify();
	}
	
}
