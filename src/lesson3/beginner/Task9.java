package lesson3.beginner;
/*
Create method which takes two integers (a and b), performs their division (a/b) and outputs
accurate result of division (this means the result should have a decimal part, if any)
 * */
public class Task9 {

	public static void main(String[] args) {
		Task9 myInstance = new Task9();
		System.out.println(myInstance.devide(10, 3));

	}

	private float devide(int i, int j) {
		float quotient = i /(float)j;
		return quotient;

	}

}
