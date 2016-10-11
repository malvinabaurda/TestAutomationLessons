package lesson3.inclass;

public class WorkWithLoops {

	public void showMyMonths(String[] months) {
		for (String myMonth : months) {
			System.out.println(myMonth);
		}
	}

	public void showOneDimentionalArray(int arraySize) {
		for (int j = 1; j <= arraySize; j++) {
			for (int i = 1; i <= arraySize; i++) {
				System.out.print(i + (j - 1) * arraySize + " ");
			}
			System.out.println();
		}

	}

	private boolean checkIfHaveValue(String value, String[] months) {
		boolean result = false;
		for (String myMonth : months) {
			if (myMonth.equals(value))
				result = true;
		}
		return result;
		

	}

	public static void main(String[] args) {
		String[] months = { "Jan", "Feb", "Mar", "Apr", "May", "June", "July", "Aug", "Sep", "Oct", "Nov", "Dec" };
		WorkWithLoops myInstanceOne = new WorkWithLoops();
		myInstanceOne.showMyMonths(months);
		myInstanceOne.showOneDimentionalArray(15);
		System.out.println(myInstanceOne.checkIfHaveValue("Juine", months));
	}

}
