package numbers;

public class sum_of_digit {

	public static void main(String[] args) {
		int sum=0;
		int num=123;
		int last=num%10;
		System.out.println(last);
		sum=sum+last;
		num=num/10;
		System.out.println(sum);
	}

}
