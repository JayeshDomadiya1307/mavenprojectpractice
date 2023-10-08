package collections.test.java;

import java.util.LinkedHashSet;

public class LinkedHashSetSample {

	public static void main(String[] args) {
		
		LinkedHashSet<String> liSet = new LinkedHashSet<String>();
		
		liSet.add("Manoj");
		liSet.add("Kishor");
		liSet.add("Rahul");
		liSet.add("Kumar");
		liSet.add("15");
		liSet.add("Ashish");
		liSet.add("Vipul");
		liSet.add("50");
		
		// Maintain the initial order list
		System.out.println("The initial ordered list : " +liSet);
	}

}
