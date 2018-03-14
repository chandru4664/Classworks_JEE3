package com.htc.day2.client;

import com.htc.day2.pojo.Product;

class Example
{
	static void display() //static method
	{
		
		System.out.println("Hi hello-Example");
		
	}
}

public class ProductDemo {
	static int a;
	
	int add(int x,int y)
	{
		return x+y;
	}
	
	
	static void display() //static method
	{
		
		System.out.println("Hi hello");
		
	}
	
public static void main(String[] args) {
Example.display();//calling static method
	
	ProductDemo pr=new ProductDemo();
	pr.add(45, 56);
	
	
	Product product1 = new Product();
	Product product2=new Product(102,"pencil",2.50);
	
	product2.setPrice(5.50);
	product1.setProductId(101);
	product1.setProductDescription("pen");
	product1.setPrice(10.50);
	
	
	
	double totalamouunt = product1.getPrice()*5;
	
	System.out.println(product1.getProductDescription());
	System.out.println(totalamouunt);
	
	
	System.out.println("product2");
	System.out.println("pencil price:"+product2.getPrice());
	
	System.out.println(product2);
	
	
	
	
	
}
}
