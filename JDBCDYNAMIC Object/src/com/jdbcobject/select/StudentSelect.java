package com.jdbcobject.select;

import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Properties;

import com.jdbcobject.entity.Student;


public class StudentSelect {
	private static Connection connection;
	private static FileReader fr;
	private static Properties properties;
	private static PreparedStatement preparedstt;
	private static String query1;
	private static ResultSet rs;
	private static String filePath="D:\\RKBackup\\WEJA1\\JDBCDYNAMIC Object\\resources\\db_info.properties";
	public static void main(String[] args) {
		try {
			fr = new FileReader(filePath);
			properties = new Properties();
			properties.load(fr);
			
			Class.forName(properties.getProperty("driverPath"));
			connection = DriverManager.getConnection(properties.getProperty("dburl"),properties);
			
			query1="Select *"
					+"from student";
			preparedstt = connection.prepareStatement(query1);
			rs=preparedstt.executeQuery();
			while(rs.next()) {
				Student student = new Student();
				student.setId(rs.getInt(1));
				student.setName(rs.getString(2));
				student.setContact(rs.getLong(3));
				System.out.println(student);
			}
		} catch (IOException | ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				if(connection != null) {
					connection.close();
				}
				if(fr!=null) {
					fr.close();
				}
				if(preparedstt != null) {
					preparedstt.close();
				}
				if(rs!= null) {
					rs.close();
				}
			}catch (SQLException | IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		
	}
	
}
