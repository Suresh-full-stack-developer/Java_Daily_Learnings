package Task;

public class IncDec {

	public static void main(String[] args) {

		int x = 10;
		int z = 20;

		System.out.println(x++ + ++x);
		System.out.println(x-- * z++);
		System.out.println(++x - --z);
		System.out.println(x == -15);
		System.out.println(++x);
		System.out.println(x == 2);
		System.out.println(x);
		System.out.println(++x);
		System.out.println(++x);
		System.out.println(x++);
		System.out.println(x + 2323111);
		System.out.println(x += 5);
		System.out.println(++x);
		System.out.println(x + 9);
		System.out.println(x++);
		System.out.println(x);
		
		
		
		
		System.out.println("-------------------");
		
		x+=125;
		x&=3;
		x<<=5;
		x>>=2;
		x*=4;
		x%=4;
		x<<=6;
		x^=2;
		x&=12;
		x&=2153;
		x+=55;
		
		System.out.println("Final Value of x:"+x);
	}

}
