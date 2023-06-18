package com.jspider.Abhijit.createFile;

import java.io.File;
import java.io.IOException;

public class fileCreate {

	public static void main(String[] args) {
		File file =new File("abhi.txt");
		try {
			file.createNewFile();
			System.out.println("File created");
		} catch (IOException e) {
			
			e.printStackTrace();
		}

	}

}
