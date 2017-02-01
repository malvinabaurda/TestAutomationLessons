package lesson4.sandbox;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.InputStreamReader;

public class GetParameterNameFromTextfile {
	String fileName = "";

	public String valueOfParameter(String fileName, String paramName) {
		String paramValue = "";
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
				if (strLine.substring(0, paramName.length()).equals(paramName)) {
					paramValue = strLine.substring(paramName.length() + 3, strLine.length());

				}

			}
			// Close the input stream
			in.close();
		} catch (Exception e) {// Catch exception if any
			System.err.println("Error: " + e.getMessage());
		}
		return paramValue;
	}

	public static void main(String[] args) {

		GetParameterNameFromTextfile myInstance = new GetParameterNameFromTextfile();
		String param2value = myInstance.valueOfParameter(
				"C://Users//Пользователь//git//MalvinaTestAutomationLessons//src//lesson4//sandbox//inifile.txt",
				"param2");
		System.out.println("Value of param2 is " + param2value);
	}
}
