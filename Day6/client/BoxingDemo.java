package com.htc.Day6.client;

public class BoxingDemo {
public static void main(String[] args) {
	int i=10;
	Integer integer=i;//Autoboxing
	
	Integer intobj=Integer.valueOf(i);//Boxing
	
	int x=integer.intValue();//unBoxing
	int y=Integer.parseInt("123u");
	System.out.println(y+10);
}
}
