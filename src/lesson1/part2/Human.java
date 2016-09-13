package lesson1.part2;

public class Human {
	// Name, surname, date of birth, sex
	private String name;
	private String surname;
	private String dateOfBirth;
	private String sex;

	//  онструкторы класса
	public Human(String newName) {
		name = newName;
	}

	public Human() {

	}

	public Human(String newName, String newSurname, String newDateOfBirth, String newSex) {
		name = newName;
		surname = newSurname;
		dateOfBirth = newDateOfBirth;
		sex = newSex;
	}
    // —оздаем дл€ каждого атрибута геттеры и сеттеры
	
	public void setName(String newName) {
		name = newName;
	}

	public String getName() {
		return name;
	}

	public void setSurname(String newSurname) {
		surname = newSurname;

	}

	public String getSurname() {
		return surname;
	}

	public static void main(String[] args) {
	//—оздаем экземпл€ры класса, использу€ различные конструкторы
		Human humanOne = new Human("Masha");
		Human humanTwo = new Human();
		Human humanThree = new Human("Victor", "Leonenko", "02.01.1974", "male");
		
		System.out.println(humanOne.getName());
		humanThree.setSurname("Ivanov");
		System.out.println(humanThree.getSurname());
		
	}

}
