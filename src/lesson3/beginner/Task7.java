package lesson3.beginner;

//Given an array of integers. Find and print the max element in it.
public class Task7 {

	public int showMax(int[] array) {
		int maxValue = array[0];
		for (int i = 1; i < array.length; i++)
			if (array[i] > maxValue)
				maxValue = array[i];
		return maxValue;
	}

	public void showMyArray(int[] myArray) {
		for (int x : myArray)
			System.out.print(x + " ");
	}

	public static void main(String[] args) {
		Task7 myInstanceOne = new Task7();
		int[] myArray = { 1, 2, -6, 3, 4, 5, 6, 7 };
		System.out.print("Initial array is ");
		myInstanceOne.showMyArray(myArray);
		System.out.println("The maximum number found in array is " + myInstanceOne.showMax(myArray));

		int[] myArray1 = { 1059, 2, -56, 3, 4, 5, 6, 7 };
		System.out.print("Initial array is ");
		myInstanceOne.showMyArray(myArray1);
		System.out.println("The maximum number found in array is " + myInstanceOne.showMax(myArray1));

	}

}
