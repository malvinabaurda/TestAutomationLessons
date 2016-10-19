package lesson3.preintermediate;

/*Write a method which takes a word and prints it like a diagonal matrix. See example:

Input: “Test”

Output: T

           e

              s

                t
*/
public class Task14 {

	public String returnSpaces(int numberOfSpaces) {
		String mySpaces = "";
		for (int i = 1; i <= numberOfSpaces; i++)
			mySpaces += " ";
		return mySpaces;

	}

	public void showDiagonal2(String value) {
		for (int i = 0; i <= value.length() - 1; i++) {
			System.out.print(returnSpaces(i*2));
			System.out.println(value.substring(i, i + 1));
		}

	}

	public void showDiagonal(String value) {
		char[][] qwer = new char[value.length()][value.length()];
		for (int i = 0; i < value.length(); i++)
			for (int j = 0; j < value.length(); j++)
				qwer[i][j] = ' ';
		for (int i = 0; i < value.length(); i++)
			qwer[i][i] = value.charAt(i);
		for (int i = 0; i < value.length(); i++) {
			for (int j = 0; j < value.length(); j++)
				System.out.print(qwer[i][j] + " ");
			System.out.println();
		}
	}

	public static void main(String[] args) {
		Task14 myInstance = new Task14();
		myInstance.showDiagonal("sfhfshsfhd");
		myInstance.showDiagonal2("sfhfshsfhd");
	}

}
