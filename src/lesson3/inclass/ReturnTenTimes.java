package lesson3.inclass;

public class ReturnTenTimes {

	private int calcutateValue(int value) {
		return value * 10;

	}

	public static void main(String[] args) {
		ReturnTenTimes myInstance = new ReturnTenTimes();
		System.out.println(myInstance.calcutateValue(10));
		myInstance.showAllNumbers(10);
	}

	private void showAllNumbers(int number) {
		for (int i=1;i<=number;i++)
		{
			System.out.print(i+ " ");
		}
		System.out.println();
		
		int j=1;
		do {
			System.out.print(j+ " ");
			j++;
		
		} while (j<=number);
		
	}
	

}
