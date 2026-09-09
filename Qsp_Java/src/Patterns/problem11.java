package Patterns;

public class problem11 {

	public static void main(String[] args) {
		int n = 8;
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n; j++) {
				if (i==j||i+j==n+1||i==(n/2)+1||j==(n/2)+1) {
					System.out.print("\u001b[31m @ \u001b[0m");
				} else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}

	}

}
