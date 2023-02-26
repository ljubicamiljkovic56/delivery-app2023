package buyerPackage;

import enumerations.Gender;
import peoplePackage.Person;

public class Buyer extends Person {
	
	private String address;
	private String phoneNumber;
	
	public Buyer() {
		this.address = "";
		this.phoneNumber = "";
	}
	
	public Buyer(String name, String surname, Gender gender, String username, String password, String address,
			String phoneNumber) {
		super(name, surname, gender, username, password);
		this.address = address;
		this.phoneNumber = phoneNumber;
	}
	
	public Buyer(Buyer original) {
		super(original);
		this.address = original.address;
		this.phoneNumber = original.phoneNumber;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	@Override
	public String toString() {
		return "Buyer "
				+ "address=" + address + 
				", phoneNumber=" + phoneNumber + 
				", name=" + name +
				", surname=" + surname
				+ ", gender=" + gender + 
				", username=" + username + 
				", password=" + password + " ";
	}
}