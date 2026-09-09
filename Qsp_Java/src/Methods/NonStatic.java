package Methods;

public class NonStatic {

	int countFactor(int num) {
		int count = 0;
		for (int i = 1; i <= num; i++) {
			if (num % i == 0) {
				count++;
			}
		}
		System.out.println(count);
		return count;
	}

	boolean checkPrime(int num) {
		return countFactor(num) == 2;
	}

	public static void main(String[] args) {
		int num = 17;
		NonStatic n = new NonStatic();
		boolean res = n.checkPrime(num);
		System.out.println(res);
	}
}
