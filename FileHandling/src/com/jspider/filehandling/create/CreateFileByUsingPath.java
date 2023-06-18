package com.jspider.filehandling.create;

import java.io.File;
import java.io.IOException;

public class CreateFileByUsingPath {

	public static void main(String[] args) {
		 File file = new File("D:\\RKBackup\\WEJA1\\FileHandling\\Hello.txt");
		 if(file.exists()) {
			 System.out.println(file.getName()+" FILE IS ALREADY EXIST..");
		 }
		 else {
			 try {
				file.createNewFile();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		 }
	}

}
