package lesson3.preintermediate;

/*Given an array of integers. Write a method which calculates sum of all elements and arithmetic

average of them*/
public class Task6 {
	public void showMyArray(int[] myArray) {
		for (int x : myArray)
			System.out.print(x + " ");
	}

	public int calculateSum(int[] array) {
		int sum = 0;
		for (int i = 0; i < array.length; i++)
			sum += array[i];
		return sum;

	}

	public double calculateArithmeticAverage(int[] array) {
		double average = 0;
		int sum = 0;
		for (int i = 0; i < array.length; i++)
			sum += array[i];
		average = (double) sum / array.length;
		return average;

	}

	public static void main(String[] args) {
		Task6 myInstance = new Task6();
		int[] array = { 1, 2, 7, 0, 0, 0, 0, 0, 0,0 };
		System.out.print("Array: ");
		myInstance.showMyArray(array);
		System.out.print("\nSum of all elements is " + myInstance.calculateSum(array));
		System.out.print("\nArithmetic average of all elements is " + myInstance.calculateArithmeticAverage(array));
	}

}
