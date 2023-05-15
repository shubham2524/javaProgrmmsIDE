package oops_Practice_programs;
class Bap{
	int landValue = 200000;
	int HomeValue = 500000;
	
}
class Beta extends Bap {
	int carValue = 20000;
	int BikeValue = 3000;
	
}

public class Inheritances_1 {

	public static void main(String[] args) {
		Beta c = new Beta();
		System.out.println(c.landValue);
		System.out.println(c.HomeValue);
		System.out.println(c.BikeValue);
		System.out.println(c.carValue);
		//here beta can exibit the property of bap ,but bap can't exebit property ogf bap_
		Bap b = new Bap();
		System.out.println(b.HomeValue);
		System.out.println(b.landValue);
		
		
		
		
		
		
		
		
	}

}
