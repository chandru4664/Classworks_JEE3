package com.htc.Day8.client;

import java.util.Enumeration;
import java.util.Vector;

public class VectorDemo {
public static void main(String[] args) {
	Vector vector= new Vector(3);
	
	
	vector.add(45);
	vector.add(90);vector.add(89);
	System.out.println(vector.size());
	System.out.println(vector.capacity());
	vector.add(45);
	System.out.println(vector.size());
	System.out.println(vector.capacity());
	
	Enumeration e=vector.elements();
	while(e.hasMoreElements())
	{
		System.out.println(e.nextElement());
	}
	
}
}
