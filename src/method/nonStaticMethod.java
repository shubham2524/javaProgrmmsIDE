package method;

public class nonStaticMethod {
	public void test() {
		System.out.println("non-static method");
	}

	public static void main(String[] args) {
		System.out.println("main method");
		nonStaticMethod nsm = new  nonStaticMethod();
		nsm.test();
		
	}

}
