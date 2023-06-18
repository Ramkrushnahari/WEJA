package com.jspider.filehandling.write;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class Bytestream {
	public static void main(String[] args) {
		File file = new File("Bytestram.txt");
		if(file.exists()) {
			System.out.println("FILE Already exist...");
		}else {
			try {
				file.createNewFile();
				System.out.println("File is created...");
				//create FileOutputStream Objectclass..
				FileOutputStream fileoutputstream = new FileOutputStream(file);
				//Write data in file By Using wrirte()
				fileoutputstream.write(2000);
				System.out.println("Data inserted file successfully...");
				fileoutputstream.close();
			} catch (IOException e) {
				System.out.println("File not Exist....");
				e.printStackTrace();
			}
		}
	 
	}
	
}
