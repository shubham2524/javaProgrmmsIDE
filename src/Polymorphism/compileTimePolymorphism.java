package Polymorphism;
class Test{
	public void m1() {
		System.out.println("zero argument");
	}
	public void m1(int a) {
		System.out.println("with one argument");
	}
	public void m1(int a,int b) {
		System.out.println("with two argument");
	}
	
}


public class compileTimePolymorphism {

	public static void main(String[] args) {
		Test t = new Test();//compile time polymorphism
		t.m1();
		t.m1(2);
		t.m1(2, 03);
		t.m1('a');//automatic promotion in overloading 
		
		
		
		

	}

}
