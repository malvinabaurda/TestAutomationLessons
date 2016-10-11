package lesson3.preintermediate;

public class Task3 {

	private boolean returnAskedResult(int a, int b) {
		boolean result = false;
		if (a == 21 || b == 21 || a + b == 21)
			result = true;
		return result;
	}

	public static void main(String[] args) {
		Task3 myInstance = new Task3();
		System.out.println(myInstance.returnAskedResult(22, 1));
	}

}
