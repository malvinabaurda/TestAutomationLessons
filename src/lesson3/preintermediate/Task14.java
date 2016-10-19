package lesson3.preintermediate;
/*Write a method which takes a word and prints it like a diagonal matrix. See example:

Input: “Test”

Output: T

           e

              s

                 t
*/
public class Task14 {

	public static void main(String[] args) {
		Task14 myInstance = new Task14();
		myInstance.show("Test");

	}

	public void show(String value) {
		int[][] array = new int[value.length()][value.length()];
		for (int i = 0; i < value.length(); i++) {
			for (int j = 0; j < value.length(); j++) {
				array[i][j] = ' ';
				{
					for (i = 0; i < value.length(); i++)
						array[i][i] = value.charAt(i);
				}
				System.out.println(array[i][i] +""+ value.charAt(i) + " ");

			}
		}
	}
}
