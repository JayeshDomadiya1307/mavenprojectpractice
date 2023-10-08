package test.java.login;

public class StringTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "Jayesh";
		char[] ch = {'V', 'I', 'P', 'U', 'L'};
		
		String s1 = new String(ch);
		System.out.println("String as array : " + s1);
		
		String s2 = "Hello!";
		System.out.println(s2);
		
//		String s3 =  new String("Economy First Class");
		String s3 =  "Economy First Class";
		
		System.out.println("Length of S3 : " + s3.length());
		System.out.println("Length of S3 : " + s3.toUpperCase());
		System.out.println("Char at position 2 for S3 : " + s3.charAt(2));
		System.out.println("Char at position 2 for S3 : " + s3.indexOf("Class"));
		System.out.println("Char at position 2 for S3 : " + s3.concat(" Jayesh Added"));
		
		String findtxt = "Please locate where locate occurs!";
		System.out.println("Position of locate : " + findtxt.indexOf("locate"));
		
		String firstName = "Jayesh";
		String lastName = "Domadiya";
		System.out.println("String concatenation using + : " + firstName + " " + lastName);
		System.out.println("String concatenation using concat() : " + firstName.concat(lastName));
		
		String myName = "Jayesh Domadiya";
		
		if(myName.equals("Jayesh"))
			System.out.println("\"Jayesh\" is not same as \"Jayesh\"");
		else
			System.out.println("else condition of \"Jayesh\"");

		
		String subStr = myName.substring(6);
		System.out.println("Remaining substring is : "+ subStr);
		
		
		char[] ch1 = str.toCharArray();
		System.out.println("[Not possible ]Converted the string in to chat array :" + ch1);
		
		int num1 = 123456789;
		String strNum = String.valueOf(num1);
		char[] charNum = strNum.toCharArray();
		
		System.out.println(charNum);
		for (char c : charNum) {
			System.out.println(c);
		}
}
}