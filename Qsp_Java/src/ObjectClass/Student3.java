package ObjectClass;

import java.util.Objects;

public class Student3 implements Cloneable {

	int id;
	String name;
	int age;
	String dept;

	public Student3(int id, String name, int age, String dept) {
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

		Student3 s = (Student3) obj;

		return id == id && name.equals(name) && age == age && dept.equals(dept);
	}
	
	

	@Override
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}

	public static void main(String[] args) throws CloneNotSupportedException {

		Student3 s1 = new Student3(101, "Suresh", 21, "Cse");
		Student3 s2=(Student3)s1.clone();
		
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
