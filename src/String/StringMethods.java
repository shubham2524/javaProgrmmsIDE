package String;

public class StringMethods {
	//length() 
	//charAt()  
	//equals()
	//equalIgnoreCase()---->case sensitivity
	//toUpperCase()
	//toLowerCase()
	//replace(oldchar,newchar)
	//replaceAll(oldsequence,"")
	//trim()
	//endsWith
	//startsWith
	//contains()
	//concat
	//split
	
	 static String s = "shubhamsaurabh";
	 static String p = "shubham$saurabh123";
	 
	public static void main(String[] args) {
		System.out.println(s.length());
		System.out.println(s.charAt(4));
		System.out.println(s.equals(p));
		System.out.println(s.toUpperCase());
		System.out.println(s.toLowerCase());
		System.out.println(p.replace('$',' '));
		System.out.println(s.indexOf('h'));
		System.out.println(s.lastIndexOf('h'));
		System.out.println(s.endsWith("saurabh"));
		System.out.println(s.startsWith("s"));
		System.out.println(s.contains("msaur"));
		System.out.println(s.concat(" singh"));
		System.out.println(p.replaceAll("[0-9]",""));
		System.out.println(p.replaceAll("[a-z]",""));
		//System.out.println(p.split("$"));
	}

}
