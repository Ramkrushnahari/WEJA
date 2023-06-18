package com.jspider.filehandling.create;

import java.io.File;
import java.io.IOException;

public class CreateFileDemo1 {
	public static void main(String[] args) {
		File file = new File("Hello.txt");
		try {
			file.createNewFile();
			System.out.println(file.getName()+" FILE IS CREATED SUCCESSFULLY.....");
			
		} catch (IOException e) {
			
			e.printStackTrace();
		}
	}
}
