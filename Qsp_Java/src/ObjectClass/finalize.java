package ObjectClass;

public class finalize {

	int id;
	String name;
	int age;
	long cno;

	public finalize(int id, String name, int age, long cno) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.cno = cno;
	}

	@Override
	protected void finalize() throws Throwable {
		System.out.println("Finalize method is called");
	}

	public static void main(String[] args) {
		finalize s1 = new finalize(101, "Suresh", 22, 987654321l);

		s1 = null;

		System.gc();
	}
}
