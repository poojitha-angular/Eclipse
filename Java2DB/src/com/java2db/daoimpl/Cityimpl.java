package com.java2db.daoimpl;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

import com.java2db.cc.CC;
import com.java2db.interfaces.dao.CityInterface;

public class Cityimpl implements CityInterface{
	

	public void readFromDB() {
		try {
			Statement st = CC.getDBConnection().createStatement();
			ResultSet rs = st.executeQuery(CC.city_details_query);
			while (rs.next()) {

				System.out.println(rs.getInt(1) + " -- " + rs.getString(2) + " -- " + rs.getString(3)+" -- "+rs.getString(4));
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

	public void insertIntoDB() {
		System.out.println("Enter your details:");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter id:");
		int cid = sc.nextInt();
		System.out.println("Enter Name:");
		String cname = sc.next();
		System.out.println("Enter County code:");
		String ccode = sc.next();
		System.out.println("Enter District:");
		String cdistrict = sc.next();
		
		
		try {
			String insert_query = "insert into city value(?,?,?,?,4376)";
			PreparedStatement pst = CC.getDBConnection().prepareStatement(insert_query);
			pst.setInt(1, cid);
			pst.setString(2, cname);
			pst.setString(3, ccode);
			pst.setString(4, cdistrict);
			int i = pst.executeUpdate();
			System.out.println(i + " rows affected");

		} catch (SQLException e) {

			e.printStackTrace();
		}

	}

}
