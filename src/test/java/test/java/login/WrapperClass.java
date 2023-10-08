package test.java.login;

public class WrapperClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Autoboxing = Converting string to integer to add the values (Converting premitive data type to Wrapper class)
		int a = 110;
		String name = "111";
		Integer i = Integer.valueOf(a);
		Integer str = Integer.valueOf(name);
		
		System.out.println(a + i + str);
		System.out.println(a + i + String.valueOf(str));
	
		String str1 = Integer.toString(a);
		str1 = str1 + str1; // Output is 110110
		
		System.out.println(a+ " " + str1);
		// output is 110 110110, where first 110 is integer and last one acts as string
		
		
		 
	}

}
