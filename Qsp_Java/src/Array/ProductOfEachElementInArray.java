package Array;

public class ProductOfEachElementInArray {

	public static void main(String[] args) {
		int prod = 1;
		int arr[] = { 10, 20, 30, 40, 50 };

		for (int i = 0; i <= arr.length - 1; i++) {
			prod = prod * arr[i];

		}
		System.out.println(prod);
	}

}
