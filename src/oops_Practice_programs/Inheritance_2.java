package oops_Practice_programs;

class Bank {
	int AvilableBalance = 200000;

}

class Transatation extends Bank {

	public int debit() {
		int debitAmount = 10000;
		AvilableBalance = AvilableBalance - debitAmount;
		return AvilableBalance;

	}

	public void credit() {
		int creditAmount = 30000;
		AvilableBalance = AvilableBalance + creditAmount;
		System.out.println(AvilableBalance);
		

	}
	
}

public class Inheritance_2{

	public static void main(String[] args) {
		Transatation t = new Transatation();
		t.debit();
		t.credit();
		
		

	}

}
