package com.htc.IO.client;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class InputTSreamDemo {
public static void main(String[] args) throws IOException {
	/*int a=System.in.read();
	System.out.println((char)a);*/
	/*InputStreamReader ir=new InputStreamReader(System.in);
	BufferedReader br=new BufferedReader(ir);*/
	
	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	
	
	DataInputStream datainput=new DataInputStream(System.in);
	
	String name=datainput.readLine();
	System.out.println(name);
	
	
	
}
}
