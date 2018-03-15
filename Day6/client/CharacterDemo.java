package com.htc.Day6.client;

public class CharacterDemo {
	
	public static void main(String[] args) {
		String str="f43hdy;'[972";
		
		System.out.println(str.length());
		char[] word=new char[str.length()];
		char[] digit=new char[str.length()];
		char[] spclchar=new char[str.length()];
		int w = 0,d=0,s=0;
		char ch[]=str.toCharArray();
		for (char c : ch) {
			
			Character cobj=Character.valueOf(c);
			if(cobj.isLetter(c))
			{
				word[w]=c;
				w++;
			}
			else if(cobj.isDigit(c))
			{
				digit[d]=c;
				d++;
			}
			else
			{
				spclchar[s]=c;
				s++;
			}
		}
		
		
		for (int i=0;i<w;i++) {
			System.out.print(word[i]);
		}
		
		for (int i=0;i<d;i++) {
			System.out.print(digit[i]);
		}
		
		for (int i=0;i<s;i++)
		{
		System.out.print(spclchar[i]);
		}
		
		
		
		String strword=String.valueOf(word);
		
		System.out.println(strword.trim()+"hi");
				
		
	}

}
