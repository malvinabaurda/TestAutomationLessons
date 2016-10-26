package lesson3.intermediateMiddle;
import java.util.Scanner;
//Temperature converter from Kelvin to Celsius
public class Task5 {

	public static void main(String[] args) {
		Task5 myInstance = new Task5();
		Scanner in = new Scanner(System.in);
		System.out.print("Температура по шкале Кельвина: ");
		double kelvin = in.nextInt();
		System.out.println("Температура по шкале Цельсия: " + myInstance.fromKelvinToCelsius(kelvin));

	}

	private double fromKelvinToCelsius(double kelvin) {
	double c = kelvin - 273.15;
	return c; 
		
	}

}
