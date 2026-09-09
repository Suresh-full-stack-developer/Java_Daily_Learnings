package numbers;

import java.util.Scanner;

public class sum_even_and_pro_odd {

	public static void main(String[] args) {
		int sum=0;
		int pod=1;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the start number:");
		int start=sc.nextInt();
		System.out.println("Enter the end number:");
		int end=sc.nextInt();
		for(int i=1;i<=end;i++) {
			if(i%2==0) {
				sum+=i;
				pod*=i;
			System.out.println(pod);
			}
				
		}

	}

}
