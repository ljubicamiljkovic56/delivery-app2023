package listsPackage;

import java.util.ArrayList;

import basicPackage.Drink;
import basicPackage.Food;
import buyerPackage.Buyer;
import employeePackage.Admin;
import employeePackage.DeliveryMan;
import orderPackage.Order;
import restaurantPackage.Restaurant;

public class Lists {
	
	private ArrayList<Admin> admins;
	private ArrayList<DeliveryMan> deliveryMen;
	private ArrayList<Buyer> buyers;
	private ArrayList<Food> food;
	private ArrayList<Drink> drinks;
	private ArrayList<Restaurant> restaurants;
	private ArrayList<Order> orders;
	private Bill[] bills;
	
	public Lists() {
		this.admins = new ArrayList<Admin>();
		this.deliveryMen = new ArrayList<DeliveryMan>();
		this.buyers = new ArrayList<Buyer>();
		this.food = new ArrayList<Food>();
		this.drinks = new ArrayList<Drink>();
		this.restaurants = new ArrayList<Restaurant>();
		this.orders = new ArrayList<Order>();
		this.bills = new Bill[1];
	}

	public ArrayList<Admin> getAdmins() {
		return admins;
	}
	
	public void setAdmins(ArrayList<Admin> admins) {
		this.admins = admins;
	}
	
	public ArrayList<DeliveryMan> getDeliveryMen() {
		return deliveryMen;
	}
	
	public void setDeliveryMen(ArrayList<DeliveryMan> deliveryMen) {
		this.deliveryMen = deliveryMen;
	}
	
	public ArrayList<Buyer> getBuyers() {
		return buyers;
	}
	
	public void setBuyers(ArrayList<Buyer> buyers) {
		this.buyers = buyers;
	}
	
	public ArrayList<Food> getFood() {
		return food;
	}
	
	public void setFood(ArrayList<Food> food) {
		this.food = food;
	}
	
	public ArrayList<Drink> getDrinks() {
		return drinks;
	}
	
	public void setDrinks(ArrayList<Drink> drinks) {
		this.drinks = drinks;
	}
	
	public ArrayList<Restaurant> getRestaurants() {
		return restaurants;
	}
	
	public void setRestaurants(ArrayList<Restaurant> restaurants) {
		this.restaurants = restaurants;
	}
	
	public ArrayList<Order> getOrders() {
		return orders;
	}
	
	public void setOrders(ArrayList<Order> orders) {
		this.orders = orders;
	}
	
	public Bill[] getBills() {
		return bills;
	}
	
	public void setBills(Bill[] bills) {
		this.bills = bills;
	}
}