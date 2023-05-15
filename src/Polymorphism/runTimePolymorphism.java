package Polymorphism;

//method overriding is example of run time polymorphism
class Parent {
	public void property() {
		System.out.println("parents property");
	}
	//overridden method
	public void marriage() {
		System.out.println("sushma");
	}
}

class Child  extends Parent{
	//overriding method 
	public void marriage() {
		System.out.println("katrina kaif");
	}
}

public class runTimePolymorphism {

	public static void main(String[] args) {
		
		Parent p  = new Parent();
		p.marriage();
		p.property();
		
		Child c = new Child();
		c.marriage();
		
		Parent p1 = new Child();//up casting
		p1.marriage();//runtime Polymorphism

	}

}
