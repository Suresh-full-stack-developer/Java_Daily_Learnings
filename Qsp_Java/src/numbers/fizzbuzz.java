package numbers;

import java.util.Scanner;

public class fizzbuzz {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the start number:");
		int start=sc.nextInt();
		System.out.println("Enter the end number:");
		int end =sc.nextInt();
		while(start<=end) {
		if(start%3==0 && start%5==0) {
			System.out.println("FizzBuzzz");
		}
		else if(start%3==0) {
			System.out.println("Fizz");
		}
		else if(start%5==0) {
			System.out.println("Buzz");
		}
		else {
			System.out.println(start);
		}
		start++;
		}
		
	}
}


