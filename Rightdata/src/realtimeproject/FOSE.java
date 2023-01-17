package realtimeproject;
import java.io.*;

public class FOSE {
	public static void main(String[] args) {
		try {
			
			FileOutputStream fos= new FileOutputStream("D:\\Approval Process\\sample\\sample1.txt");
			String s="Hi this is Pooja";
			
			byte b []= s.getBytes();
			fos.write(b);
			fos.close();

		}
		catch(Exception e ) {
			System.out.println(e);
		}
		finally {
			System.out.println("Success");
		}
	}
	

}
