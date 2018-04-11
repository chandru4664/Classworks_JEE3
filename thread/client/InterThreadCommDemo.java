package com.htc.thread.client;

import com.htc.thread.pojo.Customer;

public class InterThreadCommDemo {
public static void main(String[] args) {
	Customer customer=new Customer();
	
	new Thread() {
		public void run()
		{
			customer.withdraw(20000);
		}
	}.start();
	
	
	
	new Thread() {
		public void run()
		{
			customer.deposit(20000);
		}
	}.start();
}
}
