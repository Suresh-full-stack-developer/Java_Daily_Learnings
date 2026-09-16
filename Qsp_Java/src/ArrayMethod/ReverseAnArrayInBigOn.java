package ArrayMethod;

import java.util.Arrays;

public class ReverseAnArrayInBigOn {

	static int[] revArr(int ar[]) {

		int newAr[] = new int[ar.length];

		for (int i = ar.length - 1; i >= 0; i--) {
			newAr[ar.length - 1 - i] = ar[i];
		}
		return newAr;
	}

	public static void main(String[] args) {
		int ar[] = { 10, 20, 30, 40, 50, 60 };
		int res[]=revArr(ar);
		
		for(int i=0;i<=res.length-1;i++) {
			System.out.println(res[i]);
		}
		//System.out.println(Arrays.toString(ar));

	}

}
