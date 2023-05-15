package exceptionHandling;
//here main thread call main method and create the stack and start storing in stack
//..then main method call dostuff then dostuff call domorestuff 
// as all method executed jvm automatically destroy  all stacks
public class stackRuntimeMachenism {

	public static void main(String[] args) {
		dostuff();

	}

	public static void dostuff() {
		domorestuff();
		
	}

	private static void domorestuff() {
		System.out.println("hello");
		
	}

}
