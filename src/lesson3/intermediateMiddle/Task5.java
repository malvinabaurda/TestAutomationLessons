package lesson3.intermediateMiddle;

//Temperature converter from Celsius to Kelvin
public class Task5 {
	public float fromCelsiusToKelvin(float celsius) {
		float kelvin = celsius + (float) 273.15;
		return kelvin;

	}

	public float fromKelvinToCelsius(float kelvin) {
		float c = kelvin - (float) 273.15;
		return c;

	}

	public static void main(String[] args) {
		Task5 myInstance = new Task5();
		System.out.println("1 градус по шкале Кельвина равен " + myInstance.fromKelvinToCelsius(1)
				+ " градусов по шкале Цельсия");
		System.out.println("1 градус по шкале Цельсия равен " + myInstance.fromCelsiusToKelvin(1)
				+ " градусов по шкале Кельвина");

	}

}