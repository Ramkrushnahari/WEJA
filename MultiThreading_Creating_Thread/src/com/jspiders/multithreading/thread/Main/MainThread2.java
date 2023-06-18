package com.jspiders.multithreading.thread.Main;

import com.jspiders.multithreading.thread.MyThread2;

public class MainThread2 {

	public static void main(String[] args) {
		MyThread2 Mythread2 = new MyThread2();
		Thread Thread =new Thread(Mythread2);
		Thread.start();
	}

}
