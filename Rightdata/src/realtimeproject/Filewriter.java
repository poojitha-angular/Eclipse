package realtimeproject;
import java.io.*;
public class Filewriter {

	public static void main(String[] args) {
		try {
			FileWriter fw=new FileWriter("D:\\Approval Process\\sample\\test.txt");
			fw.write("Hello Team! Welcome to Dextrus");
			fw.flush();
			fw.close();
			
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}
}
