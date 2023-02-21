package enumerations;

public enum Vehicle {
	bicycle,
	scooter,
	car,
	van;

	
	public static Vehicle fromInt(int a) {
		switch (a) {
		case 1:
			return bicycle;
		case 2:
			return scooter;
		case 3:
			return car;
		case 4:
			return van;
		default:
			return scooter;
		}
	}
	
	public static int toInt(Vehicle vehicle) {
		switch (vehicle) {
		case bicycle:
			return 1;
		case scooter:
			return 2;
		case car:
			return 3;
		case van:
			return 4;
		default:
			return 2;
		}
	}
}
