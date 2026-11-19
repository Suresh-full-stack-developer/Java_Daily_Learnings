package Variable;

public class InstanceVariable {
	
	int id = 101;
	String name = "Suresh";
	int age = 10;
	long cno = 987654321;
	String college = "PCET";
	String gf = "None";
	String location = "Chennai";
	String degree = "Bachelor Of Engineering";
	Double percentage = 87.5;

	public static void main(String[] args) {

		InstanceVariable in = new InstanceVariable();

		System.out.println("Id:"+in.id);
		System.out.println(in.name);
		System.out.println(in.age);
		System.out.println(in.cno);
		System.out.println(in.college);
		System.out.println(in.gf);
		System.out.println(in.location);
		System.out.println(in.degree);
		System.out.println(in.percentage);

	}

}
