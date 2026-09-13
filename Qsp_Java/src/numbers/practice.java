package numbers;

import java.util.Scanner;

//prime number

public class practice {
	public static void main(String[] args) {
//		int num=21;
//		int count=0;
//		for(int i=1;i<=num;i++) {
//			if(num%i==0) {
//				System.out.println(i);
//				count++;
//			}
//			
//		}
//		if(count==2) {
//			System.out.println(num+":"+"Prime number");
//		}
//		else {
//			System.out.println(num+":"+"Not a prime number");
//		}
//		
//	}
		// ------------------------------------------------------------

		// sum of prime number factors

		// public static void main(String[] args) {
//		Scanner sc=new Scanner(System.in);
//		System.out.println("Enter the start value:");
//		int start=sc.nextInt();
//		System.out.println("Enter the end value: ");
//		int End=sc.nextInt();
//		int num=20;
//		int sum=0;
//		for(int i=1;i<=num;i++) {
//			if(num%i==0) {
//				sum+=i;
//				System.out.println("factor:"+i+" "+"sum"+sum);
//			}
//		}
		// ------------------------------------------------------------
//		
//		

		// reverse the number

//	public static void main(String[] args) {
//		int num = 1234;
//		while (num > 0) {
//			int last = num % 10;
//			int rev = last;
//			num /= 10;
//			System.out.print(rev);
//
//		}
//
//	}
		// -------------------------------------------------

		// print even or odd in given number

//	
//	public static void main(String[] args) {
//		int num=120;
//		if(num%2==0) {
//			System.out.println("Its an even number");
//		}
//		else {
//			System.out.println("It's an odd number");
//		}
		// --------------------------------------------------------

		// extarct the last one digit

//	public static void main(String[] args) {
//		int num=115;
//		int ex=num%100;
//		System.out.print(ex);
//	}
		// ---------------------------------------------

		// remove the digits

//	public static void main(String[] args) {
//		int number=1234;
//		int remove =number/10;
//		System.out.println(remove);
//		
//	}
//	
//	----------------------------------------------------

		// sum of the each given digits

//	public static void main(String[] args) {
//		int num=12345;
//		int sum=0;
//		int ex=num%10;
//		sum=sum+ex;
//		
//		System.out.println(sum);
//	}

		// print the count of the given number

		int num = 1234586685;
		int count=0;

		while(num>0) {

			num=num/10;
			count++;
		}
		System.out.println(count);

	}
}
