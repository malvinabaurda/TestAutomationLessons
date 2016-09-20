package lesson1additional;

public class Countries {
	protected String countryName;
	protected int population;
	private int density;
	private int totalArea;
	private int persentageOfWater;
	private String nationalLanguages;
	protected String capital;
	private String formOfGovernment;
	private String currency;
	private String internetTLD;
	private String region;

	public String getRegion() {
		return region;
	}

	public void setRegion(String region) {
		this.region = region;
	}

	public Countries(String countryName) {
		this.countryName = countryName;
	}

	public Countries() {
		
	}
	

	public Countries(String countryName, String capital, int population) {
		this.capital=capital;
		this.countryName=countryName;
		this.population=population;
	}

	public String getCountryName() {
		return countryName;

	}

	public void setCountryName(String countryName) {
		this.countryName = countryName;
	}
	
	
	public int getPopulation() {
		return population;
	}

	public void setPopulation(int population) {
		this.population = population;
	}

	public int getDensity() {
		return density;
	}

	public void setDensity(int density) {
		this.density = density;
	}

	public int getTotalArea() {
		return totalArea;
	}

	public void setTotalArea(int totalArea) {
		this.totalArea = totalArea;
	}

	public int getPersentageOfWater() {
		return persentageOfWater;
	}

	public void setPersentageOfWater(int persentageOfWater) {
		this.persentageOfWater = persentageOfWater;
	}

	public String getNationalLanguages() {
		return nationalLanguages;
	}

	public void setNationalLanguages(String nationalLanguages) {
		this.nationalLanguages = nationalLanguages;
	}

	public String getCapital() {
		return capital;
	}

	public void setCapital(String capital) {
		this.capital = capital;
	}

	public String getFormOfGovernment() {
		return formOfGovernment;
	}

	public void setFormOfGovernment(String formOfGovernment) {
		this.formOfGovernment = formOfGovernment;
	}

	public String getCurrency() {
		return currency;
	}

	public void setCurrency(String currency) {
		this.currency = currency;
	}

	public String getInternetTLD() {
		return internetTLD;
	}

	public void setInternetTLD(String internetTLD) {
		this.internetTLD = internetTLD;
	}

	public void showPopulationInfo(int year){
		System.out.println("В " + year + " году население составляло " + getPopulation());
	}
	
	
	

}
