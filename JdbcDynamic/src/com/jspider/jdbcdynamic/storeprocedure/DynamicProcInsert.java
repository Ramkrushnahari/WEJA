package com.jspider.jdbcdynamic.storeprocedure;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Properties;

public class DynamicProcInsert {

	private static Connection connection;
	private static CallableStatement callableStatement;
	private static FileReader fileReader;
	private static Properties properties;
	private static String query4;
	private static int result;

	private static ResultSet rs;
	private static String filePath = "D:\\RKBackup\\WEJA1\\JdbcDynamic\\resource\\db_info.properties";
	

	// private static CallableStatement callableStatement;
	public static void main(String[] args) {
		try {

			fileReader = new FileReader(filePath);
			properties = new Properties();
			properties.load(fileReader);

			Class.forName(properties.getProperty("driverPath"));

			connection = DriverManager.getConnection(properties.getProperty("dburl"), properties);
			query4 = "call proc1()";
			callableStatement = connection.prepareCall(query4);
			
			rs = callableStatement.executeQuery();
			while (rs.next()) {
				System.out.println(rs.getInt(1) + "||" + rs.getString(2) + "||" + rs.getLong(3));
			}
			
			
					} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			{
				try {
					if (connection != null) {
						connection.close();
					}
					if (fileReader != null) {
						fileReader.close();
					}
					if (callableStatement != null) {
						callableStatement.close();
					}
				} catch (SQLException e) {
					e.printStackTrace();
				} catch (IOException e) {
					e.printStackTrace();
				}

			}
		}

	}

}
