package realtimeproject;

public class OperationOnString {
	
	public void testing() {
	String s= "Hello!My name is Pooja, I am working as a data engineer at rightdata";
//	String s1="Welcome";
	String p[]= {"a","b","c"};
	String s2="A";
	System.out.println(p[0]==s2);
	System.out.println(p[0].equals(s2));
	
	char ch= s.charAt(5);
	System.out.println(ch);
	
	System.out.println(s.length());
	
	System.out.println(s.substring(4, 9));
	
	System.out.println(s.contains("Pooja"));
	
	s=s.concat(" Welcome");
    System.out.println(s);	
    
    System.out.println(s.isEmpty());
    
    System.out.println(s.replace("!", "....."));
   
    String  s1=s.trim();
	System.out.println(s1);
	
	System.out.println(s1.length());
	}
	public static void main(String[] args) {
		OperationOnString os=new OperationOnString();
		os.testing();
		
	}
	
}
