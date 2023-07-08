package variables;
//instance variable --> a seperate copy of varible is shered for all object 
//static variable  --> same varible is shered for all object 
public class Student {
	static String collegeName =  "guru gobind singh";//static variable 
	String name;//instance variable 
	int rollNo;//instamce variable 
	

	public static void main(String[] args) {
		
		int i;
		System.out.println(collegeName);
		
		Student s1 = new Student();
		System.out.println(s1.rollNo);
		s1.name= "rahul";
		s1.rollNo = 101;
		
		
		
		Student s2 = new Student();
		s2.name= "shubham";
		s2.rollNo = 102;
		s2.collegeName = "abc";
		
		System.out.println(s2.collegeName+" "+ s2.name+" "+s2.rollNo);
		//System.out.println(i);
		
		print();
		
		
	
		

	}
	
	static public void print() {
		System.out.println(collegeName);
	}

}
