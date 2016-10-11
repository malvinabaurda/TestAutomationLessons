package lesson3.beginner;

public class Task5 {
	public String writeMark(int value) {
		String myMark = null;
		switch (value) {
		case 1:
		case 2:
			myMark = "Failed";
			break;
		case 3:
		case 4:
			myMark = "Good";
			break;
		case 5:
			myMark = "Excellent";
			break;
		default:
			myMark = "No mark";
			break;
		}
		return myMark;
	}

	public static void main(String[] args) {
		Task5 myInstance = new Task5();
		System.out.println(myInstance.writeMark(45));

	}

}