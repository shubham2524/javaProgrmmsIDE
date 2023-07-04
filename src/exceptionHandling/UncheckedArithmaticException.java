package exceptionHandling;

public class UncheckedArithmaticException {
	
	//condion that stops the normal flow of the program is called exception.
	//checked exception----checked during compiletime 
	//unchecked exception----->checked during run time 
	
	

	// OBJECT CLASS 
	//     |
	// Throwale class 
	//     |
// error          exception
//            1.unchecked exception
//            2. checked exception
	
	
	//this is unchecked exception it will throw exception during run time 

	public static void main(String[] args) {
		int i = 10/0;
		System.out.println(i);

	}

}
