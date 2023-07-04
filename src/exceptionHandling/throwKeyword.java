package exceptionHandling;

public class throwKeyword {
	
	// this is customized exception 
	//we can create my own exception if required 
	// we can handle it by try and catch block
	
	public static void main(String[] args) {
		
		System.out.println(" checking throw keyword at start ");
		
		String s = "";
		if (s == "") {
			try {
			throw new Exception("no string value found");
			}
			catch (Exception e) {
				e.printStackTrace();
				
			}
			
			
		}
		System.out.println(" checking throw keyword at end ");
		
		

	}

}
