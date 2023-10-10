package oopsconcepts.test.java;

public class InheritanceConcept extends Dog{
	
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
		InheritanceConcept i1 = new InheritanceConcept();
		
		i1.dogName = "Vasuk";
		i1.barking();
		i1.eating();
	}

}
