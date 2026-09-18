package ArrayMethod;

import java.util.Arrays;

public class LeftShiftBy2 {

	static void left_shift(int ar[]) {

		int temp1 = ar[0];
		int temp2 = ar[1];

		for (int i = 2; i <= ar.length - 1; i++) {
			ar[i - 2] = ar[i];
		}

		ar[ar.length - 2] = temp1;
		ar[ar.length - 1] = temp2;

	}

	public static void main(String[] args) {
		int ar[] = { 10, 20, 30, 40, 50, 60 };

		left_shift(ar);

		System.out.println(Arrays.toString(ar));

	}

}
