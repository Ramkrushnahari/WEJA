package com.jspider.filehandling.read;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ByteStreamRead {
	public static void main(String[] args) {
		File file = new File("Bytestram.txt");
		if(file.exists()) {
			try {
				FileInputStream fileinputstream = new FileInputStream(file);
				System.out.println("Reading data from file....");
				System.out.println(fileinputstream.read());
				fileinputstream.close();
			} catch (FileNotFoundException e) {
				System.out.println("FILE NOT FOUND...");
				e.printStackTrace();
			}catch (IOException e) {
				e.printStackTrace();
			}
		}else {
		System.out.println("file not exist...");
		}
	}
}
