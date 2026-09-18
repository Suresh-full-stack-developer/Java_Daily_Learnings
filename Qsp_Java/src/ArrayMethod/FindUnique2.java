package ArrayMethod;

public class FindUnique2 {

	static void Unique_ele(int ar[]) {

		for (int i = 0; i <= ar.length - 1; i++) {
			int count = 0;
			for (int j = 0; j <= ar.length - 1; j++) {
				if (ar[i] == ar[j])
					count++;
			}
				if(count==1)
					System.out.println(ar[i]);
		}
		}
		

	public static void main(String[] args) {

		int ar[] = { 10, 20, 10, 30, 20, 50, 60, 80 };

		Unique_ele(ar);
	}

}
