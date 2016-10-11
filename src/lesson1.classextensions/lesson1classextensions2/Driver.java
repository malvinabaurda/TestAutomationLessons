package lesson1classextensions2;

public class Driver extends Human {
	private int drivingExperiance;
	private Car carType;

	public Driver(String name, String surname, int age) {
		this.name=name;
		this.surname=surname;
		this.age=age;
	}

	public Driver() {
		
	}

	public int getDrivingExperiance() {
		return drivingExperiance;
	}

	public void setDrivingExperiance(int drivingExperiance) {
		this.drivingExperiance = drivingExperiance;
	}

	public Car getCarType() {
		return carType;
	}

	public void setCarType(Car carType) {
		this.carType = carType;
	}

}
