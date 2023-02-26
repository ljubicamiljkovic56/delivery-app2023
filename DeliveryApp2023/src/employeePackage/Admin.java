package employeePackage;

import enumerations.Gender;
import peoplePackage.Employee;

public class Admin extends Employee {

	public Admin() {
		super();
	}

	public Admin(Employee original) {
		super(original);
	}

	public Admin(String name, String surname, Gender gender, String username, String password, String personId,
			int income) {
		super(name, surname, gender, username, password, personId, income);
	}

	@Override
	public String toString() {
		return "Admin "
				+ "personId=" + personId + 
				", income=" + income + 
				", name=" + name + 
				", surname=" + surname
				+ ", gender=" + gender + 
				", username=" + username + 
				", password=" + password + " ";
	}
	
	

}
