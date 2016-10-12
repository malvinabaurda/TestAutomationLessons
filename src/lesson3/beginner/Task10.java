package lesson3.beginner;

/*
 Create method which gets a number form 1 to 9 (for example 4) and then prints the follow

output:

For number 4: 
* 

** 

*** 

**** 

*** 

**

*/
public class Task10 {

	public void starPrintOneLoop(int a) {
		if (a < 1 || a > 9)
			System.out.println("Wrong number of characters");
		else {
			int flag = 1;
			for (int i = 1; i <= 2 * a - 1; i++) {
				for (int j = 1; j <= flag; j++) {
					System.out.print("*");
				}
				flag = (i < a) ? flag + 1 : flag - 1;
				
				System.out.print("\n");
			}

		}
	}

	public void printFirstWay(int value) {
		if (value < 1 || value > 9)
			System.out.println("Wrong number");
		else {
			for (int i = 1; i <= value; i++) {
				for (int j = 1; j <= i; j++) {
					System.out.print("*");
				}
				System.out.println();

			}
			for (int i = value - 1; i >= 1; i--) {
				for (int j = 1; j <= i; j++) {
					System.out.print("*");
				}
				System.out.println();

			}
		}
	}

	public static void main(String[] args) {
		Task10 myInstance = new Task10();
		myInstance.printFirstWay(9);
		myInstance.starPrintOneLoop(7);

	}
}