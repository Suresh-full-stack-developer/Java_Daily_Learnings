package ArrayMethod;

public class findMax {

	static int findMax(int ar[]) {
		int firstMax = Integer.MIN_VALUE;
		for (int i = 0; i <= ar.length - 1; i++) {
			if (ar[i] > firstMax) {
				firstMax = ar[i];
			}
		}
		return firstMax;
	}

	public static void main(String[] args) {

		int ar[] = { 26, 35, 46, 18, 422, 520 };

		int res = findMax(ar);

		System.out.println(res);

	}

}
