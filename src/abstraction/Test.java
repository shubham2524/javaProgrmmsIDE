package abstraction;
//Hide internal implementation and just highlight the set of services, is called abstraction.
//By using ATM GUI screen bank people are highlighting the set of services what they are 
//offering without highlighting internal implementation
public class Test {

	public static void main(String[] args) {
		AtmInternalInterface atmi = new AtmInternalInterface();
		atmi.checkBalance();
		atmi.deposite(2000);
		atmi.withdrawal(5000);
		atmi.checkBalance();
	}

}
