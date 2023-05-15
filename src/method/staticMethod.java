package method;

public class staticMethod {
	//non-parameterized method
	public static void test() {
		System.out.println("this is test method");
	}
	
	
	//Parameterized method
	public static void test1(int a,int b) {
		int c = a+b;
		
		System.out.println(c);
		System.out.println("this is test1 method having argumnets");
		
		
		
	}
	public static void main(String[] args) {
		System.out.println("this is main method");
		 test();
		 staticMethod.test();
		 
		 
		 test1(100,200);
		 staticMethod.test1(10,20);
		 
		 
	}

}