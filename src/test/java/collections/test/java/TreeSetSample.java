package collections.test.java;

import java.util.LinkedHashSet;
import java.util.TreeSet;

public class TreeSetSample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSet<String> tSet = new TreeSet<String>();

		tSet.add("Manoj");
		tSet.add("Kishor");
		tSet.add("Rahul");
		tSet.add("Kumar");
		tSet.add("Kumar");
		tSet.add("Kumar");
		tSet.add("Kumar");
//		tSet.add(null);
//		tSet.add(null);
//		tSet.add(null);
		tSet.add("15");
		tSet.add("Ashish");
		tSet.add("Vipul");
		tSet.add("50");
		
		// No Duplicate or null values stored
		// Sorted order [15, 50, Ashish, Kishor, Kumar, Manoj, Rahul, Vipul]
		System.out.println(tSet);
		
		tSet.remove("Kumar");
		//It will remove all duplicate values of input
		System.out.println(tSet);
		
		System.out.println("First Element of the TreeSet : " + tSet.first());
		System.out.println("Last Element of the TreeSet : " + tSet.last());
		
		//Objects before the input in list
		System.out.println("Use of headset : "+tSet.headSet("Ashish"));
		
		//Objects after the input in list
		System.out.println("Use of TailSet : "+tSet.tailSet("Ashish"));
		
		// Use of SubSet list
		System.out.println("Use of TailSet : "+tSet.subSet("Ashish", "Rahul"));
	}

}
