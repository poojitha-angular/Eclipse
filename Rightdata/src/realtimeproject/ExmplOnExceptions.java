package realtimeproject;

public class ExmplOnExceptions {
	
	private int k;
	void m1() {
		k = 33;
		System.out.println(k);
	}	
	void m2() {
		System.out.println("Java Training");
		int i = 10;
		int j = 0;
		try {
			System.out.println(k);
			k = i / j;
			System.out.println("The division is : " + k);
		} catch (ArithmeticException e) {
			e.printStackTrace();
		}
		System.out.println("Java Training Finished !!");
	}
	public static void main(String[] args) {
		ExmplOnExceptions c = new ExmplOnExceptions();
		c.m2();
		c.m1();		
	}

	

}
