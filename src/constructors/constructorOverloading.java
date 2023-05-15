package constructors;

public class constructorOverloading {
	public constructorOverloading(int a ) {
		System.out.println("this is single argument constructor");
		
	}
	public constructorOverloading(int b , int c  ) {
		System.out.println("this is multiple argument  argument constructor");
		
	}

	public static void main(String[] args) {
		constructorOverloading co1 = new constructorOverloading(10);
		constructorOverloading co2 = new constructorOverloading(10,20);
		
		
		

	}

}
