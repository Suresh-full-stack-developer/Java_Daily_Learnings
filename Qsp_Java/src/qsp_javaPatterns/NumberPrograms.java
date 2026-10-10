package qsp_javaPatterns;

public class NumberPrograms {

	public static void main(String[] args) {
		// int num = 12345;
//		int count = 0;
//		for (int i = 0; i <= num; i++) {
//			num/=10;
//			count++;
//
//		}
//		System.out.println("Count Of Number is:"+count);
//		

		System.out.println("---------------------");

//		int sum=0;
//		while(num!=0) {
//			sum+=num%10;
//			num/=10; 	
//		}
//		System.out.println("Sum of numbers:"+sum);
//		

//		System.out.println("-----------------------");
//		
//		int prod=1;
//		while(num!= 0) {
//		prod*=num % 10;
//		num/=10;
//		
//		}
//		System.out.println("Product of given number is:"+prod);
//		

		// System.out.println("---------------------");

//		int rev=0;
//		
//		while(num!=0) {
//			int digit=num%10;
//			rev=rev*10+digit;
//			num/=10;
//		}
//		System.out.println("Reversed number is:"+rev);

//		System.out.println("------------------");
//		int temp=num;
//		int  rev=0;
//		while(num!=0) {
//			int  digit=num%10;
//			rev=rev*10+digit;
//		    num/=10;
//		}
//		
//		System.out.println(rev==temp?"Palindrome Number":"Not a Palindrome Number");
//	
//		

		// System.out.println("------------------");

//		int num = 20;
//		int count = 0;
//		for (int i = 1; i <= num; i++) {
//			if (num % i == 0) {
//				count++;
//			}
//		}
//		if (count == 2) {
//			System.out.println("Prime Number");
//		} else {
//			System.out.println("Not a Prime Number");
//		}

//		System.out.println("-------------");
//		
//		
//		int start=10;
//		int end=100;
//	
//		
//		for(int i=start;i<=end;i++) {
//			int num=i;
//			int count=0;
//			for(int j=1;j<=num;j++) {
//				if(num%j==0) {
//					count++;
//				}
//				
//			}
//			if(count==2) {
//				System.out.println(num);
//			}
//		}

//		System.out.println("--------------");
//		
//		int num=153;
//		
//		int temp=num;
//		int sum=0;
//		
//		while(num!=0) {
//			int digit=num%10;
//			sum+=digit*digit*digit;
//			num/=10;
//		}
//		if(temp==sum) {
//			System.out.println("ArmStrong Number");
//		}
//		else {
//			System.out.println("Not a ArmStrong Number");
//		}
//		

//		System.out.println("-------------------");
//
//		int num = 145;
//		int temp = num;
//		int digit = 0;
//		int sum = 0;
//
//		while (num != 0) {
//			digit = num % 10;
//
//			int fact = 1;
//			for (int i = 1; i <= digit; i++)
//				fact = fact * i;
//
//			sum += fact;
//			num /= 10;
//		}
//
//		if (temp == sum) {
//			System.out.println("Strong Number");
//		} else {
//			System.out.println("Not Strong Number");
//		}

		
		
//		System.out.println("------------------");
//		
//		int num=5;
//		int fact=1;
//		for(int i=1;i<=num;i++) {
//			
//			fact=fact*i;
//		}
//		
//		System.out.println("Factorial of "+num +":"+""+fact);
//		
		
		
		
//		System.out.println("----------------");
//		
//		int a=0;
//		int b=1;
//		
//		for(int i=1;i<=10;i++) {
//			System.out.println(a);
//
//		int c=a+b;
//		a=b;
//		b=c;
//		}
		
		
		System.out.println("--------------");
		
		
		
		int num=6;
		int sum=0;
		
		for(int i=1;i<=num/2;i++) {
			
			if(num%i==0) {
				sum+=i;
			}
			
		}
		if(num==sum) {
			System.out.println("Perfect number");
		}
		else {
			System.out.println("Not a perfect number");
		}
		
		
		
		
		
	}
}
