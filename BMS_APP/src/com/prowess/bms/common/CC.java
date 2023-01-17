package com.prowess.bms.common;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class CC {
	public static final String CREATED_BY= "Poojitha";
	public static final String GET_BOOK_DETAILS_BYID="select * from book where  BOOK_ID= ?";
	public static final String GET_LIST_OF_BOOKS="select * from book";
	public static final String DELETION_OF_RECORDS="delete from book where BOOK_ID=?";
	public static final String GET_LIST_OF_BOOKS_BYAUTHOR="select * from book where AUTHOR=?";
	public static final String GET_LIST_OF_BOOKS_BYACTIVE="select * from book where IS_ACTIVE=?";
	public static final String GET_LIST_OF_BOOKS_BYSTOCK="select * from book where IN_STOCK=?";
	public static final String GET_LIST_OF_BOOKS_BYCITY="select * from book  where city=?";
	public static final String GET_LIST_OF_BOOKS_BYPRICE="select * from book where BOOK_PRICE BETWEEN ? AND ?";
	public static final String GET_LIST_OF_BOOKS_BYGENRE="select * from book where BOOK_GENERE=?";
	public static final String UPDATE_BYCITY="update book set CITY=? WHERE BOOK_ID=?";
	
	public static Connection getDBConnection() {
		Properties prop = new Properties();
		try {
			prop.load(new FileInputStream("C:\\Users\\Poojitha\\eclipse-workspace\\BMS_APP\\jdbcConnection.properties"));
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
