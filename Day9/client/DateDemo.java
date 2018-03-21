package com.htc.Day9.client;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class DateDemo {
public static void main(String[] args) {
	/*Date d=new Date();
	System.out.println(d);*/
	System.out.println("enter date in the following format dd-MM-yyyy");
	Scanner scan=new Scanner(System.in);
	Date doj = null;
	SimpleDateFormat df=new SimpleDateFormat("dd-MM-yyy");
	
	try {
		doj=df.parse((scan.nextLine()));
	} catch (ParseException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	System.out.println(doj);
}
}
