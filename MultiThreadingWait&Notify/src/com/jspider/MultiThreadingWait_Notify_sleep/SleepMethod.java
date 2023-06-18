package com.jspider.MultiThreadingWait_Notify_sleep;

public class SleepMethod {
	public static void main(String[] args) {
		String message ="This is the magic of sleep() method.";
		char [] msgArray=message.toCharArray();
		
		for(int i=0; i<message.length(); i++) {
			System.out.print(msgArray[i]);
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

}
