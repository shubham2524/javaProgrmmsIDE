package method;

public class methodOverloading {
	public static void test() {
		System.out.println("method with no arguments");
	}
	public static int test(int a) {
		System.out.println("method with single arguments");
		return a;
		
	}
	public static int test(int a,int b) {
		System.out.println("method with two arguments");
		int c = a+b;
		//System.out.println(c);
		return c;
	}

	public static void main(String[] args) {
		System.out.println("main method");
		test();
		test(10);
		test(10,20);
		int d = test(10,20);
		int e = test(10);
		int f = d+e;
		System.out.println(f);
		
		

	}

}
