package exceptionHandling;

public class FinnalyBlock {
	
	//it will always run erespective of exception is ahandled or not 

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			int o= 10/0;
			
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		finally {
			System.out.println("finally will always run");
		}

	}

}
