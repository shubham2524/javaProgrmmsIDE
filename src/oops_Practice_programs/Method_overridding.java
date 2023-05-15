package oops_Practice_programs;
//methord overliading :-  same methord name but have different arguments
class Dad{
	public void marry() {
		System.out.println("marry with kusbu");
	}
	
}

class Son extends Dad {
	public void marry() {
		System.out.println("marry with kriti sanon");
	}
	
}

public class Method_overridding { 
	

	

	public static void main(String[] args) {
		Son s = new Son();
		s.marry();

	}

}
