package exceptionHandling;

public class defaultExceptionHandling2 {

	public static void main(String[] args) {
		dostuff();
		System.out.println(10/0);
		

	}

	public static void dostuff() {
		domorestuff();
		System.out.println("hiii");
		
	}

	public static void domorestuff() {
		System.out.println("helllo");
		
	}

}
