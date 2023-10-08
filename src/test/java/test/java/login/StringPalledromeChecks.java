package test.java.login;

public class StringPalledromeChecks {

	public static void main(String[] args) {

		/*
		 * write the code for the following: Check if the given string is palindrome or
		 * not. Check if the given integer is palindrome or not.
		 */
		String str = "65645645645";

		System.out.println(str);
		
		String str1 = String.valueOf(new StringBuilder(str).reverse());
		System.out.println(str1);

		if (str.equals(str1)) {
			System.out.println("The given string is palindrome ");
		} else {
			System.out.println("The given string is NOT palindrome ");
		}

//		Write a program to reverse a number(eg. 1234 to 4321) without using the modulus operator.

		int numb = 1234;
		StringBuffer num1 = new StringBuffer(String.valueOf(numb));
		System.out.println(num1.reverse());

//		Write a program , if I have a float value 12345.4566, I want to extract only 4566 ( the value after dot)

		float flt = 12345.4566f;
		int intnumber = (int) flt;
		System.out.println(flt - intnumber);

//		Write a Program  on reverse the string on like blow the this. Str = " My School is ABC" Expected : "CBA si loohcs yM"

		String strText = "My School is ABC";

		StringBuffer str2 = new StringBuffer(strText);
		System.out.println(str2.reverse());

//		Write a program for, In a paragraph, I have to extract the following things: Get only numbers,Get only alphabets,Get only alpha-numerics,Get only spaces and Get only special characters.

	}
}
