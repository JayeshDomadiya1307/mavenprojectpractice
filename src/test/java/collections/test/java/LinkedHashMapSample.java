package collections.test.java;

import java.util.LinkedHashMap;

public class LinkedHashMapSample {

	public static void main(String[] args) {
		
		LinkedHashMap<Integer, String> hMap =  new LinkedHashMap<Integer, String>();
		
		hMap.put(1, "First");
		hMap.put(2, "Akash");
		hMap.put(3, "Hardik");
		hMap.put(12, "85");
		hMap.put(15, "70");
		hMap.put(6, "2nd Floor");
		hMap.put(17, "Noun");
		hMap.put(8, "Mountain");
		hMap.put(29, "Bat");
		hMap.put(10, "75");
		
		// Maintain the Insertion order
		System.out.println(hMap);
		
		// Check the object and provide the linked value
		System.out.println(hMap.get(15));
		
		System.out.println("Size of the map : "+ hMap.size());
		System.out.println("Is contains the 10 : "+ hMap.containsKey(10));
		

	}

}
