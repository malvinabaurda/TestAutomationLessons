package lesson3.beginner;
//Print all even numbers from range (0..50). Try to solve this in more than one way

public class Task6 {

	public void showEvenNumbersFirstWay() {
		for (int i = 2; i <= 50; i = i + 2) {
			System.out.print(i + " ");
		}

	}

	public void showEvenNumbersSecondWay() {
		int j = 2;
		do {
			System.out.print(j + " ");
			j = j + 2;
		} while (j <= 50);

	}

	private void showEvenNumbersThirdWay() {
		for (int i = 1; i <= 50; i++) {
			if (i % 2 == 0)
				System.out.print(i + " ");
		}

	}

	public static void main(String[] args) {
		Task6 myInstance = new Task6();
		System.out.print("Show all even numbers from range (0..50) in the first way ");
		myInstance.showEvenNumbersFirstWay();
		System.out.print("\nShow all even numbers from range (0..50) in the second way ");
		myInstance.showEvenNumbersSecondWay();
		System.out.print("\nShow all even numbers from range (0..50) in the third way ");
		myInstance.showEvenNumbersThirdWay();
	}

}
