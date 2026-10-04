package qsp_java;

public class NthArmStrongNumber {

	public static void main(String[] args) {

		int n = 10;
		int count = 0;
		int num = 1;

		while (count < n) {

			int original = num;
			int temp = num;
			int sum = 0;

			while (temp > 0) {
				int digit = temp % 10;
				sum += digit * digit * digit;
				temp /= 10;
			}

			if (original == sum) {
				count++;

				if (count == n) {
					System.out.println(n + "th Armstrong Number = " + original);
				}
			}

			num++;
		}

	}
}