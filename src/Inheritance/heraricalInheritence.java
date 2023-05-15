package Inheritance;

class account {

	int avilBlalance = 5000;

}

class husband extends account {
	int deposite = 2000;

	public void deposite() {
		avilBlalance = avilBlalance + deposite;
		System.out.println("Rs" + deposite + " is deposited successfully");

		System.out.println("updated amount is : " + avilBlalance);

	}

}

class wife extends account {
	int withdraw = 1000;

	public void withdraw() {
		avilBlalance = avilBlalance - withdraw;
		System.out.println("Rs" + withdraw + " is widthdrawed successfully");
		System.out.println("updated amount is : " + avilBlalance);
	}
}

public class heraricalInheritence {

	public static void main(String[] args) {
		husband h = new husband();
		h.deposite();

		wife w = new wife();
		w.withdraw();

	}

}
