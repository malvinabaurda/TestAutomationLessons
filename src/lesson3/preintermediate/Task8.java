
package lesson3.preintermediate;
/*

0,1,1, 2,3,5,8,13,21,34,55

3-2
6-4
x-100
*/

public class Task8 {

	public static void main(String[] args) {
		Task8 myInstance = new Task8();
		System.out.println(myInstance.showSum(100));

	}

	private int showSum(int value) {
		int k = 2;
		int a = 1;
		int b = 1;
		int s = 2;
		int sum = 0;
		while (s < value) {
			s = a + b;
			a = b;
			b = s;
			if (s % 2 == 0)
				k++;
		}
		return sum;

	}
}
