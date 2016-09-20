package lesson1additional;

public class G7Countries extends Countries{
	private String g7RepresentativeName;

	public G7Countries(String countryName) {
		this.countryName=countryName;
	}

	public G7Countries(String countryName, String capital, int population, String g7RepresentativeName) {
		this.capital=capital;
		this.countryName=countryName;
		this.population=population;
		this.g7RepresentativeName=g7RepresentativeName;
	}

	public String getG7RepresentativeName() {
		return g7RepresentativeName;
	}

	public void setG7RepresentativeName(String g7RepresentativeName) {
		this.g7RepresentativeName = g7RepresentativeName;
	}
	public void showG7CountryInfo(){
		System.out.println("Страна: " + getCountryName() +
				"\nСтолица: " + getCapital() +
				"\nНаселение: "+ getPopulation() +
				"\nИмя представителя: " + getG7RepresentativeName());
	
	}
	
	public static void main (String[] args){
		Countries countryUkraine = new Countries();
		countryUkraine.setCountryName("Ukraine");
		
		G7Countries countryGermany = new G7Countries("Germany");
		G7Countries countryItaly = new G7Countries("Italy","Rome",13000000, "Antonio");
		countryItaly.showG7CountryInfo();
	}
}
