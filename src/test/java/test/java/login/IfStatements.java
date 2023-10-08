package test.java.login;

public class IfStatements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int age = 10;
		if(age>=18)
			System.out.println("Person is adult ");
		else
			System.out.println("Person is not adult!");
		
		
		int age1 = 14;
		if(age%2 == 0 && age >=14 && age < 20)
			System.out.println("Number is even and age is Greater than 14");
		else if (age < 13)
		System.out.println("Age is less than 13");
		else if (age >= 20)
			System.out.println("Person is 20 or more than 20 years old");

	}

}
