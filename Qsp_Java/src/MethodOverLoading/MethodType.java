package MethodOverLoading;

public class MethodType {
	static void print(int a) {
		System.out.println("\u001b[101m Suresh \u001b[0m Java Full-Stack Developer");
	}

	static void print(char ch) {
		System.out.println("\u001b[103m Suresh \u001b[0m Java Full-Stack Developer");
	}
	
	static void print(String s) {
		System.out.println("\u001b[102m Suresh \u001b[0m Java Full-Stack Developer");
	}
	
	public static void main(String[] args) {
		print(12); //direct
		print('A');
		print("Suresh");
		
		System.out.println("---------------------------");
		
		MethodType.print(12);//class name as reference
		MethodType.print('B');
		MethodType.print("Suresh");
		
		System.out.println("---------------------------");
		
		MethodType m=new MethodType(); //object as reference
		m.print(12);
		m.print('C');
		m.print("Suresh");
		
		
	}
}
