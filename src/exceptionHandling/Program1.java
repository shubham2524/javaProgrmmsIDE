package exceptionHandling;

public class Program1 {
	
	//to create insufficient balance exception

	public static void main(String[] args) {
		
		int amount = 1000;
		
		int debitamount = 10000;
		 
		 if (amount<debitamount) {
			 try {
				 throw new Exception ("insufficient balance exception");
			 }
			 catch (Exception e ) {
				 e.printStackTrace();
			 }
		 }
		 System.out.println("amount is less than avilable amount ");
	

	}

}
