package oops_Practice_programs;
// methord overliading :-  same methord name but have different arguments

public class Method_overloading {
	public void test() {
		System.out.println("this is method with zero parametrization");
	}
	public void test(int a ) {
	System.out.println("thii is methord with single parameter");
		
		
	}
	public void test(int b,int c ) {
		System.out.println("this is method with two parametrization");
	}

	public static void main(String[] args) {
		Method_overloading mo = new Method_overloading();
		mo.test();
		mo.test(23);
		mo.test(23,41);
		

	}

}
