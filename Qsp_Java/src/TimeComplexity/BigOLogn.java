package TimeComplexity;

public class BigOLogn {

	public static void main(String[] args) {
		int arr[] = { 10, 20, 30, 40, 50, 60, 70 };
		int target = 50;
		int low = 0;
		int high = arr.length - 1;
		boolean found = false;
		while (low <= high) {
			int mid = (low + high) / 2;

			if (arr[mid] == target) {
				// System.out.println("Element found at:"+mid);
				found = true;
				break;

			} else if (target < arr[mid]) {
				high = mid - 1;
			} else {
				low = mid + 1;
			}

		}

		System.out.println(found ? "Element Found" : "Element Not Found");

	}

}
