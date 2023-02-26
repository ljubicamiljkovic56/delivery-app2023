package orderPackage;

import java.util.Date;

import basicPackage.Drink;
import basicPackage.Food;
import buyerPackage.Buyer;
import employeePackage.DeliveryMan;

public class Order {
	protected Food food;
	protected Drink drink;
	protected Date date;
	protected Buyer buyer;
	protected DeliveryMan deliveryMan;
	protected double price;
	
	public Order() {
		this.food = null;
		this.drink = null;
		this.date = null;
		this.buyer = null;
		this.price = 0;
	}
	
	public Order(Food food, Drink drink, Date date, Buyer buyer, DeliveryMan deliveryMan, double price) {
		super();
		this.food = food;
		this.drink = drink;
		this.date = date;
		this.buyer = buyer;
		this.deliveryMan = deliveryMan;
		this.price = price;
	}

	public Order(Order original) {
		this.food = original.food;
		this.drink = original.drink;
		this.date = original.date;
		this.deliveryMan = original.deliveryMan;
		this.price = original.price;
	}

	public Food getFood() {
		return food;
	}

	public void setFood(Food food) {
		this.food = food;
	}

	public Drink getDrink() {
		return drink;
	}

	public void setDrink(Drink drink) {
		this.drink = drink;
	}


	public Date getDate() {
		return date;
	}


	public void setDate(Date date) {
		this.date = date;
	}

	public Buyer getBuyer() {
		return buyer;
	}

	public void setBuyer(Buyer buyer) {
		this.buyer = buyer;
	}
	
	public DeliveryMan getDeliveryMan() {
		return deliveryMan;
	}

	public void setDeliveryMan(DeliveryMan deliveryMan) {
		this.deliveryMan = deliveryMan;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}


	@Override
	public String toString() {
		return "Order "
				+ "food=" + food + 
				", drink=" + drink + 
				", date=" + date + 
				", buyer=" + buyer + 
				", deliveryMan=" + deliveryMan + 
				", price=" + price + " ";
	}
}