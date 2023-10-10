package oopsconcepts.test.java;

public class HouseDemo extends Dog {

	// Understanding the concept of Constructor

	String houseName = "Kalakaar";
	String areaName = "Surat";
	int size = 500;
	String owner = "Jayesh Domadiya";

	int houseNumber;
	String nearBy;

	public void loation() {
		System.out.println("MY house is located at : " + areaName);
	}

	public void carpetArea() {
		System.out.println("House is in the area as  " + size + " Sqft");
	}

	public void ownerOfHouse() {
		System.out.println("This house is owned by : " + owner);
	}

	public HouseDemo() {
		System.out.println("Default constructor is created");
	}

	public HouseDemo(int num, String location) {
		this.houseNumber = num;
		this.nearBy = location;
	}

	public void homeDetails() {
		System.out.println("House is located nearly : " + nearBy + " House number is : " + houseNumber);
	}

	public static void main(String[] args) {

		HouseDemo house1 = new HouseDemo();
		HouseDemo house2 = new HouseDemo(111, "Yogi Chowk");

		Dog dog1 = new HouseDemo();
		Dog dog2 = new HouseDemo(251, "India");

		// Variables and methods from current Class
		System.out.println(house1.areaName);
		System.out.println(house1.height);
		System.out.println(house1.houseName);
		System.out.println(house1.owner);
		System.out.println(house1.size);
		System.out.println("<--------------------------------------------------------------------------->");
		/*
		 * System.out.println(house1. houseNumber); System.out.println(house1. nearBy);
		 */

		house1.carpetArea();
		house1.homeDetails();
		house1.loation();
		house1.ownerOfHouse();
		System.out.println("<--------------------------------------------------------------------------->");

		// Calling the methods and variables from the inherited Dog class
		System.out.println(house1.brred);
		System.out.println(house1.color);
		System.out.println(house1.dogName);
		System.out.println("<--------------------------------------------------------------------------->");

		house1.barking();
		house1.dogColor();
		house1.eating();

		System.out.println("<--------------------------------------------------------------------------->");

		house2.dogColor();
		house2.barking();
		house2.eating();
		System.out.println("<--------------------------------------------------------------------------->");

		dog1.barking();
		dog1.eating();
		dog1.dogColor();
		System.out.println("<--------------------------------------------------------------------------->");

		dog1.barking();
		dog2.eating();
		dog2.dogColor();
		System.out.println("<--------------------------------------------------------------------------->");
	}

}
