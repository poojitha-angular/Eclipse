package com.spring.autowiring;

public class Address {

	private int Hno;
	private String street;
	private String city;
	public int getHno() {
		return Hno;
	}
	public void setHno(int hno) {
		Hno = hno;
	}
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	public String getCity() {
		return city;
	}
	@Override
	public String toString() {
		return "Address [Hno=" + Hno + ", street=" + street + ", city=" + city + "]";
	}
	public void setCity(String city) {
		this.city = city;
	}
	
}
