package ArrayMethod;

public class FindMinValue {
	
	static int findMin(int ar[]) {
		int first_min=Integer.MAX_VALUE;
		
		for(int i=0;i<=ar.length-1;i++) {
			if(ar[i]<first_min) {
				first_min=ar[i];
			}
		}
		return first_min;
	}

	public static void main(String[] args) {
		
		int ar[]= {10,-20,30,50,-1,-150};
		
		int res=findMin(ar);
		System.out.println(res);
		
	}

}
