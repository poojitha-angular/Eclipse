package jobs.Application;

public class DButil {

		
		
		 void connectTODB(String username, String pwd,String url,int port) {
			
			System.out.println("oracle connecttion established");
		}
        void connectTODB(String username,String pwd,int port) {
			
			System.out.println("Mysql connecttion established");
		}
        void connectTODB(String username,String pwd) {
	
    	   System.out.println("cassandra connecttion established");
       }
	


public static void main(String args[]) {
	DButil db=new DButil();
	db.connectTODB("system","system","url",1234);
	db.connectTODB("root","root",8008);
	db.connectTODB("system","system");
}
}