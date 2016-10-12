package lesson3.beginner;
/*
 There are several marks in the school: from 1 to 5 (the highest). Create a method (program)

which takes a mark and return your result (for ex. "Excellent", "Good", "Failed" etc.). Please do

not use if...else condition.
 * */
public class Task5 {
	public String writeMark(int myMark) {
		String myMarkName;
		switch (myMark) {
		case 1:
			myMarkName = "Bad";
			break;
		case 2:
			myMarkName = "Failed";
			break;
		case 3:
			myMarkName = "Not good";
			break;
		case 4:
			myMarkName = "Good";
			break;
		case 5:
			myMarkName = "Excellent";
			break;
		default:
			myMarkName = "No mark name";
			break;
		}
		return myMarkName;
	}

	public static void main(String[] args) {
		Task5 myInstance = new Task5();
		System.out.print("\nMark 1 has name - " + myInstance.writeMark(1));
		System.out.print("\nMark 2 has name - " + myInstance.writeMark(2));
		System.out.print("\nMark 3 has name - " + myInstance.writeMark(3));
		System.out.print("\nMark 4 has name - " + myInstance.writeMark(4));
		System.out.print("\nMark 5 has name - " + myInstance.writeMark(5));
		System.out.print("\nMark 6 has name - " + myInstance.writeMark(6));
	}

}