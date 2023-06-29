package finalKeyword;
//final variables cannot be change 
//final method cannot be ovveride 
//final class cannot be extends 


class parent {
	final int price = 20000;
	//price = 30000; final variable cannot be change
	final void method1() {
		System.out.println("parent class final method");
	}
}
 final class child extends parent {
//	final void method1() {
//		System.out.println("parent class final method");  //it cannot be override
//	}
}
 
// class child2 extends child { // final class  cannot be extend 
//	 
// }



public class FinalKeyword {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
