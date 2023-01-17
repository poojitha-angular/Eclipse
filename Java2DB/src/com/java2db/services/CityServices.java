package com.java2db.services;

import java.util.Scanner;

import com.java2db.daoimpl.Cityimpl;

public class CityServices {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please select the menu:");
		System.out.println("1.Insert");
		System.out.println("2.Update");
		System.out.println("3.Delete");
		System.out.println("4.Read");

		System.out.println("Enter your choice");
		int choice = sc.nextInt();
//		sc.close();
		Cityimpl ci = new Cityimpl();
		switch (choice) {

		case 1:
			ci.insertIntoDB();
			break;
		case 2:
//			updateDB()
			break;
		case 3:
//			deleteFromDB()
			break;
		case 4:

			ci.readFromDB();
		}

	}
}
