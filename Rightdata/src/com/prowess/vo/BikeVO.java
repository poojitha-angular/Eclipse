package com.prowess.vo;

public class BikeVO {
	String BikeName;
	String engCapacity;
	int noOfSeats;
	String model;
	boolean insurance ;
	public String getBikeName() {
		return BikeName;
	}
	public void setBikeName(String bikeName) {
		BikeName = bikeName;
	}
	public String getEngCapacity() {
		return engCapacity;
	}
	public void setEngCapacity(String engCapacity) {
		this.engCapacity = engCapacity;
	}
	public int getNoOfSeats() {
		return noOfSeats;
	}
	public void setNoOfSeats(int noOfSeats) {
		this.noOfSeats = noOfSeats;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public boolean isInsurance() {
		return insurance;
	}
	public void setInsurance(boolean insurance) {
		this.insurance = insurance;
	}

}
