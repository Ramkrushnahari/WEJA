package com.jspider.jdbcdynamic.storeprocedure;

import java.io.FileReader;
import java.io.IOException;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Properties;

public class DynamicProcedure {
	private static Connection con;
	private static CallableStatement cstmt;
	private static FileReader fileReader;
	private static Properties properties;
	private static String query4;
	private static ResultSet rs;
	private static String filePath = "D:\\RKBackup\\WEJA1\\JdbcDynamic\\resource\\db_info.properties";
	private static CallableStatement callableStatement;

	public static void main(String[] args) {
		try {
			fileReader = new FileReader(filePath);
			properties = new Properties();
			properties.load(fileReader);

			Class.forName(properties.getProperty("driverPath"));

			con = DriverManager.getConnection(properties.getProperty("dburl"), properties);

			query4 = "call proc6()";

			callableStatement = con.prepareCall(query4);
			rs = callableStatement.executeQuery();

			while (rs.next()) {
				System.out.println(
						rs.getInt(1) + "||" + rs.getString(2) + "||" + rs.getLong(3) );

			}
			query4= "call proc8()";
			int result=callableStatement.executeUpdate(query4);
			System.out.println("qury deleted"+result);
			System.out.println("-----------------");
			rs = callableStatement.executeQuery();

			while (rs.next()) {
				System.out.println(
						rs.getInt(1) + "||" + rs.getString(2) + "||" + rs.getString(3) );

			}
			
					

		} catch (IOException | ClassNotFoundException | SQLException e) {

			e.printStackTrace();
		} finally {
			try {
				if (con != null) {
					con.close();
				}
				if (fileReader != null) {
					fileReader.close();
				}
				if (rs != null) {
					rs.close();
				}
				if (cstmt != null) {
					cstmt.close();
				}
			} catch (IOException | SQLException e) {
				e.printStackTrace();
			}
		}
	}
}
