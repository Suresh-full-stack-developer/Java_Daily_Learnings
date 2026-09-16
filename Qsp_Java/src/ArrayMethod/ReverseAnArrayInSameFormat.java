package ArrayMethod;

public class ReverseAnArrayInSameFormat {

	// print like this [10,20,30,40,50,60,70]

	static void revArr(int ar[]) {
		int newAr[]=new int[ar.length];
		System.out.print("[");

		for (int i = 0; i <= ar.length - 1; i++) {
			
			newAr[ar.length - 1 - i] = ar[i];

			System.out.print(ar[i]);

			if (i <= ar.length - 2) {
				System.out.print(",");
			}

		}

		System.out.println("]");

	}

	public static void main(String[] args) {
		int ar[] = { 10, 20, 30, 40, 50, 60, 70 };
		revArr(ar);

	}

}
