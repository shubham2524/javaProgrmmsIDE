package interviewQuestion;

public class primeNumber {
	
	//write list of prime namber from 1 to 20

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		for(int i = 1;i<=20;i++) {
			for(int j = i+1;j<i+1;j++) {
				if (i/j==0) {
					System.out.println(i);
				}
			}
		}
		
		

	}

}
