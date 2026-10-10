package qsp_javaPatterns;

public class LargestNumber {

	static int findMax(int ar[]) {
		int max1 = Integer.MIN_VALUE;
		for (int i = 0; i <= ar.length - 1; i++) {
			if (ar[i] > max1) {
				max1 = ar[i];
			}

		}
		return max1;
	}

	public static void main(String[] args) {

		int ar[] = { 10, 50, 80, 300 };
		int res=findMax(ar);
		
		System.out.println(res);

	}

}
