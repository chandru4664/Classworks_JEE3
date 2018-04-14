package com.htc.webapp.model;

import java.util.ArrayList;
import java.util.List;

public class Book {

	List<String> result=new ArrayList<>();
	
	
	public List<String> getBookbyCategory(String category)
	{
		if(category.equalsIgnoreCase("java"))
		{
			result.add("java book1");
			result.add("java book2");
			
			result.add("java book3");
			result.add("java book4");
			result.add("java book5");
		}
		else if(category.equalsIgnoreCase("dotnet"))
		{
			result.add("dotnet1");
			result.add("dotnet3");
			result.add("dotnet2");
			result.add("dotnet4");
		}
		else if(category.equalsIgnoreCase("android"))
		{
			result.add("android1");
			result.add("android2");
			result.add("android3");
			result.add("android4");
		}
		
		
		
		return result;
		
	}
}
