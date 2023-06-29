package interfaces;


//only abstract methods are allowed ...no concrete method allowed 
//achive 100% abstraction  beacuse there is no concrete method allowed
//can used for multiple inheritence 


//abstarct methods
//static concrete methords 
//final variables 


public interface RbiBank {
	
	final int minBalance = 2000;
	
	//int minBalance = 3000;
	
	public void debit();
	public void credit();
	public void moneytransfer();
	
	public static void m2() {
		System.out.println("dhekjl");
	}
	
	
//	public void m2() {
//		System.out.println("this is concrete method");
//	}
	


}
