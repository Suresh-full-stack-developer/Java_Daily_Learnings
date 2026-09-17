package ArrayMethod;

public class FindSecMinValue {
	static int second_min(int ar[]) {

		int first_min = Integer.MAX_VALUE;
		int second_min = Integer.MAX_VALUE;

		for (int i = 0; i <= ar.length - 1; i++) {
			if (ar[i] < first_min) {
				first_min = ar[i];
			}
		}
		for (int i = 0; i <= ar.length - 1; i++) {
			if (ar[i] < second_min && ar[i] != first_min) {
				second_min = ar[i];
			}
		}
		return second_min;
	}

	public static void main(String[] args) {

		int ar[] = { 20, 30, -40, 90, 140 };

		int res = second_min(ar);
		System.out.println(res);

	}

}
