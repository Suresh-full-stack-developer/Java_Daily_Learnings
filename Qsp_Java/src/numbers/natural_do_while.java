package numbers;

import java.util.Scanner;

public class natural_do_while {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the start:");
		int start=sc.nextInt();
		System.out.println("Enter the end:");
		int end=sc.nextInt();
		do
			System.out.println(start++);
		while(start<=end);
	}

}
