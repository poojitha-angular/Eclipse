package realtimeproject;

public class Circle extends Shape{

	public void draw() {
		System.out.println("This is a circle");
	}
	public static void main(String[] args) {
		Circle  s=new Circle();
		s.draw();
		
	}
}
