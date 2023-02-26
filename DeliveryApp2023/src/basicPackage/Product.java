package basicPackage;

import restaurantPackage.Restaurant;

public abstract class Product {
	
	public String name;
	public double price;
	public String description;
	public int amount;
	public Restaurant restaurant;
	
	public Product() {
		this.name = "";
		this.price = 0;
		this.description = "";
		this.amount = 0;
		this.restaurant = new Restaurant();
	}
	
	public Product(String name, double price, String description, int amount, Restaurant restaurant) {
		super();
		this.name = name;
		this.price = price;
		this.description = description;
		this.amount = amount;
		this.restaurant = restaurant;
	}
	
	public Product(Product original) {
		this.name = original.name;
		this.price = original.price;
		this.description = original.description;
		this.amount = original.amount;
		this.restaurant = original.restaurant;
	}


	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}
	
	public void setPrice(double price) {
		this.price = price;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public int getAmount() {
		return amount;
	}

	public void setAmount(int amount) {
		this.amount = amount;
	}

	public Restaurant getRestaurant() {
		return restaurant;
	}

	public void setRestaurant(Restaurant restaurant) {
		this.restaurant = restaurant;
	}


	@Override
	public String toString() {
		return "Product "
				+ "name=" + name + 
				", price=" + price + 
				", description=" + description + 
				", amount=" + amount
				+ ", restaurant=" + restaurant + " ";
	}
}