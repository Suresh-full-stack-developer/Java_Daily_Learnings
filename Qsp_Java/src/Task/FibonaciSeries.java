package Task;

public class FibonaciSeries {
	static void fibonaci(int num) {
		
		int start=0;
		int end=1;
		
		for(int i=1;i<=num;i++) {
			int fibo=start+end;
			start=end;
			end=start;
		}
		
		
	}

	public static void main(String[] args) {
		

	}

}
