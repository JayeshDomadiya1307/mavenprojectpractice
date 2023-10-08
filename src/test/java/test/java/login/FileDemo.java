package test.java.login;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileDemo {

	public static void main(String[] args) {

		System.out.println(System.getProperty("user.dir"));
		String screenshotpath = System.getProperty("user.dir") + "\\JD";
		System.out.println(screenshotpath);

		File file = new File(screenshotpath);

		try {
			File myFileObj = new File("javaTestFile.txt");

			if (myFileObj.createNewFile()) {
				System.out.println("File is created");
			} else {
				System.out.println("File is already exist");
			}
		} catch (IOException e) {
			System.out.println("Error Occured for file creation");
			e.printStackTrace();
		}

		try {
			FileWriter myWriter = new FileWriter("javaTestFile.txt", true);

			myWriter.write("First Test line is added in the file");
			myWriter.write('\n');
			myWriter.flush();
			myWriter.close();

			System.out.println("Texts are added or wtitten successfully in file");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}
