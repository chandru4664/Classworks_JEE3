package com.htc.IO.client;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Date;

import com.htc.IO.pojo.Employee;

public class SerializeDemo {
	
	
	public  void writedata(Object o) throws IOException
	{
	//Date d=(Date)o;	
		
		Employee employee=(Employee)o;
	FileOutputStream fout=new FileOutputStream("D\\employee.txt");
	ObjectOutputStream serialize=new ObjectOutputStream(fout);
	serialize.writeObject(employee);	
	
	fout.close();
	serialize.close();
	}
	
	public Object readData() throws IOException, ClassNotFoundException
	{
		FileInputStream fin=new FileInputStream("employee.txt");
		ObjectInputStream deserialize=new ObjectInputStream(fin);
		
		return deserialize.readObject();
		
	}
	
	
	
public static void main(String[] args) {
	SerializeDemo s=new SerializeDemo();
Employee employee=new Employee("E001","xxx",30898,"Training coordinator");
/*	try {
		s.writedata(employee);
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	*/
	Employee filedata=null;
	
	try {
		filedata=(Employee)s.readData();
	} catch (ClassNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	
	System.out.println(filedata);
	
	
	
	
	
	
	
	
	
	
	
	
}
}
