package collections.test.java;

import java.util.ArrayList;
import java.util.ListIterator;

public class ListIteratorSample {

	public static void main(String[] args) {
		
		ArrayList<Integer> al = new ArrayList<Integer>();
		
		ListIterator<Integer> li = al.listIterator();
		
		for (int i = 0; i < 10; i++) {
			li.add(i);
		}
		System.out.println("Elements of an arrayList: " + al);
		
		
		// Why while loop is not being execute and NOT printing the sysout things
		while (li.hasNext()) {
			int i = (Integer) li.next();
			System.out.println("Iterator list: " + i + " ");
			
			
			//Replacing the even numbers with odd numbers and adding the values in ArrayList
			if (i % 2 == 0) {
				i++;
				li.set(i);
				li.add(i);
			}
			System.out.println(al);
		}
		
	}

}
