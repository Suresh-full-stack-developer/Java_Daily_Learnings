package ExceptionHandling;

import java.util.Scanner;

public class ArithmeticException {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the num1:"); //10
		int num1=sc.nextInt();
		System.out.println("Enter the num2:"); //0
		int num2=sc.nextInt();
		
		System.out.println("Start Execution");
		
		System.out.println("Output:"+num1/num2); //---> / by zero
		
		System.out.println("End Execution");

	}

}
