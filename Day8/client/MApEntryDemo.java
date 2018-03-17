package com.htc.Day8.client;

import java.util.HashMap;
import java.util.Map;

public class MApEntryDemo {
public static void main(String[] args) {

	Map<String,Double> students=new HashMap<>();
	Map<String,String> result=new HashMap<>();
	students.put("xxx", 86.23);
	students.put("yyy",56.5);
	students.put("zzz", 76.23);
	System.out.println(students.entrySet());
	
for(Map.Entry<String,Double> entry:students.entrySet())
{
	
	if(entry.getValue()>90)
			
	{
		result.put(entry.getKey(), "outstanding");
	}
	
	else if(entry.getValue()>75&& entry.getValue()<90)
	{
		result.put(entry.getKey(), "Excellent");
	}
	else if(entry.getValue()>65&& entry.getValue()<75)
	{
		result.put(entry.getKey(), "good");
	}
	
	else
	{
		result.put(entry.getKey(),"fail");
	}
}
	

System.out.println(result.entrySet());
	
	
}
}
