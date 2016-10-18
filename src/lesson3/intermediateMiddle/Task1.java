package lesson3.intermediateMiddle;
import java.util.Scanner;

public class Task1 {

	public static void main(String[] args) {
		Task1 myInstance = new Task1();
		Scanner in = new Scanner(System.in);
		System.out.print("¬ведите число: ");
		String number = in.nextLine();
		System.out.println(myInstance.calculate(number));
	}

	private int calculate(String value) {
		int sum = 0;
		for (int i = 0; i < value.length(); i++) {
			sum += Character.getNumericValue(value.charAt(i));
		}
		return sum;

	}

}
