package lesson3.intermediateMiddle;

public class Task2 {

	public static void main(String[] args) {
		Task2 myInstance = new Task2();
		System.out.println(myInstance.calculateDigits("12f3yyyyt45"));
	}

	private int calculateDigits(String value) {
		int sum = 0;
		for (int i = 0; i < value.length(); i++) {
			if (Character.isDigit(value.charAt(i)))
				;
			sum += Character.getNumericValue(value.charAt(i));
			}

		
		return sum;

	}
}
