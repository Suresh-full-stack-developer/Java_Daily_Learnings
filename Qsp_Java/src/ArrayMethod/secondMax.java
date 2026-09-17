package ArrayMethod;

public class secondMax {
	
	
	static int second_Max(int ar[]) {
		int second_Max=Integer.MIN_VALUE;
		int first_Max=Integer.MIN_VALUE;
		for(int i=0;i<=ar.length-1;i++) {
			if(ar[i]>first_Max) {
				first_Max=ar[i];
				
			}
		}
		for(int i=0;i<=ar.length-1;i++) {
			if(ar[i]>second_Max && ar[i]!=first_Max ) {
				second_Max=ar[i];
				
			}
		}
		return second_Max;
		
	}

	public static void main(String[] args) {
		
		int ar[]= {10,255,681,751,900};
		
		//findMax.findMax(ar);
		int res=second_Max(ar);
		System.out.println(res);

	}

}
