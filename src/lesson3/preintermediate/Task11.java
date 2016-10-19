package lesson3.preintermediate;
/*Given an array of integer positive numbers. For example, {4, 6, 0, 1, 2, 3, 1, 9}, but it can be any

random. Write Java-program which returns True, if sequence {1, 2, 3} appears somewhere in the

array. Provide additional boundary checks*/
public class Task11 {

	public static void main(String[] args) {
		Task11 myInstance = new Task11();
		int[] myArray = { 4, 6, 0, 1, 2, 3, 1, 9 };
		System.out.print("Array: ");
		myInstance.showMyArray(myArray);
		System.out.println("\nSequence {1, 2, 3} appears somewhere in the array: " + myInstance.check(1, 2, 3, myArray));
		System.out.println("Sequence {1, 5, 3} appears somewhere in the array: " + myInstance.check(1, 5, 3, myArray));
	}
	public void showMyArray(int[] myArray) {
		for (int x : myArray)
			System.out.print(x + " ");
	}

	public boolean check(int a, int b, int c, int[] myArray) {
		boolean result = false;
		for (int i = 0; i <= myArray.length - 2; i++) {
			if (myArray[i] == a && (myArray[i+1]) == b && (myArray[i+2]) == c)
				result = true;
		}
		return result;
	}

}
