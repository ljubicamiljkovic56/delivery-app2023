package basicPackage;

import restaurantPackage.Restaurant;

public class Food extends Product {

	public Food() {
		super();
	}

	public Food(Product original) {
		super(original);
	}

	public Food(String name, double price, String description, int amount, Restaurant restaurant) {
		super(name, price, description, amount, restaurant);
	}

	@Override
	public String toString() {
		return "Food "
				+ "name=" + name + 
				", price=" + price + 
				", description=" + description + 
				", amount=" + amount
				+ ", restaurant=" + restaurant + " ";
	}

}
