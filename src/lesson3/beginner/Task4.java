package lesson3.beginner;

public class Task4 {

	private int showQuantity(int i) {
		int quantity = 0;
		if (i == 1)

		{
			quantity = 1;
		}
		if (i == 2)

		{
			quantity = 2;
		}
		if (i == 3)

		{
			quantity = 3;
		}
		if (i == 4)

		{
			quantity = 4;
		}
		if (i == 5)

		{
			quantity = 5;
		}

		return quantity;

	}

	public static void main(String[] args) {
		Task4 myInstance = new Task4();
		System.out.println(myInstance.showQuantity(2));

	}

}
