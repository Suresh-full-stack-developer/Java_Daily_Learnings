package Inheritance;

class top {
	String land;
	String gold;

	void display(String land, String gold) {
		System.out.println("Land:" + land);
		System.out.println("Gold:" + gold);
	}
}

class lower extends top {

	void bike() {
		System.out.println("Super Bike");
	}

	void mobile() {
		System.out.println("I-Phone");
	}

}

public class parent {

	public static void main(String[] args) {

		lower l = new lower();

		l.display("3 Hectres", "5kg");
		l.bike();
		l.mobile();

	}

}