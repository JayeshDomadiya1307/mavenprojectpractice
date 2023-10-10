package oopsconcepts.test.java;

public class SingleInheritance extends Dog {
	
	String car = "BMW";
	String color = "RED";
	
	public void run() {
		System.out.println("The running car is : " +  car);
	}
	
	public void color() {
		System.out.println("The color of the car is : " +  color);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SingleInheritance i1 = new SingleInheritance();
		Dog i2 = new SingleInheritance();
		
		i1.dogName = "Vasuk";
		System.out.println(i1.dogName);
		i1.barking();
		i1.eating();
		i1.dogColor();
		
		System.out.println("*********************************************************************************");
		
		System.out.println("Name of the dog is :" + i2.dogName);
		System.out.println("Type of the dog is :" + i2.brred);
		System.out.println("Color of the dog via variable is : " + i2.color);
		i2.barking();
		i2.dogColor();
		i2.eating();
		
	}

}
