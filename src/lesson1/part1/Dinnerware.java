package lesson1.part1;

public class Dinnerware {
	private String material;
	private int weight;
	private String trademark;
	private int yearOfProduction;
	private String nameOfOwner;

	public void setMaterial(String newMaterial) {
		material = newMaterial;
	}

	public String getMaterial() {
		return material;
	}

	public void setNameOfOwner(String newNameOfOwner) {
		nameOfOwner = newNameOfOwner;
	}

	public String getNameOfOwner() {
		return nameOfOwner;
	}
//This is comment for the main method - WE DID THE CHANGE!
	public static void main(String[] args) {
		// Creation of class instances
		Dinnerware malvinaDinnerware = new Dinnerware();
		Dinnerware sergiiDinnerware = new Dinnerware();

		// Set attributes
		malvinaDinnerware.setMaterial("Farfor");
		sergiiDinnerware.setMaterial("Glass");
		malvinaDinnerware.setNameOfOwner("Malvina");
		sergiiDinnerware.setNameOfOwner("Sergii");

		// Get some output to console
		System.out.println(sergiiDinnerware.getNameOfOwner() + " bought new dinnerware. It is made of "
				+ sergiiDinnerware.getMaterial());
		System.out.println(malvinaDinnerware.getNameOfOwner() + " bought new dinnerware. It is made of "
				+ malvinaDinnerware.getMaterial());

	}

}
