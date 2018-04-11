package com.htc.thread.client;


class Mythread extends Thread
{
	public Mythread(ThreadGroup group,String name) {
		//this.setName(name);
		super(group,name);
	}
	public void run()
	{
		for (int i = 0; i < 10; i++) {
			System.out.println(this.getName()+":"+i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}	
	}
	
}
}


class MyThread1 implements Runnable
{
Thread t;

public MyThread1(String name) {
	t=new Thread(this,name);
	t.start();
}

	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {
			System.out.println(t.getName()+":"+i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}
	
}




public class ThreadDemo {
public static void main(String[] args) throws InterruptedException
{
	ThreadGroup thgrp=new ThreadGroup("group1");
	/*MyThread1 m=new MyThread1("one");
	MyThread1 m1=new MyThread1("two");
	*/
	//Extending Thread Class
	
	Mythread t1=new Mythread(thgrp,"apple");
	Mythread t2=new Mythread(thgrp,"orange");
	System.out.println(t1);
	t1.setPriority(6);
	System.out.println(t2);
	thgrp.setMaxPriority(2);
	System.out.println(t1);
	System.out.println(t2);
	t1.join(1000);
	
	/*Thread t=Thread.currentThread();
	t.setName("myNewThread");
	t.setPriority(7);
	System.out.println(t);*/
}
}
