package JavaPracticeForInterview;

public class SbiBank implements IndianBank,usBank {
	
	int minAmount  = 3000;
	
	public void debit() {
		System.out.println("amount is debited from sbi bank");
	}
	
	public void credit() {
		System.out.println("amount is credited to sbi bank");
	}
	
	public void homeLoan() {
		System.out.println("homeloan from sbi");
	}


	public void studyLoan() {
		System.out.println("studyloan from sbi ");
		
	}

}
