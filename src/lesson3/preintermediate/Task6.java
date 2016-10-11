package lesson3.preintermediate;

public class Task6 {

	public static void main(String[] args) {
		Task6 myInstance = new Task6();
		int[] array = { 1, 2, 7, 0, 0, 0, 0, 0, 0 };
		myInstance.calculateSum(array);
		myInstance.calculateArithmeticAverage(array);
	}

	private void calculateSum(int[] array) {
		int sum = 0;
		for (int i = 0; i < array.length; i++)
			sum += array[i];
		System.out.println(sum);

	}

	private void calculateArithmeticAverage(int[] array) {
		double average = 0;
		int sum = 0;
		for (int i = 0; i < array.length; i++)
			sum += array[i];
		average = (double) sum / array.length;
		System.out.println(average);

	}

}
