package method;
 class Parent{
	public  void test() {
		System.out.println("marry with suman");
		
	}
}
 class Child extends Parent{
	 public void test() {
		 System.out.println("marry with simran");
	 }
 }



public class methodOverridding {

	public static void main(String[] args) {
		
		Child c = new Child();
		c.test();
		
		
		

	}

}
