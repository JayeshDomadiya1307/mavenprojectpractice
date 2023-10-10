package array;

public class ArrayTest {

	public static void main(String[] args) {

		int arrayOne[] = new int[10];

		int arrayTwo[] = { 15, 25, 35, 45, 55, 65 };

		arrayOne[0] = 10;
		arrayOne[1] = 20;
		arrayOne[2] = 30;
		arrayOne[3] = 40;
		arrayOne[4] = 50;
		arrayOne[5] = 60;
		arrayOne[6] = 70;
		arrayOne[7] = 80;
		arrayOne[8] = 90;
		arrayOne[9] = 100;

		System.out.println(arrayOne[5]);

		for (int i : arrayOne) {
			System.out.println(i);
		}
		System.out.println("<-------------------------------------------------------------------------------------------------------->");
		for (int i = 0; i < arrayTwo.length; i++) {
			System.out.println(arrayTwo[i]);
		}

	}

}
