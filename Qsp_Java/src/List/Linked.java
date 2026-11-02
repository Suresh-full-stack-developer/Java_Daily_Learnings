package List;

import java.util.LinkedList;

public class Linked {

	public static void main(String[] args) {
		LinkedList<String> l=new LinkedList<>();
		
		//Add the element in the list 
		l.add("Suresh");
		l.add("Full");
		l.add("Abc");
		l.add("Stack");
		l.add("Developer");
		
		System.out.println(l);
		
		//Add First
		
		l.addFirst("Hello");
		System.out.println(l);
		
		//Add Last
		
		l.add("Bye");
		System.out.println(l);
		
		//Remove First
		
		l.removeFirst();
		System.out.println(l);
		
		//Remove Last
		
		l.removeLast();
		System.out.println(l);
		
		//Remove the all elements
		
		l.remove();
		System.out.println(l);
		
		l.remove();
		System.out.println(l);
	}

}
