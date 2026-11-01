package List;

import java.util.*;

public class List {

	public static void main(String[] args) {
		
		ArrayList s1 = new ArrayList();
		
		//Add the element
		
		s1.add("Suresh");
		s1.add("SomeOne");
		s1.add("Suresh");
		s1.add("sana");
		s1.add("Unknown");
		
		System.out.println(s1);
		
		//Update the Element
		
		s1.set(2,"Lkg");
		s1.set(3, "Sana");
		
		System.out.println(s1);
		
		//Access the  element
		
		System.out.println(s1.get(2));
		System.out.println(s1.get(3));
		
		//Remove the Element
		
		System.out.println(s1.remove(4));
		System.out.println(s1);
		
		//Check the element is present or not
		
		System.out.println(s1.contains("Sana"));
		System.out.println(s1.contains("lkg"));
		
		//Search the element
		
		System.out.println(s1.indexOf(1));
		System.out.println(s1.lastIndexOf(3));
	}

}
