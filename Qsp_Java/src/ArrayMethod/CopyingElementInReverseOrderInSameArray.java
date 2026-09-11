package ArrayMethod;

public class CopyingElementInReverseOrderInSameArray {
	
	
	static void copyingArray(int arr[]) {
		int start=0;
		int end=arr.length-1;
		int temp=end;
		while(start<end) {
			arr[start]=arr[end];
			arr[end]=temp;
			start++;
			end--;
		}
	}

	public static void main(String[] args) {
		int arr[]= {10,20,30,40,50};
		copyingArray(arr);
		
	}

}
