package MockPracticeQuestions;

import java.util.Arrays;

public class Practice1 {

	public static void main(String[] args) {
	
		
		int ar[]= {40,50,60,10,35,15,45};
		
		for (int j = 0; j <= ar.length - 1; j++) {
			for (int i = 0; i <= ar.length - 2; i++) {
				if (ar[i] > ar[i + 1]) {
					ar[i] = ar[i] ^ ar[i + 1];
					ar[i + 1] = ar[i] ^ ar[i + 1];
					ar[i] = ar[i] ^ ar[i + 1];
				}
			}
		}
		System.out.println(Arrays.toString(ar));

	}

}
