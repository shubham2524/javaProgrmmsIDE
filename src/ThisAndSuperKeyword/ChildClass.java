package ThisAndSuperKeyword;

public class ChildClass  extends Parentclass{
	
	private int b;

	public void m3(int a,int z) {
		System.out.println("child class m3");
	}
	
	public void m4(int b) {
		super.m1(67);//used to refer parent cass
		this.m3(6, 8);//used to refer child class
		System.out.println("child class m4");
		
	}
	
	
	

}
