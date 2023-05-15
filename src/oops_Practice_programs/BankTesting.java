package oops_Practice_programs;

public class BankTesting {
	int AvilBal = 2000;
	int debitAmt = 100;
	int creditAmt = 300;

	public void debit() {
		AvilBal = AvilBal - debitAmt;

	}

	public void credit() {
		AvilBal = AvilBal + creditAmt;
	}

	public static void main(String[] args) {
		BankTesting bt = new BankTesting();

		bt.debit();
		bt.credit();
		System.out.println(bt.AvilBal);

	}

}
