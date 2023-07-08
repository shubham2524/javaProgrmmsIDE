package variables;

public class InstanceVariable {

	// a seperate memory is inisited for each variable in each object
	// because every employee having its own id and name so here we used instance
	// variable

	String name;
	int id;
	int password;

	public static void main(String[] args) {

		InstanceVariable employee1 = new InstanceVariable();
		employee1.name = "shubham";
		employee1.id = 101;
		employee1.password = 6789;

		System.out.println(employee1.name);

		InstanceVariable employee2 = new InstanceVariable();
		employee2.name = "rahul";
		employee2.id = 103;
		employee2.password = 67893;

		System.out.println(employee2.name);

	}

}
