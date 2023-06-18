package com.jspiders.multithreading.thread;

public class MyThread2 implements Runnable{

	@Override
	public void run() {
		System.out.println(Thread.currentThread().getName()+" MyThread2 is Running.....");
	}
	
}
