package String;

public class CountUpperCaseLetter {

	public static void main(String[] args) {
		String s="JaVa";
		int count=0;
		
		for(int i=0;i<=s.length()-1;i++) {
			char ch=s.charAt(i);
			if(ch>=65 && ch<=90) {
				count++;
			}
		}
		System.out.println("UpperCase Count:"+count);
	}

}
