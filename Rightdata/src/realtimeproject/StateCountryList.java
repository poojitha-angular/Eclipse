package realtimeproject;

import java.util.ArrayList;

public class StateCountryList {

	public void stateList() {
		ArrayList<String> sl = new ArrayList<>();
		System.out.println("Here are the statelists:");
		sl.add("Telangana");
		sl.add("Haryana");
		sl.add("Punjab");
		System.out.println(sl);

		ArrayList<String> cl = new ArrayList<>();
		System.out.println("Here are the country lists:");
		cl.add("Ind");
		cl.add("USA");
		cl.add("UK");
		System.out.println(cl);

		sl.addAll(cl);

		System.out.println(sl);

	}

	public static void main(String[] args) {
		StateCountryList sc = new StateCountryList();
		sc.stateList();

	}
}
