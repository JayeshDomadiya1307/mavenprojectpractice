package oopsconcepts.test.java;

public class HouseDemo extends InheritanceConcept {

	// Understanding the concept of Constructor
	
	String name = "Bruno";
	String areaName = "Surat";
	int size = 500;
	
	int houseNumber;
	String nearBy;

	public void loation() {
		System.out.println("MY house is located at : " + areaName);
	}

	public void area() {
		System.out.println("House is in the area as  "+ size + " Sqft");
	}

	
	/*
	 * public HouseDemo() { System.out.println("Default constructor is created"); }
	 */
	
	public HouseDemo(int  i , String j) {
		houseNumber = i;
		nearBy = j;
		}
	
	public void homeDetails() {
		System.out.println("House is located nearly : " + nearBy + " House number is : " + houseNumber);
	}
	
	
	public static void main(String[] args) {
		HouseDemo house1 = new HouseDemo(55, "Sudama Chowk");
		HouseDemo house2 = new HouseDemo(111, "Yogi Chowk");
		
		house1.homeDetails();
		house2.homeDetails();
		
		
		// These below methods are from InheritanceConcept Class
		house1.run();
		house1.color(); 
		house1.barking();
		house2.eating();
	}

}
