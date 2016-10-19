package lesson3.preintermediate;
/* 
 Given a string. Write a method which swaps first and last characters and returns a new modified

string:swapChar("Cool text") → "tool texC“
 */
public class Task2 {

	public void swapChar(String myString) {
System.out.print(myString.substring(myString.length()-1, myString.length()));
System.out.print(myString.substring(1, myString.length()-1));
System.out.println(myString.substring(0, 1));
	}

	public static void main(String[] args) {
		Task2 myInstance = new Task2();
		myInstance.swapChar("Test");
	}

}