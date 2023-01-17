package realtimeproject;

public class Sample {
	Sample(){
		System.out.println("I am from DC");
	}
	Sample (int i){
		System.out.println("i am from PC");
	}
	void m1() {
		
		System.out.println("I am from m1");
	}
	void m2() {
		m1();
		System.out.println("I am from m2");
	}
	public static void main(String[] args) {
		Sample s = new Sample();
		s.m2();
	}
}


