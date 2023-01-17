package realtimeproject;

public class ThreadExample extends Thread{

	public synchronized void  bankDeposit() {
		
			try {
				for(int i=1;i<10;i++) 
					System.out.println("Value of i:" +i);
//				Thread thread = new Thread();
				Thread.sleep(100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
	}
	public void run() {
		bankDeposit();
	}
	public static void main(String[] args) {
		ThreadExample te=new ThreadExample();
		
		ThreadExample te1=new ThreadExample();
		
		ThreadExample te2=new ThreadExample();
		
		ThreadExample te3=new ThreadExample();
	
		te.start();
		te1.start();
		te2.start();
		te3.start();
//		System.out.println("Hello");
//		System.out.println("Hello1");
//		System.out.println("Hello2");
//		System.out.println("Hello3");
//		System.out.println("Hello4");
//		System.out.println("Hello5");
//		System.out.println("Hello6");
		

	}

}
