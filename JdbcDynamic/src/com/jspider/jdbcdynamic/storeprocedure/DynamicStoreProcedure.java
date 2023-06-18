package com.jspider.jdbcdynamic.storeprocedure;

import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.CallableStatement;
import java.util.Properties;




public class DynamicStoreProcedure {
	private static Connection conn;
	private static ResultSet resultSet;
	private static FileReader fr;
	private static Properties properties;
	private static CallableStatement callableStatement;
	private static ResultSet rs;
	private static String query;
	private static String filePath="D:\\\\RKBackup\\\\WEJA1\\\\JdbcDynamic\\\\resource\\\\db_info.properties";
	public static void main(String[] args) {
		try {
			fr= new FileReader(filePath);
			properties=new Properties();
			properties.load(fr);
			//1.Load Driver class;
			Class.forName(properties.getProperty("driverPath"));
			//2.open connections.
			conn=DriverManager.getConnection(properties.getProperty("dburl"),properties);
			query="call dynamic_proc()";
			//query="call proc2()";
			callableStatement=conn.prepareCall(query);
			
			rs=callableStatement.executeQuery();
			while(rs.next()) {
				System.out.println(rs.getInt(1)+"||"+rs.getString(2)+"||"+rs.getLong(3));
			}
			System.out.println("============================");
			
		} catch (IOException | ClassNotFoundException | SQLException e) {
			
			e.printStackTrace();
		} finally {
			try {
				if(conn!=null) {
					conn.close();
				}
				if(callableStatement != null) {
					callableStatement.close();
				}
				if(fr != null) {
					fr.close();
				}
				if(resultSet!=null) {
					resultSet.close();
				}
			} catch (SQLException | IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
	}
}
