package Inheritance;
class Parent {
	
	
	int propertyincome = 1000;
	int rentincm  = 3500;
	
}
class Child extends Parent{
	int salary =2000;
	int total = salary+propertyincome+rentincm;
	public  void income() {
		System.out.println("total monthly income of house : " +total);
	}
	
	
}
public class singleInheritance {

	public static void main(String[] args) {
		
		Child c = new Child();
		c.income();
	

	}

}
