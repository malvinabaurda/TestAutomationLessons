
package lesson3.preintermediate;
/*

0,1,1, 2,3,5,8,13,21,34,55

3-2
6-4
x-100
*/

public class Task8 {

	public static void main(String[] args) {
		Task8 myInstance = new Task8();
		int [] array = null;
		myInstance.showSum(100, array);
		
	}

	private void showSum(int value, int[] array) {
		array [0]  = 1;
		array [1] = 1;
		int sum = 0;
		for(int i = 2; i<value*2; i++){
			array[i]=array[i-1]+array[i-2];
					sum = sum + array[i];
		for(int j = 1; j>0; j=j+2);
		System.out.println(sum);
			
		
	}

}
