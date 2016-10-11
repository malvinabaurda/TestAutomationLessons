package lesson1classextensions4;

public class Employee extends Human {

	private String position;
	private int experiance;
	private Employer employerNameAndSurname;

	public String getPosition() {
		return position;
	}

	public void setPosition(String position) {
		this.position = position;
	}

	public int getExperiance() {
		return experiance;
	}

	public void setExperiance(int experiance) {
		this.experiance = experiance;
	}

	public Employer getEmployerNameAndSurname() {
		return employerNameAndSurname;
	}

	public void setEmployerNameAndSurname(Employer employerNameAndSurname) {
		this.employerNameAndSurname = employerNameAndSurname;
	}

}
