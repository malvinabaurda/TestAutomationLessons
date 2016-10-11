package lesson3.preintermediate;

public class Task9 {

	public static void main(String[] args) {
		Task9 myInstance = new Task9();
		myInstance.calculate(2);

	}

	private void calculate(int value) {
		for (int i = 1; i < 11; i++)
			System.out.println(value + " x " + i + " = " + i * value);
	}

}
