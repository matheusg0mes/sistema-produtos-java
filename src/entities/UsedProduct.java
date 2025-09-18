package entities;

import java.text.SimpleDateFormat;
import java.util.Date;

public class UsedProduct extends Product{
	
	SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
	private Date manufactureDate;
	

	public UsedProduct(String name, double price, Date data) {
		super(name,price);
		this.manufactureDate = data;
	}

	public Date getManufactureDate() {
		return manufactureDate;
	}

	public void setManufactureDate(Date manufactureDate) {
		this.manufactureDate = manufactureDate;
	}

	public String priceTag() {
		
		StringBuilder sb = new StringBuilder();
		sb.append(getName() + "(used) ");
		sb.append("$ " + getPrice());
		sb.append("(manufacture date: " +  sdf.format(getManufactureDate()));
		return sb.toString();	
	}
}
