package Task;

public class SumOfDigits {
	static int sum(int num) {
		int res=0;

		while (num != 0) {
			int last = num % 10;
			res+=last;
			num /= 10;
		}
		return res;

	}

	public static void main(String[] args) {
		int out=SumOfDigits.sum(123);
		System.out.println("Sum Of Digits:"+out);

	}

}
