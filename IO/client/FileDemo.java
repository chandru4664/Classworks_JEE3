package com.htc.IO.client;

import java.io.File;

public class FileDemo {
public static void main(String[] args) {
	File file=new File("D:\\onsit training");
	System.out.println(file.getAbsolutePath());
	System.out.println(file.getParent());
	System.out.println(file.exists());
	System.out.println(file.getFreeSpace());
	System.out.println(file.isFile());
	
	File[] files=file.listFiles();
	for (File file2 : files) {
		System.out.println(file2.getName());
		
	}
	
	
	
	
	
}
}
