package collections.test.java;

import java.util.Enumeration;
import java.util.Vector;

public class EnumerationTest {

	public static void main(String[] args) {
		
		//Enumeration is only applicable on Hashtable and Vector 
		
		Vector v = new Vector();
		
		for (int i = 0; i < 10; i++) {
			v.addElement(i);
		}
		System.out.println(v);
		
		
		Enumeration e = v.elements();
		
		
		//Checking the next element availability
		while (e.hasMoreElements()) {
			int  i = (Integer) e.nextElement();
			System.out.println(i + " ");
			System.out.println("Next element is available");			
			
		}
		System.out.println("Test");
//		else {
//			System.out.println("Next element is not available");
//		}
		
		
		// Here if we use the If else instead of while, it's directly stay on the 0 element and going into else part - Reason?
		
	}

}
