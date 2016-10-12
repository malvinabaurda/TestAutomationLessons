package lesson3.beginner;

/*
 Create a method (program) which returns True if the given non-negative number is a multiple of

3 or a multiple of 5.
 * */
public class Task3 {
	private boolean showResult(int i) {
		boolean result = false;
		if (i % 5 == 0 || i % 3 == 0)
			result = true;
		return result;
	}

	public static void main(String[] args) {
		Task3 myInstance = new Task3();
		System.out.println("Check if number 18 is multiply of 5 or multiply of 3:" + myInstance.showResult(18));
		System.out.println("Check if number 30 is multiply of 5 or multiply of 3:" + myInstance.showResult(30));
		System.out.println("Check if number 20 is multiply of 5 or multiply of 3:" + myInstance.showResult(20));
		System.out.println("Check if number 22 is multiply of 5 or multiply of 3:" + myInstance.showResult(22));

	}

}
