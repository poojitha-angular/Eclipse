package realtimeproject;

import java.io.*;

public class FISE {

	public static void main(String[] args)  {
		try {
		FileInputStream fis=new FileInputStream("D:\\Approval Process\\sample\\sample1.txt");
		int i;
		while((i=fis.read())!=-1) 
			System.out.print((char)i);
			fis.close();
		}
		catch(Exception e) {
			System.out.println(e);
		}
		
		
	}

}
