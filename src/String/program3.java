package String;

//WAP to reverse a string 

public class program3 {
	
	public static void main(String [] args) {
		
		String  s = "shubhamsaurabh";
		
		
//		for(int j = 0;j<s.length();j++) {
//			System.out.print(s.charAt(j));
//		}
		
		for (int i=s.length()-1;i>=0;i--) {
			System.out.print(s.charAt(i));
			
		}
		
	}
}


