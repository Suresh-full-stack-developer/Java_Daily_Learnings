package MockPracticeQuestions;

public class SmithNumber {

	static int sumOfEachDigit(int num) {
		int sum = 0;

		while (num > 0) {

			sum = sum + num % 10;
			num /= 10;
		}
		return sum;

	}

	public static void main(String[] args) {

		int num = 666;
		int temp = num;

		int sum = 0;

		for (int i = 2; i <= num; i++) {
			while (num % i == 0) {
				sum += sumOfEachDigit(i);
				num /= i;

			}

		}
		System.out.println(sum == sumOfEachDigit(temp) ? "Smith Number" : "Not a Smith Number");

	}

}
