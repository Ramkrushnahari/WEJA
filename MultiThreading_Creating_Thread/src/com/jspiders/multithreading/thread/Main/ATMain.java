package com.jspiders.multithreading.thread.Main;

import com.jspiders.multithreading.thread.MyThread1;
import com.jspiders.multithreading.thread.MyThread2;

public class ATMain {

	public static void main(String[] args) {
		MyThread1 MyThread1 = new MyThread1() ;
		MyThread2 MyThread2 = new MyThread2();
		Thread Thread = new Thread(MyThread2);
		
		//Call start() of MyThread1 obj ref variable...
		MyThread1.start();
		//call thread class ref vairiable where can start () internally call run().
		Thread.start();

	}

}
