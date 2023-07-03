package String;

public class StringBuilders {
	
	//stringBuilder is mutuable .
	//it mean be can make changes in same string storied in heap memory .
	//help prorammers to save time 

	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder("shubham");
		System.out.println(sb.charAt(0));
		
		sb.setCharAt(0,'l');
		System.out.println(sb);
		
		sb.delete(0, 1);
		System.out.println(sb);
		
		
	}

}
