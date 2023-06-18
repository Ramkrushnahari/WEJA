package com.jspiders.multithreading.thread.Main;

import com.jspiders.multithreading.thread.Mythread3;

public class mainThread3 {

	public static void main(String[] args) {
		Mythread3 Mythread = new Mythread3();
		Mythread.setName("Thread3");
		Mythread.start();
	}

}
