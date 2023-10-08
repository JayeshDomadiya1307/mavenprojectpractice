package test.java.login;

public class VariablesClass {
	
	public String company;
	public int salary;
	public static String employeeId;
	
	public VariablesClass(String currentCompany) {
		currentCompany = company;
	}

	public VariablesClass(String compName, int perDaySalary) {
		compName = company;
		perDaySalary = salary;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Local variables
		int age = 45;
		String name = "JK";
		
		System.out.println("My name is " + name + " " + "and My age is " + age);
		
		VariablesClass empDetails = new VariablesClass("CTS");
		empDetails.company = "CTC";
		empDetails.employeeId = "CTC";
		
		System.out.println();

	}

}
