package ArrayMethod;

import java.util.Arrays;

public class RightShiftBy1 {

	static void right_shift(int ar[]) {

		int temp = ar[ar.length - 1];

		for (int i = ar.length - 2; i >= 0; i--) {
			ar[i + 1] = ar[i];
		}

		ar[0] = temp;

	}

	public static void main(String[] args) {

		int ar[] = { 10, 20, 30, 40, 50, 60 };

		right_shift(ar);

		System.out.println(Arrays.toString(ar));

	}

}
