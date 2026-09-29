package Constructor;

public class MethodChaining {
	
	MethodChaining m1() {
		System.out.println("Method 1");
		return this;
	}
	
	MethodChaining m2() {
		System.out.println("Method 2");
		return this;
	}
	
	MethodChaining m3() {
		System.out.println("Method 3");
		return this;
	}
	
	MethodChaining m4() {
		System.out.println("Method 3");
		return this;
	}
	
	

	public static void main(String[] args) {
		
		MethodChaining m=new MethodChaining();
		
		m.m1().m2().m3().m4();

	}

}
