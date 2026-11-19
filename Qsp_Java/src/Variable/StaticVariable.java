package Variable;

public class StaticVariable {

	static int id = 101;
	static String name = "Suresh";
	static int age = 10;
	long cno = 987654321;
	String college = "PCET";
	String gf = "None";
	String location = "Chennai";
	String degree = "Bachelor Of Engineering";
	Double percentage = 87.5;

	public static void main(String[] args) {

		System.out.println("Id:"+id); // Directly

		System.out.println("Id:" + StaticVariable.id); // Class Name as a reference

		StaticVariable s = new StaticVariable(); // Object name as a reference
		System.out.println("Name:"+s.name);

	}

}
