package lesson3.preintermediate;

/*
A couple is going to go to the cinema. That's makes sense, if both of them have the same mood.

There are two boolean parameters heSmile and sheSmile which indicate if each is smiling or

not. Write a method which returns True if they're eventually going to go to the cinema, of False

otherwise:

visitCinema(true, true) → true

visitCinema(false, false) → true

visitCinema(true, false) → false
*/
public class Task1 {

	public String visitCinema(boolean heSmiles, boolean sheSmiles) {
		String result = "Not going";
		if (heSmiles == true && sheSmiles == true)
			result = "Going";

		return result;

	}

	public static void main(String[] args) {
		Task1 myInstance = new Task1();
		System.out.println(myInstance.visitCinema(true, true));
		System.out.println(myInstance.visitCinema(true, false));
		System.out.println(myInstance.visitCinema(false, false));
		System.out.println(myInstance.visitCinema(false, true));
	}

}
