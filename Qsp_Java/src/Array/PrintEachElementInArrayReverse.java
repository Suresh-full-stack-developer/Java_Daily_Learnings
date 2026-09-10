package Array;

public class PrintEachElementInArrayReverse {

	static int ReverseDigit(int num) {
		int rev = 0;
		while (num != 0) {
			rev = (rev * 10) + (num % 10);
			num /= 10;
		}
		return rev;

	}

	public static void main(String[] args) {
		int arr[] = { 10, 20, 30, 40, 50 };
		for (int i = 0; i <= arr.length - 1; i++) {
			System.out.println(arr[i]);
		}
	}

}
