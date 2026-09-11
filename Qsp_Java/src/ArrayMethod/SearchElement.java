package ArrayMethod;

public class SearchElement {
	static void searchElement(String arr[], String name) {
		boolean found = false;
		for (int i = 0; i <= arr.length - 1; i++) {
			if (arr[i].equalsIgnoreCase(name)) {
				found = true;
			}
		}
		
		if(found) {
			System.out.println("Element found");
		}
		else {
			System.out.println("Not Found");
		}
//		System.out.println(found ? "Element Found" : "Not Found");

	}

	public static void main(String[] args) {
		String arr[] = { "Suresh", "Java", "Full", "Stack", "Developer" };
		String name = "stack";
		searchElement(arr, name);

	}

}
