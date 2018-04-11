package com.htc.thread.client;

import javax.swing.plaf.synth.SynthSpinnerUI;

class Demo
{
	 void display()
	{
		System.out.println("[");
		System.out.println("welocme");
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("]");
	}
	
}


class MythreadDemo extends Thread

{
	
	Demo d;
	
	public MythreadDemo(Demo d) {
		this.d=d;
	}
	
	
	public void run()
	{
		synchronized (this.d) {
			this.d.display();
		}
		
	}
}



public class SynchronizedDemo {
public static void main(String[] args) {
	Demo demo=new Demo();
	MythreadDemo thread1=new MythreadDemo(demo);
	
	MythreadDemo thread2=new MythreadDemo(demo);
	thread1.start();
	thread2.start();
}
}
