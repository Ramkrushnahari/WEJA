package com.jspider.filehandling.delete;

import java.io.File;

public class DeleteFile {
	public static void main(String[] args) {
		File file =new File("Hello.txt");
		if(file.exists()) {
			file.delete();
			System.out.println(file.getAbsolutePath()+" FILE DELETED SUCCESSFULLY.....");
			
		}else {
			System.out.println(file.getName()+" FILE DOES NOT EXISTS...");
		}
	}
}
