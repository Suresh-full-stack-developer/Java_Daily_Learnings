package Array;

import java.util.Arrays;

public class ReverseArrayUsingMulDiv {

	public static void main(String[] args) {
		int[] ar = {10, 20, 30, 40, 50};

        int i = 0;
        int j = ar.length - 1;

        while (i < j) {
            ar[i] = ar[i] * ar[j];
            ar[j] = ar[i] / ar[j];
            ar[i] = ar[i] / ar[j];

            i++;
            j--;
        }

        System.out.println(Arrays.toString(ar));

	}

}
