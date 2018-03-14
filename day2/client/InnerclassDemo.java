package com.htc.day2.client;

import com.htc.day2.pojo.Outerclass;

public class InnerclassDemo {
public static void main(String[] args) {
	
	
	Outerclass obj=new Outerclass();
	obj.setAge(45);
	Outerclass.Innerclass innerobj=obj.new Innerclass();
	innerobj.disp();
}
}
