package Object;

public class CopyingObject {

	int id;
	String name;
	String Dept;
	String cName;
	long cNo;

	public void Student(int id, String name, String Dept, String cName, long cNo) {
		this.id = id;
		this.name = name;
		this.Dept = Dept;
		this.cName = cName;
		this.cNo = cNo;
	}

	void display() {
		System.out.println(" Copying Object ");

		System.out.println("Id:" + id);
		System.out.println("Name:" + name);
		System.out.println("Department:" + Dept);
		System.out.println("cName:" + cName);
		System.out.println("Contact No:" + cNo);

	}

public static void main(String[] args) {
	   
	ObjectCreation c=new ObjectCreation();
	
	c.display();
	
	System.out.println();
	
	ObjectCreation c1=c;  //Copying the one object into another
	
	c1.display();


}
}
