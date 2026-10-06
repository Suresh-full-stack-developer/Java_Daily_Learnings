package Encapsulation;

public class BankDriver {

	public static void main(String[] args) {
		BankExample b=new BankExample();
		
		b.setAccountNo(1234554569785l);
		
		System.out.println(b.getAccountNo());

		
		b.setName("Suresh");
		System.out.println(b.getName());
		
		b.setAge(22);
		
		System.out.println(b.getAge());
		
		b.setcNo(9652655684l);
		System.out.println(b.getcNo());
		
		
		
	}
	 
	
}
