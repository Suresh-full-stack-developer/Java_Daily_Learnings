package numbers;

import java.util.Scanner;

public class sum_of_number_dowhile {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the start value:");
		int start=sc.nextInt();
		System.out.println("Enter the end value:");
		int end=sc.nextInt();
		int sum=0;
		
		do {
			sum+=start;
			start++;
			
			
		}while(start<=end);
		System.out.println(sum);
	}

}
