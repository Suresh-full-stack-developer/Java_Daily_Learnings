package Array;

public class CopyingEachElementInOneArrayToAnotherArray {

	public static void main(String[] args) {
		int arr[] = { 10, 20, 30, 40, 50 };
		int ar[] = new int[arr.length];

		for (int i = 0; i <= arr.length - 1; i++) {
			System.out.println(arr[i]);
		}
		System.out.println("------------------------");
		for (int i = 0; i <= ar.length - 1; i++) {
			ar[i] = arr[i];
			System.out.println(ar[i]);

		}

	}

}
