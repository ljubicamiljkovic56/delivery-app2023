package basicPackage;

import restaurantPackage.Restaurant;

public class Drink extends Product {

	public Drink() {
		super();
	}

	public Drink(Product original) {
		super(original);
	}

	public Drink(String name, double price, String description, int amount, Restaurant restaurant) {
		super(name, price, description, amount, restaurant);
	}

	@Override
	public String toString() {
		return "Drink "
				+ "name=" + name + 
				", price=" + price + 
				", description=" + description + 
				", amount=" + amount
				+ ", restaurant=" + restaurant + " ";
	}

}