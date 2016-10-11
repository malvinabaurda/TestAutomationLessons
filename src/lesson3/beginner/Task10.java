package lesson3.beginner;

public class Task10 {

	public static void main(String[] args) {
		Task10 myInstance = new Task10();
		myInstance.print(4);
	}

	private void print(int value) {
		for (int i = 1; i <= value; i++) {
			for (int j = 1; j <= value; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}