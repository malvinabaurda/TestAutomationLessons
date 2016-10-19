package lesson3.preintermediate;
/*Imagine that you have a special skill which allows to calculate amount of digits in any integer positive

number. For example, if number is 12345, amount=15. Write a method which checks your

superpower for any hard-coded number.*/
public class Task12 {

	public static void main(String[] args) {
		Task12 myInstance = new Task12();
		System.out.println("Sum of digits in the number 12345 is: " + myInstance.calculate("122345"));
		System.out.println("Sum of digits in the number 56789 is: " + myInstance.calculate("56789"));
	}

	public int calculate(String value) {
		int sum = 0;
		for (int i = 0; i < value.length(); i++) {
			sum += Character.getNumericValue(value.charAt(i));
		}
		return sum;

	}

}
