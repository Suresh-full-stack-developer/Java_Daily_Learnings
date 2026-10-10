package numbers;

public class extract_lat_digit {

	public static void main(String[] args) {
		int num=123;
		int result=num%10; //Extract the one digit
		result=num%100;		//Extract the two digit
		result=num%1000;	//Extract the three digits
		System.out.println(result);
	}

}
