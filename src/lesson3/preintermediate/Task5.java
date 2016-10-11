package lesson3.preintermediate;

public class Task5 {

	public static void main(String[] args) {
		Task5 myInstance = new Task5();
		int[] array = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		System.out.println(myInstance.checkIfDoesntHaveValue(7, 9, array));

	}

	private boolean checkIfDoesntHaveValue(int i, int j, int[] array) {
		boolean result = true;
		for (int numbers : array)
			if (numbers == i || numbers == j)
				result = false;

		return result;
	}
}
