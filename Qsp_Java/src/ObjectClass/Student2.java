package ObjectClass;

import java.util.Objects;

public class Student2 {

	int id;
	String name;
	int age;
	String dept;

	public Student2(int id, String name, int age, String dept) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.dept = dept;
	}

	@Override
	public String toString() {
		return "Id:" + id + "\n" + "Name:" + name + "\n" + "Age:" + age + "\n" + "Dept:" + dept;
	}

	@Override
	public int hashCode() {
		return Objects.hash(id,name,age,dept);
	}

	@Override
	public boolean equals(Object obj) {

		Student2 s = (Student2) obj;

		return id == id && name.equals(name) && age == age && dept.equals(dept);
	}

	public static void main(String[] args) {

		Student2 s1 = new Student2(101, "Suresh", 21, "Cse");
		Student2 s2 = new Student2(101, "Suresh", 21, "Cse");
		System.out.println(s1);
		System.out.println();
		System.out.println(s2);

		System.out.println();
		
		System.out.println(s1.equals(s2));
		System.out.println();

		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());

	}

}
