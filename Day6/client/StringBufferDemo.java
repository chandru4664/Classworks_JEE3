package com.htc.Day6.client;

public class StringBufferDemo {
public static void main(String[] args) {
	String str="my example";
	
//	System.out.println(str.hashCode());
	
	StringBuffer sb=new StringBuffer(str);
	//System.out.println(sb.insert(3,"java ").hashCode());
	
	System.out.println(sb.insert(3,"java ").toString());
	System.out.println(sb.reverse().toString());
	
	
}
}
