package lesson1classextensions6;

public class Actor extends Human {
	private int startCareerYear;
	private String education;
	private Film filmInNomination;

	public int getStartCareerYear() {
		return startCareerYear;
	}

	public void setStartCareerYear(int startCareerYear) {
		this.startCareerYear = startCareerYear;
	}

	public String getEducation() {
		return education;
	}

	public void setEducation(String education) {
		this.education = education;
	}

	public Film getFilmInNomination() {
		return filmInNomination;
	}

	public void setFilmInNomination(Film filmInNomination) {
		this.filmInNomination = filmInNomination;
	}

}
