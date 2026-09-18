package ArrayMethod;

import java.util.Arrays;

public class RightShiftBy2 {

	static void right_shift(int ar[]) {

		int temp1 = ar[ar.length - 1];
		int temp2 = ar[ar.length - 2];

		for (int i = ar.length - 3; i >= 0; i--) {
			ar[i + 2] = ar[i];
		}

		ar[0] = temp2;
		ar[1] = temp1;

	}

	public static void main(String[] args) {

		int ar[] = { 10, 20, 30, 40, 50, 60 };

		right_shift(ar);

		System.out.println(Arrays.toString(ar));

	}

}
