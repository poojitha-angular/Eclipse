package com.prowess.service;

import java.util.Scanner;

import com.prowess.vo.BikeVO;
import com.prowess.vo.StoreVO;
import com.prowess.vo.VehicleVO;

public class BikeDetails {

	BikeVO bvo= new BikeVO();
	public void bikeDetails(StoreVO svo, VehicleVO vvo) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Number of seats:");
		bvo.setNoOfSeats(sc.nextInt());
		System.out.println("Enter Model:");
		bvo.setModel(sc.next());
		System.out.println("Are you need Insurance:");
		bvo.setInsurance(sc.nextBoolean());
		System.out.println("Enter Engine Capacity:");
		bvo.setEngCapacity(sc.next());
		System.out.println("Enter Bike Name:");
		bvo.setBikeName(sc.next());
		
		CustomerDetails cd=new CustomerDetails();
		cd.customerDetails(svo, vvo, bvo);
}
	
	
}
