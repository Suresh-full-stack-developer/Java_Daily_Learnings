package String;

public class VowelsAndConsonants {

	public static void main(String[] args) {
		String s=" Suresh ";
		int vowels=0;
		int consonant=0;
		
		for(int i=0;i<=s.length()-1;i++) {
			char ch=s.charAt(i);
			if(ch=='A' || ch=='a' || ch=='E' || ch=='e' || ch=='I' || ch=='i' || ch=='O' || ch=='o' || ch=='U' || ch=='u') 
				vowels++;
//			else if (ch != " " ) {
//				consonant++;
		}
		System.out.println("Vowels Count:"+vowels);
		System.out.println("Consonants Count:"+consonant);
	}

}
//}
