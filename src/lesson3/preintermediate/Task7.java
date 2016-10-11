package lesson3.preintermediate;

public class Task7 {

	public static void main(String[] args) {
		Task7 myInstance = new Task7();
		int[] array = { 5, 6, 3, 9, 2, 4, 7 };
		myInstance.showMaxAndMinValues(array);

	}

	private void showMaxAndMinValues(int[] array) {
		int max = array[0];
		int min = array[0];
		for (int i = 0; i < array.length; i++) {
			if (array[i] > max)
				max = array[i];
			if (array[i] < min)
				min = array[i];
		}
		System.out.println("Максимальное значение, умноженное на 2 – " + max * 2);
		System.out.println("Минимальное значение, умноженное на 2 – " + min * 2);
	}

}
