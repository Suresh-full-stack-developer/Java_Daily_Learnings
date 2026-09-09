package Array;

public class PrintArrayUsingForLoop {

	public static void main(String[] args) {
		int arr[]= {10,20,30,40,50};
		
		for(int i=0;i<=arr.length-1;i++) {
			System.out.println(arr[i]);
		}
		
		//For-each loop to print the data
		//Syntax:
		// datatype identifier:reference variable{}
		
		//But its not working to the array  getting user input concept
		
		for(int i:arr) {
			System.out.println(i);
		}
		
		
		
		
		
		
		
		
		

	}

}
