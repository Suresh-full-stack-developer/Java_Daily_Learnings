package Task;

public class PrimeNo {
	
	static int countFactor(int num) {
		int count=0;
		for(int i=1;i<=num;i++) {
			if(count%i==0) count++;
		}
		return count;
	}
	static boolean prime(int num) {
		int count=countFactor(num);
		return count==2;
	}

	public static void main(String[] args) {
		System.out.println(prime(11));
		

	}

}
