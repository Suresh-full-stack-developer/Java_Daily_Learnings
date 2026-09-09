package numbers;

import java.util.Scanner;

public class product_numbers {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the start value:");
		int start=sc.nextInt();
		System.out.println("Enter the end value:");
		int end=sc.nextInt();
		int prod=1;	//initialize prod
		
		do {
			prod*=start;  //prod to be an given numbers
			start++;		//user input will be increment
			
			
		}while(start<=end);
		System.out.println(prod);
	}

}
