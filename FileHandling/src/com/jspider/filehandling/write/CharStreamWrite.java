package com.jspider.filehandling.write;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class CharStreamWrite {

	public static void main(String[] args) 
	{	
	
		File file = new File("charStream.txt");
		if(file.exists()) {
			System.out.println("FILE IS ALREADY EXIST");
		}else {
			try {
				file.createNewFile();
				System.out.println("File is created");
				System.out.println("read()Method...called");
				FileWriter fw= new FileWriter(file);
				fw.write("Data in file.....\n Rambhau Kenjale..");
				System.out.println("Data is written in the file is succeessfully....");
				fw.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}