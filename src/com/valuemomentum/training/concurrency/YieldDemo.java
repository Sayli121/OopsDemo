package com.valuemomentum.training.concurrency;

class MyThread5 extends Thread{
public void run()
{
	for (int i=0;i<5;i++)
		System.out.println(Thread.currentThread().getName()+ " in control");
	
}}



public class YieldDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      MyThread5 t=new MyThread5();
      t.start();
      for (int i=0;i<5;i++)
      {   //control passes to child thread
    	  Thread.yield();
    	  //after executin of child thread main thread takes over
    	  System.out.println(Thread.currentThread().getName()+ " in control");
      }
	}

}
