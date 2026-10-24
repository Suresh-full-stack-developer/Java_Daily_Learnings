package ObjectClass;

public class Student {
	int id;
	String name;
	String dept;
	long cno;
	
	public Student(int id,String name,String dept,long cno) {
		super();
		this.id=id;
		this.name=name;
		this.dept=dept;
		this.cno=cno;
	}
	public boolean equals(Object obj) {
		Student s=(Student)obj;
		return id==s.id && name.equals(s.name) && dept.equals(s.dept) && cno==s.cno;
	}
	

	public static void main(String[] args) {
		
		Student s=new Student(101, "Suresh", "Cse", 987654321l);
		
		Student s1=new Student(101, "SURESH", "Cse", 987654321l);
		
		System.out.println(s.equals(s1));
		

	}

}
