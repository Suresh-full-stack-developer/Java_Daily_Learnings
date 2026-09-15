package Array;

import java.util.Arrays;

public class ReverseArrayUsingMulDiv {

	public static void main(String[] args) {
		int[] a = {10, 20, 30, 40, 50};

        int i = 0;
        int j = a.length - 1;

        while (i < j) {
            a[i] = a[i] * a[j];
            a[j] = a[i] / a[j];
            a[i] = a[i] / a[j];

            i++;
            j--;
        }

        System.out.println(Arrays.toString(a));

	}

}
