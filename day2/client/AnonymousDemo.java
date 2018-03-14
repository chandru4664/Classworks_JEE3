package com.htc.day2.client;

import com.htc.day2.pojo.Animal;

public class AnonymousDemo {
public static void main(String[] args) {
	
	Animal obj=new Animal()
			{

		@Override
		public void foodhabits() {
			System.out.println("plant eating animal");
			
		}

			
		
			};
			
			
			
}
}
