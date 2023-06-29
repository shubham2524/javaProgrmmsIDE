package interfaces;

public class SbiBank implements RbiBank{
	
	

	@Override
	public void debit() {
		System.out.println("money is debited from sbi-bank");
		
	}

	@Override
	public void credit() {
		System.out.println("money is credited from sbi-bank");
		
	}

	@Override
	public void moneytransfer() {
		System.out.println("money is transfered by sbi-bank");
		
	}

}
