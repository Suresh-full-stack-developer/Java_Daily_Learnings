package Inheritance;

class payment {
	void amount() {
		System.out.println("Amount is 10000");
	}
}

class gpay extends payment {
	void gpay() {
		System.out.println("Payment done by G-pay ");
	}
}

class phonepe extends payment {
	void phonepe() {
		System.out.println("Payment done by PhonePe");
	}
}

class paytm extends payment {
	void paytm() {
		System.out.println("Payment done by Paytm");
	}
}

public class Hierarical {

	public static void main(String[] args) {

		paytm p = new paytm();
		p.amount();
		p.paytm();
		System.out.println();

		phonepe p1 = new phonepe();
		p1.amount();
		p1.phonepe();
		System.out.println();

		gpay g = new gpay();
		g.amount();
		g.gpay();

	}

}
