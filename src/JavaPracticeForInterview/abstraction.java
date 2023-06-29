package JavaPracticeForInterview;

abstract class mobileFunction{
	int minPrice = 2000;
	
	abstract  void messaging();
	public void calling() {
		System.out.println("dial the numbers and click on green buttons");
	}
	
}
class xyz extends mobileFunction{

	public void messaging() {
		System.out.println("type the message and click on send button");
	}
	
}

public class abstraction {
	public static void main(String[] args) {
		mobileFunction m = new xyz();
		m.calling();
		m.messaging();
		
	}

}
