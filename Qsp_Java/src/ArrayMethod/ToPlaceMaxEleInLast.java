package ArrayMethod;

import java.util.Arrays;

public class ToPlaceMaxEleInLast {

	static int[] place_lastMax(int ar[]) {
		int temp = 0;

		for (int i = 0; i <= ar.length - 2; i++) {

			if (ar[i] > ar[i + 1]) {

				temp = ar[i];
				ar[i] = ar[i + 1];
				ar[i + 1] = temp;
			}
		}

		return ar;
	}

	public static void main(String[] args) {

		int ar[] = { 10, 40, 50, 70, 10, 15, 18 };

		place_lastMax(ar);

		System.out.println(Arrays.toString(ar));
	}

}
