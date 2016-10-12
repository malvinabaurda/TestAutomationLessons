package lesson3.beginner;

/*
Given two integers, x and y. Create a method (program) which returns True if one if them is 10

or if their sum is 10.
 */
public class Task2 {

	private boolean returnAskedResult(int x, int y) {
		boolean result = false;
		if (x == 10 || y == 10 || x + y == 10)
			result = true;
		return result;

	}

	public static void main(String[] args) {
		Task2 myInstance = new Task2();
		System.out.print("Check for pair 5 and 5 - result is ");
		System.out.println(myInstance.returnAskedResult(5, 5));
		System.out.print("Check for pair 10 and 5 - result is ");
		System.out.println(myInstance.returnAskedResult(10, 5));
		System.out.print("Check for pair 5 and 10 - result is ");
		System.out.println(myInstance.returnAskedResult(5, 10));
		System.out.print("Check for pair 10 and 11 - result is ");
		System.out.println(myInstance.returnAskedResult(10, 11));
		System.out.print("Check for pair 12 and 15 - result is ");
		System.out.println(myInstance.returnAskedResult(12, 15));
	}

}
