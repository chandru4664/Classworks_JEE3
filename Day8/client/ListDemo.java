package com.htc.Day8.client;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class ListDemo {
public static void main(String[] args) {
	List<Integer> list=new ArrayList<Integer>();
	List<Integer> newlist=new ArrayList<Integer>();
	
	
	newlist.add(12);
	newlist.add(23);
	
	
	list.add(45);
	list.add(10);
	list.add(20);
	list.add(90);
	list.add(10);
	
	System.out.println(list);
	//list.remove(0);
	list.remove(new Integer(45));
list.add(1,46);
System.out.println("sorted List");

Collections.sort(list);
	System.out.println(list);
	
	
	newlist.addAll(1,list);
	System.out.println("new LIst objects");
	System.out.println(newlist);
	
	System.out.println(list.size());
	
	
	/*Iterator i=list.iterator();
	while(i.hasNext())
	{
		System.out.println(i.next()+"extra text");
	}*/
	
	
	
ListIterator<Integer> i=list.listIterator();
while(i.hasNext())
{
	System.out.println(i.next());
}

System.out.println("print backward");

while(i.hasPrevious())
{
	System.out.println(i.previous());
}
	
	
	
	
	/*List<Double> list=new ArrayList<>();
	
	list.add(90.89);
	list.add(45.23);
	System.out.println(list);;
	list.remove(45.23);
	System.out.println(list);*/
	
}
}
