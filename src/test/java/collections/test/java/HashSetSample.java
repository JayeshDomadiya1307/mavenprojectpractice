package collections.test.java;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetSample {

	public static void main(String[] args) {
		
		HashSet<String> hash = new HashSet();
		
		hash.add("Manoj");
		hash.add("Kishor");
		hash.add("Rahul");
		hash.add("Kumar");
		hash.add("15");
		hash.add("Ashish");
		hash.add("Vipul");
		hash.add("50");
		
		// HashSet doesn't maintain the insertion order
		System.out.println("Initial Hashlist is : " + hash);
		
		hash.remove("Vipul");
		System.out.println(hash);
		
		String name = "Manoj";
		if(hash.contains(name)) {
			System.out.println("Hash list is containing the : " +name );
			
			Iterator i  = hash.iterator();
			while(i.hasNext()) {
				System.out.println(i.next());
			}
		}
	}

}
