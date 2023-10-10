package array;

public class PassArrayToMethod {

	public void findMin(int arrayOne[]) {

		int min = arrayOne[0];

		for (int i = 0; i < arrayOne.length; i++) {
			if (min > arrayOne[i]) {
				min = arrayOne[i];
			}
		}
		System.out.println("Min element from the array is : " + min);
	}
	
	public static int[] getArray() {
		
		return new int[] {1,5,8,56,12,25};
	
}

	public static void main(String[] args) {
		PassArrayToMethod minPass = new PassArrayToMethod();

		int arrayTest[] = { 20, 25, 65, 18, 7, 58 };

		minPass.findMin(arrayTest);
		
		int newArray[] = PassArrayToMethod.getArray();
		System.out.println(newArray[2]);

	}

}
