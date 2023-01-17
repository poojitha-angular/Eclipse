import java.util.ArrayList;
import java.util.Iterator;

public class PrintingDBData {

	public void printData() {
//		ArrayList<Object> al=new ArrayList<>();
//		al.add(svo.getId());
//		al.add(svo.getName());
//		al.add(svo.getCountrycode());
//		al.add(svo.getDistrict());
//		al.add(svo.getPopulation());
//		
//		Iterator<Object> itr= al.iterator();
//		while(itr.hasNext()) {
//		System.out.println(itr.next());
//		
//		}

		Test t = new Test();

		ArrayList<SampleVO> al = t.testDBConnection();
		Iterator<SampleVO> itr = al.iterator();
		while (itr.hasNext()) {

			SampleVO svo = (SampleVO) itr.next();
			System.out.println(svo.getId() + " -- " + svo.getName() + " -- " + svo.getCountrycode() + " -- "
					+ svo.getDistrict() + " -- " + svo.getPopulation());

		}
	}

	public static void main(String[] args) {

		PrintingDBData pdd = new PrintingDBData();
		pdd.printData();

	}

}
