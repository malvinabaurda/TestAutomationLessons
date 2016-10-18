package lesson3.preintermediate;

public class Task12 {

	public static void main(String[] args) {
		Task12 myInstance = new Task12();
		System.out.println(myInstance.calculate("122345"));
	}

	private int calculate(String value) {
		int sum = 0;
		for (int i = 0; i < value.length(); i++) {
			sum += Character.getNumericValue(value.charAt(i));
		}
		return sum;

	}

}
