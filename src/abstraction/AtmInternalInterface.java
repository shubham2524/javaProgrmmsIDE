package abstraction;

public class AtmInternalInterface extends Atmuserinterface {
	
	int balance = 5678;

	@Override
	void checkBalance() {
		System.out.println(balance);
		
		
	}

	@Override
	void withdrawal(int a) {
	this.balance = balance-a;
	System.out.println(balance);
		
		
	}

	@Override
	void deposite(int a) {
		this.balance = balance+a;
		System.out.println(balance);
		
		
	}
	

	

}
