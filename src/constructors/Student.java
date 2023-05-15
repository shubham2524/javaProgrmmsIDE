package constructors;

public class Student {
	String name;
	int roll;
	
	Student(String name ,int roll){
		this.name = name;
		this.roll = roll;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Student s1 = new Student("shubham",101);
		Student s2 = new Student("saurabh",102);
		Student s3 = new Student("sanu",103);
		
		System.out.println("name is : "+ s1.name + " and roll no is :"+s1.roll);
		
		
		
		
		
		

	}

}
