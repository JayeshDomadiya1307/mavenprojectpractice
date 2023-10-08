package collections.test.java;

import java.util.LinkedList;

public class LinkedListSample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList list = new LinkedList();
		
		list.add(12);
		list.add(50);
		list.add(25);
		list.add(10);
		list.add("Jayesh");
		list.add("Automation");
		list.add(18);
		list.add("Test");
		list.add(12);
		list.add(12);
		list.add("Automation");
		list.add(12);
		list.add(1);
		
		System.out.println("The intial list : " + list);
		
		list.addFirst("First element");
		list.addLast("Last element");
		System.out.println("The list after adding objects: " + list);
		
		list.removeFirst();
		list.removeLast();
		System.out.println("The list after removing objects: " + list);
	}

}
