package method;

public class CreateMultipleMethodWithSameVariables {
	
	
	public void RectangleArea(int l,int b) {
		
		int area = l*b;
		System.out.println(area);
		//return area;
		final int  a = 1000;
		
	}

	public static void main(String[] args) {
		CreateMultipleMethodWithSameVariables r1 = new CreateMultipleMethodWithSameVariables();
		r1.RectangleArea(23, 34);
		r1.RectangleArea(45, 56);
		
	}

}
