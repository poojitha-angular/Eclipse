package com.prowess.service;

import java.util.Scanner;

import com.prowess.vo.BikeVO;
import com.prowess.vo.CustomerVO;
import com.prowess.vo.StoreVO;
import com.prowess.vo.VehicleVO;

public class CustomerDetails {

	CustomerVO cvo=new CustomerVO();
	
   public void customerDetails(StoreVO svo, VehicleVO vvo, BikeVO bvo) {
	   Scanner sc= new Scanner(System.in);
	 System.out.println("enter your email id:");
	cvo.setCustEmail(sc.next());
	System.out.println("Enter customer ID:");
	cvo.setCustID(sc.nextInt());
	System.out.println("Enter Customer Location:");
	cvo.setCustLocation(sc.next());
	System.out.println("Enter Customer Name:");
	cvo.setCustName(sc.next());
	System.out.println("Enter AMount you Paid:");
	cvo.setAmountPaid(sc.nextInt());
	
	printAllDetails(svo,vvo,bvo);
   }
   void printAllDetails(StoreVO svo, VehicleVO vvo,BikeVO bvo) {
	   
	   System.out.println("Here are the customer details:");
		
		System.out.println(vvo.getvState());
		System.out.println(bvo.getBikeName());
		System.out.println(bvo.getEngCapacity());
		System.out.println(bvo.getModel());
		System.out.println(bvo.getNoOfSeats());
		System.out.println(cvo.getCustName());
		System.out.println(cvo.getCustID());
		System.out.println(cvo.getCustLocation());
		System.out.println(cvo.getCustEmail());
		System.out.println(cvo.getAmountPaid());
		System.out.println(vvo.getvColor());
		System.out.println(vvo.getvCoutry());
		
	}
}
