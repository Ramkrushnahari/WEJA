package com.jspider.jdbcdynamic.insert;

import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Properties;

public class DynamicInsert {
	
	private static FileReader fileReader;
	private static Connection conn;
	private static PreparedStatement preparedStatement;
	private static Properties properties;
	private static int Result;
	private static String query;
	private static String filePath ="D:\\RKBackup\\WEJA1\\JdbcDynamic\\resource\\db_info.properties";
	
	public static void main(String[] args) {
		try {
			fileReader = new FileReader(filePath);
			properties = new Properties();
			properties.load(fileReader);
		//1. class Loading
			Class.forName(properties.getProperty("driverPath"));
		//2. open connections
			conn = DriverManager.getConnection(properties.getProperty("dburl"),properties);
			query ="insert into student values(?,?,?)";
			preparedStatement=conn.prepareStatement(query);
			preparedStatement.setInt(1,5);
			preparedStatement.setString(2,"akshay");
			preparedStatement.setLong(3,125467893L);
			Result =preparedStatement.executeUpdate();
			System.out.println("Query RECOrd updated, ok"+Result+" row(s) affected..");
			
		} catch (IOException | ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				if(conn!=null) {
					conn.close();
				}
				if(preparedStatement != null) {
					preparedStatement.close();
				}
				if(fileReader != null) {
					fileReader.close();
				}
			} catch (SQLException | IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
