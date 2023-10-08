package test.java.login;

public class StringBufferBuilder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s1 = "abc";
		String s2 = "abc";

		// Note that this == compares whether
		// s1 and s2 refer to same object or not

		if (s1 == s2)
			System.out.println("Yes");
		else
			System.out.println("No");

		System.out.println("<---------------------------------------------------------------------------------->");

		String s3 = new String("abc");
		String s4 = new String("abc");
		if (s3 == s4)
			System.out.println("Yes");
		else
			System.out.println("No");
		
		String name = "Jayesh";
		StringBuffer name1 = new StringBuffer("Jayesh");
		name.concat("Patel");
		name1.append("Domadiya");
		
		System.out.println(name + "AND" + name1);
		System.out.println(name1.reverse());
		
		

	}

}
