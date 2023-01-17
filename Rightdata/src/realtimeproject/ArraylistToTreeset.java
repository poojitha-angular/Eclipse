package realtimeproject;

import java.util.ArrayList;
import java.util.TreeSet;

public class ArraylistToTreeset {
	public void arrayList() {

		ArrayList<String> al = new ArrayList<>();
		System.out.println("Here are the arralylists:");
		al.add("Pooja");
		al.add("Ravi");
		al.add("Vijay");
		al.add("Sanjay");
		al.add("Pooja");
		al.add(null);

		TreeSet<Object> ts = new TreeSet<>();
		ts.addAll(al);
		
		System.out.println(al);

	}

	public static void main(String[] args) {
		ArraylistToTreeset at = new ArraylistToTreeset();
		at.arrayList();

	}

}
