package com.jspiders.multithreding.properties.main;

import com.jspiders.multithreading.thread.MyThread2;

public class MainthreadProperty {
	public static void main(String[] args) {
		MyThread2 mt2 = new MyThread2();
		Thread T =new Thread(mt2);
		T.setName("Thread set");
		T.setPriority(2);
		
		T.start();
	}
}
