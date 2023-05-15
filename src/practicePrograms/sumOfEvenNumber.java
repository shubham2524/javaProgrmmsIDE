package practicePrograms;

public class sumOfEvenNumber {
	

	public static void main(String[] args) {
		// WAP to print sum of all even number from 1 to 100
		int sum = 0;
		for (int i = 0;i<=100;i++) {
			if (i%2==0) {
				sum = sum+i;
				
			}
			
		}
		System.out.println("sum of all even numbers from 1 to 100 = "+sum);

	}

}
