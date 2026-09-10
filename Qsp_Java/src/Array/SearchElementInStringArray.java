package Array;

public class SearchElementInStringArray {

	public static void main(String[] args) {
		String str[] = { "Suresh", "Java", "Full", "Stack", "Developer" };
		String element = "Developer";

		for (int i = 0; i <= str.length - 1; i++) {
			if (str[i] == element) {
				System.out.println("Found"+" "+"Index"+" "+i);
				return;
			}
		}
		System.out.println("Not Found");

	}

}
