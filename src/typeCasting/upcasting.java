package typeCasting;
class Animal {
	//storing subclass memeory in to super class refrance variable is called Upcasting.
	
	public void eat() {
		System.out.println("Animals like foods  ");
		
	}
}
class Dog extends Animal {
	
	public void eat() {
		System.out.println("Dog likes chicken ");
		
	}
	
}
public class upcasting {

	public static void main(String[] args) {
		Animal a = new Dog();
		a.eat();
		

	}

}
