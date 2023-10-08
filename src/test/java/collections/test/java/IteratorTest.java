package collections.test.java;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<String> al = new ArrayList<String>();
		System.out.println(al.size());
		
		for (int i = 0; i < 10; i++) {
			al.add(Integer.toString(i));
		}
		System.out.println(al.toString());
		
		Iterator<String> itr = al.iterator();
		while(itr.hasNext()) {
			
			String iStr = itr.next();
			int i = Integer.valueOf(iStr);
			// Throwing an error -- Need to see the reason
			
			System.out.println(i + " ");
			
//			Removig the even numbers
		/*	if (i % 2 == 0) {
				al.remove(i);
			*/}
		}
	}

//}
