package List;

import java.util.*;

public class Array {
	
	public static void main(String[] args) {
		
		ArrayList<Integer> al = new ArrayList<>();
		
		// Add the element in an array
		al.add(10);
		al.add(90);
		al.add(30);
		al.add(80);
		al.add(50);
		al.add(60);
		
		System.out.println("Elements add in an array:"+al);
		
		//Update the Element
		
		al.set(3, 400);
		al.set(4, 500);
		
		System.out.println("Updated Array:"+al);
		
		//Size of an array
		System.out.println(al.size());
		
		//Sort the array
		al.sort(null);
		
		System.out.println("Sorted Array:"+al);
		
		//remove the element
		
		al.remove(3);
		
		System.out.println("Removed array:"+al);
		
		//Access the element
		
		System.out.println(al.get(1));
		
		//Check the element is there or not
		
		System.out.println(al.contains(500));
		
		//Check the array is empty or not
		
		System.out.println(al.isEmpty());
		
		
		// Remove the first element
		al.removeFirst();
		System.out.println(al);
		
		//Add the first element
		al.addFirst(10);
		System.out.println(al);
		
		//Add the last element
		
		al.addLast(70);
		System.out.println(al);
		
		//remove last
		al.removeLast();
		System.out.println(al);
		
		//Remove all
		//al.removeAll(al);
		al.clear();
		System.out.println(al);
	}

}
