package lesson3.beginner;

public class Task3 {

	public static void main(String[] args) {
		Task3 myInstance = new Task3();
		myInstance.showResult(18);

	}

	private void showResult(int i) {
		boolean result = false;
		if (i % 5 == 0 || i % 3 == 0)
			result = true;
		System.out.println(result);

	}

}
