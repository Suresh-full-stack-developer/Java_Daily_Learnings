package qsp_java;

public class RangeOfArmstrongNumber {

	public static void main(String[] args) {
		int start = 2;
	    int end = 1000;

	    for (int num = start; num <= end; num++) {

	        int original = num;
	        int temp = num;
	        int sum = 0;

	        while (temp > 0) {
	            int digit = temp % 10;
	            sum += digit * digit * digit;
	            temp /= 10;
	        }

	        if (original == sum) {
	            System.out.println(original);
	        }

	}

	}
}
