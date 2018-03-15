package com.htc.Day6.client;

public class STringDemo {
public static void main(String[] args) {
	String str="HTC Global Services";
	String companyname="HTC Global Services";
	String name=new String ("HTC Global Services");
/*if(str.equals(name))
{
	System.out.println("true");
}
else
{
	 System.out.println("false");
}*/
	
	char ch[]=str.toCharArray();
	
	for(char a:ch)
	{
	String string1=String.valueOf(a);
	
	if(!string1.matches("[aeiouAEIOU]"))
	{
		System.out.print(string1);
	}
	
	 		
}
}
}
