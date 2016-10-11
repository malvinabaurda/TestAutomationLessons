package lesson3.preintermediate;

public class Task4 {

	private void showSecondPart(int[] array) {
		int i = 0;
		for (i = array.length / 2; i <= array.length - 1; i++)
			if (i >= array.length / 2)
				System.out.print(array[i] + " ");
	}

	public static void main(String[] args) {
		int[] array = { 1, 2, 3, 4, 5, 6, 7 };
		Task4 myInstanceOne = new Task4();
		myInstanceOne.showSecondPart(array);

	}

}
