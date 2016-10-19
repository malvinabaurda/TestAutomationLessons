package lesson3.preintermediate;

/*Given an array of integers. Write a method which finds max and min elements in it and

multiplies them by 2
*/
public class Task7 {
	public void showMyArray(int[] myArray) {
		for (int x : myArray)
			System.out.print(x + " ");
	}

	public void showMaxAndMinValues(int[] array) {
		int max = array[0];
		int min = array[0];
		for (int i = 0; i < array.length; i++) {
			if (array[i] > max)
				max = array[i];
			if (array[i] < min)
				min = array[i];
		}
		System.out.println("\nМаксимальное значение, умноженное на 2 : " + max * 2);
		System.out.println("Минимальное значение, умноженное на 2 : " + min * 2);
	}

	public static void main(String[] args) {
		Task7 myInstance = new Task7();
		int[] array = { 5, 6, 3, 9, 2, 4, 7 };
		myInstance.showMyArray(array);
		myInstance.showMaxAndMinValues(array);

	}

}
