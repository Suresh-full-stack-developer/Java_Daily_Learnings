package Object;

import Object.ObjectCreation.Student;

public class ObjectCreation {

	class Student {
		int id;
		String name;
		String Dept;
		String cName;

		public Student(int id, String name, String dept, String cName) {
			this.id = id;
			this.name = name;
			this.Dept = dept;
			this.cName = cName;
		}

		void display(int id,String name,String Dept,String cName) {
			System.out.println("This Is Object Creation");

			System.out.println("Id:" + id);
			System.out.println("Name:" + name);
			System.out.println("Department:" + Dept);
			System.out.println("College:" + cName);

		}
	

	public static void main(String[] args) {
		
		
	Student s=new Student();
	
	s.display(101, "Suresh", "Cse", "Pcet");
		
	
		
		

	}

}
}
