package lesson3.intermediateMiddle;
import java.util.Scanner;
//Temperature converter from Celsius to Kelvin
public class Task5p2 {

	public static void main(String[] args) {
		Task5p2 myInstance = new Task5p2();
		Scanner in = new Scanner(System.in);
		System.out.print("����������� �� ����� ����c��: ");
		double number = in.nextInt();
		System.out.println("����������� �� ����� ��������: " + myInstance.fromCelsiusToKelvin(number));

	}

	private double fromCelsiusToKelvin(double celsius) {
	double kelvin = celsius + 273.15;
	return kelvin; 
		
	}

}