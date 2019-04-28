package ReplsHomeWorkTasks;

public class Main12 {
	String LastName;
	String name;
	int employeeId;
	int salary;
	int b;
	String startDate;

	public static void main(String[] args) {
		Main12 obj = new Main12();
		obj.name = "null";
		obj.b =0;
		obj.LastName = "null";
		obj.startDate ="null";

		System.out.println(obj.name+ " " + obj.b+ " " + obj.LastName+" "+obj.startDate);

		Main12 obj1 = new Main12();
	
		obj1.LastName = "Syntax";
		obj1.employeeId = 2019;
		obj1.salary = 4;
		obj1.startDate = "07/30/2019";

		System.out.println(
				obj1.LastName+" " + obj1.salary+" "+ obj1.employeeId+" "+ obj1.startDate);

	}

}
