package com.jspider.jdbc1.select;

import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

public class JdbcSelectDemo5 {

	private static Connection con;
	private static Statement stmt;
	private static ResultSet rs;
	private static FileReader fileReader;
	private static Properties properties;
	private static String filePath = "D:\\RKBackup\\WEJA1\\jdbc\\resource\\db_info.properties";

	public static void main(String[] args) {

		try {
			// 1. Load Driver Class

			fileReader = new FileReader(filePath);
			properties = new Properties();
			properties.load(fileReader);

			Class.forName(properties.getProperty("driverPath"));

			// 2. Open Connection

			con = DriverManager.getConnection(properties.getProperty("dburl"), properties);

			// 3. create Statement

			stmt = con.createStatement();

			// 4. Process the Result

			rs = stmt.executeQuery(properties.getProperty("query"));

			while (rs.next()) {
				System.out.println("ID is " + rs.getString(1) + "| " + rs.getString(2) + "| " + rs.getString(3) + "|");
			}

			// 5. Close Connection

		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (IOException e) {

			e.printStackTrace();
		} finally {
			try {
				if (con != null) {
					con.close();
				}
				if (stmt != null) {
					stmt.close();
				}
				if (rs != null) {		
					rs.close();
				}
				if (fileReader != null) {
					fileReader.close();
				}

			} catch (SQLException e) {
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}
	}
}
