package com.jspider.jdbcdynamic.delete;

import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Properties;

public class DynamicDelete {
	private static Connection conn;
	private static ResultSet rs;
	private static int result;
	private static FileReader fr;
	private static PreparedStatement preparedStatement;
	private static String query;
	private static String filePath ="D:\\RKBackup\\WEJA1\\JdbcDynamic\\resource\\db_info.properties";
	private static Properties properties;
	public static void main(String[] args) {
		try {
			fr= new FileReader(filePath);
			properties = new Properties();
			properties.load(fr);
			//1 load driverClass.
			Class.forName(properties.getProperty("driverPath"));
			//2.open connection
			conn = DriverManager.getConnection(properties.getProperty("dburl"),properties);
			query ="delete from student "
					+"where id=?";
			preparedStatement =conn.prepareStatement(query);
			preparedStatement.setInt(1,5);
			result=preparedStatement.executeUpdate();
			System.out.println("QUERY UPDATED OK ,"+result+"row(S) affected...");
			query="select * from student";
			rs=preparedStatement.executeQuery(query);
			while(rs.next()) {
				System.out.println(rs.getInt(1)+"||"+rs.getString(2)+"||"+rs.getString(3));
			}
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
				if(fr != null) {
					fr.close();
				}
				if(rs!=null) {
					rs.close();
				}
			} catch (SQLException | IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
	}
}
