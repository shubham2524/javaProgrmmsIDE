package Encapsulation;

public class Employee  {

	private String Name;
	private String Empid ;
	private String BloodGroup;
	
	
	
	public String getBloodGroup() {
		return BloodGroup;
	}

	public void setBloodGroup(String BloodGroup) {
		this.BloodGroup = BloodGroup;
	}

	public String getName() {
		return Name;
		
	}
	
	public void setName(String Name) {
		this.Name = Name;
		
		
	}
	public void setEmpid(String Empid) {
		this.Empid = Empid;
		
		
	}
	
	public String getEmpid() {
		return Empid;
		
		
	}

}
