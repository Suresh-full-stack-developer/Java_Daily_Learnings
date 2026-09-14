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

//		int num = 1234586685;
//		int count=0;
//
//		while(num>0) {
//
//			num=num/10;
//			count++;
//		}
//		System.out.println(count);
//
//	}

		// automorphic number

//		int num = 6;
//		int sq = num * num;
//		int temp = num;
//		int pow = 1;
//
//		while (num > 0) {
//			num = num / 10;
//			pow *= 10;
//		}
//		System.out.println(temp == sq % pow ? "Automorphic Number" : "Not Automorphic");
//
//	}

		// Armstrong Number

//		int num=6;
//		int temp=num;
//		int temp1=num;
//		int count=0;
//		int pow=1;
//		int sum=0;
//		
//		while(num>0) {
//			num=num/10;
//			count++;
//		}
//		while(temp>0) {
//			int last=temp%10;
//			
//		}
//			
//		}

		// To find how many notes present in the given amount

//		int Amount = 100000;
//
//		System.out.println("To find how many notes present in the given amount:)");
//
//		if (Amount >= 2000) {
//			System.out.println("2000 rupe:" + Amount / 2000);
//		}
//		if (Amount >= 500) {
//			System.out.println("500 rupee:" + Amount / 500);
//		}
//		if (Amount >= 200) {
//			System.out.println("200 rupee:" + Amount / 200);
//		}
//		if (Amount >= 100) {
//			System.out.println("100 rupee:" + Amount / 100);
//		}
//		if (Amount >= 50) {
//			System.out.println("50 rupee:" + Amount / 50);
//		}
//		if (Amount >= 20) {
//			System.out.println("20 rupee:" + Amount / 20);
//		}
//		if (Amount >= 10) {
//			System.out.println("10 rupee:" + Amount / 10);
//		}
//
//		if (Amount >= 5) {
//			System.out.println("5 rupee coin:" + Amount / 5);
//		}
//		if (Amount >= 2) {
//			System.out.println("2 rupee coin:" + Amount / 2);
//		}
//		if (Amount >= 1) {
//			System.out.println("1 rupee coin:" + Amount / 1);
//		}
		
		
		
		
		// print the natural number
		
		
//		int num=10;
//		
//		for(int i=0;i<=num;i++) {
//			
//			System.out.println(i);
//		}
//		
//		
//		//Reverse order
//		System.out.println("------------------------");
//		
//		int numm1=10;
//		
//		for(int i=num;i>=0;i--) {
//			System.out.println(i);
//		}
		
		
		// Extract the last digit in given number
		
//		int num=5238;
//		while(num>0) {
//			 num=num/10;
//			System.out.println(num);
//		}
		
		// sum each digit
		int num=1234;
		int sum=0;
		
		for(int i=0;i<=num;i++) {
			
			num=num%10;
			sum+=num/10;
			System.out.println(sum);
			
		}
	}
}
