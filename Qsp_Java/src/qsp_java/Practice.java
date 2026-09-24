package qsp_java;

public class Practice {
	
	static int sumOfDigit(int num) {
		int sum=0;
		while(num>0) {
			sum+=num%10;
			num/=10;
		}
		return sum;
	}
	
	

	public static void main(String[] args) {
		
		int nth=5;
		int num=1;
		
		int count=0;
		
		int res=0;
		int sum=0;
		while(num>0) {
			sum+=sumOfDigit(i);
			num/=10;
		}
	}
}
	
		