package Encapsulation;
//The process of wrapping data with codes together in a single unit is called encapsulation.
//we can make achieve encapsulation:-
//By making all variable of a class as private we can protect it outside world.
//with the help of getter and setter method we can set and get the data.

public class test {

	public static void main(String[] args) {
		Employee emp =  new  Employee();
		emp.setName("shubham saurabh");
		emp.setEmpid("ty1121764");
		emp.setBloodGroup("B+");
		
		System.out.println("name = "+emp.getName());
		System.out.println("employeeId = "+ emp.getEmpid());
		System.out.println("id = "+emp.getBloodGroup());		
		
		
	

	}

}
