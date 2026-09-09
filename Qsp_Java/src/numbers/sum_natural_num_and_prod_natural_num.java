package numbers;

import java.util.Scanner;

public class sum_natural_num_and_prod_natural_num {

	public static void main(String[] args) {
		int sum=0;
		int pod=1;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the start number:");
		int start=sc.nextInt();
		System.out.println("Enter the end number:");
		int end=sc.nextInt();
		
		for(int i=start;i<=end;i++) {
			sum+=i;
			pod*=i;
		}
		System.out.println(sum);
		System.out.println(pod);
			
		}

	}