package ObjectClass;

public class Employee {
	
	int id;
	String name;
	String dept;
	Double salary;
	
	public Employee(int id,String name,String Dept,Double salary) {
		super();
		this.id=id;
		this.name=name;
		this.dept=Dept;
		this.salary=salary;
		
	}
	
	@Override
	public String toString() {
		
		return "Id:"+id+
		"\n"+"Name:"+name+
		"\n" +"Department:"+dept+
		"\n" +"Salary:"+salary;
	}
	

	public static void main(String[] args) {
		
		Employee e=new Employee(101, "Suresh", "Cse", 250000.0);
		
		System.out.println(e);
		

	}

}
