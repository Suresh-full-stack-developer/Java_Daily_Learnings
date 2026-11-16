package Set;

import java.util.HashSet;

public class hashSet {

	public static void main(String[] args) {
		HashSet<String> hs=new HashSet<>();
		
		//Add the elements in the set
		
		hs.add("Suresh");
		hs.add("Full");
		hs.add("Stack");
		hs.add("Developer");
		hs.add("From");
		hs.add("Where");
		
		System.out.println(hs);
		
		
		//Remove the element in the set
		
		hs.remove("From");
		hs.remove("Where");
		
		System.out.println(hs);
		
		//Check the elements present in the or not
		
		System.out.println(hs.contains("Suresh"));
		System.out.println(hs.contains("From"));
		
		//Check the set is empty or not
		
		System.out.println(hs.isEmpty());
		
		//clear the all elements in the set
		
		hs.clear();
		
		System.out.println(hs);
		
		

	}

}
