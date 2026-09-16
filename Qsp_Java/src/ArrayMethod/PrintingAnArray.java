package ArrayMethod;

import java.util.Arrays;

public class PrintingAnArray {

	static int[] printArr(int ar[]) {
		for (int i = 0; i <= ar.length - 1; i++) {

			// System.out.println(ar[i]);
		}
		return ar;
	}

	public static void main(String[] args) {
		int ar[] = { 10, 20, 30, 40, 50, 60 };
		System.out.println(Arrays.toString(ar));
	}

}
