package realtimeproject;

public class Rateofinst extends Bankabstract{
 
	
	void rateOfIntrest() {
		System.out.println("Hdfc rate of intrest: ");
	}
	public static void main(String[] args) {
		
		Bankabstract b= new Rateofinst();
		b.rateOfIntrest();
	}

}
