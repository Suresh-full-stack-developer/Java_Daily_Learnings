package Array;

public class CopyingElementOneToAnotherArrayButReverse {

	public static void main(String[] args) {
		int index=0;
		int arr[]={10,20,30,40,50};
		int newAr[]=new int [arr.length];
		for(int i=arr.length-1;i>=0;i--) {
			newAr[index]=arr[i] ;
				index++;
		}
		for(int i=0;i<=newAr.length-1;i++) {
			System.out.println(newAr[i]);
		}

	}

}
