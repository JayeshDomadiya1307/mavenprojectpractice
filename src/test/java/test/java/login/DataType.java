package test.java.login;

public class DataType {

	public static void main(String[] args) {
		byte bytetData = 127;
		short shortData = -32768;
		long longtData = 9223372036854775807L;
		int intData = 2147483647;
		double doubleData = 5.365435435435435454354354354353454354354353454353;
		float floatData = 127.543543543543f;
		boolean boolData = true;

		System.out.println(bytetData);
		System.out.println(shortData);
		System.out.println(longtData);
		System.out.println(intData);
		System.out.println(doubleData);
		System.out.println(floatData);

		if (longtData > intData) {
			System.out.println(boolData);
		} else {
			System.out.println("Long is not greater then int");
		}
	}
}
