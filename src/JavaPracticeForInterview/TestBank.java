package JavaPracticeForInterview;

public class TestBank {

	public static void main(String[] args) {
		
		
		IndianBank.m();
		
		
		IndianBank ib  = new SbiBank();
		ib.credit();
		ib.debit();
		
		usBank ub = new SbiBank();
		ub.homeLoan();
		ub.studyLoan();
		
		System.out.println(ub.minAmount);
		

	}

}
