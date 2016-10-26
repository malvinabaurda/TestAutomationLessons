package lesson3.intermediateMiddle;

/*Addition of matrices. Add two matrix according to the common math rules and print the output to the console
 */
public class Task7 {

	public static void main(String[] args) {
		Task7 myInstance = new Task7();
		int[][] matrix1 = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
		int[][] matrix2 = { { 10, 20, 30 }, { 40, 50, 60 }, { 70, 80, 90 } };
		myInstance.add(matrix1, matrix2);
	}

	private void add(int[][] matrix1, int[][] matrix2) {
		int[][] resultMatrix = new int[3][3];
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				resultMatrix[i][j] = matrix1[i][j] + matrix2[i][j];
				System.out.print(resultMatrix[i][j] + " ");
			}
		}
	}
}
