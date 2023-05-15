package Inheritance;
class accounts {

	int avilBlalance = 5000;

}

class father extends accounts {
	int deposite = 2000;

	public void deposite() {
		avilBlalance = avilBlalance + deposite;
		System.out.println("Ac xxxxxxxx8753 is credited with Rs."+deposite+"..Avil Balance is Rs. "+avilBlalance);

		

	}

}

class son extends father {
	int withdraw = 1000;

	public void withdraw() {
		avilBlalance = avilBlalance - withdraw;
		System.out.println("Ac xxxxxxxx8753 is debited with Rs. "+withdraw+"..Avil Balance is Rs. "+avilBlalance);
	}
}

public class multiLevelInheritence {

	public static void main(String[] args) {
		
		son s = new son();
		s.deposite();
		s.withdraw();
		
		
	}

}

