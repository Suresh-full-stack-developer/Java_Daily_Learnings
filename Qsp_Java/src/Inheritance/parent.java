package Inheritance;

public class parent {
	
	
	void gold() {
		System.out.println("Gold");
	}
	void land() {
		System.out.println("Land");
	}
	void bike() {
		System.out.println("Bike");
	}
}
	
	
	class child extends parent{
		void superbike() {
			System.out.println("Super Bike");
		}
		
		void cycle() {
			System.out.println("Cycle");
		}

	

	public static void main(String[] args) {
		
		child c=new child();
		 
		c.gold();

	}
}


