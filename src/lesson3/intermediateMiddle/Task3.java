package lesson3.intermediateMiddle;
//Reversed array. Write a method which takes an array and returns inverted one
public class Task3 {

	public static void main(String[] args) {
		Task3 myInstance = new Task3();
		int [] myArray = {1,2,3,4,5,6};
		System.out.print("Initial array: ");
		myInstance.showMyArray(myArray);
		System.out.print("\nReversed array: ");
		myInstance.reverse(myArray);

	}
	public void showMyArray(int[] myArray) {
		for (int x : myArray)
			System.out.print(x + " ");
	}
	public void reverse(int[] myArray) {
		int i,buf;
		for (i = 0; i < myArray.length/ 2; i++) {
			buf = myArray[i];
			myArray[i] = myArray[myArray.length - 1 - i];
			myArray[myArray.length - 1 -i] = buf;

		} for( i = 0; i<myArray.length; ++i)
		System.out.print(myArray[i]+" ");

	} 

}
