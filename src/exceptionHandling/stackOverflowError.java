package exceptionHandling;

public class stackOverflowError {
	
	//it is child class of error class and error class is child class of Throwable
	//it shows in recursive method
	
	public static void m1() {
		m2();
		
	}
	public static void m2 () {
		m1();
	}

	public static void main(String[] args) {
		m1();
		
	}

}
