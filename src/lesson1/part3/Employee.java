package lesson1.part3;

public class Employee extends lesson1.part2.Human{
	private String position;
	private int employeeId;
	private String employer;

	public String getPosition() {
		return position;
	}

	public void setPosition(String position) {
		this.position = position;
	}

	public int getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}

	public String getEmployer() {
		return employer;
	}

	public void setEmployer(String employer) {
		this.employer = employer;
	}

	public void showEmployeeSummary(){
		System.out.println("Name:" + getName());
		System.out.println("Surname:" + getSurname());
		System.out.println("Position:" + getPosition());
		System.out.println("EmployeeId:" + getEmployeeId());
		System.out.println("Employer:" + getEmployer());
	}
	
	
	
	public static void main(String[] args) {
		Employee employeeOne = new Employee();
		employeeOne.setName("Nikolay");
		employeeOne.setSurname("Anelka");
		employeeOne.setPosition("Engineer");
		employeeOne.setEmployeeId(788);
		employeeOne.setEmployer("NBU");
		employeeOne.showEmployeeSummary();
	}

}
