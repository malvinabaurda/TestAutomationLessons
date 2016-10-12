package lesson3.beginner;
/*
 Given an array of integer numbers. Create a method (program) which returns a new one where

each element is multiplied by 3.
 */
public class Task1 {

	public void multiplyPreviousNumber(int[] myArray ) {
		for (int x:myArray) System.out.print(x*3+" ");
	}
	public void showMyArray(int[] myArray ) {
		for (int x:myArray) System.out.print(x+" ");
	}
	

	public static void main(String[] args) {
		int [] myArray = { 1, 2, 3 };
		Task1 myInstance = new Task1();
		System.out.print("Initial array is ");
		myInstance.showMyArray(myArray);
		System.out.print("\nModified array is ");
		myInstance.multiplyPreviousNumber(myArray);
	}

}
