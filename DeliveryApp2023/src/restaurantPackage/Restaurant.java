package restaurantPackage;

import enumerations.RestaurantEnum;

public class Restaurant {
	
	protected String name;
	protected String address;
	protected RestaurantEnum category;
	
	public Restaurant() {
		this.name = "";
		this.address = "";
		this.category = RestaurantEnum.Pizzeria;
	}
	
	public Restaurant(String name, String address, RestaurantEnum category) {
		super();
		this.name = name;
		this.address = address;
		this.category = category;
	}

	public Restaurant(Restaurant original) {
		this.name = original.name;
		this.address = original.address;
		this.category = original.category;
	}

	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public RestaurantEnum getCategory() {
		return category;
	}
	
	public void setCategory(RestaurantEnum category) {
		this.category = category;
	}


	@Override
	public String toString() {
		return "Restaurant "
				+ "name=" + name + 
				", address=" + address + 
				", category=" + category + " ";
	}
	
	
}