package realtimeproject;

import java.io.FileReader;

public class Filereader {

	public static void main(String[] args) {
		try {
			FileReader fr= new FileReader("D:\\Approval Process\\sample\\test1.txt");
			int i;
			while((i=fr.read())!=-1)
				System.out.println((char)i);
		}
		catch(Exception e) {
			System.out.println(e);
		}

	}

}
