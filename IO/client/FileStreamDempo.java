package com.htc.IO.client;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.FilterInputStream;
import java.io.FilterReader;
import java.io.IOException;

import com.htc.IO.pojo.Employee;

public class FileStreamDempo {
public static void main(String[] args) throws IOException {
	//String data="file output demo";
/*FileOutputStream fout=new FileOutputStream("test1.txt",true);
try {
	fout.write(data.getBytes());
} catch (IOException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}
System.out.println("data has been written");
fout.close();
}*/
int i;
	/*FileInputStream filein=new FileInputStream("test1.txt");
	while( (i=filein.read())!=-1)
	{
		System.out.print((char)i);
	}
	filein.close();*/
	
	
/*FileReader fr=new FileReader("test1.txt");
BufferedReader br=new BufferedReader(fr);
System.out.println(br.readLine());

br.close();
fr.close();*/
Employee employee=new Employee("E002","yyy",68734,"Trainer");
String str=employee.toString()+"\r\n";
FileWriter fw=new FileWriter("emprecord.txt",true);

fw.write(str);
System.out.println("file creatde");
fw.close();




















}
}
