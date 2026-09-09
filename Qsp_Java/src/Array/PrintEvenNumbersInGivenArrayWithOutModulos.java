package Array;

public class PrintEvenNumbersInGivenArrayWithOutModulos {

	public static void main(String[] args) {
		int arr[] = { 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20 };

		for (int i = 0; i <= arr.length - 1; i++) {
			System.out.println(arr[i] >> 1 << 1 == arr[i]);
		}
	}

}
