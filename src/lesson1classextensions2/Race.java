package lesson1classextensions2;

public class Race {

	public static void main(String[] args) {

		Car carOne = new Car("A7", "black");

		Driver driverOne = new Driver("Mike", "Green", 23);

		driverOne.setCarType(carOne);

		Car carTwo = new Car("116i", "grey");
	    carTwo.setBrand("BMW");
        Driver driverTwo = new Driver();
		driverTwo.setName("Victor");
		driverTwo.setSurname("Mason");
		driverTwo.setAge(28);
		driverTwo.setCarType(carTwo);
        Car carThree = new Car("Nissan", "Almera", "white");
        Driver driverThree = new Driver();
        driverThree.setCarType(carThree);
        Driver driverFour = new Driver();
        driverFour.setName("Kate");
        driverFour.setSurname("Milton");
        driverFour.setDrivingExperiance(10);
        driverOne.setDrivingExperiance(8);
        driverTwo.setDrivingExperiance(9);
        driverThree.setDrivingExperiance(5);
        System.out.println(driverOne.getCarType());
		System.out.println(driverOne.getCarType().getModel() + " " + driverOne.getCarType().getColor());
		System.out.println(driverTwo.getName() + " " + driverTwo.getSurname() + " " + driverTwo.getAge() + " " + driverTwo.getCarType().getBrand() + " " + driverTwo.getCarType().getModel() + " " + driverTwo.getCarType().getColor());
	}

}
