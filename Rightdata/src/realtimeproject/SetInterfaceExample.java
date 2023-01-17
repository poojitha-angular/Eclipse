package realtimeproject;

import java.util.HashSet;

public class SetInterfaceExample {

	public void exampleSet() {
	 HashSet<String> hs = new HashSet<String>();
	 hs.add("Pooja");
	 hs.add("Nani");
	 hs.add("Rams");
	 hs.add("sravs");
	 hs.add("Pooja");
	 System.out.println(hs);
	 
	}
	public static void main(String[] args) {
	
		SetInterfaceExample si =new SetInterfaceExample();
		si.exampleSet();
	}

}
