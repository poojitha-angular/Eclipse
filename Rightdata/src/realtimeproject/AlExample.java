package realtimeproject;

import java.util.ArrayList;
import java.util.ListIterator;
import java.util.TreeSet;

public class AlExample {

	public ArrayList<Object> getProdDetails() {
		ArrayList<Object> prodList = new ArrayList<Object>();

		prodList.add(new Products(123, "Pooja", 20000));
		prodList.add(new Products(456, "Ravi", 25000));
		prodList.add(new Products(123, "Vijay", 2000));
		
		return prodList; 
		
	}
	
}