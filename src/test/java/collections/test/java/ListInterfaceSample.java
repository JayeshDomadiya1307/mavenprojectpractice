package collections.test.java;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;
import java.util.Vector;

public class ListInterfaceSample {

	public static void main(String[] args) {
		
		List<String> list1 = new ArrayList<String>();
		List<String> list2 = new LinkedList<String>();
		List<String> list3 = new Vector<String>();
		List<String> list4 = new Stack<String>();
		
		for (int i = 0; i < 10; i++) {
			list1.add(Integer.toString(i));
		}
		System.out.println(list1);
		
		//Adding value in list 2
		list2.add("USA");
		list2.add("INDIA");
		list2.add("JAPAN");
		list2.addAll(0, list1);
		
		//Adding object at index 1 and adding list 2 collection at index 5
		list1.add(1, "Jayesh");
		list1.addAll(5, list2);
		System.out.println(list1);
		
		list1.remove("USA");
		System.out.println(list1);
		
		System.out.println("The value at index 5 is: "+ list1.get(5));
		
		
		// Set will replace the value at index
		list1.set(0, "Replaced value");
		System.out.println(" After set operation, values are : "+list1);
		
		//Search for an element in the list and return the index number
		// It will return the index of first occurance element and if no element found, it will return -1
		System.out.println(list1.indexOf("2"));
		
		//Search for an element in the list and return the index number
		// It will return the index of last occurance element and if no element found, it will return -1
		System.out.println(list1.lastIndexOf("5"));
		
		
		// Sub list out the main list fromIndext(inclusive) and toIndex(exclusive)
		System.out.println("Partial List is : " +list1.subList(5, 10));
	}

}
