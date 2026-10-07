package qsp_java;

public class numberPattern {

	public static void main(String[] args) {
		int n=4;
		
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=n-i;j++) {
				System.out.println(" ");
			}
			for(int k=1;k<=i;k++) {
				if(i%2==0) {
					System.out.print(i*3  +"C");
				}
				else {
					System.out.println(i*3  );
				}
			}
		}

	}

}
