package Comparable;

import java.util.Arrays;

public class Student implements Comparable<Student> {

	int id;
	String name;
	int age;

	public Student(int id, String name, int age) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
	}

	public Student() {
		super();

	}

	@Override
	public int compareTo(Student o) {
		return this.id - o.id;
	}

	@Override
	public String toString() {
		return "\n"+"Id:" + id + " "+ "Name:" + name +" " + "Age:" + age;
	}

	public static void main(String[] args) {

		Student s1 = new Student(101, "Suresh", 25);
		Student s2 = new Student(108, "Gowtham", 28);
		Student s3 = new Student(103, "Pavan", 26);

		Student list[] = { s1, s2, s3 };
		Arrays.sort(list);
		System.out.println(Arrays.toString(list));

	}

}
