package lesson3.preintermediate;

public class Task2 {

	private void swapChar(String myString) {
System.out.print(myString.substring(myString.length()-1, myString.length()));
System.out.print(myString.substring(1, myString.length()-1));
System.out.println(myString.substring(0, 1));
	}

	public static void main(String[] args) {
		Task2 myInstance = new Task2();
		myInstance.swapChar("This is the only text in theHHgggg  kk");
	}

}