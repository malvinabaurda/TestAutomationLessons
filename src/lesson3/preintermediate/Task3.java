package lesson3.preintermediate;
/*
 Given 2 integers, a and b. Write a method which returns true if one if them is 21 or if their sum

is 21.
 */
public class Task3 {

	public boolean returnAskedResult(int a, int b) {
		boolean result = false;
		if (a == 21 || b == 21 || a + b == 21)
			result = true;
		return result;
	}

	public static void main(String[] args) {
		Task3 myInstance = new Task3();
		System.out.print("Check for pair 10 and 21 - result is ");
		System.out.println(myInstance.returnAskedResult(10, 21));
		System.out.print("Check for pair 21 and 8 - result is ");
		System.out.println(myInstance.returnAskedResult(21, 8));
		System.out.print("Check for pair 7 and 21 - result is ");
		System.out.println(myInstance.returnAskedResult(7, 21));
		System.out.print("Check for pair 21 and 22 - result is ");
		System.out.println(myInstance.returnAskedResult(21, 22));
		System.out.print("Check for pair 23 and 45 - result is ");
		System.out.println(myInstance.returnAskedResult(23, 45));
	}

}
