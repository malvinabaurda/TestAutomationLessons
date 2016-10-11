package lesson3.beginner;

public class Task7 {

	private int showMax(int[] array) {
		int maxValue = array[0];
		for (int i = 1; i < array.length; i++)
			if (array[i] > maxValue)
				maxValue = array[i];
		return maxValue;
	}

	public static void main(String[] args) {
		int[] array = { 1, 2, -6, 3, 4, 5, 6, 7 };
		Task7 myInstanceOne = new Task7();
		System.out.println(myInstanceOne.showMax(array));

	}

}
