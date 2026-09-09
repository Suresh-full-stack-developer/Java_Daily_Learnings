package numbers;

import java.util.Scanner;

public class natural_num_reverse {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number to end:");
		int end=sc.nextInt();
		System.out.println("Enter the number to start:");
		int start=sc.nextInt();
		do
			System.out.println(end--);
		while(start<=end);
	}

}
