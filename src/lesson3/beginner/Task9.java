package lesson3.beginner;

public class Task9 {

	public static void main(String[] args) {
		Task9 myInstance = new Task9();
		System.out.println(myInstance.devide(5, 4));

	}

	private float devide(int i, int j) {
		float quotient = (float) i / j;
		return quotient;

	}

}
