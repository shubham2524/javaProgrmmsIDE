package String;

//WAP to find the no.of 's' in a string 

public class Program1 {

	public static void main(String[] args) {

		String s = "shubhamsaurabhsingh";

		int count = 0;

		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == 's') {
				count++;
			}

		}

		System.out.println(count++);

	}

}
