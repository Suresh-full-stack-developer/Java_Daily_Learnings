package String;

public class ConvertLowerCaseToUpper {

	public static void main(String[] args) {
			String name="suresh";
			
			String temp="";
			
			for(int i=0;i<=name.length()-1;i++) {
				temp+=(char)(name.charAt(i)-32);
			}
			System.out.println(temp);
	}

}
