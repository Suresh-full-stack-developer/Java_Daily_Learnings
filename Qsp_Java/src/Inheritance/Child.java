package Inheritance;

class grandParent{
	public void gold(){
		System.out.println("5 kg Gold");
	}
	public void land() {
		System.out.println("3 hecters land");
	}
}

class phone extends grandParent{
	void bike() {
		System.out.println("Super Bike");
	}
	void cycle() {
		System.out.println("Gear Cycle");
	}
}

class smart extends parent{
	void superbike() {
		System.out.println("Super Bike");
	}
	void supercycle() {
		System.out.println("Super Cycle");
	}
}


public class Child {

	public static void main(String[] args) {
		smart s=new smart();
		s.gold();
		s.land();
		s.bike();
		s.cycle();
		s.superbike();
		s.supercycle();	

	}

}
