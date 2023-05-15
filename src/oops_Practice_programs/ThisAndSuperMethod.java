package oops_Practice_programs;

//this() is used to call the the constructor ofsame class 
//super is used to call the constructor of their parent class 
//By default every constructor is having one super() method.

 class Parent{
	 Parent(){
		 this(222);
		 System.out.println("constructor -2");
	 }
	 Parent(int a){
		 
		 System.out.println("constructor -1");
	 }
    
 }
 
 class Child extends Parent{
	 Child(){
		 this(111);
		 System.out.println("constructor -4");	 
		
	 }
	 
	 Child(int b){
		 System.out.println("constructor -3");
	 }
 }

public class ThisAndSuperMethod {

	public static void main(String[] args) {
		Child c = new Child();
	}

}

//program start exxcution from main method,it will create object with the help of constructor,
//first it will go to constructor 4 and there is this(111),so it will call parametrized constructor of same class
//again by default constructor 3 has by defult super(),so it will call the constructor of parent class and there there is 
//this(111) so it will call the parametrized constructor of same class constructor -4
//SO OUTPUT IS:-
//constructor -1
//constructor -2
//constructor -3
//constructor -4
