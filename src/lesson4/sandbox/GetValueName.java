package lesson4.sandbox;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.InputStreamReader;

public class GetValueName {
	String fileName = "";

	public String valueOfText(String fileName, String textName) {
		String textValue = "";
		try {
			// Open the file that is the first
			// command line parameter
			FileInputStream fstream = new FileInputStream(fileName);
			// Get the object of DataInputStream
			DataInputStream in = new DataInputStream(fstream);
			BufferedReader br = new BufferedReader(new InputStreamReader(in));
			String strLine;
			// Read File Line By Line
			while ((strLine = br.readLine()) != null) {
				// Print the content on the console
				if (strLine.substring(0, textName.length()).equals(textName)) {
					textValue = strLine.substring(textName.length() + 3, strLine.length());

				}

			}
			// Close the input stream
			in.close();
		} catch (Exception e) {// Catch exception if any
			System.err.println("Error: " + e.getMessage());
		}
		return textValue;
	}

	public static void main(String[] args) {

		GetValueName myInstance = new GetValueName();
		String textvalue1 = myInstance.valueOfText(
				"C://Users//Мальвина//git//TestAutomationLessons//src//lesson4//sandbox//1",
				"text1");
		System.out.println("Value of text1 is " + textvalue1);
		String textvalue2 = myInstance.valueOfText(
				"C://Users//Мальвина//git//TestAutomationLessons//src//lesson4//sandbox//1",
				"text2");
		System.out.println("Value of text2 is " + textvalue2);
		String textvalue3 = myInstance.valueOfText(
				"C://Users//Мальвина//git//TestAutomationLessons//src//lesson4//sandbox//1",
				"text3");
		System.out.println("Value of text3 is " + textvalue3);
		String textvalue4 = myInstance.valueOfText(
				"C://Users//Мальвина//git//TestAutomationLessons//src//lesson4//sandbox//1",
				"text4");
		System.out.println("Value of text4 is " + textvalue4);
		String textvalue5 = myInstance.valueOfText(
				"C://Users//Мальвина//git//TestAutomationLessons//src//lesson4//sandbox//1",
				"text5");
		System.out.println("Value of text5 is " + textvalue5);
	}
}
