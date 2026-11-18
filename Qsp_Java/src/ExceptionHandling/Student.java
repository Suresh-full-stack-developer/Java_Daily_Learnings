package ExceptionHandling;

public class Student {
	int id;
	String name;
	int age;
	
	public Student(int id, String name, int age) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
	}


	public static void main(String[] args) {
		
		Student s=new Student(101, "Suresh", 21);
		
		System.out.println(s.id);
		System.out.println(s.name);
		System.out.println(s.age);
		
		s=null;
		
		System.out.println(s.id);
		System.out.println(s.name);
		System.out.println(s.age);

	}

}
