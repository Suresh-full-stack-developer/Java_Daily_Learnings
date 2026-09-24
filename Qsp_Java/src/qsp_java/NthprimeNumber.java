package qsp_java;

public class NthprimeNumber {

	public static void main(String[] args) {
		int nth =5;

		int count = 0;
		int num = 1;

		while (count < nth) {
			num++;

			int i;
			for (i = 2; i <= num; i++) {
				if (num % i == 0) {
					break;
				}
			}

			if (i == num) {
				count++;
			}
			
		}
		System.out.println(nth+" th Prime Number:"+num);
	}
}
