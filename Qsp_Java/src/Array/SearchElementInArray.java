package Array;

public class SearchElementInArray {

	public static void main(String[] args) {
		int arr[] = { 10, 20, 30, 40, 50 };
		int element = 30;
		boolean found = false;
		for (int i = 0; i <= arr.length - 1; i++) {
			if (arr[i] == element) {
				found = true;
			}
		}
		System.out.println(found ? "Found" : "Not Found");
	}

}