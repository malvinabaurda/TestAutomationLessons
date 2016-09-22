package lesson1classextensions2;

public class Race {

	public static void main(String[] args) {
		
		Car audi = new Car("A7", "black");
	
		Driver driverOne = new Driver("Mike", "Green", 23);
		
		driverOne.setCarType(audi);
		
		System.out.println(driverOne.getCarType());
	}

}
