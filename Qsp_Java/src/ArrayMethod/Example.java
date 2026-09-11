package ArrayMethod;

public class Example {

	static void  exampleProgram(int arr[]) {
		for (int i = 0; i <= arr.length - 1; i++) {
			System.out.println(arr[i]);
		}
		System.out.println("-----------------------");

		for (int s : arr) { // for each loop
			System.out.println(s);

		}
	}

	public static void main(String[] args) {
		int arr[] = { 10, 20, 30, 40, 50 };
		exampleProgram(arr);
		

	}

}
