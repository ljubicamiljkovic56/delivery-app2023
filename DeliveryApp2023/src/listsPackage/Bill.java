package listsPackage;

import java.util.ArrayList;

import basicPackage.Product;

public class Bill {
	
	private ArrayList<Product> bill;
	public static final double delivery_fee = 200;
	
	public Bill() {
		this.bill = new ArrayList<Product>();
	}
	public ArrayList<Product> getBill() {
		return bill;
	}
	public void addToBill(Product product) {
		this.bill.add(product);
	}
	public void removeFromBill(Product product) {
		this.bill.remove(product);
	}
	public double payTheBill() {
		double finalPrice = 0;
		for(Product product : bill) {
			finalPrice += product.getPrice();
		}
		bill.clear();
		return finalPrice + delivery_fee;
	}
}