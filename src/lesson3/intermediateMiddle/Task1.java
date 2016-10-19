package lesson3.intermediateMiddle;
import java.util.Scanner;
/*Superpower (complicated). Imagine that you have a special skill which allows to calculate amount of

digits in any integer positive number. For example, if number is 12345, amount=15. Write a program

which checks your superpower when user enters necessary number via console (in IDE). Use error

guessing technique for provide additional checks */
public class Task1 {
	

	public static void main(String[] args) {
		Task1 myInstance = new Task1();
		Scanner in = new Scanner(System.in);
		System.out.print("¬ведите число: ");
		String number = in.nextLine();
		System.out.println(myInstance.calculate(number));
	}

	public int calculate(String value) {
		int sum = 0;
		for (int i = 0; i < value.length(); i++) {
			sum += Character.getNumericValue(value.charAt(i));
		}
		return sum;

	}

}
