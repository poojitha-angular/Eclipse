package realtimeproject;

public class Bank {

	int accountno=91234;
	int amount=10000;
	int pin=1234;
	Bank(){
		System.out.println("DB connection established");
	}
	public void withdrawmoney(int amount) {
		System.out.println("amount withdraw");
	}
	public void depmoney(int amount) {
		System.out.println("amount deposited");
	}
	public void updatepin(int oldpin, int newpin) {
		System.out.println("Pin changed successfully!!");
	}
	public static void main(String[] args) {
		
	  Bank b=new Bank();
	  
	  b.withdrawmoney(3000);
	  b.depmoney(2000);
	  b.updatepin(1234,4567);
	  
	  
	}

}
