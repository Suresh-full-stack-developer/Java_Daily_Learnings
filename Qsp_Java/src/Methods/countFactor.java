package Methods;

public class countFactor {
	static int countFactor(int num) {
		int count = 0;
		for (int i = 1; i <= num; i++) {
			if (num % i == 0) {
				count++;
			}
		}
		System.out.println(count);
		return count;

	}

	static boolean checkPrime(int num) {
		int count = countFactor(num);
		return count == 2;
	}
	
	
	
	
//	static void RangeOfPrime(int start) {
//		for(int i=start;i<=end;i++) {
//			if(checkPrime(i)) {
//				System.out.println(i);
//			}
//		}
//	}

	public static void main(String[] args) {
		System.out.println(checkPrime(17));
	}

}
