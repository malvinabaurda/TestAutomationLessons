package lesson3.intermediateMiddle;

public class Task11 {

	public static void main(String[] args) {
		String passwordSymbols = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
		StringBuilder randomPassword = new StringBuilder();
		int quantity = (int) (Math.random() * 7) + 8;
		for (int i = 0; i < quantity; i++)
			randomPassword.append(passwordSymbols.charAt((int) (Math.random()*passwordSymbols.length())));

		System.out.println(randomPassword);

	}

}
