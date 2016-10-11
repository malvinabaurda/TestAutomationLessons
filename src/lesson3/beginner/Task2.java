package lesson3.beginner;

public class Task2 {

	private boolean returnAskedResult(int x, int y) {
		boolean result = false;
		if (x == 10 || y == 10 || x + y == 10)
			result = true;
		return result;

	}

	public static void main(String[] args) {
		Task2 myInstance = new Task2();
		System.out.println(myInstance.returnAskedResult(5, 5));

	}

}
