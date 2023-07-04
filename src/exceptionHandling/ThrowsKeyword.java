package exceptionHandling;

public class ThrowsKeyword {

	// this is used to throw the exception from one method to another only
	// it will not handle the exception
	// it is handled by try and catch block only

	public static void main(String[] args) {
		ThrowsKeyword tk = new ThrowsKeyword();
		tk.sum();
		System.out.println("we are handling the exception by throws the exception but it is terminating");

	}

	public void sum() {
		try {
			div();
		}
		// throwable is super class of error and exception class so we can use throwable
		// also
		catch (Throwable e) {
			// e.printStackTrace();

		}

	}

	public void div() throws ArithmeticException {
		int i = 9 / 0;
	}

}
