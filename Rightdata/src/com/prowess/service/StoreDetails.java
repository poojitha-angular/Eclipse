package com.prowess.service;

import java.util.Scanner;

import com.prowess.vo.StoreVO;

public class StoreDetails {

	StoreVO svo=new StoreVO();
	
	public void storedetails() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Store ID: ");
		svo.setStoreId(sc.nextInt());
		System.out.println("Enter Store Name:");
		svo.setStroreName(sc.next());
		System.out.println("Enter Store Capacity:");
		svo.setStoreCapacity(sc.nextInt());
		System.out.println("Enter Store Location:");
		svo.setLocation(sc.next());
		System.out.println("Enter Store Pin:");
		svo.setStorePin(sc.nextInt());
		
		VehicleDetails vd=new VehicleDetails();
		vd.vehicleDetails(svo);
	}
	public static void main(String[] args) {
		
		StoreDetails sd=new StoreDetails();
		sd.storedetails();
		
	}
}
