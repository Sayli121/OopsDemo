package com.valuemomentum.training.concurrency;

public class ThreadRunExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread t1=new Thread(new HeavyWorkRunnable(), "t1");
		Thread t2=new Thread(new HeavyWorkRunnable(), "t2");
		t1.start(); //invoke run method
		t2.start();
		System.out.println("Starting Runnable threads");
		Thread t3=new MyThread2("t3");
		Thread t4=new MyThread2("t4");
		
		System.out.println("String MyThreads");
		t3.start();
		t4.start();
		System.out.println("MyThreads has been started");

	}

}
