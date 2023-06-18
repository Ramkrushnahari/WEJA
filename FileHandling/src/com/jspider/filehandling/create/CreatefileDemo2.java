package com.jspider.filehandling.create;

import java.io.File;
import java.io.IOException;

public class CreatefileDemo2 {

	public static void main(String[] args) {
		File file = new File("Hello.txt");
		if(file.exists()) {
			System.out.println("FILE IS ALREADY EXIST..!!\nPLEASE CHANGE THE NAME OF FILE...");
		}
		else {
			try {
				file.createNewFile();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

}
