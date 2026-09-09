package Array;

public class ArrayCreation {

	public static void main(String[] args) {

		// Using the new keyword to create an array
		int arr[] = new int[6];
		
		arr[0] = 10;
		arr[1] = 20;
		arr[2] = 30;
		arr[3] = 40;
		arr[4] = 50;
		arr[5] = 60;

		System.out.println(arr[0]);
		System.out.println(arr[1]);
		System.out.println(arr[2]);
		System.out.println(arr[3]);
		System.out.println(arr[4]);
		System.out.println(arr[5]);

		System.out.println("-----------------------------");

		//Its another method for creating an Array
		
		String str[] = { "Suresh", "Java", "Full-Stack", "Developer" };

		System.out.println("\u001b[92m" + str[0]+"\u001b[0m");
		System.out.println("\u001b[94m"+str[1]+"\u001b[0m");
		System.out.println("\u001b[95m"+str[2]+"\u001b[0m");
		System.out.println("\u001b[90m"+str[3]+"\u001b[0m");

	}

}
