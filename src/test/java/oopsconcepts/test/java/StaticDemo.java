package oopsconcepts.test.java;

public class StaticDemo {
	
	
	// Static variables are on Class level, not object level.
	int  i = 0;
	static int j = 5;

	public static void main(String[] args) {
		
		StaticDemo stc = new StaticDemo();
		System.out.println(stc.i);
		
		System.out.println(StaticDemo.j);
		
	}

}
