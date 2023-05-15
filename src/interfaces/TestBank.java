package interfaces;

public class TestBank {

	public static void main(String[] args) {
		 SbiBank sbi = new SbiBank();
		 sbi.debit();
		 sbi.credit();
		 sbi.moneytransfer();
		 
		 
		 
		 PnbBank pnb = new PnbBank();
		 pnb.debit();
		 pnb.credit();
		 pnb.moneytransfer();

	}

}
