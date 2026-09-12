package TimeComplexity;

import java.util.Arrays;

public class BigOn {

	static void revArr(int arr[]) {
		int newArr[] = new int[arr.length];

		for (int i = arr.length - 1; i >= 0; i--) {
			newArr[arr.length - 1 - i] = arr[i];
		}
		for (int i = 0; i <= newArr.length - 1; i++) {
			System.out.println(newArr[i]);
		}
	}

	public static void main(String[] args) {
		int arr[] = { 10, 20, 30, 40, 50 };
		revArr(arr);

	}

}
