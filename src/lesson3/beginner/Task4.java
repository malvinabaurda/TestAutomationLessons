package lesson3.beginner;

/*
Given an array of integers. Create a method (program) which takes two arguments - this array

and number that you are looking for - and returns quantity of this number in the array.
 * */
public class Task4 {

	private int showQuantity(int myNumber, int[] myArray) {
		int quantity = 0;
		for (int i : myArray)
			if (i == myNumber)
				quantity++;
		return quantity;

	}

	public void showMyArray(int[] myArray) {
		for (int x : myArray)
			System.out.print(x + " ");
	}

	public static void main(String[] args) {
		int[] myArray = { 10, 10, 10, 2, 2, 3, 4, 3, 4, 3, 3 };
		Task4 myInstance = new Task4();
		System.out.print("Initial array is ");
		myInstance.showMyArray(myArray);
		System.out.print("\nNumber 2 is found " + myInstance.showQuantity(2, myArray) + " times in array");
		System.out.print("\nNumber 10 is found " + myInstance.showQuantity(10, myArray) + " times in array");
		System.out.print("\nNumber 3 is found " + myInstance.showQuantity(3, myArray) + " times in array");
		System.out.print("\nNumber 4 is found " + myInstance.showQuantity(4, myArray) + " times in array");
		System.out.print("\nNumber 28 is found " + myInstance.showQuantity(28, myArray) + " times in array");

	}

}
