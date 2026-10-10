package qsp_javaPatterns;

public class RemoveDuplicate {

	public static void main(String[] args) {
		int ar[]= {10,20,10,30,40,10,20};
		
		for(int i=0;i<=ar.length;i++) {
			int count=0;
			
			for(int j=0;j<i;j++) {
				if(ar[i]==ar[j]) {
					count++;
					break;
				}
			}
			if(count==0) {
				System.out.println(ar[i]);
			}
			
		}

	}

}
