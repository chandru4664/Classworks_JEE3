package com.htc.day2.pojo;

public interface IPrintable extends I1,I3{

	String FORMAT="A4";
	 void show();
	String print();
	
	interface I2 {

		String fillAttendence();
		
	}
}
