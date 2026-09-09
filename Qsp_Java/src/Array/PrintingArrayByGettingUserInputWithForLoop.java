package Array;

import java.util.Scanner;

public class PrintingArrayByGettingUserInputWithForLoop {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int arr[] = new int[6];
		for (int i = 0; i <= arr.length - 1; i++) {
			System.out.println("Enter the value of " + i);
			arr[i] = sc.nextInt();
			System.out.println("------------------------------");

		}
		for (int i = 0; i <= arr.length - 1; i++) {
			System.out.println(arr[i]);
		}

	}

}
