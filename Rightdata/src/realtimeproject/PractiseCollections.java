package realtimeproject;

import java.util.HashSet;
import java.util.Iterator;
import java.util.TreeSet;



public class PractiseCollections {

	public static void main(String[] args) {

//		HashMap<String, String> hm = new HashMap<>();
//
//		hm.put("1", "Pooja");
//		hm.put("2", "Nithin");
//		hm.put("3", "Nani");
//		hm.put("4", "Ranjith");
//		hm.put("5", "Sravan");
//		hm.put("6", "Pandu");
//		hm.remove("6");
//		System.out.println(hm.get("7"));
//		System.out.println(hm.keySet());
//		System.out.println(hm.entrySet());
//		System.out.println(hm.containsKey("5"));
//		System.out.println(hm.containsValue("Nithish"));
//
//		HashMap<String, String> hm1 = new HashMap<>();
//
//		hm1.put("7", "Nithish");
//		hm1.put("8", "Sahithi");
//		hm1.put("13", "Sandeep");
//		hm1.put("14", "Ajay");
//		hm1.put("15", "Vishnu");
//		
//		
//		hm.putAll(hm1);
//		System.out.println(hm);
		TreeSet<String> ts=new TreeSet<>();
		ts.add("pooja");
		ts.add("Ajay");
		ts.add("vishnu");
//		System.out.println(ts);
		
		HashSet<String> hs=new HashSet<>();
		hs.add("1");
		hs.add("9");
		hs.add("ajay");
		hs.add("Ajay");
//		hs.add(null);

		Iterator itr = hs.iterator();
		while(itr.hasNext()) {
			String s1=(String) itr.next();
			System.out.println(s1.hashCode());
//			System.out.println(itr.next());
		}
		
		
		System.out.println(hs);
		
	}

}
