package employeePackage;

import enumerations.Gender;
import enumerations.Vehicle;
import peoplePackage.Employee;

public class DeliveryMan extends Employee {
	
	private String registrationNumber;
	private Vehicle vehicleType;
	
	public DeliveryMan() {
		this.registrationNumber = "";
		this.vehicleType = Vehicle.bicycle;
	}
	
	public DeliveryMan(String name, String surname, 
			Gender gender, String username, String password, String personId,
			int income, String registrationNumber, Vehicle vehicleType) {
		super(name, surname, gender, username, password, personId, income);
		this.registrationNumber = registrationNumber;
		this.vehicleType = vehicleType;
	}

	public DeliveryMan(DeliveryMan original) {
		super(original);
		this.registrationNumber = original.registrationNumber;
		this.vehicleType = original.vehicleType;
	}
	
	public String getRegistrationNumber() {
		return registrationNumber;
	}

	public void setRegistrationNumber(String registrationNumber) {
		this.registrationNumber = registrationNumber;
	}

	public Vehicle getVehicleType() {
		return vehicleType;
	}

	public void setVehicleType(Vehicle vehicleType) {
		this.vehicleType = vehicleType;
	}

	@Override
	public String toString() {
		return "DeliveryMan "
				+ "registrationNumber=" + registrationNumber + 
				", vehicleType=" + vehicleType + 
				", personId=" + personId + 
				", income=" + income + 
				", name=" + name + 
				", surname=" + surname + 
				", gender=" + gender
				+ ", username=" + username + 
				", password=" + password + " ";
	}
	
	

}
