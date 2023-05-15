package exceptionHandling;

public class defaultExceptionHandler {

	public static void main(String[] args) {
		dostuff();

	}

	public static void dostuff() {
		domorestuff();
		
	}

	public static void domorestuff() {
		System.out.println(100/0);
		
	}
	//here jvm will ask domorestuff "have u any exception code"an destroy -----again ask from dostuff---ask from main ----
	// if no handling code is there then jvm will sent it to default exception handler
	//format of exception 
	//name of exception ...description
	//location tracing

}
