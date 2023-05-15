package Encapsulation;
//encapsulation is the process of wrapping data with codes with the help of getter and shetter method.

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
