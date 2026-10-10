package qsp_javaPatterns;

public class SecondMax {

	static int secondMax(int ar[]) {
		int max1 = Integer.MIN_VALUE;
		int max2 = Integer.MIN_VALUE;
		for (int i = 0; i <= ar.length - 1; i++) {
			if (ar[i] > max1) {
				max1 = ar[i];
			}
		}
		for (int i = 0; i <= ar.length - 1; i++) {
			if (ar[i] > max2 && ar[i] != max1) {
				max2 = ar[i];
			}
		}
		return max2;
	}

	public static void main(String[] args) {

		int ar[] = { 20, 300, 299, 50, 60 };
		int res = secondMax(ar);

		System.out.println(res);

	}
}
