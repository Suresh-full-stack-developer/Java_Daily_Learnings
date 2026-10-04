package qsp_java;

public class ArmStrongNumber {

	public static void main(String[] args) {
		
		int num=153; int temp=num;
		int sum=0;
		
		
		while(num>0) {
			int digit=num%10;
			sum+=digit*digit*digit;
			num/=10;
		}
		System.out.println(sum);
		System.out.println(temp==sum?"ArmStrong Number":"Not a ArmStrong Number");
	}
}
