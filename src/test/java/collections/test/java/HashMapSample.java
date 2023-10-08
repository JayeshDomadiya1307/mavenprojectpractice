package collections.test.java;

import java.util.HashMap;

public class HashMapSample {

	public static void main(String[] args) {
		
		HashMap<Integer, String> hMap =  new HashMap<Integer, String>();
		
		hMap.put(1, "First");
		hMap.put(2, "Akash");
		hMap.put(3, "Hardik");
		hMap.put(10, "50");
		hMap.put(15, "70");
		hMap.put(6, "2nd Floor");
		hMap.put(17, "Noun");
		hMap.put(8, "Mountain");
		hMap.put(29, "Bat");
		hMap.put(10, "75");
		
		System.out.println(hMap);
		
		// Check the object and provide the linked value
		System.out.println(hMap.get(15));

	}

}
