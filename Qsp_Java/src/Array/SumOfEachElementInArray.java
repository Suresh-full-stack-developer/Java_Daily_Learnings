package Array;

public class SumOfEachElementInArray {

	public static void main(String[] args) {
		int sum = 0;
		int ar[] = { 10, 20, 30, 40 };

		for (int i = 0; i <= ar.length - 1; i++) {
			sum =sum+ar[i];
		}
		System.out.println(sum);
	}

}
