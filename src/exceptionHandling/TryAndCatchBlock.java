package exceptionHandling;

public class TryAndCatchBlock {
	
	//to handle the exception,that disturbs the normal flow of the program is colled exception handling .

	public static void main(String[] args) {
		
		System.out.println("we are checking the sequence of program");
		
		try {
			int i = 10/0;
		}
		catch(ArithmeticException e) {
			e.printStackTrace();
			System.out.println(e.getMessage());
		}
		
		System.out.println("this is exception handling ");
		

	}

}
