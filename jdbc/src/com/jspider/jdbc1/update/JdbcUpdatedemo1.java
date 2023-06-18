package com.jspider.jdbc1.update;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

public class JdbcUpdatedemo1 {
	private static Connection conn;
	private static Statement stt;
	private static FileReader fr;
	private static int Result;
	private static Properties properties;
	private static String filePath = "D:\\RKBackup\\WEJA1\\jdbc\\resource\\db_info.properties";
	private static String query1;

	public static void main(String[] args) {
		try {
			fr= new FileReader(filePath);
			properties= new Properties();
			properties.load(fr);
			//1. Load driver class
			Class.forName(properties.getProperty("driverPath"));
			//2.Open Connection
			conn = DriverManager.getConnection(properties.getProperty("dburl"),properties);
			//3. create statements.
			stt=conn.createStatement();
			//Update query
			query1 ="update student set name='HATIM' where id=4";
			//4.process the result.
			Result = stt.executeUpdate(query1);
			System.out.println("UPDATE Query ok ,"+Result+"rows(S) affected...");
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			try
			{
				if(conn != null) {
					conn.close();
				}
				if(stt != null) {
					stt.close();
				}
				if(fr != null) {
					fr.close();
				}
			} catch (SQLException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
