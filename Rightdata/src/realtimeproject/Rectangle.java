package realtimeproject;

public class Rectangle extends Shape {
	
	public void draw() {
		System.out.println("This is a rectangle");
	}
	public void m1() {
		super.m1();
		System.out.println("child m1() implemented method");
	}
	public static void main(String[] args) {
		Rectangle r=new Rectangle();
	
		r.draw();
		r.m1();
	}

}
