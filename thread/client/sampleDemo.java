package com.htc.thread.client;

public class sampleDemo {
public static void main(String[] args) {
	Y ovb=new Y();
}
}
class X
{

/*public X()
 * 
{
System.out.println(10);
}*/
    public X(int i)
    {
        System.out.println(1);
    }
}
 
class Y extends X
{
    public Y()
    {
    	

//super(8);
        System.out.println(2);
    }
}

