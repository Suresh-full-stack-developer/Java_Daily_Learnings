package SortingConcepts;

import java.util.Arrays;

public class BubbleSort {

	public static void main(String[] args) {

		int ar[] = { 20, 60, 80, 65, 45, 80, 95 };

		for (int j = 0; j <= ar.length - 1; j++) {
			for (int i = 0; i <= ar.length - 2; i++) {
				if (ar[i] > ar[i + 1]) {
					ar[i] = ar[i] ^ ar[i + 1];
					ar[i + 1] = ar[i] ^ ar[i + 1];
					ar[i] = ar[i] ^ ar[i + 1];
				}
			}
		}
		System.out.println(Arrays.toString(ar));

	}

}
