package Inheritance;

public class SingleLevel {
	
	
		int land;
		double cash;
		int gold;

	
	public class child extends SingleLevel{
		
		public child() {
			super();
		}

		void dance() {
			System.out.println("Dancing");
		}
		
		void sing() {
			System.out.println("Singing");
		}
	}

	public static void main(String[] args) {
		child c=new child();
		
	 

	}
	

	}
