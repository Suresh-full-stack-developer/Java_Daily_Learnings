package Patterns;

public class problem7 {

	public static void main(String[] args) {
		int n = 8;
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n; j++) {
				if (j == 1 || i == 1 || j == n || i == n||i+j==n+1) {
					System.out.print("\u001b[31m @");
				} else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}

	}

}
