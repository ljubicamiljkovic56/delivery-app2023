package enumerations;

public enum Gender {
	female,
	male;
	
	public static Gender fromInt(int a) {
		switch (a) {
		case 1:
			return female;
		default:
			return male;
		}
	}
	
	public static int toInt(Gender gender) {
		switch (gender) {
		case female:
			return 1;
		case male:
			return 2;
		default:
			return 1;
		}
	}

}
