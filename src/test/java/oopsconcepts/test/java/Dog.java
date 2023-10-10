package oopsconcepts.test.java;

public class Dog {
	// Understanding the concept of Class and Object
	
	String dogName = "Bruno";
	String brred = "Browning";
	int height = 10;

	public void barking() {
		System.out.println(dogName + " Is Barking ");
		
	}

	public void eating() {
		System.out.println(dogName + " is eating a food");
	}

	public static void main(String[] args) {
		Dog dogObj = new Dog();
		
		dogObj.barking();
		System.out.println(dogObj.height);   
		
		
	}

}
