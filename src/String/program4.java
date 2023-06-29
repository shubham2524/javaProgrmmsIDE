package String;


//to check weather giver string is palindrom or not

public class program4 {

	public static void main(String[] args) {
		
		String s = "mmooloomm";
		
		String revs = "";
		
		
		
		for (int i= s.length()-1;i>=0;i--) {
			
			 revs =  revs+s.charAt(i);
			
			
			// revS =  revS+i;
		}
		System.out.println(revs);
		
		if (s.equals(revs)) {
			System.out.println("this is a palindrome");
			
			
		}
		else
		{
			System.out.println("this is not a palindrome");
		}
		
		
		
		
		

	}

}
