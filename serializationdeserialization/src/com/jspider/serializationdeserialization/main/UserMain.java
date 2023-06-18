package com.jspider.serializationdeserialization.main;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import com.jspider.serializationdeserialization.object.User;

public class UserMain {
	public static void main(String[] args) {
		File file;
		FileInputStream fileInputStream;// Used for To read byteStream Data...from file.
		FileOutputStream fileOutputStream;//// Used for To write byteStream Data...from file.

		try {
			file = new File("Object.txt");
			if (file.exists()) {
				System.out.println("File is already exist..");
			} else {
				file.createNewFile();
				System.out.println("file is created....Please Check");
			}
			// SERIALIZATION>>>>>>
			System.out.println("<<<<<<SERIALIZATION-->CONVERT JAVA OBJECT INTO ByteSTREAM OBJECT>>>>>>");
			fileOutputStream = new FileOutputStream(file);
			ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
			User user = new User(1, "RamBhau", "ram@gmail.com");
			objectOutputStream.writeObject(user);
			System.out.println("OBJECT IS WRITTEN....");
			objectOutputStream.close();

			System.out.println("<<<<<< DESERIALIZATION--->CONVERT ByteSTREAM OBJECT into JAVA OBJECT.>>>>>");

			fileInputStream = new FileInputStream(file);
			ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
			User output = (User) objectInputStream.readObject();
			System.out.println("DATA OF FILE IS: " + output);
			objectInputStream.close();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
