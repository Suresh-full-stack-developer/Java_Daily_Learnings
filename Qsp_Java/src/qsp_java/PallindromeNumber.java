package qsp_java;

public class PallindromeNumber {

	public static void main(String[] args) {
		int num = 121;
		int temp=num;

		int rev = 0;

		while (num > 0) {

			int digit = num % 10;
			rev = rev * 10 + digit;
			num /= 10;
		}
		
		System.out.println(rev);
		System.out.println(temp == rev ? "Pallindrome Number" : "Not a Pallindrome Number");
		
//		if(num==rev) {
//			System.out.println("Pallindrome Number");
//		}
//		else {
//			System.out.println("Not a Pallindrome Number");
//		}
	}
	}
