package variables;

public class LocalAndGlobalVariable {
	//global static variables  
	//here initialization is not mandatory
	static int p;// by default it is zero
	static int x =100;
	static int y = 200;
	static int z = x+y;
	
	//global non-static variables
	int m = 1000;
	int n = 2000;
	int o = m+n;
	
	
	//this is non static method 
	public  void shubham() {
		System.out.println("this is not main method");
		System.out.println(o);
	}
	
	
	//this is static main method
	public static void main(String[] args) {
	//local variable 
	//here initialization is mandatory
		System.out.println(p);
		int m;
		//System.out.println(m);
		int a = 10;
		int b =20;
		int c = a+b;
		
		System.out.println("this is main method");
		System.out.println(c);
		System.out.println(a+b);
		System.out.println(z);
		
		
		//non static member called in static member by creating object .
		LocalAndGlobalVariable l = new  LocalAndGlobalVariable();
		System.out.println(l.o);
		//method called by main method 
		l.shubham();
	}

}
