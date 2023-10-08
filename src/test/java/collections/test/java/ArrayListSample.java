package collections.test.java;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListSample {

	public static void main(String[] args) {

		ArrayList<String> arrlist = new ArrayList<String>();

		ArrayList<Integer> arrayList = new ArrayList<Integer>();
		arrayList.add(5);
		arrayList.add(6);
		arrayList.add(7);
		arrayList.add(8);
		arrayList.add(9);
		arrayList.addAll(1, arrayList);

		System.out.println("The created list elements are : " + arrayList);

		boolean b = Collections.addAll(arrlist, "SURAT", "USA", "UK");

		// printing the arrlist after operation
		System.out.println("result : " + b);
		System.out.println("result of added arrList: " + arrlist);

		Collections.sort(arrlist);
//		 arrlist.clear();
		System.out.println("result of added arrList: " + arrlist);
		arrlist.remove("UK");
		System.out.println("result of added arrList: " + arrlist);

		System.out.println("====For Loop Using the Size() function ===");

		for (int i = 0; i < arrlist.size(); i++)
			System.out.println(arrlist.get(i));

	}

}
