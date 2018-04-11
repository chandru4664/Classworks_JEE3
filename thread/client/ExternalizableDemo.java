package com.htc.thread.client;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import com.htc.thread.pojo.Person;

public class ExternalizableDemo {
	
	public Person readSerializeData() throws IOException, ClassNotFoundException
	{
		
		Person person=null;
		FileInputStream fin=new FileInputStream("person.txt");
		ObjectInputStream obInput=new ObjectInputStream(fin);
		person=(Person)obInput.readObject();
		System.out.println("file has been created");
		obInput.close();
		fin.close();
		return person;
	}
	
	public void writeSerializeData(Person person) throws IOException
	{
		FileOutputStream fout=new FileOutputStream("person.txt");
		ObjectOutputStream obout=new ObjectOutputStream(fout);
		obout.writeObject(person);
		System.out.println("file has been created");
		obout.flush();
		fout.close();
	}
public static void main(String[] args) {
	ExternalizableDemo demo=new ExternalizableDemo();
	//Person person=new Person("Bob","male",23);
	/*try {
		demo.writeSerializeData(person);
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}*/
	
	try {
		System.out.println(demo.readSerializeData());
	} catch (ClassNotFoundException | IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
}
}
