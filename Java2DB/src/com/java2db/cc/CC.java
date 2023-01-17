package com.java2db.cc;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class CC {
	
	public static String city_details_query="SELECT ID,NAME,COUNTRYCODE,DISTRICT FROM CITY";

	public static Connection getDBConnection() {
		Properties prop = new Properties();
		try {
			prop.load(new FileInputStream("C:\\Users\\Poojitha\\eclipse-workspace\\Java2DB\\src\\jdbcConnection.properties"));
		} catch (FileNotFoundException e) {

			e.printStackTrace();
		} catch (IOException e) {

			e.printStackTrace();
		}
		String url = prop.getProperty("url");
		String username = prop.getProperty("username");
		String password = prop.getProperty("password");
		String driverurl = prop.getProperty("driverurl");
		Connection con=null;
		try {
			Class.forName(driverurl);
			con = DriverManager.getConnection(url, username, password);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return con;
	}
}
