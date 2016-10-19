
package lesson3.preintermediate;
/*
Write a method which calculates a sum of first 100 odd elements of Fibonacci sequence
*/

public class Task8 {
	public long showSum(int value) {
		int k = 2;
		int a = 1;
		int b = 1;
		long sum = 2;
		while (k < value) {
			int s = a + b;
			if (!(s % 2 == 0)) {
				sum = sum + s;
				k++;
			}
			a = b;
			b = s;
		}
		return sum;

	}

	public static void main(String[] args) {
		Task8 myInstance = new Task8();
		System.out.println("Sum of first 6 odd elements of Fibonacci sequence: " + myInstance.showSum(6));

	}

}
