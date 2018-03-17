package com.htc.Day8.client;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;

public class MapDemo {
	public static void main(String[] args) {
		
		/*Map<Integer,String> map=new HashMap<>();
		map.put(101, "bhavani");
		map.put(102,"Anish");
		map.put(100, "Gopi");
		map.put(103, null);
		map.put(104, null);
		map.put(null,"Sumathi");
		
		System.out.println(map.keySet());
		System.out.println(map.values());
		System.out.println(map.entrySet());
		
		for(Map.Entry<Integer,String> entry:map.entrySet()) {
			System.out.println(entry.getKey() +":"+entry.getValue());
		}*/
		
		
		Map<Integer,String> map=new Hashtable<>();
		map.put(101, "bhavani");
		map.put(102,"Anish");
		map.put(100, "Gopi");
		map.put(103, "Ashok");
		map.put(104, "prasad");
		map.put(105,"Sumathi");
		
		System.out.println(map.entrySet());
		
	}

}
