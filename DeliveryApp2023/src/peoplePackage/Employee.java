package peoplePackage;

import enumerations.Gender;

public class Employee extends Person {

	protected String personId;
	protected int income;
	
	public Employee() {
		this.personId = "";
		this.income = 0;
	}
	
	public Employee(String name, String surname, Gender gender, String username, String password, String personId,
			int income) {
		super(name, surname, gender, username, password);
		this.personId = personId;
		this.income = income;
	}
	
	public Employee(Employee original) {
		this.personId = original.personId;
		this.income = original.income;
	}
	
	
	public String getPersonId() {
		return personId;
	}
	public void setPersonId(String personId) {
		this.personId = personId;
	}
	public int getIncome() {
		return income;
	}
	public void setIncome(int income) {
		this.income = income;
	}


	@Override
	public String toString() {
		return "Employee "
				+ "personId=" + personId + 
				", income=" + income + 
				", name=" + name + 
				", surname=" + surname
				+ ", gender=" + gender + 
				", username=" + username + 
				", password=" + password + " ";
	}
}