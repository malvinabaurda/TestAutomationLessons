package lesson3.intermediateMiddle;
/*Sum of numbers in the string. Given a string. Write a method which returns the sum of the numbers

appearing in the string, ignoring all other characters. Provide all necessary checks. Example:

yourMethod("krm236abw") → 11

yourMethod("aa49b55") → 23
*/
public class Task4 {

	public static void main(String[] args) {
		Task4 myInstance = new Task4();
		System.out.print(myInstance.calculate("1v4h2g35v235h"));

	}

	public int calculate(String value) {
		int sum = 0;
		for (int i = 0; i < value.length(); i++) {
			if (Character.isDigit(value.charAt(i))) {
				sum += Character.getNumericValue(value.charAt(i));

			}

			
		}
		return sum;
	}
}
