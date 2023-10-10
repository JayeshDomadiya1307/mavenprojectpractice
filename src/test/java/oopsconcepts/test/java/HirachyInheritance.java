package oopsconcepts.test.java;

public class HirachyInheritance extends Dog {

	public static void main(String[] args) {
		/*
		 * Here we're inheriting the Dog class which is already inherited by HouseDemo
		 * class - So one parent is inherited by multiple child
		 */
		HirachyInheritance hirachyObj1 = new HirachyInheritance();

		System.out.println(hirachyObj1.brred);
		System.out.println(hirachyObj1.color);
		System.out.println(hirachyObj1.dogName);
		System.out.println(hirachyObj1.height);

		System.out.println("<--------------------------------------------->");

		hirachyObj1.barking();
		hirachyObj1.eating();
		hirachyObj1.dogColor();
	}

}
