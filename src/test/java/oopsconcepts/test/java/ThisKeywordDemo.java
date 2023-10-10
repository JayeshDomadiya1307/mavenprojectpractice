package oopsconcepts.test.java;

public class ThisKeywordDemo {

	int rollnumber;
	String name;
	String standard;

	// this keyword can be use to identify the access the instance variable
	public ThisKeywordDemo(int r, String n, String s) {
		this.rollnumber = r;
		this.name = n;
		this.standard = s;
	}

	public void display() {
		System.out.println("Name of the standent is : " + name + " Roll number : " + rollnumber
				+ " Studying in the standard : " + standard);

	}

	public static void main(String[] args) {
		ThisKeywordDemo student1 = new ThisKeywordDemo(15, "Jack", "5th");
		ThisKeywordDemo student2 = new ThisKeywordDemo(20, "Birger", "2nd");
		
		student1.display();
		student2.display();
	}

}
