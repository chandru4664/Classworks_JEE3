package com.htc.Day1.client;

import java.util.Scanner;

public class BreakDemo {
public static void main(String[] args) {
	
	int n,sum=0;
	Scanner scan=new Scanner(System.in);
	for (int i = 0; i < 5; ) {
		
		n=scan.nextInt();
		if(n<0)
		{
		continue;	
		}
		sum=sum+n;
		i++;
	}
	System.out.println(sum);
	
}
}
