package lesson3.intermediateMiddle;

public class Task2 {

	public static void main(String[] args) {
		Task2 myInstance = new Task2();
		System.out.println("Totally " + myInstance.calculateLuckyTicketsQuantity() + " lucky tickets"); 

	}

	private int calculateLuckyTicketsQuantity() {
		int sum = 0;
		for (int a = 0; a<=9; a++)
			for (int b = 0; b<=9; b++)
				for (int c = 0; c<=9; c++)
					for (int d = 0; d<=9; d++)
						for (int e = 0; e<=9; e++)
							for (int f = 1; f<=9; f++)
								if (a+b+c == d+e+f) 
									sum += 1;
		return sum;
								
	}

}
