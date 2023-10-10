package oopsconcepts.test.java;

public class MultiLevelInheritance extends HouseDemo {

	public static void main(String[] args) {
		// HouseDemo class is itself inherited class

		MultiLevelInheritance multiObj1 = new MultiLevelInheritance();
		HouseDemo multiObj2 = new MultiLevelInheritance();

		System.out.println("The area property from inherited class from Object 1 : " + multiObj1.areaName);
		System.out.println("The area property from inherited class from Object 1 : " + multiObj2.areaName);
		System.out.println("The dog name from hirachy inherited class from Object 1: " + multiObj1.dogName);
		System.out.println("The dog name from hirachy inherited class from Object 2: " + multiObj2.dogName);

		System.out.println(
				"<------------------------------------------------------------------------------------------------------->");

		multiObj1.barking();
		multiObj2.barking();

		System.out.println(
				"<------------------------------------------------------------------------------------------------------->");

		multiObj1.carpetArea();
		multiObj2.carpetArea();

		System.out.println(
				"<------------------------------------------------------------------------------------------------------->");
	}

}
