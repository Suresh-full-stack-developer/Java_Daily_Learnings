package CodingPractice;

public class RangeOfPrime {

	public static void main(String[] args) {
		int start=1;
		int end=15;
		
		for(int j=start;j<=end;j++) {
			int num = j;
			int count = 0;

			for (int i = 1; i <= num; i++) {

				if (num % i == 0) {
					count++;
				}
			}
			System.out.println();
		}
	}
}

