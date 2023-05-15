package interfaces;

public class PnbBank implements RbiBank {

	@Override
	public void debit() {
		System.out.println("money is debited from pnb-bank");
		
	}

	@Override
	public void credit() {
		System.out.println("money is credited by pnb-bank");
		
	}

	@Override
	public void moneytransfer() {
		System.out.println("money is transfered by pnb-bank");
		
	}
	

}
