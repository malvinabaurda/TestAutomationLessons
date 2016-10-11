package lesson3.beginner;

public class Task8 {

	public static void main(String[] args) {
		Task8 myInstance = new Task8();
		myInstance.myMethod("Testing", 2);
	}

	private void myMethod(String value, int i) {
		for (; i > 0; i--)
			System.out.print(value.substring(0, i));
	}

}
