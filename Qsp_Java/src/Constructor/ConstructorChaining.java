package Constructor;

public class ConstructorChaining {

	int id;
	String name;
	String dept;
	int age;

	public ConstructorChaining(int id) {
		this.id = id;
	}

	public ConstructorChaining(int id, String name) {
		this(id);
		this.name = name;
	}

	public ConstructorChaining(int id, String name, String dept) {
		this(id, name);
		this.dept = dept;

	}

	public ConstructorChaining(int id, String name, String dept, int age) {
		this(id, name, dept);
		this.age = age;

	}

	void display() {
		System.out.println("Id:" + id);
		System.out.println("Name:" + name);
		System.out.println("Department:" + dept);
		System.out.println("Age:" + age);
	}

	public static void main(String[] args) {

		ConstructorChaining ch = new ConstructorChaining(38, "Sana", "Cse", 21);

		ch.display();
	}

}
