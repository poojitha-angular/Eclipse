package com.prowess.service;

import java.util.Scanner;

import com.prowess.vo.StoreVO;
import com.prowess.vo.VehicleVO;

public class VehicleDetails {

	VehicleVO vvo=new VehicleVO();
	public void vehicleDetails(StoreVO svo) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Vehicle color:");
		vvo.setvColor(sc.next());
		System.out.println("Enter Your country:");
		vvo.setvCoutry(sc.next());
		System.out.println("Enter Your State:");
		vvo.setvState(sc.next());
		System.out.println("Enter Mode:");
		vvo.setMode(sc.next());
		
		BikeDetails bd=new BikeDetails();
		bd.bikeDetails(svo,vvo);
		
		
	}
}
