package lesson3.beginner;

/*
Given a string and an int n. Return a string made of the first n characters of the string, followed

by the first n-1 characters of the string, and so on. Example:

yourMethod("Testing", 4) → "TestTesTeT"

yourMethod("Testing", 3) → "TesTeT"

yourMethod("Testing", 2) → "TeT“ 
 * */
public class Task8 {
	public String myMethod(String value, int i) {
		String result = "";
		for (; i > 0; i--)
			result = result + value.substring(0, i);
		return result;
	
	}

	public static void main(String[] args) {
		Task8 myInstance = new Task8();
		System.out.print(myInstance.myMethod("Testing", 4));
	}

}
