package MockPracticeQuestions;

public class NthSmithNumber {

	static int sumOfDigit(int num) {
		int sum = 0;
		while (num > 0) {
			sum = sum + num % 10;
			num /= 10;
		}
		return sum;
	}

	public static void main(String[] args) {

		int nth = 5;
		int count = 0;
		int res = 0;

		for (int j = 0; count <= nth; j++) {
			int num = j;
			int temp = num;

			int sum = 0;

			for (int i = 2; i <= num; i++) {
				while (num % i == 0) {
					sum += sumOfDigit(i);
					num /= i;

				}

			}
			if (sum == sumOfDigit(temp)) {
				res = temp;
				count++;
			}
		}
		System.out.println(res);

	}

}
