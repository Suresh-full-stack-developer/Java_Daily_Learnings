package Constructor;

public class ConstructorCreation {
	
	
	int id;
	String name;
	String Dept;
	String cName;
	long cNo;
	
	
	

	public ConstructorCreation(int id, String name, String dept, String cName, long cNo) {
		super();
		this.id = id;
		this.name = name;
		this.Dept = dept;
		this.cName = cName;
		this.cNo = cNo;
	}
	
	void dislay() {
		System.out.println(id);
		System.out.println(name);
		System.out.println(Dept);
		System.out.println(cName);
		System.out.println(cNo);
		
	}




	public static void main(String[] args) {
		 
		ConstructorCreation c = new ConstructorCreation(101, "Suresh","cse", "pcet", 0);
		
		c.dislay();

	}

}
