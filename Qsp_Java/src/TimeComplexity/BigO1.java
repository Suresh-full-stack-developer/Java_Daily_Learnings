package TimeComplexity;

import java.util.Scanner;

public class BigO1 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the number1:");
		int num1=sc.nextInt();
		System.out.println("Enter the number2:");
		int num2=sc.nextInt();
		
		
		System.out.println("---------------------------");
		
		System.out.println("Sum of two number is:"+(num1+num2));
		System.out.println("---------------------------");
		
		
		System.out.println("Example 2");
		
		
		
		//Another Array Example
		
		
		int arr[]= {10,20,30,40,50};
		
		int start=0;
		int end=arr.length-1;
		int mid=start+end/2;
		
		System.out.println("First Element:"+arr[0]);
		
		System.out.println("----------------------");
		
		System.out.println("Last Element:"+arr[arr.length-1]);
		
		System.out.println("----------------------");
		
		System.out.println("Middle Element:"+arr[mid]);

	}

}
