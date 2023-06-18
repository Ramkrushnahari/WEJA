package com.jspider.filehandling.read;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class CharStreamRead {
	public static void main(String[] args) {
		File file = new File("charStream.txt");
		if(file.exists()) {
			System.out.println("File already Present");
			try {
				FileReader fr = new FileReader(file);
				System.out.println("Reading data from file...");
				System.out.println("read()"+fr.read());
				Scanner sc = new Scanner(file);
				System.out.println("Scanner output is");
				while(sc.hasNextLine()) {
					System.out.println(sc.nextLine());
				}
				sc.close();
				fr.close();
			}catch(FileNotFoundException e) {
				e.printStackTrace();
			}catch (IOException e) {
				e.printStackTrace();
			}
		}else {
			System.out.println("File Not created....");
		}
	}
}
