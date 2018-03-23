package com.htc.IO.client;

import java.io.CharArrayWriter;
import java.io.FileWriter;
import java.io.IOException;

public class CharArrayWriterDemo {
public static void main(String[] args) throws IOException {
	CharArrayWriter charbuf=new CharArrayWriter();
	String str="The String class represents character strings. All string literals in Java programs, such as "
			+ "\"abc\" , are implemented as instances of this class. Strings are "
			+ "constant; their values cannot be changed after they are created. String buffers support"
			+ " mutable strings. Because String objects are immutable they can be shared.";
	char[] data=str.toCharArray();
	
	charbuf.write(data,5,50);
	
	//System.out.println(charbuf.toString());
	
	FileWriter fw=new FileWriter("data.txt");
	FileWriter fw1=new FileWriter("data1.txt");
	FileWriter fw2=new FileWriter("data2.txt");
	FileWriter fw3=new FileWriter("data3.txt");
	
	charbuf.writeTo(fw3);
	charbuf.writeTo(fw2);
	charbuf.writeTo(fw1);
	charbuf.writeTo(fw);
	
	fw.close();
	fw1.close();
	fw2.close();
	fw3.close();
}
}
