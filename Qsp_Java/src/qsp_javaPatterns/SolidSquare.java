package qsp_javaPatterns;

import java.util.Scanner;

public class SolidSquare {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number:");
		int n = sc.nextInt();

		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n; j++) {
				System.out.print("* ");
			}
			System.out.println(" ");
		}

		System.out.println("----------------");

		System.out.println("Hallow Square");

		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= i; j++) {
				if (i == n || i == 1 || j == n || j == 1) {
					System.out.print("* ");
				} else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}

		System.out.println();

		System.out.println("Right Angle Triangle");
		System.out.println();

		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print("* ");
			}
			System.out.println();

		}

		System.out.println();

		System.out.println("Left Angle Triangle");
		System.out.println();

		for (int i = n; i >= 1; i--) {
			for (int j = 1; j <= i; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}

		System.out.println();

		System.out.println("Right Aligned Triangle");
		System.out.println();

		for (int i = 1; i <= n; i++) {
			for (int k = 0; k <= n - i; k++) {
				System.out.print("  ");
			}
			for (int j = 1; j <= i; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}

		System.out.println();

		System.out.println("Left Aligned Triangle");
		System.out.println();

		for (int i = n; i >= 1; i--) {
			for (int k = 0; k <= n - i; k++) {
				System.out.print("  ");
			}
			for (int j = 1; j <= i; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}

		System.out.println();

		System.out.println("Full pyramid");
		System.out.println();

		for (int i = 1; i <= n; i++) {
			for (int k = 1; k <= n - i; k++) {
				System.out.print("  ");
			}
			for (int j = 1; j <= 2 * i - 1; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}

		System.out.println();

		System.out.println("Inverted Pyramid");
		System.out.println();

		for (int i = n; i>=1; i--) {
			for (int k = 1; k <= n - i; k++) {
				System.out.print("  ");
			}
			for (int j = 1; j <= 2 * i - 1; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}

	}

}
