package List;

import java.util.Stack;

public class stack {

	public static void main(String[] args) {
		
		Stack<Integer> s=new Stack<>();
		
		//Adding the elements
		s.push(10);
		s.push(20);
		s.push(30);
		s.push(40);
		s.push(50);
		System.out.println(s);
		
		//To access the top element
		
		System.out.println(s.peek());
		
		//Remove the element
		
		System.out.println(s.pop());
		System.out.println(s.pop());
		System.out.println(s);
		
		//To check stack is empty or not
		
		System.out.println(s.isEmpty());
		
		//Check the size of an stack
		
		System.out.println(s.size());
		

	}

}
