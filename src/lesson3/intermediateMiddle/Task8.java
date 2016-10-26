package lesson3.intermediateMiddle;

/*CamelCaseSeparator. Some testing frameworks can read names of test methods and include them to the report like a beautiful sentence. As you know, we use camelCaseNamingPolicyduring writing our tests. Please write a method which takes a test name and returns beautiful sentence for report. Example:
Input: "checkChangingProfilePicture“
Output: "Check changing profile picture"
*/
public class Task8 {

	public static void main(String[] args) {
		Task8 myInstance = new Task8();
		System.out.println(myInstance.returnBeautifulSentence("checkChangingProfilePicture"));

	}

	public String returnBeautifulSentence(String value) {
		String myStr = Character.toString(Character.toUpperCase(value.charAt(0)));
		for (int i = 1; i < value.length(); i++) {
			char c = value.charAt(i);
			if (Character.isUpperCase(c)) {
				myStr = myStr + " " + Character.toLowerCase(c);
			} else {
				myStr = myStr + c;
			}
		}
		return myStr;
	}

}
