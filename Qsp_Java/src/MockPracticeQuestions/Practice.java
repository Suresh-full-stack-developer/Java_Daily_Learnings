package MockPracticeQuestions;

import java.util.Arrays;

public class Practice {
	
	
	static int FindMax(int ar[]) {
		int firstMax=Integer.MIN_VALUE;
		int secondMax=Integer.MIN_VALUE;
		
		for(int i=0;i<=ar.length-1;i++) {
			if(ar[i]>firstMax) {
				firstMax=ar[i];
			}
		}
		for(int i=0;i<=ar.length-1;i++) {
			if(ar[i]>secondMax && ar[i]!=firstMax) {
				secondMax=ar[i];
			}
		}
		return secondMax;
	}

	public static void main(String[] args) {
		// To find the second maximum number in the array
		
		int ar[]= {180,200,40,90,60,70};
		
		int res=FindMax(ar);
		
		System.out.println(res);
		
		
		

	}

}
