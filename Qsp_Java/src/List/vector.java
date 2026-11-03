package List;

import java.util.Vector;

public class vector {

	public static void main(String[] args) {
		Vector<Integer> v=new Vector<>();
		
		//Add the elements in the vector
		v.add(10);
		v.add(20);
		v.add(30);
		v.add(40);
		v.add(50);
		v.add(60);
		
		System.out.println(v);
		
		//Update the element
		
		v.set(2, 80);
		System.out.println(v);
		
		//Access the element 
		
		System.out.println(v.get(0));
		System.out.println(v.get(4));
		
		//Check the vector is empty or not
		System.out.println(v.isEmpty());
		
		//remove
		
		v.remove(4);
		System.out.println(v);
		
		//clear
		
		v.clear();
		System.out.println(v);
		
		System.out.println(v.isEmpty());
		

	}

}
