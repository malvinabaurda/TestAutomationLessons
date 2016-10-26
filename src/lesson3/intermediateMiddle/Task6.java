package lesson3.intermediateMiddle;

/*The longest word. Write a method which returns the longest word in the input string. Compare only letters separated by space symbol
 * */
public class Task6 {
	
	static String findLongestWord(String[] partOfSentence) {
		String longestWord = partOfSentence[0];
		for (int i = 1; i < partOfSentence.length; i++) {
			if (longestWord.length() < partOfSentence[i].length()) {
				longestWord = partOfSentence[i];
			}
		}
		return longestWord;
	}

	public static void main(String[] args) {
		Task6 myInstance = new Task6();
		String sentence = "The longest word";
		String[] partsOfSentence = sentence.split(" ");
		System.out.println("The longest word in the string is: " + myInstance.findLongestWord(partsOfSentence));

	}

}