package com.jspider.filehandling.fileinfo;

import java.io.File;

public class fileInfo {

	public static void main(String[] args) {
		File file = new File("Hello.txt");
		if(file.exists()) {
			System.out.println("FILE NAME IS: "+file.getName());
			System.out.println("FILE PATH IS: "+file.getAbsolutePath());
			System.out.println("LENGTH OF FILE IS: "+file.length());
			
			//READABLE FILE USE canRead()....
			if(file.canRead()) {
				System.out.println("FILE IS READABLE....");
			}else {
				System.out.println("FILE IS NOT READABLE...PLEASE CHECK DATA IN FILE..");
			}
			//WRITABLE FILE USE canWrite()....
			if(file.canWrite()) {
				System.out.println("FILE IS WRITABLE...");
			}else {
				System.out.println("FILE IS NOT WRITABLE....NO DATA FOUND");
			}
			//EXECUTABLE FILE USE canExecute()....
			if(file.canExecute()) {
				System.out.println("FILE IS EXECUTABLE.....");
				
			}else {
				System.out.println("FILE IS NOT EXECUTABLE....PLEASE CHECK");
				
			}
		}else {
			System.out.println("FILE DOES NOT EXIST.....THANK YOU");
		}

	}

}
