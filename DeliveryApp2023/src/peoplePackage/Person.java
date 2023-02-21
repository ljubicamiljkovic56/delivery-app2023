package peoplePackage;

import enumerations.Gender;

public class Person {
	
	protected String name;
	protected String surname;
	protected Gender gender;
	protected String username;
	protected String password;
	
	public Person() {
		this.name = "";
		this.surname = "";
		this.gender = Gender.female;
		this.username = "";
		this.password = "";
	}

	public Person(String name, String surname, Gender gender, String username, String password) {
		super();
		this.name = name;
		this.surname = surname;
		this.gender = gender;
		this.username = username;
		this.password = password;
	}
	
	public Person(Person original) {
		this.name = original.name;
		this.surname = original.surname;
		this.gender = original.gender;
		this.username = original.username;
		this.password = original.password;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public Gender getGender() {
		return gender;
	}

	public void setGender(Gender gender) {
		this.gender = gender;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String toString() {
		return "Person "
				+ "name=" + name + 
				", surname=" + surname + 
				", gender=" + gender + 
				", username=" + username
				+ ", password=" + password + " ";
	}
}