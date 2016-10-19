package lesson3.preintermediate;
/*Write a method for calculating quadratic equation. It takes a, b, c numbers and print the solution*/
import static java.lang.Math.*;

public class Task13 {

	public static void main(String[] args) {
		Task13 myInstance = new Task13();
		myInstance.calculateQuadraticEquation(1, 96, 4);

	}

	public void calculateQuadraticEquation(int a, int b, int c) {
		double d = pow(b, 2) - 4 * a * c;
		if (d > 0) {
			System.out.println("x1 = " + (-b - sqrt(d)) / (2 * a));
			System.out.println("x2 = " + (-b + sqrt(d)) / (2 * a));
		} else if (d == 0) {
			System.out.println("x = " + (-b / (2 * a)));
		} else {
			System.out.println("The equation has no solution.");

		}

	}
}
