package com.htc.IO.client;

import java.io.ByteArrayOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class bYTEaRRAYdEMO {
	public static void main(String[] args) throws IOException {
		ByteArrayOutputStream bos=new ByteArrayOutputStream();
		
		String str="The String class represents character strings. All string literals in Java programs, such as "
				+ "\"abc\" , are implemented as instances of this class. Strings are "
				+ "constant; their values cannot be changed after they are created. String buffers support"
				+ " mutable strings. Because String objects are immutable they can be shared.";
		
		byte[] data=str.getBytes();
		try {
			bos.write(data);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		FileOutputStream fout=new FileOutputStream("file1.txt");
		FileOutputStream fout2=new FileOutputStream("file2.txt");
		FileOutputStream fout3=new FileOutputStream("file3.txt");
		
		bos.writeTo(fout);
		bos.writeTo(fout2);
		bos.writeTo(fout3);
		
		System.out.println("data has been written ");
		
		fout3.close();
		fout2.close();
		fout.close();
		bos.close();
	}

}
