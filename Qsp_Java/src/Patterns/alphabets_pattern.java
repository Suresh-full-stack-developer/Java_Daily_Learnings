package Patterns;

import java.util.Scanner;

public class alphabets_pattern {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (true) {
			System.out.println("Enter the Uppercase alphabet:");
			char a = sc.next().charAt(0);
			

			switch (a) {
			case 'A':
				int n = 10;

				for (int i = 1; i <= n; i++) {
					for (int j = 1; j <= n - i; j++) {
						System.out.print("   ");
					}
					for (int k = 1; k <= (i * 2) - 1; k++) {
						if (k == 1 || k == (2 * i) - 1 || i == (n / 2) + 1)
							System.out.print("\u001b[92m❤️ \u001b[0m");
						else {
							System.out.print("   ");
						}
					}
					System.out.println();
				}
				break;
			case 'B':
				
				n = 10;
				for (int i = 1; i <= n; i++) {
					for (int j = 1; j <= n; j++) {
						if (i == 1 && j <= n - 1 || j == 1 || i == n && j != i
								|| j == n && n + 1 != i + j && j != i && i != (n / 2) + 1 || i == (n / 2) + 1 && j != n)
//							System.out.print(i + "" + j + " ");
//						else {
//							System.out.print(" ");
//						}
//							}
							System.out.println();
					}
					System.out.println("B----------");
					for (int i1 = 1; i1 <= n; i1++) {
						for (int j = 1; j <= n; j++) {
							if (i1 == 1 && j <= n - 1 || j == 1 || i1 == n && j != i1
									|| j == n && n + 1 != i1 + j && j != i1 && i1 != (n / 2) + 1
									|| i1 == (n / 2) + 1 && j != n)
								System.out.print("\u001b[92m@ \u001b[0m");
							else
								System.out.print(" ");
						}
						System.out.println();
					}
				}

			}
		}
	}
}
