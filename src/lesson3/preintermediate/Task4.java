package lesson3.preintermediate;

/*Given an array of integers. Write a method which prints the second half of the array. Include the

middle element to output, if the array has odd number of elements
*/
public class Task4 {

	public void showSecondPart(int[] array) {
		int i = 0;
		for (i = array.length / 2; i <= array.length - 1; i++)
			if (i >= array.length / 2)
				System.out.print(array[i] + " ");
	}

	public void showMyArray(int[] myArray) {
		for (int x : myArray)
			System.out.print(x + " ");
	}

	public static void main(String[] args) {
		int[] array = { 1, 2, 3, 4, 5, 6, 7 };
		Task4 myInstanceOne = new Task4();
		System.out.print("Initial array: ");
		myInstanceOne.showMyArray(array);
		System.out.print("\nThe second  half of the array: ");
		myInstanceOne.showSecondPart(array);

	}

}
