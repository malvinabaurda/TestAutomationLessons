package lesson3.preintermediate;

public class Task1 {

	private String visitCinema(boolean heSmiles, boolean sheSmiles) {
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
