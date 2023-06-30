package String;


//WAP to print and count no. of vowels in a given string

public class countNoOfVowelsInString {

	public static void main(String[] args) {
		String s = "shubhamsaurabh";
		
		String v = "aeiou";
		
		int count = 0;
		
		for (int i =0;i<s.length();i++) {
			for(int j = 0;j<v.length();j++) {
				if (s.charAt(i)==v.charAt(j)) {
					System.out.println(s.charAt(i));
					count ++;
				}
				
			}
			
		}
		
		System.out.println(count);

	}

}
