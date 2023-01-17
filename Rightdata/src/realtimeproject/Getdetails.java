package realtimeproject;

import java.util.ArrayList;
import java.util.Iterator;

public class Getdetails {

	void getprodDetails() {
		AlExample al = new AlExample();

//	System.out.println(al.getProdDetails());
		ArrayList prodList = al.getProdDetails();

		Iterator itr = prodList.iterator();

		while (itr.hasNext()) {
			Products p = (Products) itr.next();
			System.out.println(p.prodId + "---" + p.prodName + "---" + p.price);

		}

	}

	public static void main(String[] args) {

		Getdetails g = new Getdetails();
		g.getprodDetails();
	}

}
