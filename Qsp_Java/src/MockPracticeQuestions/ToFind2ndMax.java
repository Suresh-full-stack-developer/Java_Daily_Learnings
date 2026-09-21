package MockPracticeQuestions;

public class ToFind2ndMax {

	static int Second_Max(int ar[]) {

		int firstMax = Integer.MIN_VALUE;
		int secondMax = Integer.MIN_VALUE;

		for (int i = 0; i <= ar.length - 1; i++) {
			if (ar[i] > firstMax) {
				firstMax = ar[i];
			}
		}

		for (int i = 0; i <= ar.length - 1; i++) {
			if (ar[i] > secondMax && ar[i] != firstMax) {
				secondMax = ar[i];
			}
		}
		return secondMax;

	}

	public static void main(String[] args) {

		int ar[] = { 20, 40, 60, 110, 80, 90 };

		int res = Second_Max(ar);

		System.out.println(res);

	}

}
