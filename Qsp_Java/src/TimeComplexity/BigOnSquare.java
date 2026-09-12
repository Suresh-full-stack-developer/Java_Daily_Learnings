package TimeComplexity;

import java.util.Arrays;

public class BigOnSquare {

	public static void main(String[] args) {
		int arr[] = { 2, 6, 10, 15 };
		int target = 16;

		for (int i = 0; i <= arr.length - 1; i++) {
			for (int j = i + 1; j <= arr.length - 1; j++) {
				if ((arr[i] + arr[j]) == target) {
					System.out.println(i);
					System.out.println(j);
					// System.out.println(Arrays.toString(i,j));

				}
			}
		}

	}

}
