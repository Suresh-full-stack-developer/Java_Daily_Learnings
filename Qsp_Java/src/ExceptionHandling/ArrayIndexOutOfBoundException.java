package ExceptionHandling;

import java.util.Scanner;

public class ArrayIndexOutOfBoundException {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Index Value:");
		int ar[] = { 10, 20, 30, 40, 50 };
		int index = sc.nextInt();

		System.out.println("Index" + " " + index + ":" + " " + ar[index]);
	}

}
