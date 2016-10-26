package lesson3.intermediateMiddle;
/*Years converter. Write a program which takes Arabic numerals in range (0..2015) and returns their Romanian analogue. Do not create dual converter, just Arabic > Romanian
 */
public class Task12 {

	public static void main(String[] args) {
		Task12 myInstance = new Task12();
		System.out.println("Romanian analogue of Arabic number 2015 is " + myInstance.convertFromArabicToRomanian(2015));
		System.out.println("Romanian analogue of Arabic number 2015 is " + myInstance.convertFromArabicToRomanian(1444));
		System.out.println("Romanian analogue of Arabic number 2015 is " + myInstance.convertFromArabicToRomanian(1333));
	}

	public String convertFromArabicToRomanian(int value) {
		String year = "";
		while (value >= 1000) {
			value = value - 1000;
			year = year + "M";
		}
		while (value >= 900) {
			value = value - 900;
			year = year + "CM";
		}
		while (value >= 500) {
			value = value - 500;
			year = year + "D";
		}
		while (value >= 400) {
			value = value - 400;
			year = year + "CD";
		}
		while (value >= 100) {
			value = value - 100;
			year = year + "C";
		}
		while (value >= 90) {
			value = value - 90;
			year = year + "XC";
		}
		while (value >= 50) {
			value = value - 50;
			year = year + "L";
		}
		while (value >= 40) {
			value = value - 40;
			year = year + "XL";
		}
		while (value >= 10) {
			value = value - 10;
			year = year + "X";
		}
		while (value >= 9) {
			value = value - 9;
			year = year + "IX";
		}
		while (value >= 5) {
			value = value - 5;
			year = year + "V";
		}
		while (value >= 4) {
			value = value - 4;
			year = year + "IV";
		}
		while (value >= 1) {
			value = value - 1;
			year = year + "I";
		}
		return year;
	}
}