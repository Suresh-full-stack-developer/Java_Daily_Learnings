package qsp_java;

public class CountDigits {

	public static void main(String[] args) {
			int num=123456789;
			
			int count=0;
			
			while(num>0) {
				int res=num%10;
				count++;
				num/=10;
			}
			System.out.println(count);

	}

}
