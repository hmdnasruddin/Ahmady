package YouTub.Method1;

public class MyClass {
	
	public static void main(String[] args) {
		Student mark=new Student();//mark is object or instance
		mark.setId(1);
		mark.setAge(25);
		mark.setName("Mark");
		
		System.out.println(mark.getId()+ " is "+ mark.getName()+ " is "+ mark.getAge()+ " years old");
		
		Student tom=new Student();//Tom is object or instance
		tom.setId(2);
		tom.setAge(26);
		tom.setName("Tom");
		System.out.println(tom.getId()+ " is "+ tom.getName()+ " is "+ tom.getAge()+ " years old");
	}

}
