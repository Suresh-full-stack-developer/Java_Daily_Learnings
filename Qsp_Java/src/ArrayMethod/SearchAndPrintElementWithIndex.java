package ArrayMethod;

public class SearchAndPrintElementWithIndex {
	static void searchElement(String arr[], String name) {
		boolean found = false;
		int index = -1;
		for (int i = 0; i <= arr.length - 1; i++) {
			if (arr[i].equalsIgnoreCase(name)) {
				found = true;
				index = i;
			}
		}
		if (found) {
			System.out.println("Element found at:" + index);
		} else {
			System.out.println("Element not Found");
		}

	}

	public static void main(String[] args) {
		String arr[] = { "Suresh", "Java", "Full", "Stack", "Developer" };
		String name = "stack";
		searchElement(arr, name);

	}

}
