package lesson3.preintermediate;

public class Task11 {

	public static void main(String[] args) {
		Task11 myInstance = new Task11();
		int[] myArray = { 4, 6, 0, 1, 4, 3, 1, 9 };
		myInstance.check(1, 2, 3, myArray);

	}

	private void check(int a, int b, int c, int[] myArray) {
		boolean result = false;
		for (int i = 0; i <= myArray.length - 2; i++) {
			if (myArray[i] == a && (myArray[i+1]) == b && (myArray[i+2]) == c)
				result = true;
		}
		System.out.println(result);
	}

}
