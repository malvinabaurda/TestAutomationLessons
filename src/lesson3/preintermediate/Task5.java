package lesson3.preintermediate;

/*You don't like number 7 and number 9. Write a method which checks input array and returns
True if the array doesn't contain your unloved numbers
*/
public class Task5 {
	public boolean checkIfDoesntHaveValue(int i, int j, int[] array) {
		boolean result = true;
		for (int numbers : array)
			if (numbers == i || numbers == j)
				result = false;

		return result;
	}

	public void showMyArray(int[] myArray) {
		for (int x : myArray)
			System.out.print(x + " ");
	}

	public static void main(String[] args) {
		Task5 myInstance = new Task5();
		int[] array = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		System.out.print("Initial array: ");
		myInstance.showMyArray(array);
		System.out.println("\nArray doesn't have unloved numbers 7 and 9: " + myInstance.checkIfDoesntHaveValue(7, 9, array));
		

	}

}
