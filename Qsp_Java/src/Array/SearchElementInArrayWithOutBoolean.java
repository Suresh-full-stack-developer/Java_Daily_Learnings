package Array;

public class SearchElementInArrayWithOutBoolean {

	public static void main(String[] args) {
		int arr[] = { 10, 20, 30, 40, 50 };
		int element = 50;

		for (int i = 0; i <= arr.length - 1; i++) {
			if (arr[i] == element) {
				System.out.println("Found");
				return;   //To Stop Main Method
			}
		}
		System.out.println("Not Found");
	}

}
