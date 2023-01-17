package realtimeproject;

public class Student {
	int id;
	String name;
	float marksAvg;
	
	public Student(int id,String name, float marksAvg) {
		this.id=id;
		this.name=name;
		this.marksAvg=marksAvg;
		
	}
	public void printData() {
		System.out.println(id +" "+ name +" " +marksAvg);
	}
	public static void main(String[] args) {
		Student s1=new Student(101,"Poojitha",75);
		Student s2=new Student(102,"Nithish",80);
		Student s3=new Student(101,"Sahithi",95);
		Student s4=new Student(101,"Sandeep",95);
		
		s1.printData();
		
	}

}
