package ArrayMethod;

public class CheckArrSortOrNot {

	static void check_sort(int ar[]) {
		boolean found = false;

		for (int i = 0; i <= ar.length - 2; i++) {
			if (ar[i] < ar[i + 1]) {

				found = true;
			} else {
				found = false;
				break;
			}
		}
		System.out.println(found ? "Sorted" : "Not Sorted");

	}

	public static void main(String[] args) {
		int ar[] = { 10, 130, 40, 170, 80 };

		check_sort(ar);

	}

}
