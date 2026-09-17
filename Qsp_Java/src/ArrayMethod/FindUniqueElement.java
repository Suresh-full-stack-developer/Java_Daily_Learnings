package ArrayMethod;

public class FindUniqueElement {

	static int uniqueEle(int ar[]) {
		int unique = 0;

		for (int i = 0; i <= ar.length - 1; i++) {

			unique = unique ^ ar[i];

		}
		return unique;
	}

	public static void main(String[] args) {

		int ar[] = { 10, 20, 10, 50, 70, 60, 50, 60, 20 };

		int res = uniqueEle(ar);

		System.out.println(res);

	}

}
