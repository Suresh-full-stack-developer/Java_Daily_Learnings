package ArrayMethod;

import java.util.Arrays;

public class LeftShiftBy1 {

	static void left_shift(int ar[]) {

		int temp = ar[0];

		for (int i = 1; i <= ar.length - 1; i++) {
			ar[i - 1] = ar[i];
		}
		ar[ar.length - 1] = temp;
		//System.out.println(ar);

		//return ar;

	}

	public static void main(String[] args) {
		int ar[] = { 10, 20, 30, 40, 50, 60 };

		left_shift(ar);

		System.out.println(Arrays.toString(ar));

	}

}
