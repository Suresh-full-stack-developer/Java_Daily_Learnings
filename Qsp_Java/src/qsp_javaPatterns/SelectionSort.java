package qsp_javaPatterns;

public class SelectionSort {

	public static void main(String[] args) {
		int ar[] = { 5, 8, 3, 6, 2 };
		for (int i = 0; i < ar.length - 1; i++) {
			int min = i;
			for (int j = i + 1; j < ar.length; j++) {
				if (ar[j] < ar[min]) {
					min = j;
				}
			}
			int temp = ar[i];
			ar[i] = ar[min];
			ar[min] = temp;
		}
		for (int i = 0; i < ar.length; i++) {
			System.out.println(ar[i]);
		}

	}

}
