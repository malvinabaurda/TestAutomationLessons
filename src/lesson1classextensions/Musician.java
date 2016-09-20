package lesson1classextensions;

public class Musician extends Human{
private int yearsOfExperiane;
private String nameOfBand;
private MusicalInstrument instrument;
public Musician(String name, String surname) {
this.name=name;
this.surname=surname;
}
public int getYearsOfExperiane() {
	return yearsOfExperiane;
}
public void setYearsOfExperiane(int yearsOfExperiane) {
	this.yearsOfExperiane = yearsOfExperiane;
}
public String getNameOfBand() {
	return nameOfBand;
}
public void setNameOfBand(String nameOfBand) {
	this.nameOfBand = nameOfBand;
}
public MusicalInstrument getInstrument() {
	return instrument;
}
public void setInstrument(MusicalInstrument instrument) {
	this.instrument = instrument;
}

}
