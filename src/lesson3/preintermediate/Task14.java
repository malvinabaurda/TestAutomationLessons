package lesson3.preintermediate;

public class Task14 {

	public static void main(String[] args) {
		Task14 myInstance = new Task14();
		myInstance.show("Test");

	}

	private void show(String value) {
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
