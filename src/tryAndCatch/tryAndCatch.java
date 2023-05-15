package tryAndCatch;

public class tryAndCatch {
	public static void main(String [] args) {
		
		int a =  100;
		int b = 100;
		
		
		//uncaught exception
		try {
			int c = 9/0;
			System.out.println(c);
		} catch (ArithmeticException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println(e);
		}
		
		
		
	}

}
