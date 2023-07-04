package exceptionHandling;

public class MultipleTryAndCatchBlock {

	public static void main(String[] args) {
		try {
			int i = 9/0;
			
		}
		catch(ArithmeticException e) {
			e.printStackTrace();
			
		}
		catch(Throwable t ) {
			t.printStackTrace();
		}
		
		System.out.println("trying with multiple try and catch block");

	}

}
