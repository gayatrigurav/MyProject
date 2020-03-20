package myproject;

// Abstact class example

abstract class Bank{
	
	public void diposite() {
		System.out.println("Common Deposite method implementation across all Banks");
	}
	
	public void withdraw() {
		System.out.println("Common withdraw method implementation across all Banks");
	}
	
	public abstract int calculateInterest();
}

class HDFC extends Bank{
	
	@Override
	public int calculateInterest() {
		System.out.println("HDFC Bank Calculate Interest Implementation");
		return 0;
	}
}

class ICICI extends Bank{
	@Override 
	public int calculateInterest() {
		System.out.println("ICICI Bank Calculate Interest Implementation");
		return 0;
	}
}

public class Myclass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 
		Bank hdfc = new HDFC();
		hdfc.diposite();
		hdfc.withdraw();
		hdfc.calculateInterest();
		
		Bank icici = new ICICI();
		icici.diposite();
		icici.withdraw();
		icici.calculateInterest();
	
		
	}

}
