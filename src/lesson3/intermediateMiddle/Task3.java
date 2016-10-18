package lesson3.intermediateMiddle;

public class Task3 {

	public static void main(String[] args) {
		Task3 myInstance = new Task3();
		int [] myArray = {1,2,3,4,5,6};
		myInstance.reverse(myArray);

	}

	public void reverse(int[] myArray) {
		int i,buf;
		for (i = 0; i < myArray.length/ 2; i++) {
			buf = myArray[i];
			myArray[i] = myArray[myArray.length - 1 - i];
			myArray[myArray.length - 1 -i] = buf;

		} for( i = 0; i<myArray.length; i++)
		System.out.print(myArray[i]+" ");

	} 

}
