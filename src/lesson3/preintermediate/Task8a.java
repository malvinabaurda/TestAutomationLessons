package lesson3.preintermediate;

public class Task8a {

	public static void main(String[] args) {
		Task8a myInstance = new Task8a();
		System.out.println(myInstance.showFibonacciNumber(10));

	}

	public double showFibonacciNumber(int i) {
		if (i == 0) return 0;
		else if (i ==1) return 1;
		else return showFibonacciNumber(i-1) + showFibonacciNumber(i-2);
		
	}

}
