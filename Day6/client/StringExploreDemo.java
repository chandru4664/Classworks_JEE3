package com.htc.Day6.client;

public class StringExploreDemo {
public static void main(String[] args) {
	
	String string1="This ,is, my, first ,example to explain string concept";
	
	System.out.println(string1.length());
	
	System.out.println(string1.charAt(5));
	System.out.println(string1.contains("example"));
	
	System.out.println(string1.isEmpty());
	
	System.out.println(string1.substring(7, 12));
	
	System.out.println(string1.indexOf("is"));
	
	System.out.println(string1.concat(" in java"));
	
	System.out.println(string1.endsWith("concept"));
	
	System.out.println(string1.startsWith("This"));
	
	System.out.println(string1.replace("string","string Buffer"));
	
	
String[] strarr=string1.split(",");

for (String string2 : strarr) {
	System.out.println(string2);
	
}
}
}
