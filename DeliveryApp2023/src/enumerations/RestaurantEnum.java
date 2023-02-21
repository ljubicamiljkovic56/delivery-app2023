package enumerations;

public enum RestaurantEnum {
	Pizzeria,
	Chinese_restaurant,
	Indian_restaurant,
	BBQ,
	Home_made,
	Pastry_shop;
	
	
	public static RestaurantEnum fromInt(int a) {
		switch (a) {
		case 1:
			return Pizzeria;
		case 2:
			return Chinese_restaurant;
		case 3:
			return Indian_restaurant;
		case 4:
			return BBQ;
		case 5:
			return Home_made;
		case 6:
			return Pastry_shop;
		default:
			return Pizzeria;
		}
	}
	
	public static int toInt(RestaurantEnum re) {
		switch (re) {
		case Pizzeria:
			return 1;
		case Chinese_restaurant:
			return 2;
		case Indian_restaurant:
			return 3;
		case BBQ:
			return 4;
		case Home_made:
			return 5;
		case Pastry_shop:
			return 6;
		default:
			return 1;
		}
	}
}
