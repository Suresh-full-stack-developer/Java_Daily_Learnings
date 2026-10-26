package Inheritance;

class grandParent {
	public void gold() {
		System.out.println("5 kg Gold");
	}

	public void land() {
		System.out.println("3 hecters land");
	}
}

class phone extends grandParent {
	public phone() {
		super();
	}

	void bike() {
		System.out.println("Super Bike");
	}

	void cycle() {
		System.out.println("Gear Cycle");
	}
}

class smart extends phone {
	public smart() {
		super();
	}

	void superbike() {
		System.out.println("Super Bike");
	}

	void supercycle() {
		System.out.println("Super Cycle");
	}
}

public class MultiLevel {

	public static void main(String[] args) {
		smart s = new smart();
		s.gold();
		s.land();
		s.bike();
		s.cycle();
		s.superbike();
		s.supercycle();

	}

}
