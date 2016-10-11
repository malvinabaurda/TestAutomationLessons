package lesson3.beginner;

public class Task1 {

	private void multiplyPreviousNumber(int value) {
		for (int x = 1; x > 0; x = x * value)
			System.out.println(x);
	}

	public static void main(String[] args) {
		Task1 myInstance = new Task1();
		myInstance.multiplyPreviousNumber(3);
	}

}
