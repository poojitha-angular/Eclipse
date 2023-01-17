package realtimeproject;

public class Vehicle {

	Customer c = new Customer();
	String vehname = "Audi";
	int vehnumber = 7654;

	void getVehicleDetails() {
		
		c.getDetails();
		System.out.println(vehname);
		System.out.println(vehnumber);
	
	}

	public static void main(String[] args) {
		Vehicle v = new Vehicle();
		v.getVehicleDetails();

	}

}
