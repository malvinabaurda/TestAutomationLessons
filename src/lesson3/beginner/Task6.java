package lesson3.beginner;

public class Task6 {

	private void showNumbers(int value) {
		for (int i = 0; i < value; i++) {
			System.out.print(i + " ");
		}
		System.out.println();
		int j = 0;
		do {
			System.out.print(j + " ");
			j++;
		} while (j < value);
	}

	public static void main(String[] args) {
		Task6 myInstance = new Task6();
		myInstance.showNumbers(51);
	}

}
