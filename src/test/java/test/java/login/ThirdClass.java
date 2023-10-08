package test.java.login;

import java.util.Iterator;

public class ThirdClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String demo = "Jayesh";

		String str = String.valueOf(new StringBuilder(demo).reverse());

		if (demo.equals(str)) {
			System.out.println("Given name is palidrome");
		} else {
			System.out.println("Given name is NOT palidrome");
		}
		//
		
		int num = 12345;
		StringBuffer num1  = new StringBuffer(String.valueOf(num));
		System.out.println(num1.reverse());
		
		
		int number = 4564546;
		int reverse = 0;
		
		while (number != 0) {
			int reminder = number % 10;
			reverse = reverse * 10 + reminder ;
			
			number = number / 10;
		}
		
		System.out.println("Reverse number is :" + reverse);
		
		//--------------------------------------------------------------------------------------------------------------------------
		
		float fltnumber =  12345.4566f;
		int remainN = (int) fltnumber;
		
		System.out.println(fltnumber - remainN);
		
		String[] strValues = String.valueOf(fltnumber).split("\\.");
		double val1 = Double.parseDouble(strValues[0]); // 
		double val2 = Double.parseDouble(strValues[1]); // 
		
		System.out.println(val2);
		//--------------------------------------------------------------------------------------------------------------------------
		String nameS = "My School is ABC";
		
		char ch[] = nameS.toCharArray();
		
		String reverseStr = "";
		for (int i = ch.length-1; i >= 0; i--) {
			reverseStr = reverseStr + ch[i];
		}
		
		System.out.println(reverseStr);
		
		
	}

}
