package com.htc.day7.client;

import java.util.Arrays;
import java.util.Scanner;

public class ArrraysDemo {
public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
			
/*System.out.println("enter 5 nos");
			
	
	int[] arr=new int[5];
	for (int i=0;i<arr.length;i++) {
	arr[i]=scan.nextInt();	
	
	}
	System.out.println("before sorting");
	for (int i : arr) {
		System.out.println(i);
	}
	
	Arrays.sort(arr);
	System.out.println("after sorting");
	for (int i : arr) {
		System.out.println(i);
	}
	
	
	System.out.println("using tostring");
	System.out.println(Arrays.toString(arr));
	*/
	
	String[] str= {"ria","rithish","parthiv","aaradhana"};
	
	Arrays.sort(str);
	
	for (String string : str) {
		System.out.println(string);
	}
	
	
	
	
	
	
	
}
}
