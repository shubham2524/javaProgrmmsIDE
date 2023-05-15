package oops_Practice_programs;

public class Test {
	public void m1() {
		System.out.println("no arguments");
	}
	public void m1(int a) {
		System.out.println("integer argument ");
	}
	public void m1(double d) {
		System.out.println("double arguments");
	}

	public static void main(String[] args) {
		Test t = new Test();
		t.m1();
		t.m1(3);
		t.m1(22.22);
		

	}

}
