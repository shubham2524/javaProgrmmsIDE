package String;

public class StringComaparision {

	public static void main(String[] args) {
		String s1 = "shubham";
		String s2 = new String ("shubham");
		
		if (s1 ==s2 ) {
			System.out.println("equal");
			
		}
		else {
			System.out.println("not equal");
		}
		
		if (s1.compareTo(s2)== 0) {
			System.out.println("equal");
		}
		
		else {
			System.out.println("not equal");
		}

	}

}
