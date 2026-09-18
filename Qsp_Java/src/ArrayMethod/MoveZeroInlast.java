package ArrayMethod;

import java.util.Arrays;

public class MoveZeroInlast {
	static void move_zero(int ar[]) {

		int index = 0;

		for (int i = 0; i <= ar.length - 1; i++) {
			if (ar[i] != 0) {
				ar[index] = ar[i];
				index++;

			}
		}
		for (int j = index; j < ar.length; j++) {
			ar[j] = 0;
		}
	}

	public static void main(String[] args) {

		int ar[] = { 10, 0, 20, 30, 0, 40 };

		move_zero(ar);
		System.out.println(Arrays.toString(ar));

	}

}
