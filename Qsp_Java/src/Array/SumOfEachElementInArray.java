package Array;

public class SumOfEachElementInArray {

	public static void main(String[] args) {
		int sum = 0;
		int str[] = { 10, 20, 30, 40 };

		for (int i = 0; i <= str.length - 1; i++) {
			sum =sum+str[i];
		}
		System.out.println(sum);
	}

}
