package oopsconcepts.test.java;

public class MethodOverloadingSample {

	public void display() {
		System.out.println("Dipslay method with no paramater");
	}

	public void display(int height, String name) {
		System.out.println("The display height is " + height + " and the name of TV is : " + name);
	}

	public static void main(String[] args) {
		// Method overloading is that Class is having the same method names with different parameters
		
		MethodOverloadingSample method1 = new MethodOverloadingSample();
		
		method1.display();
		method1.display(50, "Samsung TV");
		
	}

}
