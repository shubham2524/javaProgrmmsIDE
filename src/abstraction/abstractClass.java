package abstraction;

abstract class Parent{
	//abstract void property();  //abstract method
	public void test() {
		System.out.println("this is non-abstract method");
	}
}
class Child extends Parent{
	void property() {   //implementation of abstract method
		System.out.println("here is implementation of abstract class");
	}
	
}

public class abstractClass {

	public static void main(String[] args) {
		
		Child c = new Child();
		c.property();
		c.test();

	}

}
