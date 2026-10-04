package String;

public class ConvertUpperCaseToLower {

	public static void main(String[] args) {
		String name = "SURESH";

		String temp = "";

		for (int i = 0; i <= name.length() - 1; i++) {
			temp += (char) (name.charAt(i) + 32);
		}
		System.out.println(temp);
	}

}
