package com.test.a;

public class TestB extends TestA {
	public void getDetails() {
		id = 101;
		mobile = 78999999;
		company = "PSS";
	}

	public static void main(String[] args) {

		TestB b = new TestB();

		b.getDetails();
	}

}
