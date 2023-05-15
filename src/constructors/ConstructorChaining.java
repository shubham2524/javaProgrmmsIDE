package constructors;
//by default compiler add 1 constructor at the time of object creation
//by default compiler added 1 super() on every constructor
//if u add any calling statement then constructor will not add any super()
//this() and super() should be first command of constructor
//super() is used to call the constructor of parent class.
//this() is used to call the constructor in same class by passing arguments 
//------WORK FLOW------------------------------

// when we create an object of a particular class it will invoke constructor 
// as by default first statement is super() so it will call the parent class constructor and reverse on same path


class Parent {
	Parent() {
		this(222);
		System.out.println("constructor-2");
	}

	Parent(int a) {
		System.out.println("constructor-1");
	}

}

class Child extends Parent {
	Child() {
		this(333);
		System.out.println("constructor-4");
	}

	Child(int b) {
		super(); //by default
		System.out.println("constructor-3");
	}

}

public class ConstructorChaining {
	public static void main(String[] args) {
		Child c = new Child();

	}

}
