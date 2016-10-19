package lesson3.preintermediate;

/*Write a method which prints multiplication table for the input number. Like this:

2 x 2 = 4

2 x 3 = 6

2 x 4 = 8*/
public class Task9 {
	public void calculate(int value) {
		for (int i = 1; i < 11; i++)
			System.out.println(value + " x " + i + " = " + i * value);
	}

	public static void main(String[] args) {
		Task9 myInstance = new Task9();
		System.out.println("Multiplication table for number 2:");
		myInstance.calculate(2);
		System.out.println("Multiplication table for number 5:");
		myInstance.calculate(5);

	}

}
