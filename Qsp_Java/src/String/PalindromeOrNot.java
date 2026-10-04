package String;

public class PalindromeOrNot {

	public static void main(String[] args) {

		//String name = "racecar";
		
		String name="Suresh";

		String temp = "";

		for (int i = name.length() - 1; i >= 0; i--) {
			temp += name.charAt(i);
		}

		System.out.println(name.equals(temp) ? "Pallidrome" : "Not a Pallindrome");

	}

}
