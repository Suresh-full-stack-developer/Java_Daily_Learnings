package Array;

public class CopyingElementOneToAnotherArrayButReverseWithOutExtraVariable {

	public static void main(String[] args) {
		int arr[]={10,20,30,40,50};
		int newAr[]=new int[arr.length];
		for(int i=arr.length-1;i>=0;i--) {
			newAr[arr.length-1-i]=arr[i];
		}
		for(int i=0;i<=newAr.length-1;i++) {
			System.out.println(newAr[i]);
		}
	}

}
