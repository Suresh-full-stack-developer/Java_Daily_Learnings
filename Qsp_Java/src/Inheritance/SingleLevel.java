package Inheritance;

public class SingleLevel {
	
	
		int land;
		double cash;
		int gold;
		
 SingleLevel(int land,double cash,int gold) {
			this.land=land;
			this.cash=cash;
			this.gold=gold;
			
		}

	
	public class child extends SingleLevel{
		
		public child() {
			
		

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
