package entities;

import java.util.ArrayList;
import java.util.List;

public class Product {

	
	private String name;
	private double price;
	
	
	
	public Product(String name, double price) {
		super();
		this.name = name;
		this.price = price;
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
	public String priceTag() {
	
		StringBuilder sb = new StringBuilder();
		sb.append(name);
		sb.append("$" + price);
		return sb.toString();	
	}
}
