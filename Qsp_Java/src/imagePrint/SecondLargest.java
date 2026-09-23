package imagePrint;

public class SecondLargest {
	
	static int secondMax(int ar[]) {
		int first_max=Integer.MIN_VALUE;
		int second_max=Integer.MIN_VALUE;
		
		for(int i=0;i<=ar.length-1;i++) {
			if(ar[i]>first_max) {
				first_max=ar[i];
			}
		}
		for(int i=0;i<=ar.length-1;i++) {
			if(ar[i]>second_max && ar[i]!=first_max) {
				second_max=ar[i];
			}
		}
		
		return second_max;
		
		
	}
	
	

	public static void main(String[] args) {
		
		int ar[]= {10,200,180,600,799};
		
		
		int res=secondMax(ar);
		
		System.out.println(res);
		

	}

}
